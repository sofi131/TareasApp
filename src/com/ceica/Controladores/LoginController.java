package com.ceica.Controladores;

public class LoginController {
    public static boolean login(String usuario,String password){
        return Usuario.getUsuario(usuario,password);
    }
}
