/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public class MediumFries extends Fries {
    @Override
    public void prepareFries() {
        System.out.println("Preparing Medium Fries...");
    }

    @Override
    public double price() {
        return 4.0;
    }
}
