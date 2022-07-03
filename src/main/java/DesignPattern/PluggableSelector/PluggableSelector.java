package DesignPattern.PluggableSelector;

public class PluggableSelector {
    public void start() {
        PluggableTest junit = new PluggableTest();
        junit.addTest(UnderTest.class);
        junit.runTest();
    }
}
