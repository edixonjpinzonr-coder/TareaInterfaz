package co.edu.uniquindio.poo.model;

public class ImpresoraCartucho implements Impresion{

    private String modeloCartucho;
    private EstadoImpresora estadoImpresora;

    public ImpresoraCartucho(String modeloCartucho) {
        this.modeloCartucho = modeloCartucho;
        this.estadoImpresora = EstadoImpresora.APAGADA;
    }

    public String getModeloCartucho() {
        return modeloCartucho;
    }

    public void setModeloCartucho(String modeloCartucho) {
        this.modeloCartucho = modeloCartucho;
    }

    public EstadoImpresora getEstadoImpresora() {
        return estadoImpresora;
    }

    public void setEstadoImpresora(EstadoImpresora estadoImpresora) {
        this.estadoImpresora = estadoImpresora;
    }

    @Override
    public String toString() {
        return "ImpresoraCartucho{" +
                "modeloCartucho='" + modeloCartucho + '\'' +
                ", estadoImpresora=" + estadoImpresora +
                '}';
    }

    @Override
    public String conectar(){
        this.estadoImpresora= EstadoImpresora.ENCENDIDA;
        return "la impresora esta encendiendo";
    }
    @Override
    public String desconectar(){
        this.estadoImpresora = EstadoImpresora.APAGADA;
        return "la impresora se esta apagando";
    }

    @Override
    public String imprimir(String contenido){
        if(this.estadoImpresora== EstadoImpresora.ENCENDIDA){
            return  "La impresora a laser esta imprimiendo: "+ contenido;
        }else{
            return  "la impresora esta apagada";
        }

    }


    @Override
    public EstadoImpresora observarEstado(){
        return  this.estadoImpresora;
    }
}
