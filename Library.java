import java.sql.*;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws Exception {
        Connection con = cm.getConnection();
        Scanner ob = new Scanner(System.in);
        System.out.println("1.STAFF" + "\n2.STUDENT");
        int a = ob.nextInt();
         if (a == 1) {
            System.out.println("1.Add books " + "\n2.Check books");
            int b = ob.nextInt();
            if (b == 1) {
                System.out.println("Choose Department" + "\n1.CSE " + "\n2.ECE" + "\n3.MECH");
                int c = ob.nextInt();
                if (c == 1) {
                    System.out.println("Enter the book name");
                    String name = ob.next();
                    String q = "insert into cse values(?)";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, name);
                    int rs = ps.executeUpdate();
                    if (rs > 0) {
                        System.out.println("Updated Successfully");
                    }
                } else if (c == 2) {
                    System.out.println("Enter the book name");
                    String name = ob.next();
                    String q = "insert into ece values(?)";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, name);
                    int rs = ps.executeUpdate();
                    if (rs > 0) {
                        System.out.println("Updated Successfully");
                    }

                } else if (c == 3) {
                    System.out.println("Enter the book name");
                    String name = ob.next();
                    String q = "insert into mech values(?)";
                    PreparedStatement ps = con.prepareStatement(q);
                    ps.setString(1, name);
                    int rs = ps.executeUpdate();
                    if (rs > 0) {
                        System.out.println("Updated Successfully");
                    }
                }
            }
            else if (b == 2) {
                System.out.println("Choose Department" + "\n1.CSE " + "\n2.ECE" + "\n3.MECH");
                int c = ob.nextInt();
                if (c == 1) {
                    String q = "select * from cse";
                    PreparedStatement ps = con.prepareStatement(q);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String na = rs.getString("bkna");
                        int count=rs.getInt("count");
                        System.out.println(na+" "+count);
                    }
                    if (c == 2) {
                        String r = "select * from ece";
                        PreparedStatement pr = con.prepareStatement(r);
                        ResultSet s = pr.executeQuery();
                        while (s.next()) {
                            String na = s.getString("bkna");
                            int count=s.getInt("count");
                            System.out.println(na+" "+count);

                        }
                        if (c == 3) {
                            String m = "select * from mech";
                            PreparedStatement n = con.prepareStatement(m);
                            ResultSet mn = ps.executeQuery();
                            while (rs.next()) {
                                String na = mn.getString("bkna");
                                int count=rs.getInt("count");
                                System.out.println(na+" "+count);

                            }
                        }
                    }
                }
            }
        }
         else if (a == 2) {
             System.out.println("enter student id");
             String c = ob.next();
             System.out.println("Choose Department" + "\n1.CSE " + "\n2.ECE" + "\n3.MECH");
             int d = ob.nextInt();
            System.out.println("1.take " + "\n 2.return");
            int b = ob.nextInt();
            if (b == 1) {
                if (d==1) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q="select * from cse";
                    PreparedStatement ps=con.prepareStatement(q);
                    ResultSet r=ps.executeQuery();
                    int v=0;
                    while(r.next()){
                        v=r.getInt("count");

                    }
                    if(v>=1){
                        System.out.println("book is available");
                        String l="update cse set count =count-1 where bkna=?";
                        PreparedStatement pr=con.prepareStatement(l);
                        pr.setString(1,e);
                        int m=pr.executeUpdate();
                        if(m>0){
                            System.out.println("book taken");
                        }
                    }
                    else{
                        System.out.println("book is not available");
                    }


                }
                else if (d==2) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q="select * from ece";
                    PreparedStatement ps=con.prepareStatement(q);
                    ResultSet r=ps.executeQuery();
                    int v=0;
                    while(r.next()){
                        v=r.getInt("count");

                    }
                    if(v>=1){
                        System.out.println("book is available");
                        String l="update ece set count =count-1 where bkna=?";
                        PreparedStatement pr=con.prepareStatement(l);
                        pr.setString(1,e);
                        int m=pr.executeUpdate();
                        if(m>0){
                            System.out.println("book taken");
                        }
                    }
                    else{
                        System.out.println("book is not available");
                    }


                }
                else if (d==3) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q="select * from mech";
                    PreparedStatement ps=con.prepareStatement(q);
                    ResultSet r=ps.executeQuery();
                    int v=0;
                    while(r.next()){
                        v=r.getInt("count");

                    }
                    if(v>=1){
                        System.out.println("book is available");
                        String l="update mech set count =count-1 where bkna=?";
                        PreparedStatement pr=con.prepareStatement(l);
                        pr.setString(1,e);
                        int m=pr.executeUpdate();
                        if(m>0){
                            System.out.println("book taken");
                        }

                    }
                    else{
                        System.out.println("book is not available");
                    }


                }
            }
            else if (b==2) {
                if (d==1) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q = "select * from cse";
                    PreparedStatement ps = con.prepareStatement(q);
                    ResultSet r = ps.executeQuery();
                    int v = 0;
                    while (r.next()) {
                        v = r.getInt("count");

                    }
                    if (v >= 1) {
                        System.out.println("book is available");
                        String l = "update cse set count =count+1 where bkna=?";
                        PreparedStatement pr = con.prepareStatement(l);
                        pr.setString(1, e);
                        int m = pr.executeUpdate();
                        if (m > 0) {
                            System.out.println("book returned");
                        }
                    }
                }
                else if (d==1) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q = "select * from ece";
                    PreparedStatement ps = con.prepareStatement(q);
                    ResultSet r = ps.executeQuery();
                    int v = 0;
                    while (r.next()) {
                        v = r.getInt("count");

                    }
                    if (v >= 1) {
                        System.out.println("book is available");
                        String l = "update ece set count =count+1 where bkna=?";
                        PreparedStatement pr = con.prepareStatement(l);
                        pr.setString(1, e);
                        int m = pr.executeUpdate();
                        if (m > 0) {
                            System.out.println("book returned");
                        }
                    }
                }
                if (d==1) {
                    System.out.println("name of book ");
                    String e = ob.next();
                    String q = "select * from mech";
                    PreparedStatement ps = con.prepareStatement(q);
                    ResultSet r = ps.executeQuery();
                    int v = 0;
                    while (r.next()) {
                        v = r.getInt("count");

                    }
                    if (v >= 1) {
                        System.out.println("book is available");
                        String l = "update mech set count =count+1 where bkna=?";
                        PreparedStatement pr = con.prepareStatement(l);
                        pr.setString(1, e);
                        int m = pr.executeUpdate();
                        if (m > 0) {
                            System.out.println("book returned");
                        }
                    }
                }




            }
         }
    }
}
    class cm {
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123456");
        }
        public static void closeConnection(Connection connection) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }