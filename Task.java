import java.util.Objects;

public abstract class Task {
    // Cerinta 1
    /* Definiți clasa abstractă Task
       atributele: taskID(String), descriere(String)
       metodele: un constructor cu parametri, set/get, execute() (metoda abstracta), toString()
       metodele equals - hashCode;
    */
    private String id;
    private String descriere;

    public Task(String id, String descriere){
        this.id = id;
        this.descriere = descriere;
    }

    public String getId() {
        return id;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(id, task.id) && Objects.equals(descriere, task.descriere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descriere);
    }
}
