/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj_finall_project;

/**
 *
 * @author lenovo
 */
public class Calculate {
    
    public double Total=0;
    public void Sum(double price){
        Total+=price;
    }
    public void Extract(double price, double Total){
        Total-=price;
        this.Total=Total;
    }
    
}
