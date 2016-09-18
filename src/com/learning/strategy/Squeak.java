package com.learning.strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeck!!!");
    }
}
