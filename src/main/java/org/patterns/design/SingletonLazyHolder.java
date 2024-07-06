package org.patterns.design;

/**
 * Singleton Lazy Holder do Bootcamp DIO Design Patterns com
 * Java Puro
 * @author Amanda0711Martins
 */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instancia = new SingletonLazyHolder();;

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return instancia;
    }

}
