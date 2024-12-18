public class Employe implements Comparable<Employe> {
    private int id;
    private String name;

    // Constructor
    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement compareTo for sorting by ID
    @Override
    public int compareTo(Employe other) {
        return Integer.compare(this.id, other.id);
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "Employe{id=" + id + ", name='" + name + "'}";
    }
}
