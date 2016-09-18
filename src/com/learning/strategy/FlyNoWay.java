package com.learning.strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
