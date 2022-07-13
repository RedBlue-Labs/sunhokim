package TDD.xUnit;

public class ResultListener {
    private int count;

    public ResultListener() {
        this.count = 0;
    }

    public void startTest() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
