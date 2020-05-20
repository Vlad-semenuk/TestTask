package ua.com.semeniuk.function;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.semeniuk.action.ActionContainer;

public class FunctionTest {

    private ActionContainer actionContainer;

    @Before
    public void setUp() {
        actionContainer = new ActionContainer();
    }

    @Test
    public void testFunctionShouldBeSuccessfulAddingOperation() throws Exception {
        int expected = 5;
        Function<Integer> function = new Function<>();
        int actual = function.function(2, 3 , actionContainer.getActionByNumber(1));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFunctionShouldBeSuccessfulSubtractOperation() throws Exception {
        int expected = 4;
        Function<Integer> function = new Function<>();
        int actual = function.function(5, 1 , actionContainer.getActionByNumber(2));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFunctionShouldBeSuccessfulMultiplyOperation() throws Exception {
        int expected = 40;
        Function<Integer> function = new Function<Integer>();
        int actual = function.function(4, 10, actionContainer.getActionByNumber(3));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFunctionShouldBeSuccessfulDivisionOperation() throws Exception {
        int expected = 4;
        Function<Integer> function = new Function<>();
        int actual = function.function(12, 3, actionContainer.getActionByNumber(4));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFunctionShouldBeSuccessfulStringConcatOperation() throws Exception {
        String expected = "asddsa";
        Function<String> function = new Function<>();
        String actual = function.function("asd", "dsa", actionContainer.getActionByNumber(5));
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testFunctionShouldBeThrowsException() throws Exception {
        Function<String> function = new Function<>();
        function.function("a", "b", actionContainer.getActionByNumber(22));
    }

    @Test(expected = Exception.class)
    public void testFunctionShouldBeThrowsExceptionByDivisionsByZero() throws Exception {
        Function<Integer> function = new Function<>();
        function.function(10, 0, actionContainer.getActionByNumber(4));
    }

}