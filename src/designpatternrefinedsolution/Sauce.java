/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public abstract class Sauce extends Fries {
    protected Fries fries;
    
    public Sauce(Fries fries) {
        this.fries = fries;
    }
    
    @Override
    public void prepareFries() {
        fries.prepareFries();
    }
    
    @Override
    public void setSize(int packet) {
        fries.setSize(packet);
    }
    
    @Override
    public double price() {
        return fries.price();
    }
    
    @Override
    public String getSauces() {
        return fries.getSauces();
    }
}
