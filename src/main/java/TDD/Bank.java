package TDD;

import java.util.Hashtable;

public class Bank {
    private Hashtable rates = new Hashtable();
    private double commission = 0.0f;

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    public Money reduce (Expression source, String to){
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer((rate)));
    }

    public void commission(double commission) {
        this.commission = commission;
    }

    public Money convert(Expression money, String target) {
        Money reducedMoney = reduce(money, target);

        return (Money) reducedMoney.times((1-commission));
    }

    public int getRate(String from, String to) {
        if(from.equals(to))
            return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
