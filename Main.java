package org.example;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        try{
            Class.forName("org.h2.Driver").newInstance();}
        catch(Exception e)
        {System.err.println("Unable to load driver:"+ e);}
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhotoSalon", "root", "Smirnovav.d69");
        if (conn==null){System.out.println("Нет соединения с БД!");
            System.exit(0);}
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM photosalonnn JOIN Photograf ON photosalonnn.photograf_id=photograf.id  JOIN CLIENT ON photosalonnn.client_id=CLIENT.id");
        while(rs.next()){
            System.out.println(rs.getRow() + ". " +
                    "ФОТОГРАФ - " + rs.getString("fotoname") + "\t\t\t" +
                    "ЕГО КЛИЕНТ - " + rs.getString("name") + "\t\t\t");}
        stmt.close();}}
