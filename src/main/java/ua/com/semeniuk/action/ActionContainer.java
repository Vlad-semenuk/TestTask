package ua.com.semeniuk.action;

import ua.com.semeniuk.action.impl.*;


import java.util.HashMap;
import java.util.Map;

/**
 * Container for actions
 * @Autor Semeniuk Vladyslav
 */
public class ActionContainer {

    private Map<Integer, Action> actionMap;

    public ActionContainer() {
        actionMap = new HashMap<>();
        initContainer();
    }

    /**
     * Returns the specified action type by number in the container
     * @param actionNumber specified number
     * @return if action by number not exist return NotAction
     */
    public Action getActionByNumber(int actionNumber) {
        return actionMap.getOrDefault(actionNumber, new NotAction());
    }

    private void initContainer() {
        actionMap.put(1, new AddAction());
        actionMap.put(2, new SubtractAction());
        actionMap.put(3, new MultipleAction());
        actionMap.put(4, new DivisionAction());
        actionMap.put(5, new StringAction());
    }
}
