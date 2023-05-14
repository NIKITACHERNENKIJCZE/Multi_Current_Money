package Multi_Current_Money;

public class Franc extends Money {

    public Franc (int amount, String currency) {
        super(amount, currency);

    }
    @Override
    protected String currency () {
        return currency;
    }

    public Money times (int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }
}
