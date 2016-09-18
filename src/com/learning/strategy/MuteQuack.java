package com.learning.strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I cant Quack!!!");
    }
}
