package org.patterns.design;

import org.strategy.design.*;

public class Teste {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy

        Behaviour defense = new Defense();
        Behaviour standard = new Standard();
        Behaviour agressive = new Agressive();

        Robot robot = new Robot();
        robot.setBehaviour(standard);

        robot.move();
        robot.move();

        robot.setBehaviour(agressive);

        robot.move();
        robot.move();

        robot.setBehaviour(defense);

        robot.move();
        robot.move();


    }
}
