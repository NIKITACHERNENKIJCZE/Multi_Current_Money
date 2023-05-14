package Multi_Current_Money;

public class Money implements Expression {
    public String currency;
    protected int amount;

    public Money (int amount, String currency) {

    }

    protected String currency(){
        return currency;
    }

    public Expression times(int multiplier) {
        return null;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equal(Object object) {
        Money money = (Dollar) object;
        return amount == money.amount
                && this.currency == money.currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend) {
            @Override
            public Money reduce (Bank String) {
                return null;
            }

            @Override
            public Expression plus (Expression addend) {
                return null;
            }

            @Override
            public Expression times (int multiplier) {
                return null;
            }
        };
    }

    @Override
    public Money reduce (Bank String) {
        return null;
    }

    @Override
    public Sum reduce (String to) {
        return null;
    }


}
