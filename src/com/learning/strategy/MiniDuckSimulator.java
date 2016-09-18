package com.learning.strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        Duck duck = new ModelDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();

        mallarDuck.performQuack();
        mallarDuck.performFly();
        mallarDuck.display();
    }
}
