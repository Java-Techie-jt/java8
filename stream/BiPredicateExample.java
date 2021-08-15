package com.javatechie.stream;

import java.util.function.BiPredicate;

public class BiPredicateExample {


    public static void main(String[] args) {


        BiPredicate<String,String> biPredicate=new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate.test("madam","madam"));


        BiPredicate<String,String> equalsPredicate= ( s1,  s2) ->s1.equals(s2);
        BiPredicate<String,String> lengthPredicate=(s1,s2)->s1.length()==s2.length();

        boolean output=lengthPredicate.and(equalsPredicate).test("madam","madam");
        System.out.println("output : "+output);

        boolean orOutput=lengthPredicate.or(equalsPredicate).test("abc","def");
        System.out.println("orOutput : "+orOutput);

        System.out.println(equalsPredicate.test("madam","madam"));

    }
}
