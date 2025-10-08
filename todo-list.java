// todo list in java

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Simple console To-Do List application.
 * Save this file as ToDoApp.java
 */
public class ToDoApp {
    private static final String DATA_FILE = "todos.txt";
    private static List<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadTasks();
        System.out.println("Welcome to Simple To-Do List (Java)");
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> addTask();
                case "2" -> listTasks();
                case "3" -> markDone();
                case "4" -> deleteTask();
                case "5" -> saveTasks();
                case "6" -> { saveTasks(); System.out.println("Goodbye!"); running = false; }
                default -> System.out.println("Invalid choice — enter 1-6.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add task");
        System.out.println("2. List tasks");
        System.out.println("3. Mark task as done");
        System.out.println("4. Delete task");
        System.out.println("5. Save tasks");
        System.out.println("6. Save and Exit");
        System.out.print("Choose (1-6): ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String desc = scanner.nextLine().trim();
        if (desc.isEmpty()) {
            System.out.println("Task cannot be empty.");
            return;
        }
        tasks.add(new Task(desc, false));
        System.out.println("Task added.");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        System.out.println("\nYour tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            String status = t.done ? "[x]" : "[ ]";
            System.out.printf("%d. %s %s%n", i + 1, status, t.description);
        }
    }

    private static void markDone() {
        if (tasks.isEmpty()) { System.out.println("No tasks to mark."); return; }
        listTasks();
        System.out.print("Enter task number to mark as done: ");
        Integer idx = readIntIndex();
        if (idx == null) return;
        tasks.get(idx).done = true;
        System.out.println("Marked as done.");
    }

    private static void deleteTask() {
        if (tasks.isEmpty()) { System.out.println("No tasks to delete."); return; }
        listTasks();
        System.out.print("Enter task number to delete: ");
        Integer idx = readIntIndex();
        if (idx == null) return;
        Task removed = tasks.remove((int) idx);
        System.out.println("Removed: " + removed.description);
    }

    private static Integer readIntIndex() {
        String line = scanner.nextLine().trim();
        try {
            int num = Integer.parseInt(line);
            if (num < 1 || num > tasks.size()) {
                System.out.println("Number out of range.");
                return null;
            }
            return num - 1; // convert to 0-based
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return null;
        }
    }

    // ---------- Persistence (simple text format) ----------
    private static void loadTasks() {
        Path path = Paths.get(DATA_FILE);
        if (!Files.exists(path)) return;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                // format: 0|Task description  or 1|Done task
                String[] parts = line.split("\\|", 2);
                if (parts.length == 2) {
                    boolean done = parts[0].equals("1");
                    String desc = parts[1];
                    tasks.add(new Task(desc, done));
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to load tasks: " + e.getMessage());
        }
    }

    private static void saveTasks() {
        Path path = Paths.get(DATA_FILE);
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            for (Task t : tasks) {
                bw.write((t.done ? "1" : "0") + "|" + t.description);
                bw.newLine();
            }
            System.out.println("Tasks saved to " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("Failed to save tasks: " + e.getMessage());
        }
    }

    // ---------- Task class ----------
    private static class Task {
        String description;
        boolean done;
        Task(String description, boolean done) {
            this.description = description;
            this.done = done;
        }
    }
}



// this is not working because some instaletions are in process