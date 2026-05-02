package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.util.Scanner;

public class Aplicacion {
    public static void main( String []args){
        Scanner scanner= new Scanner(System.in);

        Empresa empresa= new Empresa("Papeleria");
        CentroImpresion centroImpresion= new CentroImpresion( "primer piso", empresa);

        ImpresoraLaser impresoraLaser= new ImpresoraLaser(5);
        ImpresoraCartucho impresoraCartucho= new ImpresoraCartucho("Cartucho HP");

        centroImpresion.agregarImpresora(impresoraCartucho);
        centroImpresion.agregarImpresora(impresoraLaser);




    }












}
