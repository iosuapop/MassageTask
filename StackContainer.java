public class StackContainer extends Refactorizare{

    /*
        StackContainer - care implementeazǎ, folosind o reprezentare pe un array, o strategie de tip LIFO;
     */
    @Override
    public Task remove(){
        if(!tasks.isEmpty()){
            return tasks.remove(tasks.size()-1);
        }
        else
            return null;
    }
}
