/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import com.vo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "webService1")
public class webService1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListaUsuarios")
    public List<Usuario> getListaUsuarios(){

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        
        Usuario usu1 = new Usuario();
        Usuario usu2 = new Usuario();
        Usuario usu3 = new Usuario();
        
        usu1.setNombre("CVidal");
        usu1.setApePaterno("López");
        usu1.setApeMaterno("Montoya");
        usu1.setEdad("26");
        
        usu2.setNombre("Juan");
        usu2.setApePaterno("Perez");
        usu2.setApeMaterno("Perez");
        usu2.setEdad("25");
        
        usu3.setNombre("Richard");
        usu3.setApePaterno("Stallman");
        usu3.setApeMaterno("Stallman");
        usu3.setEdad("55");
        
        
        listaUsuario.add(usu1);
        listaUsuario.add(usu2);
        listaUsuario.add(usu3);
        
        return listaUsuario;
    }

   

}
