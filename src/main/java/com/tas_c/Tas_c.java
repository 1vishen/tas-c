package com.tas_c;

import java.util.Scanner;

public class Tas_c {
    private static String[] taskList = new String[5];

    public static void main(String[] args) {
        System.out.println("\n=====*=====*=====");

        System.out.println("Hello! Welcome to 'tas-c' task manager\n");

        System.out.println("1. Add task");
        System.out.println("2. View tasks");
        System.out.println("3. Delete tasks");
        System.out.print("Pick an option (1, 2, 3):- ");

        TaskActions taskActions = new TaskActions();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        System.out.println("You picked: " + input);

        switch (input) {
            case 1:
                taskActions.addTask(taskList, sc);
                break;
            case 2:
                taskActions.viewTask(taskList);
                break;
            default:
                System.out.println("Invalid Option Selected!");

        }

        // if (input == 1) {
        // System.out.println("Hiii");
        // } else if (input == 2) {
        // System.out.println("Hiii2");
        // } else {
        // System.out.println("Invalid Option Selected!");
        // }

        // System.out.println("=====*=====*=====\n");
    }

}
