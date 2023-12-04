import java.util.ArrayList;

public abstract class Refactorizare implements Container{

    /*
       Refactorizati clasele StackContainer si QueueContainer astfel incat sa evitati codul duplicat (bad smell)
     */
    protected ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public abstract Task remove();

    @Override
    public void add(Task task){
        tasks.add(task);
    }

    @Override
    public int size(){
        return tasks.size();
    }
    @Override
    public boolean isEmpty(){
        return tasks.isEmpty();
    }
}
