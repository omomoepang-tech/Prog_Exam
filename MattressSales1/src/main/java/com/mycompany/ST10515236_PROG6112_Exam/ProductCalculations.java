/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales1;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {
    
    private static final double VAT_RATE = 0.15;
    private static final double COMMISSION_RATE = 0.05;
    
    private final double price;
    
    public ProductCalculations(double price) {
        this.price = price;
    }
    
    @Override
    public double GetVat(){
        return price * VAT_RATE;
    }
    
    @Override
    public double GetCommision() {
        return price * COMMISSION_RATE;
    }
    
    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommision();
    }
    
}
