/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatternrefinedsolution;

import java.util.Scanner;

/**
 *
 * @author johnp
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to French King Fries!");
        System.out.println("Select Fries Size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        
        int sizeChoice = scanner.nextInt();
        scanner.nextLine();
        
        FriesFactory friesFactory = new FriesFactory();
        Fries selectedFries;
        
        switch (sizeChoice) {
            case 1:
                selectedFries = friesFactory.createFries("small");
                break;
            case 2:
                selectedFries = friesFactory.createFries("medium");
                break;
            case 3:
                selectedFries = friesFactory.createFries("large");
                break;
            default:
                System.out.println("Invalid size. Defaulting to Small.");
                selectedFries = friesFactory.createFries("small");
        }
        
        selectedFries.prepareFries();
        selectedFries.setSize(1);
        
        System.out.println("\nSelect Sauce Options:");
        System.out.println("1. No Sauce");
        System.out.println("2. Ketchup");
        System.out.println("3. Chili");
        System.out.println("4. Both Sauces");
        
        int sauceChoice = scanner.nextInt();
        scanner.nextLine();
        
        Fries finalFries = selectedFries;
        
        switch (sauceChoice) {
            case 2:
                finalFries = new KetchupSauce(selectedFries);
                break;
            case 3:
                finalFries = new ChiliSauce(selectedFries);
                break;
            case 4:
                finalFries = new ChiliSauce(new KetchupSauce(selectedFries));
                break;
        }
        
        String sauces = finalFries.getSauces();
        System.out.println("\nSauce(s): " + (sauces.isEmpty() ? "None" : sauces));
        System.out.println("Total Price: RM" + String.format("%.2f", finalFries.price()));
        
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Online Banking");
        
        int paymentChoice = scanner.nextInt();
        scanner.nextLine();
        
        PaymentStrategy paymentStrategy;
        
        switch (paymentChoice) {
            case 1:
                System.out.println("Enter Credit Card Number:");
                String cardNumber = scanner.nextLine();
                paymentStrategy = new CreditCardPaymentStrategy(cardNumber);
                break;
            case 2:
                System.out.println("Enter Bank Account Number:");
                String bankAccount = scanner.nextLine();
                paymentStrategy = new OnlineBankingPaymentStrategy(bankAccount);
                break;
            default:
                System.out.println("Invalid payment method. Using Credit Card as default.");
                paymentStrategy = new CreditCardPaymentStrategy("0000-0000-0000-0000");
        }
        
        Payment payment = new Payment(paymentStrategy);
        payment.processPayment(finalFries.price());
        
        scanner.close();
    }
    
}
