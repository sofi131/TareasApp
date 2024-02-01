package com.ceica.Controllers;
import com.ceica.Models.User;

public class TaskController {
    private User userLogged;

    //ver que user está logueado
    public boolean login (String username, String password){

        User user=new User();
        userLogged=user.login(username,password);
        if(userLogged!=null){
            return true;
        }else{
            return false;
        }
    }
    public boolean createUser(String username,String pass,int rol){
        User user=new User();
        return user.insertar("(username,password,idrol) values (?,?,?)",username,pass,rol);
    }
//editar la contraseña de un usuario
    public boolean editPassword(String username,String password){
        User user=new User();
        return user.actualizar("password=? where username=?",password, username);
    }
}
