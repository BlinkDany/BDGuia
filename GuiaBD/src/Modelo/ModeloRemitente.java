
package Modelo;

import ConexionBD.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Derek
 */
public class ModeloRemitente extends Remitente{
    ConexionBD.ConexionSQL cpg = new ConexionSQL();
    ResultSet rs = null;
    String sql;
    
    public boolean RegistrarRemitente() {

        sql = "INSERT INTO Remitente (IdRemitente,cedulaPer, FechaEnvio)\n"
                + "VALUES (" + getIdRemitente() + ", '" + getCedulaPer() + "', '" + getFechaEnvio() + "');";
        return cpg.CRUD(sql);
    }
    
    public boolean ModificarRemitente(){
        
        sql = "UPDATE Remitente "
                + "SET cedulaPer = '" + getCedulaPer()+ "', FechaEntrega = '" + getFechaEnvio()+ "'"+ "WHERE IdRemitente = " + getIdRemitente() + ";";
        return cpg.CRUD(sql);
    }
    
    public boolean EliminarRemitente(){
        
        sql = "DELETE Remitente "
                + "WHERE IdRemitente = " + getIdRemitente() + ";";
        return cpg.CRUD(sql);
    }
    
    public List<Remitente> listarRemitente (int cedu){
       List<Remitente> remitent = new ArrayList<>();
       try {
            if (cedu==0) {
                sql = "SELECT IdRemitente,cedulaPer, FechaEnvio FROM Remitente";
            } else {
                sql = "SELECT IdRemitente,cedulaPer, FechaEnvio FROM Remitente WHERE IdRemitente="+cedu; 
            }
            rs = cpg.Consultas(sql);
            if (rs != null) {
                while (rs.next()) {
                    Remitente remi = new Remitente(rs.getInt(1), rs.getString(2), rs.getDate(3));
                    remitent.add(remi);
                }
            }
            return remitent;
        } catch (SQLException ex) {
            return null;
        }
    }
}
