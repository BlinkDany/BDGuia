package Modelo;

import ConexionBD.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPaquetes extends Paquetes{

    ConexionBD.ConexionSQL con = new ConexionSQL();

    public boolean Registrar() {

        String sql = "INSERT INTO PAQUETES (codigopaquete, descripcion, direccion, peso, precio, idremitente, iddestinatario, codcanton) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.Creae(sql);
            stmt.setInt(1, getCodPaquete());
            stmt.setString(2, getDescripcion());
            stmt.setString(3, getDireccion());
            stmt.setDouble(4, getPeso());
            stmt.setDouble(5, getPrecio());
            stmt.setInt(6, getIdRemitente());
            stmt.setInt(7, getIdDestinatario());
            stmt.setInt(8, getCodCanton());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ValidarCodigo() {

        try {
            int count = 0;
            boolean val = false;
            String sql = "select count(codigopaquete) "
                    + "from paquetes where codigopaquete = " + getCodPaquete() + "";
            ResultSet res = con.Consultas(sql);

            while (res.next()) {

                count = res.getInt("count(codigopaquete)");
            }

            if (count == 0) {

                val = true;
            }

            return val;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean Modificar() {

        String sql = "UPDATE viajes "
                + "SET descripcion = '" + getDescripcion() + "', direccion = '" + getDireccion() + "', peso = " + getPeso() + ", "
                + "idremitente = " + getIdRemitente() + ", iddestinatario = " + getIdDestinatario() + ", codcanton = " + getCodCanton() + " "
                + "WHERE codigopaquete = " + getCodPaquete() + ";";
        return con.CRUD(sql);
    }

    public boolean Eliminar() {

        String sql = "DELETE viajes "
                + "WHERE codigopaquete = " + getCodPaquete() + ";";
        return con.CRUD(sql);
    }

    public List<Paquetes> ListaPaquetes() {

        try {
            String sql = "SELECT * FROM DANIEL.PAQUETES ORDER BY codigopaquete";
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
