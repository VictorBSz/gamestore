/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gamestore.model;

/**
 *
 * @author d4rkp
 */
public class Maintenance {
    private int maintID;
    private String customerName;
    private String maintBy;
    private String maintType;
    private String parts;
    private String maintDescription;
    private float maintPrice;
    
    public Maintenance(String customerName, String fixBy, String jobdescript, float jobPrice, String maintType, String parts) {
        this.customerName = customerName;
        this.maintBy = fixBy;
        this.maintType = maintType;
        this.parts = parts;
        this.maintDescription = jobdescript;
        this.maintPrice = jobPrice;
    }
    
    //Getters
    
    public int getmaintID() { return maintID; }
    public String getcustomerName() { return customerName; }
    public String getmaintBy() { return maintBy; }
    public String getmaintType() { return maintType; }
    public String getparts() { return parts;}
    public String getmaintDescription() { return maintDescription; }
    public float getmaintPrice() { return maintPrice; }
}
