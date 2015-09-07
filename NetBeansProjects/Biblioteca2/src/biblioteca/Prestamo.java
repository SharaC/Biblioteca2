
package biblioteca;

import java.util.Arrays;
import java.util.Scanner;
import biblioteca.Informacion;

public class Prestamo {
    Informacion objeto = new Informacion ();
    
    Scanner teclado= new Scanner(System.in);
    static public String [] prestados= new String[50];
    static public String [] usuar_prestador= new String [50];
    static String [] libros1;
    static String [] autores1;
    static String [] anios_pub1;
    static String [] codigos1;
    static Integer [] cantidades1;
    static Integer [] areas1;
    static int usuario1;        
    
    public void inicializar(){
        Prestamo objeto3= new Prestamo();
        boolean salir =false;
        do{
            System.out.println("Ingrese la opción de gestion de prestamo que desee asi:"
                + "'1' para prestar un libro, '2' para devolver un libro prestado,"
                + "'3' para consultar sus libros prestados, '4' para regresar al menú principal");
        int opcion= teclado.nextInt();
        switch(opcion){
                case 1:
                    objeto3.Prestar();
                    
                    break;
                    
                case 2:
                    objeto3.devolver();
                    
                    break;
                    
                case 3:
                    objeto3.mostrar();
                    
                    break;
                default:    
                    System.out.println("Instruccion incorrecta, debe volvr al menú principal");
                    salir= true;
        }
        }while (salir==false);
    }
    public void Prestar(){
        libros1= objeto.getLibros();
        autores1= objeto.getAutores();
        anios_pub1= objeto.getAnio_pub();
        codigos1= objeto.getCodigos();
        cantidades1= objeto.getCantidades();
        areas1= objeto.getAreas();
        usuario1= objeto.getUsuario();
        
        System.out.println(Arrays.asList(libros1));
        
        objeto.buscar();
        System.out.println("Ingrese su cedula");
        System.out.println(Arrays.asList(cantidades1));
        System.out.println(usuario1);
        String cedula= teclado.next();
        cantidades1[usuario1]=cantidades1[usuario1]-1;
        System.out.println(Arrays.asList(cantidades1));
        for (int j=0;j<=49;j++){
            if (usuar_prestador[j]== null){
                usuar_prestador[j]=cedula;
                prestados[j]=libros1[usuario1];
                System.out.println("libros"+Arrays.asList(libros1));
                j=50;
                                
            }else if(j==49){
                System.out.println("No se pueden prestar libros en este momento");
            }
            
        }
        
        /*objeto.setlibros(libros1);
        objeto.setAutores(autores1);
        objeto.setAnios_pub(anios_pub1);
        objeto.setCodigos(codigos1);
        objeto.setAreas(areas1);*/
        objeto.setCantidades(cantidades1);
        
    }
    public void devolver(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro que desea devolver");
        String nombre= teclado.nextLine();
        for(int i=0;i<=49;i++){
            if (prestados[i].equals(nombre)){
                prestados [i]=null;
                usuar_prestador[i]=null;
                
                for(int j=0;j<=9;j++){
                    if (libros1[j].equals(nombre)){
             
                       cantidades1[i]=cantidades1[i]+1;
                                j=10;
                    }else System.out.println("El libro solicitado no se encuentra registrado en la base de datos de prestamo");
                }
                i=50;
            }else System.out.println("El libro solicitado no se encuentra registrado en la base de datos de prestamo");
        }
        
    }
    public void mostrar(){
        System.out.println("Ingrese su cedula");
        String cedula= teclado.next();
        for(int i=0;i<=49;i++){
            if (usuar_prestador[i]!=null){
            if (usuar_prestador[i].equals(cedula)){
                System.out.println("el usuario: "+cedula+"tiene prestado el libro: "+prestados[i]);
                i=50;
            }else if(i==49){ System.out.println("El usuario no registra libros prestados");
            }
            }else if(i==49){
                System.out.println("El usuario no registra libros prestados");
            }
    }
}

}