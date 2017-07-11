package com.company;

/**
 * Created by owner on 2017-07-02.
 */
public  class Dog extends Animal {

    public Dog() {
        System.out.println("Dog constructor");
    }

    public void jump(){
        System.out.println("The Dog is jumping");
    }

    public void tail(){
        System.out.println("The Dog is wagging his tail");
    }

    @Override
    public void see() {
        System.out.println("Dog has eyesight");

    }

    @Override
    public void excrete() {

    }


}
