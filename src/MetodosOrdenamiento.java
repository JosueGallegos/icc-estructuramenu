import java.util.Scanner;

public class MetodosOrdenamiento {
// Isertion = Insercion
// Sort = ordenar
    public void insertionSort(int [] numeros){
        int tamano= numeros.length;
        for(int i= 1; i<tamano;i++){
            // El elemento a comparar
            int elementoActual=numeros[i];
            int j=i-1;
            while (j>=0 && numeros[j]>elementoActual){
                numeros[j+1]=numeros[j];
                j=j-1; //  j--;
            }
            numeros[j+1]= elementoActual;


        }
        imprimirArreglo(numeros);


        

    }

    //Metodo para imprimir un Arreglo de int

    public void imprimirArreglo(int [] numeros ){
        for (int i=0; i< numeros.length;i++){

            System.out.print(numeros[i]+ " ");
        }

        
    
    }



    
    
    
}
