/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.vo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class IUsuarioAdmImp implements IUsuarioAdm{

    @Override
    public ArrayList<Usuario> getlistaUsuario() {
        ArrayList usuarioLista = new ArrayList();
        
        Usuario usuario1 = new Usuario();
        
        usuario1.setNombre("CVidal");
        usuario1.setApePaterno("López");
        usuario1.setApeMaterno("Montoya");
        usuario1.setEdad("26");
        
        usuarioLista.add(usuario1);
        
              
        return usuarioLista;
        
        
        
    }
    
}
