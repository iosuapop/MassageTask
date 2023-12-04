import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DelayTaskRunner extends AbstractTaskRunner {

    //Cerinta 12
    /*
       DelayTaskRunner – care execută taskurile cu întârziere;
     */
    /*|try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/
    public DelayTaskRunner(TaskRunner taskRunner){
        super(taskRunner);
    }

    @Override
    public void executeOneTask(){
        try{
            Thread.sleep(3000);
            super.executeOneTask();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
