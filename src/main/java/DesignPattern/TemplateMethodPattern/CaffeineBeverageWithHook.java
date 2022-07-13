package DesignPattern.TemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {

    /* 템플릿 메서드 */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected void pourInCup() {
        System.out.println("컵에 물 따르는 중");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}