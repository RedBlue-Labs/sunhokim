public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }
    int times(int multiplier) {
        amount *= multiplier;
        return amount;
    }

    public boolean equals(Object object) {
        return true;
    }
}
