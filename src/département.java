public class département {
    private int id;
    private String nom;
    private int nombreEmployes;

    // Constructeur sans paramètres
    public département() {}

    // Constructeur avec paramètres
    public département(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof département)) return false;

        département that = (département) obj;
        return id == that.id && nom.equals(that.nom);
    }

    //  la méthode toString
    @Override
    public String toString() {
        return "Département{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
