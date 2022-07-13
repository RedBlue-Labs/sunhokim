package TDD;

import java.util.ArrayList;
import java.util.List;

public class Account implements Holding {
    private List<Holding> holdings = new ArrayList<>();

    public void addTransaction(Holding holding) {
        holdings.add(holding);
    }

    @Override
    public Expression balance() {
        Expression sum = Money.zero();

        for (int i = 0; i < holdings.size(); i++) {
            sum = sum.plus(holdings.get(i).balance());
        }

        return sum;
    }
}
