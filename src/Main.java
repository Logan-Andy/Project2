//Logan Andy 2/28/25 Project 2

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Tasks> taskList = new ArrayList<>();

    public static void main(String[] args) {
        options();
        try {
            int exit = 0;
            while (quit == 0) {
                int userResponse = input.nextInt();
                input.nextLine();
                if (userResponse == 1) {
                    addTask();
                } else if (userResponse == 2) {
                    deleteTask();
                } else if (userResponse == 3) {
                    updateTask();
                } else if (userResponse == 4) {
                    listTasks();
                } else if (userResponse == 5) {
                    taskItem();
                } else if (userResponse == 0) {
                    exit = 20;
                } else {
                    options();
                    System.out.println("Try again bud, that wasn't a choice.");
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }


    static void options() {
        System.out.println("""
                Please choose an option:
                (1) Add a task.
                (2) Remove a task.
                (3) Update a task.
                (4) List all tasks.
                (5) List # Priority Tasks
                (0) Exit.
                """);
    }

    static void addTask() {
        System.out.println("What's the name of the task?");
        String title = input.nextLine();
        System.out.println("Description of the your task.");
        String desc = input.nextLine();
        System.out.println("What Priority is it?(0 lowest and 5 highest)");
        int prio = input.nextInt();
        taskList.add(new Tasks(title, desc, prio));
        options();
    }

    static void listTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.)");
        } else {
            System.out.println("List of all of your tasks");
            for (Tasks task : taskList) {
                System.out.println(task);
            }
        }
        options();
    }

    static void taskItem() {
        System.out.println("What priority of tasks do you wish to see?");
        int prio = input.nextInt();
        input.nextLine();

        if (prio >= 0 && prio <= 5) {
            for (Tasks task : taskList) {
                if (task.getPrio() == prio) {
                    System.out.println(task);
                }
            }

            options();
        }
    }

    static void deleteTask() {
        System.out.println("Enter the tasks number to delete:");
        listTasks();
        int taskNumber = input.nextInt();
        input.nextLine();

        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            taskList.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
        options();
    }


    static void updateTask() {
        System.out.println("Which task? ");
        listTasks();
        int taskNumber = input.nextInt();
        input.nextLine();

        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            System.out.println("What's the name of the task?");
            String title = input.nextLine();
            System.out.println("Description of the your task.");
            String desc = input.nextLine();
            System.out.println("What Priority is it?(0 lowest and 5 highest)");
            int prio = input.nextInt();
            taskList.add(new Tasks(title, desc, prio));
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
        options();
    }
}
