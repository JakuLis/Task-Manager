import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        try {
            taskManager.loadTasksFromFile(); // Wczytanie zadań z pliku przy uruchomieniu
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania zadań: " + e.getMessage());
        }

        System.out.println("Witaj w Task Manager!");

        boolean running = true;
        while (running) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Wyświetl zadania");
            System.out.println("2. Dodaj zadanie");
            System.out.println("3. Usuń zadanie");
            System.out.println("4. Edytuj zadanie");
            System.out.println("5. Zapisz i wyjdź");

            System.out.print("Twój wybór: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Oczyszczenie bufora

            switch (choice) {
                case 1 -> taskManager.displayTasks();
                case 2 -> {
                    System.out.print("Podaj nazwę zadania: ");
                    String name = scanner.nextLine();
                    System.out.print("Podaj opis zadania: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(new Task(name, description));
                }
                case 3 -> {
                    System.out.print("Podaj ID zadania do usunięcia: ");
                    int id = scanner.nextInt();
                    taskManager.removeTask(id);
                }
                case 4 -> {
                    System.out.print("Podaj ID zadania do edycji: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Oczyszczenie bufora
                    System.out.print("Podaj nową nazwę zadania: ");
                    String newName = scanner.nextLine();
                    System.out.print("Podaj nowy opis zadania: ");
                    String newDescription = scanner.nextLine();
                    taskManager.editTask(id, newName, newDescription);
                }
                case 5 -> {
                    try {
                        taskManager.saveTasksToFile();
                        System.out.println("Zadania zapisane. Do zobaczenia!");
                        running = false;
                    } catch (IOException e) {
                        System.out.println("Błąd podczas zapisywania zadań: " + e.getMessage());
                    }
                }
                default -> System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}
