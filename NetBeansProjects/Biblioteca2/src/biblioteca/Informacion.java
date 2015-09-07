
package biblioteca;
import java.util.Scanner;
import java.util.Arrays;

import biblioteca.Prestamo;
public class Informacion {
    
    String nombre;
    String autor;
    String an_publi;
    String codigo;
    int cantidad;
    int area;
    static int usuario;
    
    
      static  String [] libros= new String[10];
      static  String [] autores= new String[10];
      static  String [] anios_pub= new String[10];
      static  String [] codigos= new String[10];
      static  Integer [] cantidades= new Integer[10];
      static  Integer [] areas= new Integer[10];
    
      public String[] getLibros(){
          return libros;
      }
     public void setlibros(String libros[]){
          
      this.libros=libros;
      }
     
     public String[] getAutores(){
          return autores;
      }
     public void setAutores(String autores[]){
          
      this.autores=autores;
      }
     public String[] getAnio_pub(){
          return anios_pub;
      }
     public void setAnios_pub(String anios_pub[]){
          
      this.anios_pub=anios_pub;
      }
     public String[] getCodigos(){
          return codigos;
      }
     public void setCodigos(String codigos[]){
          
      this.codigos=codigos;
      }
     public Integer[] getCantidades(){
          return cantidades;
      }
     public void setCantidades(Integer cantidades[]){
          
      this.cantidades=cantidades;
      }
     public Integer[] getAreas(){
          return areas;
      }
     public void setAreas(Integer areas[]){
          
      this.areas=areas;
      }
     public int getUsuario(){
         return usuario;
     }
    public void inicializar(){
        
        System.out.println(Arrays.asList(libros));
    Scanner teclado= new Scanner(System.in);
    Informacion objeto= new Informacion();
    Prestamo objeto1= new Prestamo();
    boolean salir =false;
    int otro;
        
        do{
            System.out.println("Ingrese la opción de gestion que desee asi:"
                + "'1' para ingresar un libro nuevo, '2' para actualizar información de un libro existente,"
                + "'3' para eliminar un libro existente, '4' para buscar un libro en la base de datos");
        int opcion= teclado.nextInt();
            switch(opcion){
                case 1:
                    objeto.Ingresar_libro();
                    System.out.println("si desea realizar otra gestión de información"
                            + " digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    
                case 2:
                    objeto.actualizar();
                    System.out.println("si desea realizar otra gestión de información"
                            + " digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    
                case 3:
                    objeto.eliminar();
                    System.out.println("si desea realizar otra gestión de información"
                            + " digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                case 4:
                    objeto.buscar();
                    System.out.println("si desea realizar otra gestión de información"
                            + " digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    
                case 5:
                    
                    objeto1.Prestar();
                    break;
                    
                default: 
                    System.out.println("ingrese una opción válida por favor");
                    salir = true;
            }
            
        }while (salir == false);
}    
        
    public void Ingresar_libro(){
        
        
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        nombre= teclado.nextLine();
        System.out.println("Ingrese el autor del libro");
        autor= teclado.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        an_publi= teclado.next();
        System.out.println("Ingrese el codigo del libro");
        codigo= teclado.next();
        System.out.println("Ingrese la cantidad de libros de este tipo a ingresar");
        cantidad= teclado.nextInt();
        //teclado.next();
        System.out.println("Ingrese el area del libro asi: digite '1' para quimica, "
                + "'2' para fisica, '3' para tecnologia, '4' para cálculo y '5' para programación ");
        area= teclado.nextInt();
        
        
        
        for (int i=0;i<=9;i++){
            if (libros[i]== null){
                libros[i]=nombre;
                usuario=i;
                System.out.println(Arrays.asList(libros));
                i=10;
            }else if (i==10)System.out.println("La base de datos está llena, debe eliminar un libro existente.");
            
        }
        
        libros[usuario]=nombre;
        autores[usuario]= autor;
        anios_pub[usuario]=an_publi;
        codigos[usuario]= codigo;
        cantidades[usuario]= cantidad;
        areas[usuario]= area;
        
    }
    
    public void actualizar(){
        
        
        boolean salir= false;
        int otro;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro a actualizar");
        nombre= teclado.nextLine();
        for(int i=0;i<=9;i++){
            if (libros[i]!=null){
            if (libros[i].equals(nombre)){
                
                do{
                System.out.println("para actualizar: a) el autor digite '1', "
                        + "b) el año de publicación digite '2', c) el código del "
                        + "libro digite '3', d) la cantidad de libros digite '4',"
                        + "e) el area del libro digite '5'");
                int cambio= teclado.nextInt();
                switch (cambio){
                    case 1:
                        System.out.println("Ingrese el autor del libro");
                        autor= teclado.nextLine();
                        autores[i]= autor;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 2:
                        System.out.println("Ingrese el año de publicación del libro");
                        an_publi= teclado.next();
                        anios_pub[i]= an_publi;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 3:
                        System.out.println("Ingrese el codigo del libro");
                        codigo= teclado.next();
                        codigos[i]= codigo;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 4:
                        System.out.println("Ingrese la cantidad de libros a añadir. "
                                + "NOTA: la cantidad de libros actual es: "+cantidades[i]);
                        cantidad= teclado.nextInt();
                        codigos[i]= codigos[i]+codigo;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 5:
                        System.out.println("Ingrese el area del libro asi: digite '1' para quimica, "
                + "'2' para fisica, '3' para tecnologia, '4' para cálculo y '5' para programación");
                        area= teclado.nextInt();
                        areas[i]= area;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                        
                    default:
                        System.out.println("Por favor ingrese una opción correcta ");
                        
                }
                } while  (salir == false);
                i=10;
            }else if(i==10)System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
            }else if(i==9) System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
            }
    }
    
    
    public void eliminar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro a eliminar");
        nombre= teclado.nextLine();
        for(int i=0;i<=9;i++){
            if(libros[i]!=null){
            if (libros[i].equals(nombre)){
             
                libros[i]= null;
                autores[i]=null;
                anios_pub[i]= null;
                codigos[i]=null;
                cantidades[i]= null;
                areas[i]=null;
                i=10;
            }else if(i==10)System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
            }else if(i==9)System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
        }
    }
    
    public void buscar(){
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro que desea encontrar");
        nombre= teclado.nextLine();
        for(int i=0;i<=9;i++){
            if(libros[i]!=null){
            if (libros[i].equals(nombre)){
             
                System.out.println("Nombre: "+libros[i]+
                        " Autor: "+autores[i]+" Anio de publicación: "+anios_pub[i]
                +" código: "+codigos[i]+" cantidad de libros almacenados: "+cantidades[i]
                +" Area a la que pertenece el libro: "+areas[i]);
                                i=10;
            }else if(i==10) {
                System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
            }
            }else if(i==9){
                 System.out.println("El libro solicitado no se encuentra registrado en la base de datos");
            }
        }
    }
    
    
    
}
