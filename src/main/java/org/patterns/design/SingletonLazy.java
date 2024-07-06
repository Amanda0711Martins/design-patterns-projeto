package org.patterns.design;

/**
 * Singleton Lazy do Bootcamp DIO Design Patterns com
 * Java Puro
 * @author Amanda0711Martins
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {

    if(instancia == null){
        instancia = new SingletonLazy();

    }
        return instancia;
        }

}
