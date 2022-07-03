package TDD;

import DesignPattern.AdapterPattern.AdapterPatternExample;
import DesignPattern.CompositePattern.CompositePattern;
import DesignPattern.PluggableSelector.PluggableSelector;

import java.util.HashMap;
import java.util.Map;


public class main {
    static public void main(String[] args) {
        //CompositePattern compositePattern = new CompositePattern();
        //compositePattern.start();

        //AdapterPatternExample adapterPatternExample = new AdapterPatternExample();
        //adapterPatternExample.start();

        PluggableSelector pluggableSelector = new PluggableSelector();
        pluggableSelector.start();
    }
}
