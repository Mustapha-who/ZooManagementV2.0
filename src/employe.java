public class employe implements Comparable<employe>{

    private int id;
    private String nom;
    private String prenom;
    private String departement;
    private int grade;

    public employe(){}

    public  employe(int id, String nom, String prenom, String departement, int grade){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;

    }

    public boolean equals(Object obj) {
        // Vérification si c'est le même objet
        if (this == obj) {
            return true;
        }

        // Vérification si l'objet passé est null ou d'un type différent
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Conversion de l'objet en Employe et comparaison des champs
        employe employe  = (employe) obj; // lazmk tcasti il obj bich tnajem tist3ml il emp2.nom et emp2.id etc...
        return this.id == employe.id && this.nom.equals(employe.nom);

    }

    public String toString() {
        return "Employe{" +"id=" + id +", nom='" + nom + '\'' +", prenom='"
                + prenom + '\'' +", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }


    public int compareTo(employe other) {
        return Integer.compare(this.id, other.id); // Compare by id
    }


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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
