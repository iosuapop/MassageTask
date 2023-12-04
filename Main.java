import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Cerinta 4
        /*
           Scrieti un program de test care creeaza un vector (array) de 5 task-uri de tipul MessageTask si le afiseaza pe ecran
         */
        MessageTask task1 = new MessageTask("1","desc1","mesaj1","p1","d1", LocalDateTime.now());
        MessageTask task2 = new MessageTask("2","desc2","mesaj2","p2","d2", LocalDateTime.now());
        MessageTask task3 = new MessageTask("3","desc3","mesaj3","p3","d3", LocalDateTime.now());
        MessageTask task4 = new MessageTask("4","desc4","mesaj4","p4","d4", LocalDateTime.now());
        MessageTask task5 = new MessageTask("5","desc5","mesaj5","p5","d5", LocalDateTime.now());

        Task[] tasks = new Task[]{task1, task2, task3, task4, task5};

        System.out.print("Multimea de taskuri: " + '\n');

        for(Task i : tasks){
            System.out.println(i);
            i.execute();
        }

        // Cerinta 10
        /*
           Scrieți un program de test care creeaza un vector de task-ri de tipul MessageTask si le executa, via un obiect de
           tipul StrategyTaskRunner, folosind strategia specificata ca parametru in linia de comanda. (main(String[] args).

         */

        System.out.print("Afisam taskuri dupa o anumita strategie" + '\n');


        //convertire string la enum
        StrategyTaskRunner runner = new StrategyTaskRunner(ContainerStrategy.valueOf(args[0]));
        for (Task mesajTask : tasks){
            runner.addTask(mesajTask);
        }
        runner.executeAll();

        //Cerinta 13
        /*
           Scrieți un program de test care creeaza un vector de task-ri de tipul MessageTask si le executa
           initial via un obiect de tipul StrategyTaskRunner apoi via un obiect de tipul
           PrinterTaskRunner (decorator), folosind startegia specificata ca parametru in linia de comanda.
         */

        System.out.print("Printer: " + '\n');
        PrinterTaskRunner taskPrint = new PrinterTaskRunner(new StrategyTaskRunner(ContainerStrategy.valueOf(args[0])));
        for (Task i : tasks){
            taskPrint.addTask(i);
        }
        //taskPrint.executeOneTask();
        taskPrint.executeAll();

        //Cerinta 14
        /*
           Scrieți un program de test care creeaza un vector de task-ri de tipul MessageTask si le executa,
           initial via un obiect de tipul StrategyTaskRunner apoi via un obiect de tipul DelayTaskRunner (decorator)
           apoi via un obiect detipul PrinterTaskRunner (decorator), folosind startegia specificata ca parametru in linia de comanda.
         */
        System.out.print("Cu Delay: " + '\n');
        DelayTaskRunner object = new DelayTaskRunner(new StrategyTaskRunner(ContainerStrategy.valueOf(args[0])));
        for (Task i : tasks){
            object.addTask(i);
        }
        object.executeAll();
    }
}