import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.time.LocalDateTime;

public class MessageTask extends Task{
    //Cerinta 2
    /*
      Derivați clasa MessageTask din clasa Task
      atributele mesaj (String), from(String), to(String) si date (LocalDateTime)
      afișează pe ecran, via metoda execute, textul mesajului (valoarea atributului mesaj) si data la care a fost creat;
      (Vezi si DateTimeFormatter)
     */

    private String message;
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(String id, String descriere, String message, String from, String to, LocalDateTime date){
        super(id, descriere);
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    private static final DateTimeFormatter DATA_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public void execute() {
        System.out.println(date.format(DATA_FORMATTER) + ":" + message);
    }

    @Override
    public String toString() {
        return "MessageTask{" +
                "id='" + getId() + '\'' +
                ", descriere='" + getDescriere() + '\'' +
                "message='" + message + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date.format(DATA_FORMATTER) +
                '}';
    }
}
