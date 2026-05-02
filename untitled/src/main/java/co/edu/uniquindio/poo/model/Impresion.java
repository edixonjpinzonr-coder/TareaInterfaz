package co.edu.uniquindio.poo.model;

public interface Impresion {
    String conectar();
    String desconectar();
    String imprimir(String contenidoAImprimir);
    EstadoImpresora observarEstado();

}
