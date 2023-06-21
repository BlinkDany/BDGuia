
package Modelo;

import java.sql.Date;

/**
 *
 * @author Derek
 */
public class destinatario {
    private int IdRDestinatario ;
    private String cedulaPer;
    private Date FechaEntrega;

    public destinatario() {
    }

    public destinatario(int IdRDestinatario, String cedulaPer, Date FechaEntrega) {
        this.IdRDestinatario = IdRDestinatario;
        this.cedulaPer = cedulaPer;
        this.FechaEntrega = FechaEntrega;
    }

    public int getIdRDestinatario() {
        return IdRDestinatario;
    }

    public void setIdRDestinatario(int IdRDestinatario) {
        this.IdRDestinatario = IdRDestinatario;
    }

    public String getCedulaPer() {
        return cedulaPer;
    }

    public void setCedulaPer(String cedulaPer) {
        this.cedulaPer = cedulaPer;
    }

    public Date getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(Date FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }
    
}
