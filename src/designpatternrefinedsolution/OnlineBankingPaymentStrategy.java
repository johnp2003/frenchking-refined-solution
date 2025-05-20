/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternrefinedsolution;

/**
 *
 * @author johnp
 */
public class OnlineBankingPaymentStrategy implements PaymentStrategy {
    private String bankAccount;

    public OnlineBankingPaymentStrategy(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying RM" + String.format("%.2f", amount) + " using Online Banking: " + bankAccount);
    }
}