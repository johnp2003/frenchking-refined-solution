/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public class SmallFries extends Fries {
    @Override
    public void prepareFries() {
        System.out.println("Preparing Small Fries...");
    }

    @Override
    public double price() {
        return 3.0;
    }
}
