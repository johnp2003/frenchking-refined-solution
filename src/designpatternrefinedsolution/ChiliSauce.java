/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public class ChiliSauce extends Sauce {
    public ChiliSauce(Fries fries) {
        super(fries);
    }
    
    @Override
    public double price() {
        return fries.price() + 0.70;
    }
    
    @Override
    public String getSauces() {
        String baseSauces = fries.getSauces();
        return baseSauces.isEmpty() ? "Chili" : baseSauces + ", Chili";
    }
}
