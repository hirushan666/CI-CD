package org.example;

import java.util.Scanner;

public class Task {

    private String name;
    private String nameCopy;

    public Task(String name) {
        this.name = name;
        this.nameCopy = name;
    }

    public String getName() {
        return name;
    }

    public String getNameCopy() {
        return nameCopy;
    }

    public void printTask() {
        System.out.println("Task name: " + name);
    }

    public void printTaskAgain() {
        System.out.println("Task name: " + name);
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        String input = scanner.nextLine();
        this.name = input;
    }
}
