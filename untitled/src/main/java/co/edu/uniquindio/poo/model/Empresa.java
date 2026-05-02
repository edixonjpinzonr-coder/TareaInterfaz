package co.edu.uniquindio.poo.model;

public class Empresa {
    private String nombre;

    private Inventario inventario;
    private Nomina nomina;
    private CentroImpresion centroImpresion;

    public Empresa(String nombre, Inventario inventario,
                   Nomina nomina, CentroImpresion centroImpresion) {
        this.nombre = nombre;
        this.inventario = inventario;
        this.nomina = nomina;
        this.centroImpresion = centroImpresion;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }

    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", inventario=" + inventario +
                ", nomina=" + nomina +
                ", centroImpresion=" + centroImpresion +
                '}';
    }
}
