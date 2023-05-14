package Multi_Current_Money;

public interface Expression {
    Money reduce (Bank String);

    Sum reduce (String to);

    public Expression plus(Expression addend);

    public Expression times(int multiplier);
}
