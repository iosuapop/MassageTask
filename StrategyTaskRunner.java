public class StrategyTaskRunner implements TaskRunner{

    //Cerinta 9

    /*
       Creaţi clasa StrategyTaskRunner care implementează interfața TaskRunner și care conţine:
       - Un atribut privat de tipul Container;
       - Un constructor ce primeşte ca parametru o strategie prin care se specificǎ în ce ordine se vor executa taskurile (LIFO sau FIFO);
     */
    private Container container;

    public StrategyTaskRunner(ContainerStrategy strategy){
        TaskContainerFactory taskContainerFactory = TaskContainerFactory.getInstance();
        container = taskContainerFactory.createConatainer(strategy);

        //asa nu, ca constructorul TaskContFactory e PRIVAT!!
        //container = new TaskContainerFactory().createContainer(strategy);
    }

    //constructorul

    public StrategyTaskRunner(){
        super();
    }

    @Override
    public void executeOneTask(){
        Task task = container.remove();
        task.execute();
    }

    @Override
    public void executeAll(){
        while(hasTask())
            executeOneTask();
    }

    @Override
    public void addTask(Task t){
        container.add(t);
    }

    @Override
    public boolean hasTask(){
        return !container.isEmpty();
    }
}
