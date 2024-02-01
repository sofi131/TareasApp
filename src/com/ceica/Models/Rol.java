package com.ceica.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rol extends ModeloBase {
    private int idrol;
    private String description;

    public Rol() {
    }

    public Rol(int idrol, String description) {
        this.idrol = idrol;
        this.description = description;
    }

    //---------------------------------------getter y setter--------------------------

    public int getIdrol() {
        return idrol;
    }

    public String getDescription() {
        return description;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //-----------------------------------toString--------------------------------


    @Override
    public String toString() {
        return "Rol{" +
                "idrol=" + idrol +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        //return "rol"; //en vez de un valor nulo devuelve el rol del usuario
        return null;
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
//        String admin = resultSet.getString("admin");
//        String usuario = resultSet.getString("usuario");
//        //o devuelve o admin o usuario
//        return new Rol(admin, usuario);
        return null;
    }
}
