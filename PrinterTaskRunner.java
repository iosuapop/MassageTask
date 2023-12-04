import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrinterTaskRunner extends AbstractTaskRunner{
    //Cerinta 12

    /*
       PrinterTaskRunner - care afişeazǎ un mesaj dupǎ execuţia unui task în care se specificǎ ora la care s-a executat task-ul.
     */
    public PrinterTaskRunner(TaskRunner taskRunner){
        super(taskRunner);
    }
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public void executeOneTask(){
        //se trimit mesaje
        super.executeOneTask();
        System.out.println(LocalDateTime.now().format(formatter));
    }
}
