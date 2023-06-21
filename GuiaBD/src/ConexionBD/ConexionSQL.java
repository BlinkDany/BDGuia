package ConexionBD;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionSQL {

    String URL = "jdbc:postgresql://localhost:5432/MVC";
    private final String USER = "postgres";
    private final String PASSWORD = "1234";

    private Connection con = null;
    private Statement st;

    public ConexionSQL() {
        /*
        con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         */

        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@192.168.43.185:1521:XE");
            ods.setUser("Daniel");
            ods.setPassword("dan23");
            con = ods.getConnection();
            System.out.println("conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error de conexión!", null, JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("ksjdghj");
        }
    }

    public boolean CRUD(String sql) {
        st = null;
        try {
            st = con.createStatement();
            st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ResultSet Consultas(String SQL) {

        st = null;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
