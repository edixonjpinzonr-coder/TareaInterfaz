package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class CentroImpresion {
    private String ubicacion;

    private Empresa ownedByEmpresa;
    private Inventario inventario;
    private Nomina nomina;
    private ArrayList<Impresion> listaImpresiones;

    public CentroImpresion(String ubicacion, Empresa ownedByEmpresa,
                           Inventario inventario, Nomina nomina, ArrayList<Impresion> listaImpresiones) {
        this.ubicacion = ubicacion;
        this.ownedByEmpresa = ownedByEmpresa;
        this.inventario = inventario;
        this.nomina = nomina;
        this.listaImpresiones = listaImpresiones;
    }

    public CentroImpresion(String ubicacion, Empresa ownedByEmpresa) {
        this.ubicacion = ubicacion;
        this.ownedByEmpresa = ownedByEmpresa;
        this.listaImpresiones = new ArrayList<>();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Empresa getOwnedByEmpresa() {
        return ownedByEmpresa;
    }

    public void setOwnedByEmpresa(Empresa ownedByEmpresa) {
        this.ownedByEmpresa = ownedByEmpresa;
    }

    public ArrayList<Impresion> getListaImpresiones() {
        return listaImpresiones;
    }

    public void setListaImpresiones(ArrayList<Impresion> listaImpresiones) {
        this.listaImpresiones = listaImpresiones;
    }

    @Override
    public String toString() {
        return "CentroImpresion{" +
                "ubicacion='" + ubicacion + '\'' +
                ", ownedByEmpresa=" + ownedByEmpresa.getNombre() +
                ", inventario=" + inventario +
                ", nomina=" + nomina +
                ", impresion=" + listaImpresiones +
                '}';
    }

    public boolean verificarCantidadActivas() {
        boolean bandera = true;
        int contador = 0;
        for (Impresion aux : listaImpresiones) {
            if (aux.observarEstado() == EstadoImpresora.ENCENDIDA ||
                    aux.observarEstado() == EstadoImpresora.IMPRIMIENDO ||
                    aux.observarEstado() == EstadoImpresora.SIN_PAPEL) {
                contador++;
            }
            if (contador >= 2) {
                bandera = false;
                break;
            }
        }

        return bandera;
    }

    public void agregarImpresora(Impresion nuevaImprecion) {
        this.listaImpresiones.add(nuevaImprecion);

    }


    public void listarImpresoras() {

        System.out.println("Inventario");
        if (listaImpresiones.isEmpty()) {
            System.out.println("no hay impresoras registradas");

        } else {

            for (int i = 0; i < listaImpresiones.size(); i++) {
                String tipo = listaImpresiones.get(i).getClass().getSimpleName();
                System.out.println("Numero de impresora: " + i + "\nTipo de Impresora: " + tipo);
            }
        }
    }

    public void mostrarEstado() {
        for (Impresion aux : listaImpresiones) {
            EstadoImpresora estado = aux.observarEstado();
            System.out.println("Estado de Impresora: " + estado);
        }
    }

    public void encenderImpresora(int indice) {
        if (indice < 0 || indice >= listaImpresiones.size()) {
            System.out.println("valor invalido, solo hay " + listaImpresiones.size() +
                    "impresoras. seleccione un numero del 0 al " + (listaImpresiones.size() - 1));
        } else {
            Impresion impresora = listaImpresiones.get(indice);
            impresora.conectar();
            System.out.println("conectando la impresora: " + impresora);

            if (verificarCantidadActivas() == false) {
                impresora.desconectar();
                System.out.println("Ya hay una impresor conectada");
            } else {
                System.out.println("impresora conectada correctamente");
            }
        }
    }

    public void mandarAImprimir(String mensaje) {
        boolean verificarImpresora = false;
        for (Impresion aux : listaImpresiones) {
            if (aux.observarEstado() == EstadoImpresora.ENCENDIDA) {
                String texto = aux.imprimir(mensaje);
                System.out.println("imprecion: " + texto);
                verificarImpresora = true;
                break;
            }
        }
        if (!verificarImpresora)
            System.out.println("No hay ninguna impresora conectada");
    }

    public void desconectarImpresora() {
        boolean resultado= false;
       for(Impresion aux: listaImpresiones){
           if (aux.observarEstado()!= EstadoImpresora.EN_MANTENIMINETO &&
                   aux.observarEstado()!=EstadoImpresora.APAGADA) {
               aux.desconectar();
               System.out.println("Impresora desconectada");
               resultado= true;
               break;
           }
       }
    }
}
