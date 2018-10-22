
#**DOCUMENTACIÓN PROYECTO ORDENAMIENTOS**




# Código fuente almacenado en github

package orden;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner (System.in);
				int op,n;
				long tinicio,tfin,tiempo; //VARIABLES PARA DETERMINAR EL TIEMPO DE LA EJECUCION
				//int vector[] = {25,15,34,2,7,85};
				//int array[]= {18,21,8,14,62,20};
				do {
				tinicio=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE INICIO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
				System.out.flush();
				System.out.println("   		BIEMVENIDO AL MENU     ");
				System.out.println("1.) Metodo Burbuja.");
				System.out.println("2.) Metodo Insercion.");
				System.out.println("3.) Metodo Quicksort.");
				System.out.println("4.) Metodo Headsort.");
				System.out.println("5.) Metodo Countingsort.");
				System.out.println("6.) Metodo Radixsort.");//EL RADIXSORT NO FUNCIONA, ARREGLARLO O REEMPLAZARLO
				System.out.println("7.) Metodo Mezcla.");
				System.out.println("8.) Salir del programa.");
				System.out.println("Escoja una opcion:");
				op=sc.nextInt();
				switch(op){
				case 1:
					System.out.flush();
					System.out.println("USTED DECIDIO UTILIZAR EL METODO BURBUJA.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] arreglo=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<arreglo.length;x++) {
						arreglo[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Numeros ordenados.");
					OrdenamientoBurbuja o = new OrdenamientoBurbuja();
					o.OrdenamientoBurbuja1(arreglo);
					
					for(int i=0; i< arreglo.length;i++) {
						System.out.println(arreglo[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 2:
					System.out.flush();
					System.out.println("USTED DECIDIO UTILIZAR EL METODO INSERCION.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] vector=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<vector.length;x++) {
						vector[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Numeros ordenados:");
					Insercion ins = new Insercion();
					ins.Insercion1(vector);
					
					for(int i=0; i<vector.length;i++) {
						System.out.println(vector[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 3:
					System.out.flush();
					System.out.println("USTED DECIDIO UTILIZAR EL METODO QUICKSORT.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] array=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<array.length;x++) {
						array[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Metodo quicksort.");
					Quicksort qui = new Quicksort();
					qui.Quicksort1(array, 0, array.length-1);
					
					for(int i=0; i< array.length;i++) {
						System.out.println(array[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 4:
					System.out.flush();
					
					System.out.println("USTED DECIDIO UTILIZAR EL METODO HEAPSORT.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] arreglo2=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<arreglo2.length;x++) {
						arreglo2[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Metodo radixsort.");
					heapsort he = new heapsort();
					he
					.OrdenamientoHeapSort(arreglo2);
					
					for(int i=0; i< arreglo2.length;i++) {
						System.out.println(arreglo2[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 5:
					System.out.flush();
					System.out.println("USTED DECIDIO UTILIZAR EL METODO COUNTINGSORT.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] vecounting=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<vecounting.length;x++) {
						vecounting[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Metodo countingcksort.");
					Countingsort co = new Countingsort();
					co.Countingsort1(vecounting);
					
					for(int i=0; i< vecounting.length;i++) {
						System.out.println(vecounting[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 6:
					System.out.flush();
					System.out.println("USTED DECIDIO UTILIZAR EL METODO RADIXSORT.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] arreglo1=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<arreglo1.length;x++) {
						arreglo1[x] = (int) (Math.random()*2000)+1;
					}
					System.out.println("Metodo radixsort.");
					Radixsort ra = new Radixsort();
					ra.OrdenamientoRadixSort(arreglo1);
					
					for(int i=0; i< arreglo1.length;i++) {
						System.out.println(arreglo1[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				case 7:
					System.out.flush();
					//mezcla
					System.out.println("USTED DECIDIO UTILIZAR EL METODO RADIXSORT.");
					System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
					System.out.println("Ingrese la dimension del vector a ordenar:");
					n=sc.nextInt();
					int[] a=new int[n];
					//int arreglo = (int) (Math.random()*n)+1;
					for(int x=0;x<a.length;x++) {
						a[x] = (int) (Math.random()*1000000)+1;
					}
					
					int[] tmp = new int[a.length];
					System.out.println("Metodo radixsort.");
					Mergesort m = new Mergesort();
					m.Merge1(a,tmp,0,a.length-1);
					
					
					for(int i=0; i< a.length;i++) {
						System.out.println(a[i]);
					}
					tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
					tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
					System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				
				case 8:
					System.out.flush();
					System.out.println("Usted decidio salir del programa.");
					System.out.println("");
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
					break;
					
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
					System.out.flush();
				break;
				}
				}while(op!=8);
				
				sc.close();
			
				
				/*System.out.println("Metodo quicksort.");
				Quicksort qui = new Quicksort();
				qui.Quicksort(array, 0, array.length-1);
				
				for(int i=0; i< array.length;i++) {
					System.out.println(array[i]);
				}
				
				
				System.out.println("Metodo burbuja.");
				OrdenamientoBurbuja o = new OrdenamientoBurbuja();
				o.OrdenamientoBurbuja(arreglo);
				
				for(int i=0; i< arreglo.length;i++) {
					System.out.println(arreglo[i]);
				}
				
				System.out.println("Metodo insercion.");
				Insercion ins = new Insercion();
				ins.Insercion(vector);
				
				for(int i=0; i<vector.length;i++) {
					System.out.println(vector[i]);
				}*/
	}

}


## Codigo fuente metodos de ordenamientos


## ordenamiento inserción

package orden;

public class Insercion {
public void Insercion1(int[] vector) {
		
		int aux;
		int cont1,cont2;
		
		for(cont1=1;cont1<vector.length;cont1++) {
			aux=vector[cont1];
			for(cont2=cont1-1;cont2 >= 0 && vector[cont2] > aux; cont2--) {
				vector[cont2+1] = vector[cont2];
				vector[cont2] = aux;
			}
		}
	}
}


## Rordenamiento mergesort

package orden;

public class Mergesort {

	public void Merge1(int[] arreglo,int [] tmp,int izq, int der)
	{
		if(izq<der)
		{
			int centro = (izq + der)/2;
			Merge1(arreglo,tmp,izq,centro);
			Merge1(arreglo,tmp,centro+1,der);
			OrdenamientoMezcla(arreglo,tmp,izq,centro+1,der);
		}
	}
	
	public static void OrdenamientoMezcla(int[] arreglo, int[] tmp,int izq, int der, int rend)
	{
		int lend = der-1;
	    int tpos = izq; 
	    int lbeg = izq;
	  
	    while(izq <= lend && der <= rend){
	         if(arreglo[izq] < arreglo[der]){
	               tmp[tpos++] = arreglo[izq++];
	         }else{
	               tmp[tpos++] = arreglo[der++];
	         }
	    }
	    while(izq <= lend){
	         tmp[tpos++] = arreglo[izq++];
	    }
	    while(der <= rend){
	         tmp[tpos++] = arreglo[der++];
	    }
	    for(tpos = lbeg; tpos <= rend; tpos++){
	         arreglo[tpos] = tmp[tpos];
	    }
		
		
	}
}


## ordenamiento Heapsort
package orden;

public class heapsort {
public void OrdenamientoHeapSort(int[] arr) { 
		
		int i;
		for (i = arr.length; i > 1; i--) { 
			fnSortHeap(arr, i - 1); 
			} 		
		} 
	
		public static void fnSortHeap(int array[], int arr_ubound) { 
		
			int i, o; 
			int lChild, rChild, mChild, root, temp; 
			
			root = (arr_ubound - 1) / 2; 
			
			for (o = root; o >= 0; o--) { 
			
			for (i = root; i >= 0; i--) { 
			
			lChild = (2 * i) + 1; 
			rChild = (2 * i) + 2; 
		
		if ((lChild <= arr_ubound) && (rChild <= arr_ubound)) { 
		
			if (array[rChild] >= array[lChild]) 
			mChild = rChild; 
			else 
			mChild = lChild; 
			
		} else { 
		
			if (rChild > arr_ubound) 
			mChild = lChild; 
			else 
			mChild = rChild; 
		
		} 
		
		if (array[i] < array[mChild]) { 
		
			temp = array[i]; 
			array[i] = array[mChild]; 
			array[mChild] = temp; 
			
			} 
			} 
		} 
		
		temp = array[0]; 
		array[0] = array[arr_ubound]; 
		array[arr_ubound] = temp; 
		return; 
		
		} 
	}


## ordenamiento Quicksort

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

## ordenamiento Countingsort

package orden;

public class Countingsort {
	public void Countingsort1(int[] vecounting) {
		int arrayLength = vecounting.length;
        if (arrayLength == 0)
            return;
        int max = vecounting[0], min = vecounting[0];
        for (int i = 1; i < arrayLength; i++) {
            if (vecounting[i] > max)
                max = vecounting[i];
            if (vecounting[i] < min)
                min = vecounting[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < arrayLength; i++)
            count[vecounting[i] - min]++;
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
            	vecounting[j++] = i + min;
	}
	
}




## ordenamiento Radixsort
package orden;

public class Radixsort {
	
		static int getMax(int[] arreglo, int n)
		{
			int mx = arreglo[0]; 
	        for (int i = 1; i < n; i++) 
	            if (arreglo[i] > mx) 
	                mx = arreglo[i]; 
	        return mx; 
		}


	public void countSort(int arreglo[], int n, int exp) {
		    int [] output = new int[n];
		    int [] count  = new int[10];
		    int i;
		 
		    for (i = 0; i < n; i++)
		        count[(arreglo[i] / exp) % 10]++;
		 
		    for (i = 1; i < 10; i++)
		        count[i] += count[i - 1];
		 
		    for (i = n - 1; i >= 0; i--) {
		        output[count[(arreglo[i] / exp) % 10] - 1] = arreglo[i];
		        count[(arreglo[i] / exp) % 10]--;
		    }
		 
		    for (i = 0; i < n; i++)
		        arreglo[i] = output[i];
		}
		
		
		
		public void OrdenamientoRadixSort(int[] arreglo)
		{
			int n = arreglo.length;
			int m = getMax(arreglo, n);
			 
		    int exp;
		    for (exp = 1; m / exp > 0; exp *= 10)
		 
		        countSort(arreglo, n, exp);
		}
}





# Diagramas de clases



## Ordenamiento inserción
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/diagramas/insercion.png?raw=true)
## Ordenamiento mergesort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/diagramas/merge.png?raw=true)

## Ordenamiento heapsort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/diagramas/heap.png?raw=true)

## Ordenamiento quicksort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/diagramas/quick.png?raw=true)

## Ordenamiento countingsort

## Ordenamiento radixsort


# Analisis de velocidades

## Ordenamiento inserción
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/insercion.PNG?raw=true)

## Ordenamiento mergesort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/merge.PNG?raw=true)

## Ordenamiento heapsort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/heap.PNG?raw=true)

## Ordenamiento quicksort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/quick.PNG?raw=true)

## Ordenamiento countingsort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/counting.PNG?raw=true)

## Ordenamiento radixsort
![enter image description here](https://github.com/vly241/PooProyectoCorte2/blob/master/velocidades/radix.PNG?raw=true)





# Ventajas y desventajas
|                |ventajas                        |desventajas                         |
|----------------|-------------------------------|-----------------------------|
|insercion|   no es muy complejo//tiene un buen funcionamiento si hablamos de listas pequeñas//  requiere de poco espacio    |    no es uno de los motodos mas rapidos//su funcionamiento no es muy bueno si se coloca una lista grande        |
|Mezcla        |            |           |
|quicksort         |||
|heapsort|   los datos desordenados los acomoda efectivamente //puede llegar a ser tan bueno como el metodo quicksort // no utiliza memorial adicional    |es un metodo con una estructura complicada y compleja//puede llegar a no ser estable||       |          |
|countingsort|     |||       |           |
|radixsort|        |||       |           |




# Conclusiones


## Ordenamiento inserción
metodos de ordenamiento el proceso de direccionar datos en un orden especifico
por ejemplo tenemos es metodo por insercion 
es el este plantea que los datos de un arreglo puedan estar ordenados
y repetidos.
el metodo esta basado en hacer muchas comparaciones 
y estructurando con anterioridad la forma de comparar los elementos
el metodo insercion es sencillo ya que este se acomoda facilmente 
a muchas situaciones hasta en la vida cotidiana ya que nuestro cerebro
ordenan las cosas paresido al insercion por que comparamos una por una hasta que
aquellos objetos se encuentren ordenados y un ejemplo relativo 
puede ser las carpetas.

## Ordenamiento mergesort
El metodo de ordenamiento merge, es bastante eficiente y sirve para manejar un volumen de datos bastante grande, porque no maneja muchas iteraciones lo que reduce el consume computacional.

## Ordenamiento heapsort
este puede llegar ser un poco mas lento que los otros metodos 
re ordenamientos pero tambien puede llegar a ser mas eficaz esto es por su
estructura de arbol y tambien es complejo y este metodo es 
sumamente eficaz cuando se trata de arreglos estaticos.

## Ordenamiento quicksort
Es uno de los mejores metodos de ordenamiento, este metodo demuestra que es muy efectivo cuando se tiene grandres catidades de datos a trabajar y cuando se necesita ahorrar tiempo y recursos.

## Ordenamiento countingsort y radixsort
Los métodos de ordenamiento de datos son sumamente utiles,
 pues la manera de arreglar una cantidad de nuemeros al 
azar en algun tipo de ordenamiento secuencial de acuerdo
 a sus criterios de orden, que puede ser de muchos tipos
; en este caso numerico.
Nos facilitan el ordenamiento de una cantidad de numeros 
en un moderado tiempo,siendo metodos muy eficientes.
A traves de la forma de ordenamiento de cada metodo hay una
 comparacion de valores que se intercambian si no se encuantran
 en una posicion correcta debido a su valor.
