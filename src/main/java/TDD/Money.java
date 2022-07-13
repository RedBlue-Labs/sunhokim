package TDD;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    @Override
    public Expression times(double multiplier) {
        return new Money((int) (amount * multiplier), currency);
    }


    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;

        return this.amount == money.amount &&
                currency.equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money note(int amount) { return new Money(amount, "GBP"); }

    static Money zero() {
        return new Money(0, "USD");
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.getRate(currency, to);
        return new Money(amount / rate, to);
    }
}
