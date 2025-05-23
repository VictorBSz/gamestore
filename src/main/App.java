/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import br.com.gamestore.DAO.ClientsDAO;
import br.com.gamestore.model.Clients;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
/**
 *
 * @author d4rkp
 */
public class App {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        
        // PAINEL CADASTRO
        JPanel panel = new JPanel(new GridLayout(4,4));
        
        
        // CAMPOS DE TEXTO
        JTextField txtName = new JTextField();
        JTextField txtCPF = new JTextField();
        JTextField txtContact = new JTextField();
        JTextField txtAddress = new JTextField();
        JTextField txtNumber = new JTextField();
        JTextField txtCity = new JTextField();
        JTextArea txtList = new JTextArea();
        
        //BOTOES DE INTERAÇÃO
        JButton btnSave = new JButton("Cadastrar");
        JButton btnShow = new JButton("Listar");
        
        //PAINEIS DE TEXTO
        panel.add(new JLabel("Nome: "));
        panel.add(txtName);
        panel.add(new JLabel("CPF: "));
        panel.add(txtCPF);
        panel.add(new JLabel("Contato: "));
        panel.add(txtContact);
        panel.add(new JLabel("Endereço: "));
        panel.add(txtAddress);
        panel.add(new JLabel("Número: "));
        panel.add(txtNumber);
        panel.add(new JLabel("Cidade: "));
        panel.add(txtCity);
        panel.add(btnSave);
        panel.add(btnShow);
        
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new JScrollPane(txtList), BorderLayout.CENTER);
        
        ClientsDAO dao = new ClientsDAO();
        
        //EVENTO BOTÃO CADASTRAR
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtName.getText();
                String cpf = txtCPF.getText();
                String contato = txtContact.getText();
                String endereco = txtAddress.getText();
                String numero = txtNumber.getText();
                String cidade = txtCity.getText();
                
                Clients cliente = new Clients(nome, cpf, contato, endereco, numero, cidade);
                dao.Insert(cliente);
                JOptionPane.showMessageDialog(frame, "Usuário atualizado com sucesso!");
                
                txtName.setText("");
                txtCPF.setText("");
                txtContact.setText("");
                txtAddress.setText("");
                txtNumber.setText("");
                txtCity.setText("");
            }
        });
        
        // EVENTO BOTÃO LISTAR
        btnShow.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               List<String> usuarios = dao.listarTodos();
               txtList.setText("");
               for (String u : usuarios){
                   txtList.append(u + "\n");
               }
           }
        });
    frame.setVisible(true);
    }
}
