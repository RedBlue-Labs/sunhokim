package DesignPattern.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput("커피에 우유와 설탕을 넣을까요? (y/n)? ");
        if (answer.toLowerCase().startsWith("y")) return true;

        return false;
    }

    private String getUserInput(String question) {
        String answer = null;

        System.out.println(question);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch(IOException e) {
            System.err.println("IO 에러");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
