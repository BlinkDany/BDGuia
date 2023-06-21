
package Modelo;

/**
 *
 * @author Derek
 */
public class Conductores {
    private int IdConductor ;
    private String cedulaPer ;
    private double salario;

    public Conductores() {
    }

    public Conductores(int IdConductor, String cedulaPer, double salario) {
        this.IdConductor = IdConductor;
        this.cedulaPer = cedulaPer;
        this.salario = salario;
    }

    public int getIdConductor() {
        return IdConductor;
    }

    public void setIdConductor(int IdConductor) {
        this.IdConductor = IdConductor;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
