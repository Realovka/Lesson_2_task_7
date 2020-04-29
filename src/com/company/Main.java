package com.company;

public class Main {

    public static void main(String[] args) {
        int i, sum;
        sum=0;
        for (i=1; i<100; i++){
            if ((i%2)!=0)
                sum+=i;
        }
        System.out.println("Сумма нечетных чисел от 1 до 99 равна "+sum);
    }
}
