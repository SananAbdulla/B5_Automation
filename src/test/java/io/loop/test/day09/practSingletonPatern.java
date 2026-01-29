package io.loop.test.day09;

import org.testng.annotations.Test;


public class practSingletonPatern {

    private static practSingletonPatern instance;


    private practSingletonPatern() {


    }


    public static practSingletonPatern getInstance() {

        if (instance == null) {
            System.out.println("We are creating a practSingletonPatern instance");
           instance = new practSingletonPatern();
        } else {
            System.out.println("Already created");
        }

        return instance;
    }

}





