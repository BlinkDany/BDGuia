package guiabd;

import ConexionBD.ConexionSQL;
import Modelo.ModeloPaquetes;
import controlador.ControladorPaquetes;
import vistas.VistaPaquetes;

public class GuiaBD {

    public static void main(String[] args) {
        
        Modelo.ModeloPaquetes v = new ModeloPaquetes();
        vistas.VistaPaquetes vi = new VistaPaquetes();
        controlador.ControladorPaquetes c = new ControladorPaquetes(v, vi);
        
        c.Iniciar();
    }
    
}
