package com.tas_c;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tas_c {
    private static String[] taskList = new String[5];

    public static void main(String[] args) {
        System.out.println("\n=====*=====*=====");

        System.out.println("Hello! Welcome to 'tas-c' task manager\n");

        System.out.println("1. Add task");
        System.out.println("2. View tasks");
        System.out.println("3. Exit App");

        TaskActions taskActions = new TaskActions();
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Pick an option (1, 2, 3):- ");
            input = sc.nextInt();
            sc.nextLine();
            System.out.println("You picked: " + input);

            switch (input) {
                case 1:
                    String result = taskActions.addTask(taskList, sc);
                    System.out.println(result);
                    break;
                case 2:
                    taskActions.viewTask(taskList);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option Selected!");

            }
        }
        while(input != 3);

        System.out.println("=====*=====*=====\n");
    }

}
