package moneycalculator.model;

public class Money {

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    private final double amount;
    private final Currency currency;
    
    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    
}
