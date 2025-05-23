/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gamestore.DAO;
import br.com.gamestore.model.Clients;
import main.Conexao;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author d4rkp
 */
public class ClientsDAO {
    private Connection conn;
    
    public ClientsDAO() {
        try {
            this.conn = Conexao.conectar();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar-se: " + e.getMessage());
        }
}
    
    public void Insert(Clients clients) {
        String sqlInsert = "INSERT INTO Clients (customerName, cpf, contact, addressST, addressNO, city) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlInsert);
            
            stmt.setString(1, clients.getcustomerName());
            stmt.setString(2, clients.getcpf());
            stmt.setString(3, clients.getcontact());
            stmt.setString(4, clients.getaddressST());
            stmt.setString(5, clients.getaddressNO());
            stmt.setString(6, clients.getcity());
            
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
    
    public List<String> listarTodos() {
        List<String> clients = new ArrayList<>();
        String sqlRead = "SELECT customerID, customerName, cpf, contact, addressST, addressNO, city, regdate FROM CLIENTS";
        
        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlRead)) {
            
            while(rs.next()) {
                String linha = rs.getString("customerID") + " - " +
                               rs.getString("customerName") + " - " +
                               rs.getString("cpf") + " - " +
                               rs.getString("contact") + " - " +
                               rs.getString("addressST") + " - " +
                               rs.getString("addressNO") + " - " +
                               rs.getString("city") + " - " +
                               rs.getString("regdate");
                clients.add(linha);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar dados: " + e.getMessage());
        }
        
        return clients;
    }
    
    public void Update(Clients clients) {
        String sqlUpdate = "UPDATE CLIENTS SET customerName = ?, cpf = ?, contact = ?, addressST = ?, addressNO = ?, city = ? WHERE CUSTOMERID = ?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlUpdate);
            
            stmt.setString(1, clients.getcustomerName());
            stmt.setString(2, clients.getcpf());
            stmt.setString(3, clients.getcontact());
            stmt.setString(4, clients.getaddressST());
            stmt.setString(5, clients.getaddressNO());
            stmt.setString(6, clients.getcity());
            stmt.setInt(7, clients.getcustomerID());
            
            stmt.executeUpdate();
            System.out.println("Atualização feita com Sucesso!");
            
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar os dados: " + e.getMessage());
        }
    }
    
    public void Delete(Clients clients) {
        String sqlDelete = "DELETE FROM CLIENTS WHERE customerID = ?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlDelete);
            
            stmt.setInt(1, clients.getcustomerID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir registro: " + e.getMessage());
        }
    }
}