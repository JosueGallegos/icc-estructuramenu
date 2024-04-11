
// la condicion siempre tiene que ser cero
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner= new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();

        
        //opcion = scanner.nextInt();
        //en pynthon
        // opcion = int(inpuy)
        // ((System.out.println(opcion);


        int opcion;
       do{

        
        System.out.println("Menu principal");
        System.out.println("1. Ingrese al metodo");
        System.out.println("0. Salir del Programa");
        opcion= scanner.nextInt();

        switch (opcion) {
            case 1:
            System.out.println(" Ingrese al metodo de ordenamiento");
            int [] numeros = {20, 8, 2 ,0 -9, -10};
            metodos.imprimirArreglo(numeros);
            metodos.insertionSort(numeros);
                
                break;

                case 0:
            System.out.println(" Salida del Programa.\nAdios");
                break;
        
            default:
            System.out.println(" Opcion no valida , Ingrese una opcion de menu ");
                break;
        }


       }while(opcion != 0 );

       scanner.close();


    }






}
