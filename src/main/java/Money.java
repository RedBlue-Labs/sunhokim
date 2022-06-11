public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;

        return this.amount == money.amount &&
                this.getClass().equals(object.getClass());
    }

    static public Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static public Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
