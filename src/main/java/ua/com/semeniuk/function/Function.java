package ua.com.semeniuk.function;

import ua.com.semeniuk.action.Action;

/**
 * The main function for math operation any type.
 * @param <T> specified type of parameter.
 * @Autor Semeniuk Vladyslav
 */
public class Function<T> {

    public T function(T a, T b, Action<T> action) throws Exception {
        return action.execute(a, b);
    }
}
