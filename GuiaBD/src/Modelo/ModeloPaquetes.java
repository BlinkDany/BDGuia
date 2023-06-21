package Modelo;

import ConexionBD.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPaquetes extends Paquetes{

    ConexionBD.ConexionSQL con = new ConexionSQL();

    public boolean Registrar() {

        String sql = "INSERT INTO paquetes (codigopaquete,descripcion, direccion, peso, idremitente, iddestinatario, codcanton)\n"
                + "VALUES (" + getCodPaquete() + ", '" + getDescripcion() + "', '" + getDireccion() + "', " + getPeso() + ", "
                + "" + getIdRemitente() + ", " + getIdDestinatario() + ", " + getCodCanton() + ");";
        return con.CRUD(sql);
    }
    
    public boolean Modificar(){
        
        String sql = "UPDATE viajes "
                + "SET descripcion = '" + getDescripcion() + "', direccion = '" + getDireccion() + "', peso = " + getPeso() + ", "
                + "idremitente = " + getIdRemitente() + ", iddestinatario = " + getIdDestinatario() + ", codcanton = " + getCodCanton() + " "
                + "WHERE codigopaquete = " + getCodPaquete() + ";";
        return con.CRUD(sql);
    }
    
    public boolean Eliminar(){
        
        String sql = "DELETE viajes "
                + "WHERE codigopaquete = " + getCodPaquete() + ";";
        return con.CRUD(sql);
    }
    
    public List<Paquetes> ListaPaquetes(){
        
        try {
            String sql = "select * from paquetes order by codcanton;";
            ResultSet res = con.Consultas(sql);
            List<Paquetes> paquete = new ArrayList<>();            
            
            while (res.next()) {
                Paquetes mipaquete = new Paquetes();
                mipaquete.setCodCanton(res.getInt("codcanton"));
                mipaquete.setCodPaquete(res.getInt("codigopaquete"));
                mipaquete.setDescripcion(res.getString("descripcion"));
                mipaquete.setDireccion(res.getString("direccion"));
                mipaquete.setIdDestinatario(res.getInt("iddestinatario"));
                mipaquete.setIdRemitente(res.getInt("idremitente"));
                mipaquete.setPeso(res.getDouble("peso"));
                mipaquete.setPrecio(res.getDouble("precio"));
                
                paquete.add(mipaquete);
            }
            res.close();
            return paquete;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
