package designpatternrefinedsolution;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johnp
 */
// FriesFactory.java

public class FriesFactory {
    public Fries createFries(String type) {
        switch (type) {
            case "small":
                return new SmallFries();
            case "medium":
                return new MediumFries();
            case "large":
                return new LargeFries();
            default:
                return new SmallFries();
        }
    }
}
