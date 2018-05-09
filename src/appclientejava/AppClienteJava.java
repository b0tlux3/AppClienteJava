/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclientejava;

import com.ws.Usuario;
import java.util.ArrayList;
import javax.sound.sampled.Port;

/**
 *
 * @author Admin
 */
public class AppClienteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Usuario> listaUsu = (ArrayList) getListaUsuarios();
        
        for (int i = 0; i < listaUsu.size(); i++) {
            
            System.out.print("Nombre: " + listaUsu.get(i).getNombre());
            System.out.print("  ApellidoPaterno: " + listaUsu.get(i).getApePaterno());
            System.out.print("      ApellidoMaterno: " + listaUsu.get(i).getApeMaterno());
            System.out.println("        Edad: " + listaUsu.get(i).getEdad());
            
        }
        
        
        
        
        
    }

    private static java.util.List<com.ws.Usuario> getListaUsuarios() {
        com.ws.WebService1_Service service = new com.ws.WebService1_Service();
        com.ws.WebService1 port = service.getWebService1Port();
        return port.getListaUsuarios();
    }

    
    
    
}
