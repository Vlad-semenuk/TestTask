package ua.com.semeniuk.action.impl;

import ua.com.semeniuk.action.Action;

public class DivisionAction implements Action<Integer> {

    public Integer execute(Integer a, Integer b) throws Exception {
        if (b == 0){
            throw new Exception("Division by zero is prohibited");
        }
        return a / b;
    }
}
