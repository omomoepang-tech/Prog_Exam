/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MattressSalesReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Single dimensional array
        String[] products = {
            "Cozy nights monarch",
            "Restonic barbados",
            "Sealy Phuket"
        };
        
        //Two dimensional array
        int [][] sales = new int[products.length][3];
        
        //The user to enter the sales
        for (int i = 0; i < products.length; i++) {
            for (int j=0; j < sales[i].length; j++) {
                System.out.print("Enter number of sales for month " +(j +1 ) + " for " + products[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println(); // It is to show the empty space between the products
        }
        int totalSales = 0;
        int totalEnteries = products.length * 3;
        int highestSingleSale = 0;
        String mostPopularProduct = "";
        
        //Clculating the total sales
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales [i][j];
                
                if( sales [i][j] >highestSingleSale) {
                    highestSingleSale = sales[i][j];
                    mostPopularProduct = products[i];
                }
            }
        }
        //Calculate the average
        int averageSales = totalSales / totalEnteries;
        
        //The formatt
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************");
        System.out.println("TOTAL PRODUCT SALES: " + totalSales);
        System.out.println("AVERAGE PRODUCT SALES: " + averageSales);
        System.out.println("MOST POPULAR PRODUCT: " + mostPopularProduct);
    }
    
    public interface IProduct {
        int GetTotalProductSold();
        double GetAverageProductSold();
        String GetMostPopularProduct();
        
    }
    
    public class Product implements IProduct {
        private String[] products;
        private int[][] sales;
        
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }
    
    
    @Overrride
    public int GetTotalProductsSold(){
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }
    
    }
}
