package DesignPattern.CompositePattern;

public class CompositePattern {

    public void start() {
        MenuComponent pancake = new Menu("팬케이크", "아침메뉴");
        MenuComponent dinner = new Menu("점심", "점심메뉴");
        MenuComponent cafe = new Menu("커피", "저녁메뉴");
        MenuComponent desert = new Menu("디저트", "아침메뉴");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체메뉴");

        allMenus.add(pancake);
        allMenus.add(dinner);
        allMenus.add(cafe);

        dinner.add(new MenuItem("파스타", "알리오올리", true, 3000));
        dinner.add(desert);

        desert.add(new MenuItem("애플파이", "바삭한 크러스트", true, 10000));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
