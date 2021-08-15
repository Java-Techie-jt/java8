package com.javatechie.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String,Integer> {
    @Override
    public void accept(String i1, Integer i2) {
        System.out.println("input 1 "+i1 +": input 2 "+i2);
    }

    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=new BiConsumerExample();
        biConsumer.accept("javatechie",53000);

        BiConsumer<String,Integer> biConsumer1=new BiConsumer<String, Integer>() {
            @Override
            public void accept(String i1, Integer i2) {
                System.out.println(i1+":"+i2);
            }
        };

        biConsumer1.accept("Welcome",143);

        BiConsumer<String,Integer> biConsumer2= ( i1,  i2) -> System.out.println("key :"+i1+" value :"+i2);
        biConsumer2.accept("youTube",786);

        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);

        map.forEach((k,v)-> System.out.println(k+","+v));


    }
}
