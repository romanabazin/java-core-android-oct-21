package ru.javacore.lession1;

public class Task1 {
    public static void main(String[] args){
        System.out.println(calculate(100f, 25f, 3f, 100f));
        }
        public static float calculate(float a, float b, float c, float d){
        float x = a*(b+(c/d));
        return x;
        }
    }

