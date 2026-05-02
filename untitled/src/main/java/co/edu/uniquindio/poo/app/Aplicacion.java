package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.util.Scanner;

public class Aplicacion {

    static Scanner scanner= new Scanner(System.in);
    static Empresa empresa= new Empresa("Papeleria");
    static CentroImpresion centroImpresion= new CentroImpresion( "primer piso", empresa);
    public static void main( String []args){

        int iniciador= 0;

        do{
            System.out.println(mostrarMenu());
            iniciador = scanner.nextInt();
            scanner.nextLine();
            ejecutarMetodo(iniciador);

        }while (iniciador!=7 );
        System.out.println("Saliendo del sistema");

    }

    public static String mostrarMenu(){
        return "Gestion de Empresa"+"\n"+
                " Seleccione una de las siguientes opciones "+ "\n"+
                "1. Mostrar lista de impresoras\n"+
                "2. Mostrar Estados de las impresoras\n"+
                "3. conectar impresora\n"+
                "4. Mandar informacion a Imprimir\n"+
                "5. Desconectar impresora\n"+
                "6. Agregar nueva impresora\n"+
                "7. Salir\n";

    }

    public static void ejecutarMetodo(int iniciador){
        switch (iniciador){
            case 1:
                mostrarImpresoras();
                break;

            case 2:
                mostrarEstados();
                break;

            case 3:
                conectarImpresora();
                break;

            case 4:
                mandarInformacionAImprimir();
                break;

            case 5:
                desconectarImpresora();
                break;
            case 6:
                agregarImpresora();
                break;

            case 7:
                break;

            default:
                System.out.println("Opcion no valida, intente de nuevo");
                break;
        }

    }

    public static void mostrarImpresoras(){
        System.out.println("IMPRESORAS: ");
        System.out.println(centroImpresion.getListaImpresiones());
    }

    public static void mostrarEstados(){
        System.out.println("Estados de todas las Impresoras: ");
        centroImpresion.mostrarEstado();
    }

    public static void conectarImpresora(){
        centroImpresion.listarImpresoras();
        System.out.println("Ingrese el numero de la impresora que desea conectar ");
        int indice= scanner.nextInt();
        centroImpresion.encenderImpresora(indice);
    }

    public static void mandarInformacionAImprimir(){
        System.out.println("ingrese lo que desea imprimir: ");
        String texto= scanner.nextLine();
        centroImpresion.mandarAImprimir(texto);
    }

    public static void desconectarImpresora(){
        centroImpresion.desconectarImpresora();
    }

    public static void agregarImpresora(){
        System.out.println("Registrar Impresora"+ "\n"+
                "¿Que impresora desea registrar?"+"\n"+
                "1. Impresora de Cartucho"+"\n"+
                "2. Impresora a Laser"); //para agregar una nueva toca agregar la opcion aqui


        int opcion= scanner.nextInt();
        scanner.nextLine();

        Impresion nuevaImpresora= null;
        switch (opcion){
            case 1:
                System.out.println("ingrese el tipo de cartucho");
                String modelo= scanner.nextLine();
                nuevaImpresora= new ImpresoraCartucho(modelo);
                break;

            case 2:
                System.out.println("ingrese el numero de paginas por minuto");
                int paginas= scanner.nextInt();
                nuevaImpresora= new ImpresoraLaser(paginas);
                break;

            default:
                System.out.println("impresora no reconocida");
                return;
        }
        if(nuevaImpresora!= null){
            centroImpresion.agregarImpresora(nuevaImpresora);
            System.out.println("Impresora: "+ nuevaImpresora.getClass().getSimpleName() + " agregada correctamente ");
        }
    }








}
