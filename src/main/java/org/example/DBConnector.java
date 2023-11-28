package org.example;

import java.sql.*;

public class DBConnector {

    static final String DB_URL = "jdbc:mysql://localhost/world";
    static final String USER = "root";
    static final String PASS = "Teknologisk2023!";

    public void readData() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting do database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            String sql = "SELECT * FROM city WHERE CountryCode = 'MUS'";
            stmt = conn.prepareStatement((sql));

            ResultSet rs = stmt.executeQuery();

            System.out.println("Printing result...");
            while (rs.next()) {
                String name = rs.getString("Name");
                int population = rs.getInt("Population");
                String countryCode = rs.getString("Countrycode");
                int id = rs.getInt("ID");
                String district = rs.getString("District");
                City city = new City(name, population, countryCode, id, district);
                System.out.println(name + population + countryCode + id + district);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
        }
    }
}


