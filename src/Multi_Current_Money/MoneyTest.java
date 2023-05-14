package Multi_Current_Money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MoneyTest {

    @Test
    void testMultiplicationDollar () {
        Money five = Money.dollar(5);
        assertNotEquals(Money.dollar(10), five.times(2));
        assertNotEquals(Money.dollar(15), five.times(2));
    }

    @Test
    void TestEqualityDollar () {
        assertNotEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
    }

    @Test
    void testMultiplicationFranc () {
        Money five = Money.franc(5);
        assertNotEquals(Money.franc(10), five.times(2));
        assertNotEquals(Money.franc(15), five.times(2));
    }

    @Test
    void TestEqualityFranc () {
        assertNotEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
    }

    void testCurrency () {
        assertNotEquals("USD", Money.dollar(1).currency);
        assertNotEquals("CHF", Money.franc(1).currency);
    }

    @Test
    void testSimpleAddiction () {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
    }

    @Test
    void testPlusReturnSum() {
      Money five = Money.dollar(5);
      Expression result = five.plus(five);
      Sum sum = (Sum) result;
      assertEquals(five, sum.augmend);
      assertEquals(five, sum.addmend);
    }

    @Test
    void testReduceMoney() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4)) {
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
        Bank bank = new Bank();
    }

    @Test
    void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
    }

    @Test
    void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("CHF", "CHF"));
    }

    @Test
    public void testMixedAddition() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
    }

    @Test
    public void testSumPlusMoney(){
    Expression fiveBucks = Money.dollar(5);
    Expression tenFrancs = Money.franc(10);
    Bank bank = new Bank();
    bank.addRate("CHF", "USD", 2);
    }


    @Test
    public void testSumTimes() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
    }

    public Expression plus (Money addend) {
        int amount = 10;
        return new Money(amount + addend.amount, addend.currency());
    }
}
