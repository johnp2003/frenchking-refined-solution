/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public class KetchupSauce extends Sauce {
    public KetchupSauce(Fries fries) {
        super(fries);
    }
    
    @Override
    public double price() {
        return fries.price() + 0.50;
    }
    
    @Override
    public String getSauces() {
        String baseSauces = fries.getSauces();
        return baseSauces.isEmpty() ? "Ketchup" : baseSauces + ", Ketchup";
    }
}
