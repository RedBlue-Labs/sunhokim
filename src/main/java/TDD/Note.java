package TDD;

public class Note extends Money {
    public Note(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(double multiplier) {
        return new Money((int) (amount * multiplier), currency);
    }
}
