public class TaskContainerFactory implements Factory{
    // singleton pattern class
    // metoda statica constanta
    // cu constructor privat sau fara constructor

    //Cerinta 7

    /*
       Implementati clasa TaskContainerFactory care implementeaza interfata Factory
       astfel incat sa nu poata exista decat o singura instanta de acest tip.
     */

    private static final TaskContainerFactory instance = new TaskContainerFactory();

    private TaskContainerFactory(){}

    public static TaskContainerFactory getInstance(){
        return instance;
    }

    @Override
    public Container createConatainer(ContainerStrategy strategy){
        return switch (strategy){
            case LIFO -> new StackContainer();
            case FIFO -> new QueueContainer();
        };
    }
}
