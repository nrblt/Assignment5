package com.company;



public interface StateOfCar {
    void stop();
    default void start(){
        System.out.println("We are moving");
    }


}