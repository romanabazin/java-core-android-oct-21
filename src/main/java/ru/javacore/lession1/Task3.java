package ru.javacore.lession1;

public class Task3 {
    public static void main(String[] args){
    numbers(7);
    }
    private static void numbers(int x){
        if (x<=0) System.out.println("Число отрицательное.");
        else System.out.println("Число положительное.");
    }
}
