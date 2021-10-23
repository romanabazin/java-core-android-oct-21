package ru.javacore.lession1;

public class Task2 {
    public static void main(String[] args){
        System.out.println(numbers(13, 15));
    }
    public static boolean numbers(int first, int second){
        return first + second <= 20 && first + second >= 10;
    }
}
