package innventadesk2;

import controlador.CtrlMenu;
import controlador.CtrlProducto;
import modelo.ConsultasProducto;
import modelo.Producto;
import vista.Inventario;
import vista.Login;
import vista.Menu;

public class InnventaDesk2 {

    public static void main(String[] args) {
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();

        Login login = new Login();
        Menu menu = new Menu();
        Inventario inv = new Inventario();

        CtrlMenu ctrlm = new CtrlMenu(mod, modC, menu);
        ctrlm.iniciar();
        menu.setVisible(true);

      //  CtrlProducto ctrl = new CtrlProducto(mod, modC, inv);
       // ctrl.iniciar();        
        //inv.setVisible(true);
    }

}
