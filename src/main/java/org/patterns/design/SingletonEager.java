package org.patterns.design;

/**
 * Singleton Eager do Bootcamp DIO Design Patterns com
 * Java Puro
 * @author Amanda0711Martins
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
