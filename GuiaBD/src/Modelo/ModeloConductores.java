
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Derek
 */
public class ModeloConductores extends Conductores{
    
    ConexionBD.ConexionSQL cpg = new ConexionBD.ConexionSQL();
    ResultSet rs = null;
    String sql;
    
    public boolean crearConductor() {
        sql = "INSERT INTO Conductor(IdConductor,cedulaPer,salario)"
                + " VALUES (" + getIdConductor()
                + "," + getCedulaPer()
                + "," + getSalario()
                + ")";
        return cpg.CRUD(sql);
    }
    
    public boolean ModificarConductor(){
        
        sql = "UPDATE Conductor "
                + "SET cedulaPer = '" + getCedulaPer()+ "', salario = '" + getSalario()+ "'"+ "WHERE IdConductor = " + getIdConductor() + ";";
        return cpg.CRUD(sql);
    }
    
    public boolean EliminarConductor(){
        
        sql = "DELETE Conductor "
                + "WHERE IdConductor = " + getIdConductor() + ";";
        return cpg.CRUD(sql);
    }
    
    public List<Conductores> listarConductores (int cedu){
       List<Conductores> conduc = new ArrayList<>();
       try {
            if (cedu==0) {
                sql = "SELECT IdConductor,cedulaPer,salario FROM Conductor";
            } else {
                sql = "SELECT IdConductor,cedulaPer,salario FROM Conductor WHERE cedulaPer="+cedu; 
            }
            rs = cpg.Consultas(sql);
            if (rs != null) {
                while (rs.next()) {
                    Conductores conductor = new Conductores(rs.getInt(1), rs.getString(2), rs.getInt(3));
                    conduc.add(conductor);
                }
            }
            return conduc;
        } catch (SQLException ex) {
            return null;
        }
    }
}
