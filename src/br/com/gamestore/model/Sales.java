/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gamestore.model;

/**
 *
 * @author d4rkp
 */
public class Sales {
    
    private int OrderID;
    private int CustomerID;
    private String customerName;
    private String product;
    private String price;
    
    public Sales(String customerName, String product, String price) {
    
    this.customerName = customerName;
    this.product = product;
    this.price = price;
    }
    
    //Getters
    public String getcustomerName() { return customerName; }
    public String getproduct() { return product; }
    public String getprice() { return price; }
}
