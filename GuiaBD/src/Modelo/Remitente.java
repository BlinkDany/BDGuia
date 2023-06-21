
package Modelo;

import java.sql.Date;

/**
 *
 * @author Derek
 */
public class Remitente {
    private int IdRemitente ;
    private String cedulaPer ;
    private Date FechaEnvio;

    public Remitente() {
    }

    public Remitente(int IdRemitente, String cedulaPer, Date FechaEnvio) {
        this.IdRemitente = IdRemitente;
        this.cedulaPer = cedulaPer;
        this.FechaEnvio = FechaEnvio;
    }

    public int getIdRemitente() {
        return IdRemitente;
    }

    public void setIdRemitente(int IdRemitente) {
        this.IdRemitente = IdRemitente;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public Date getFechaEnvio() {
        return FechaEnvio;
    }

    public void setFechaEnvio(Date FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }
}
