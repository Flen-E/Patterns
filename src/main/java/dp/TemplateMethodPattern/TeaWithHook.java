package dp.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Teat through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")) return true;
        else return false;
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like Lemon with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();

        }catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null) {
            return "n";
        }
        return answer;
    }
}
