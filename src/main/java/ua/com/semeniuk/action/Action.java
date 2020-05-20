package ua.com.semeniuk.action;

/**
 * Template for all actions
 * @param <T> specified type of parameter.
 * @Autor Semeniuk Vladyslav
 */
public interface Action <T>{

    T execute(T a, T b) throws Exception;
}
