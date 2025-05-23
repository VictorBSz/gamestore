    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gamestore.model;

/**
 *
 * @author d4rkp
 */
public class Clients {
    private int customerID;
    private String customerName;
    private String cpf;
    private String contact;
    private String addressST;
    private String addressNO;
    private String city;
    
    public Clients(String customerName, String cpf, String contact, String addressST, String addressNO, String city) {
        this.customerName = customerName;
        this.cpf = cpf;
        this.contact = contact;
        this.addressST = addressST;
        this.addressNO = addressNO;
        this.city = city;
    }
    
    public Clients(String customerName, String cpf, String contact, String addressST, String addressNO, String city, int customerID) {
        this.customerName = customerName;
        this.cpf = cpf;
        this.contact = contact;
        this.addressST = addressST;
        this.addressNO = addressNO;
        this.city = city;
        this.customerID = customerID;
    }
    
    public Clients() {
        
    }
    
    //Getters
    public int getcustomerID() { return customerID; }
    public String getcustomerName() { return customerName; }
    public String getcpf() { return cpf; }
    public String getcontact() { return contact; }
    public String getaddressST() { return addressST; }
    public String getaddressNO() { return addressNO; }
    public String getcity() { return city; }
    
    //Setters
    public void setcustomerID(int customerID) { this.customerID = customerID; }
}
