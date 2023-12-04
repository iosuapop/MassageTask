public interface Factory {

    //Cerinta 6
    /*
       interfaţa Factory care conţine o metodǎ createContainer, ce primeşte ca parametru o strategie
       (FIFOsau LIFO) şi care întoarce un container asociat acelei strategii
     */
    Container createConatainer(ContainerStrategy strategy);
}
