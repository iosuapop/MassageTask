public interface Container {

    //Cerinta 5
    /*
       interfata Container specificǎ interfaţa comunǎ pentru colecţii de obiecte Task,
       în care se pot adǎuga şi din care se pot elimina elemente
     */
    Task remove();
    void add(Task task);
    int size();
    boolean isEmpty();
}
