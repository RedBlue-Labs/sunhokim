package TDD;

public class Transaction implements Holding {
    private Money value;

    public Transaction(Money value) {
        this.value = value;
    }

    @Override
    public Expression balance() {
        return value;
    }
}
