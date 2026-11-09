package com.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApplication {
	

    static ArrayList<Task> tasks = new ArrayList<>();

    // Method to add a task
    public static void addTask(Scanner sc) {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Task Title: ");
        String title = sc.nextLine();

        Task task = new Task(id, title, "Pending");

        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    // Method to display all tasks
    public static void viewTasks() {

        if (tasks.isEmpty()) {

            System.out.println("No tasks available!");

        } else {

            System.out.println("\n===== YOUR TASK LIST =====");

            for (int i = 0; i < tasks.size(); i++) {

                Task task = tasks.get(i);

                task.displayTask();
            }
        }
    }

    // Method to mark task as completed
    public static void markTaskCompleted(Scanner sc) {

        System.out.print("Enter Task ID to complete: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < tasks.size(); i++) {

            Task task = tasks.get(i);

            if (task.getTaskId() == id) {

                task.setStatus("Completed");

                System.out.println("Task marked as completed!");

                found = true;

                break;
            }
        }

        if (found == false) {

            System.out.println("Task not found!");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== TO-DO LIST APPLICATION =====");

            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addTask(sc);
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    markTaskCompleted(sc);
                    break;

                case 4:
                    System.out.println("Thank you for using To-Do List!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

}
