package TDD.xUnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestResult {
    private int runCount;
    private int failureCount;
    private ResultListener resultListener;

    public TestResult() {
        this.runCount = 0;
        this.failureCount = 0;
    }

    public void testStarted() {
        this.runCount += 1;
    }

    public void testFailed() {
        this.failureCount += 1;
    }

    public String summary() {
        return String.format("%d run, %d failed", runCount, failureCount);
    }

    public void addListener(ResultListener resultListener) {
        this.resultListener = resultListener;
    }
}
