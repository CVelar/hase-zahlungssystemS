package payment;

import bankingEntity.Bank;

/**
 * Schnittstelle, die alle Zahlungsmethoden implementieren müssen,
 * damit sie austauschbar in das System eingebunden werden können.
 */
public interface PaymentMethod {

    /**
     * Führt die eigentliche Zahlung durch.
     *
     * @param amount Betrag, der bezahlt werden soll
     */
    void pay(double amount);

    /**
     * Prüft die Zahlungsdaten gegen die angebundene Bank.
     *
     * @param bank Bankinstanz, die die Validierung übernimmt
     * @return true, wenn die Daten akzeptiert werden
     */
    boolean validate(Bank bank);
}
