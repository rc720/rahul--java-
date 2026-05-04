package q27;
import java.sql.*;
import java.util.Scanner;
public class AuthDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

           
            Class.forName("com.mysql.cj.jdbc.Driver");

          
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb1?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );

       
            PreparedStatement ps = con.prepareStatement(
                "SELECT role FROM users WHERE username=? AND password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

        
            if (rs.next()) {
                String role = rs.getString("role");

                System.out.println("Login Successful!");
                System.out.println("Role: " + role);

                if (role.equals("ADMIN_ROLE")) {
                    System.out.println("Access: Full Admin Rights");
                } else {
                    System.out.println("Access: Limited User Rights");
                }

            } else {
                System.out.println("Invalid Username or Password!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

