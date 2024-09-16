package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking &&  ((8 <= clock)&& (clock<= 20))){
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        boolean first = (firstAge > 13 && firstAge <19);
        boolean second = (secondAge > 13 && secondAge <19);
        boolean third = (thirdAge > 13 && thirdAge <19);


        if(first || second|| third){
            return true;
        } else{
          return  false;
        }

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean isSummerTemp = temp >25 && temp <35;
        boolean isNotSummerTemp = temp >35 && temp <45;

        boolean play = (isSummer && isSummerTemp) || (!isSummer && isNotSummerTemp);

       return play ? true :false;

    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            return -1;
        } else {
            return width*height;
        }


    }

    public static double area(double radius) {
        if(radius < 0){
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}
