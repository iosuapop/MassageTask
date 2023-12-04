public abstract class AbstractTaskRunner implements TaskRunner{

    //Cerinta 11
    /*
       Definiti clasa abstractă AbstractTaskRunner [Decorator Pattern] care implementează interfața TaskRunner
       conține ca și atribut privat o referință la un obiect de tipul Task Runner,
       referința primită ca parametrul prin intermediul constructorului.
     */

    private TaskRunner taskRunner;
    public AbstractTaskRunner(TaskRunner taskRunner){
        this.taskRunner = taskRunner;
    }

    //@Override
    public void executeOneTask(){
        taskRunner.executeOneTask();
    }

    @Override
    public void executeAll(){
        while (hasTask())
            executeOneTask();
    }

    @Override
    public void addTask(Task t){
        taskRunner.addTask(t);
    }

    @Override
    public boolean hasTask(){

        return taskRunner.hasTask();
    }
}
