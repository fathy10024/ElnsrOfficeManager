package model ;
import java.sql.*;

public class Database {
    public static void main(String[] args) {

        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=emplyee;"
                + "encrypt=false;"
                + "trustServerCertificate=true;"
                + "integratedSecurity=true;";

        try (Connection conn = DriverManager.getConnection(url)) {
            
            System.out.println("✅ Connected successfully to SQL Server!");



        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}