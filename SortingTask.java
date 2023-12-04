public class SortingTask extends Task{
    //Cerinta 3

    /*
       Derivați clasa SortingTask din Task
       sortează un vector de numere întregi si afiseaza vectorul sortat, via metoda execute().
       SortingTask permite sortarea unui vector conform unei strategii
       Se cer doua strategii de sortare – BubbleSort si (QuickSort sau MergeSort)
       SortingTask incapsuleaza un AbstractSorter ce are metoda sort
     */
    public int[] vector;
    BubbleSort bubbleSort;
    MergeSort mergeSort;

    enum Met_sortare{
        BubbleSort,
        MergeSort
    }

    public  SortingTask(String i, String d, int[] vector, Met_sortare METODA){
        super(i,d);
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();

        if(METODA == Met_sortare.BubbleSort)
            this.vector = this.bubbleSort.sort(vector.clone());
        else
            this.vector = this.mergeSort.sort(vector.clone());
    }

    private static abstract class AbstractSorter{
        public abstract int[] sort(int[] arr);
    }

    //clasa bubblesort

    private static class BubbleSort extends AbstractSorter{
        public int[] sort(int[] arr){
            int i,aux;
            boolean ok;
            do{
                ok=true;
                for (i=0; i<arr.length-1; i++){
                    if(arr[i] > arr [i+1]){
                        aux = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = aux;
                        ok = false;
                    }
                }
            }while(!ok);
            return arr;
        }
    }

    //clasa mergesort
    private static class MergeSort extends AbstractSorter{
        private int[] copie_vector;
        public int[] sort(int[] arr){
            copie_vector = new int[arr.length];
            mergesort(arr,0,arr.length-1);
            return arr;
        }

        public void mergesort(int[] arr, int st, int dr){
            if (st<dr){
                int m= (st+dr)/2;
                mergesort(arr,st,m);
                mergesort(arr,m+1,dr);

                //interclasare
                int i = st;
                int j = m+1;
                int k = 0;

                while(i <= m && j <= dr){
                    if (arr[i] < arr[j])
                        copie_vector[++k] = arr[++i];
                    else
                        copie_vector[++k] = arr[++j];
                }

                while(i<=m)
                    copie_vector[++k] = arr[++i];

                while(i<=m)
                    copie_vector[++k] = arr[++j];

                for (i= st, j=0; i <=dr; i++, j++)
                    arr[i] = copie_vector[j];
            }
        }
    }
    @Override
    public void execute(){
        for(int i : this.vector)
        {
            System.out.print(i + "");
        }
    }

}
