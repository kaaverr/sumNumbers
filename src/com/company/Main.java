package com.company;

import java.util.Arrays;

public class Main {

    public static int sumNumber(String numbers){
        Integer sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            sum+=Integer.valueOf(numbers.charAt(i))-48;
        }
        return sum;
    }

    public static int sumNumber2(String numbers){
        Integer sum = 0;
        String[] splited = numbers.split("");
        for (int i = 0; i <splited.length ; i++) {
            sum+=Integer.valueOf(splited[i]);
        }
        return sum;
    }

    public static int sumNumber3(String numbers){

        return Arrays.stream(numbers.split(""))
                .mapToInt(el->Integer.valueOf(el)).sum();
    }

    public static int sumNumber4(String numbers){

        return Arrays.stream(numbers.split(""))
                .mapToInt(Integer::valueOf).sum();
    }

    public static void main(String[] args) {
        String numbers = "3255";

        System.out.println(sumNumber(numbers));
        System.out.println(sumNumber2(numbers));
        System.out.println(sumNumber3(numbers));
        System.out.println(sumNumber4(numbers));

    }
}
