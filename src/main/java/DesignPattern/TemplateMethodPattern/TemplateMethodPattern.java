package DesignPattern.TemplateMethodPattern;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("커피 준비중...");
        coffeeWithHook.prepareRecipe();
    }
}