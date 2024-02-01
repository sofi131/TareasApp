package com.ceica.Controllers;
import com.ceica.Models.Task;
import com.ceica.Models.User;

import java.time.LocalDate;
import java.util.List;

public class TaskController {
    //usuario logueado
    public User userLogged;

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
//editar la contraseña de un usuario (solo admin)
    public boolean editPassword(String username,String password){
        User user=new User();
        return user.actualizar("password=? where username=?",password, username);
    }
    //crear tareas
    public boolean createTask(String title, String description, LocalDate deadline){
        Task task=new Task();
        task.insertar("(title, description, deadline, iduser) values (?,?,?,?)", title,description,deadline,userLogged.getIduser());
        return true;
    }

    public List<Task> getAllTaskByUser(){
        Task task=new Task();
        return task.getAllByUser(userLogged.getIduser());
    }

//    public List<Task> getAllTask(){
//        Task task=new Task();
//        return task.getAll();
//    }




}
