package io.loop.test.MethodsWritingPractice;

public class T2_singleton_pattern_example_pract {


    public T2_singleton_pattern_example_pract() {


    }


    private static String word;


    public static String getWord() {

        if (word == null) {
            System.out.println("First time calling, word is null but assigning it now");
            word = "driver";

        } else {
            System.out.println("word is already assigned");
        }


        return word;
    }
}
