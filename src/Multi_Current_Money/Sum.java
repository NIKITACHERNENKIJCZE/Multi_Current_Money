package Multi_Current_Money;

public abstract class Sum implements Expression {
    Expression augmend;
    Expression addmend;
    private int amount;

    public Sum (Expression augment, Expression addend) {
        this.augmend = augment;
        this.addmend = addend;
    }

    @Override
    public Sum reduce (String to) {
        int amount = augmend.reduce(to).amount + addmend.reduce(to).amount;
        return new Sum(this, addmend) {
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
                return new Sum(augmend.times(multiplier), addmend.times(multiplier)) {
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
        };
    }
}
