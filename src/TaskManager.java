import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private final String fileName = "tasks.txt";

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Dodano zadanie: " + task.getName());
    }

    public void removeTask(int id) {
        Task taskToRemove = findTaskById(id);
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Usunięto zadanie o ID: " + id);
        } else {
            System.out.println("Nie znaleziono zadania o ID: " + id);
        }
    }

    public void editTask(int id, String newName, String newDescription) {
        Task taskToEdit = findTaskById(id);
        if (taskToEdit != null) {
            taskToEdit.setName(newName);
            taskToEdit.setDescription(newDescription);
            System.out.println("Zaktualizowano zadanie o ID: " + id);
        } else {
            System.out.println("Nie znaleziono zadania o ID: " + id);
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań do wyświetlenia.");
        } else {
            System.out.println("Twoje zadania:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void saveTasksToFile() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(tasks);
        }
    }

    public void loadTasksFromFile() throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                List<Task> loadedTasks = (List<Task>) ois.readObject();
                tasks.clear();
                tasks.addAll(loadedTasks);
                System.out.println("Załadowano zadania z pliku.");
            } catch (ClassNotFoundException e) {
                System.out.println("Błąd przy odczycie pliku: " + e.getMessage());
            }
        } else {
            System.out.println("Brak zapisanych zadań. Rozpoczynamy nową listę.");
        }
    }

    private Task findTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }
}
