package ru.javacore.lession1;

public class Task7 {
    public static void main(String[] args) {
        welcome("Рома");
    }
    public static String welcome(String name){
        String result = "Привет, " + name + "!";
        System.out.println(result);
        return result;
    }
}
