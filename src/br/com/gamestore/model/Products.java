/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gamestore.model;

/**
 *
 * @author d4rkp
 */
public class Products {
    
    private int prodID;
    private String prodName;
    private String prodPrice;
    private String prodDetail;
    
    public Products(String prodName, String prodPrice, String prodDetail) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodDetail = prodDetail;
    }
    
    //Getters
    public String getprodName() { return prodName; }
    public String getprodPrice() { return prodPrice; }
    public String getprodDetail() { return prodDetail; }
}
