package ua.com.semeniuk.action.impl;

import ua.com.semeniuk.action.Action;

public class NotAction implements Action<Object> {

    public Object execute(Object a, Object b) throws Exception {
        throw new Exception("Incorrect action type");
    }
}
