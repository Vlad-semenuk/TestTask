package ua.com.semeniuk.action.impl;

import ua.com.semeniuk.action.Action;

public class StringAction implements Action<String> {

    public String execute(String a, String b) {
        return a + b;
    }
}
