import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //create url string
        String url = "JDBC:mysql://127.0.0.1:3306/employee_database";


        try {
            //get connection
            Connection conn = DriverManager.getConnection(url,"root","Root");

            //create statement
            Statement statement = conn.createStatement();

            //execute query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees WHERE id = 600");

            //process query
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}