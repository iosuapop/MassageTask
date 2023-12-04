public class QueueContainer extends Refactorizare{

    /*
       QueueContainer - care implementeazǎ, folosind o reprezentare pe un array, o strategie de tip FIFO;
     */
    public Task remove(){
        if(!tasks.isEmpty()){
            return tasks.remove(0);
        }
        else
            return null;
    }
}
