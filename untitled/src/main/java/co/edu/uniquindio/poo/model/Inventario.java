package co.edu.uniquindio.poo.model;

public class Inventario {

    private int cantidadProductos;
    private Empresa ownedByEmpresa;
    private CentroImpresion centroImpresion;

    public Inventario(int cantidadProductos, Empresa ownedByEmpresa,
                      CentroImpresion centroImpresion) {
        this.cantidadProductos = cantidadProductos;
        this.ownedByEmpresa = ownedByEmpresa;
        this.centroImpresion = centroImpresion;
    }

    public Inventario(int cantidadProductos, Empresa ownedByEmpresa) {
        this.cantidadProductos = cantidadProductos;
        this.ownedByEmpresa = ownedByEmpresa;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Empresa getOwnedByEmpresa() {
        return ownedByEmpresa;
    }

    public void setOwnedByEmpresa(Empresa ownedByEmpresa) {
        this.ownedByEmpresa = ownedByEmpresa;
    }

    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }

    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "cantidadProductos=" + cantidadProductos +
                ", ownedByEmpresa=" + ownedByEmpresa.getNombre() +
                ", centroImpresion=" + centroImpresion +
                '}';
    }
}
