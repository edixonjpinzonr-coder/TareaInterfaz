package co.edu.uniquindio.poo.model;

public class ImpresoraLaser implements Impresion{

    private int paginasMinuto;
    private EstadoImpresora estadoImpresora;

    public ImpresoraLaser(int paginasMinuto) {
        this.paginasMinuto = paginasMinuto;
        this.estadoImpresora= EstadoImpresora.APAGADA;
    }

    public int getPaginasMinuto() {
        return paginasMinuto;
    }

    public void setPaginasMinuto(int paginasMinuto) {
        this.paginasMinuto = paginasMinuto;
    }

    public EstadoImpresora getEstadoImpresora() {
        return estadoImpresora;
    }

    public void setEstadoImpresora(EstadoImpresora estadoImpresora) {
        this.estadoImpresora = estadoImpresora;
    }

    @Override
    public String toString() {
        return "ImpresoraLaser{" +
                "paginasMinuto=" + paginasMinuto +
                ", estadoImpresora=" + estadoImpresora + '\'' +
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
