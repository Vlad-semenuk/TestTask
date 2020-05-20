package ua.com.semeniuk.action.impl;

import ua.com.semeniuk.action.Action;

public class MultipleAction implements Action<Integer> {

    public Integer execute(Integer a, Integer b) {
        return a * b;
    }
}
