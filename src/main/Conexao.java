/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author d4rkp
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/gamestore";
    private static final String USER = "root";
    private static final String PASSWORD = "Rodvitvi#350";
    
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
