package orden;

public class Quicksort {
	public void Quicksort1(int[] array, int izquierda, int derecha) {
		int pivote = array[(izquierda+derecha)/2];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        
        
        do {
        	while(array[i]<pivote) {
        		i++;
        	}
        	while(array[j]>pivote) {
        		j--;
        	}
        	//Aqui se hace el intercambio
        	if(i<=j) {
        		auxIntercambio=array[i];
        		array[i]=array[j];
        		array[j]=auxIntercambio;
        		i++;
        		j--;
        	}
        }while(i<=j);
        if(izquierda<j) {
        	Quicksort1(array,izquierda,j);
        }
        if(i<derecha) {
        	Quicksort1(array,i,derecha);
        }
        
        
        
       /* while (i < j) {
            while (array[i] <= pivote && i < j) {
                i++;
            }
            while (array[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = array[i];
                array[i] = array[j];
                array[j] = auxIntercambio;
            }
        }
        array[izquierda] = array[j];
        array[j] = pivote;
        if (izquierda < j - 1) {
            QuickSort(array, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(array, j + 1, derecha);
        }*/
    }	
}
