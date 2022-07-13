package TDD.xUnit;

public class Scanner {
    private Item item;
    private Display display;

    public Scanner(Display display) {
        this.display = display;
    }

    public Item scan() {
        return item;
    }
}
