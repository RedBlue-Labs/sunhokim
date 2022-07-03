package TDD;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(double multiplier) {
        return new Money((int) (amount * multiplier), currency);
    }
}
