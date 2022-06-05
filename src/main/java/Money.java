public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;

        return this.amount == money.amount &&
                this.getClass().equals(object.getClass());
    }

    static public Money dollar(int amount) {
        return new Dollar(amount);
    }

    static public Money franc(int amount) {
        return new Dollar(amount);
    }

}
