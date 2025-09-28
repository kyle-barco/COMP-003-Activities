/*
Write a program that will compute and output the time required to travel 5400 miles at a
speed of 220 mph.
 */

package com.num7.computeTime;

public class ComputeTime {
    public static void main(String[] args) {

        // VARIABLES NEEDED
        int distance = 5400, speed = 220, time;

        // COMPUTE TIME
        time = distance / speed;

        // OUTPUT
        System.out.println("\n********** COMPUTE TIME **********");
        System.out.println("Distance  : " + distance + "mi");
        System.out.println("Speed     : " + speed + "mph");
        System.out.println("Time      : " + time + " hours");
        // System.out.println("\n----------------------------");

        System.out.println("\n\nPROGRAMMED BY : KYLE BARCO");
        System.out.println("---------- END ----------");
    }

}
