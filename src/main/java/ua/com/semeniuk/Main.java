package ua.com.semeniuk;

import ua.com.semeniuk.action.ActionContainer;
import ua.com.semeniuk.function.Function;

public class Main {

    public static void main(String[] args) throws Exception {

        Function<Integer> functionInt = new Function<>();
        Function<String> functionString = new Function<>();
        ActionContainer actionContainer = new ActionContainer();

        System.out.println("result is : " + functionInt.function(6, 4, actionContainer.getActionByNumber(1)));
        System.out.println("result is : " + functionInt.function(6, 4, actionContainer.getActionByNumber(2)));
        System.out.println("result is : " + functionInt.function(6, 4, actionContainer.getActionByNumber(3)));
        System.out.println("result is : " + functionInt.function(6, 4, actionContainer.getActionByNumber(4)));
        System.out.println("result is : " + functionString.function("6", "4", actionContainer.getActionByNumber(5)));


    }
}
