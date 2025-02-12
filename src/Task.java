import java.io.Serializable;

public class Task implements Serializable {
    private static int counter = 1; // Automatyczne ID dla zadań
    private final int id;
    private String name;
    private String description;

    public Task(String name, String description) {
        this.id = counter++;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nazwa: " + name + ", Opis: " + description;
    }
}
