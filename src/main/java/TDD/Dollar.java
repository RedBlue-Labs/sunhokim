package TDD;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(double multiplier) {
        return new Money((int) (amount * multiplier), currency);
    }
}
