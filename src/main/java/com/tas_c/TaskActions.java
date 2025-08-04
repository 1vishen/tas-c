package com.tas_c;

import java.util.Scanner;

public class TaskActions {

    public String addTask(String[] str, Scanner sc) {
        System.out.println("Add your task in the following format: id, task-description, status:-");
        String inputTask = sc.nextLine();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                str[i] = inputTask;
                return "Task added successfully!";
            }
        }
        return "Task list full!";
    }

    public void viewTask(String[] str) {
        for (String string1 : str) {
            System.out.println(string1);
        }
    }
}
