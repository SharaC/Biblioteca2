
package biblioteca;
import java.util.Scanner;

import biblioteca.Informacion;
import biblioteca.Prestamo;
public class Biblioteca {

    
    public static void main(String[] args) {
        
         
        
        Informacion libro1= new Informacion ();
        Prestamo libro2= new Prestamo();
        Scanner teclado= new Scanner(System.in);
        boolean salida= false;
        
        
            do{
        
            System.out.println("Si desea gestionar información de un libro digite '1'"
                + "si desea gestionar el préstamo de un libro digite '2'");
            int opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                  libro1.inicializar();
                                      
                    break;
                case 2:
                   libro2.inicializar();
                   
                    break;
                default:
                    salida=true;
            }
            
        }while (salida==false);
        
    }
    
}
