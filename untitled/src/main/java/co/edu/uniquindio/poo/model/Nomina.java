package co.edu.uniquindio.poo.model;

public class Nomina {
    private int cantidadEmpleados;
    private Empresa ownedByEmpresa;
    private CentroImpresion centroImpresion;

    public Nomina(int cantidadEmpleados, Empresa ownedByEmpresa,
                      CentroImpresion centroImpresion) {
        this.cantidadEmpleados = cantidadEmpleados;
        this.ownedByEmpresa = ownedByEmpresa;
        this.centroImpresion = centroImpresion;
    }

    public Nomina(int cantidadEmpleados, Empresa ownedByEmpresa) {
        this.cantidadEmpleados = cantidadEmpleados;
        this.ownedByEmpresa = ownedByEmpresa;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
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
                "cantidadProductos=" + cantidadEmpleados +
                ", ownedByEmpresa=" + ownedByEmpresa.getNombre()+
                ", centroImpresion=" + centroImpresion +
                '}';
    }

}
