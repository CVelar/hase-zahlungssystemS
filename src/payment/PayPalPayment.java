package payment;

import bankingEntity.*;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Bezahlung von " + amount + " mit PayPal erfolgreich.");
    }

    @Override
    public boolean validate(Bank bank) {
        return bank.validatePayPal(email, password);
    }
}
