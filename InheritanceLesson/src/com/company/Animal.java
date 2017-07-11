package com.company;

/**
 * Created by owner on 2017-07-02.
 */
public   class Animal implements Contract{

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public void walk(){
        System.out.println("The animal is walking");
    }

    public void speak(){
        System.out.println("The animal is speaking");
    }

    public void eat(){
        System.out.println("The animal is eating");
    }

    public void breath(){
        System.out.println("The animal is breathing");
    }

    @Override
    public void see() {
        System.out.println("The animal must have eyes");
    }

    @Override
    public void excrete() {
        System.out.println("The animal must take shits");

    }

}
