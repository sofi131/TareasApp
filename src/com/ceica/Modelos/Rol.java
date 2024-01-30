package com.ceica.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rol extends ModeloBase {
    private String admin;
    private String usuario;

    public Rol() {
    }

    public Rol(String admin, String usuario) {
        this.admin = admin;
        this.usuario = usuario;
    }

    //---------------------------------------getter y setter--------------------------
    public String getAdmin() {
        return admin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
//-----------------------------------toString--------------------------------
    @Override
    public String toString() {
        return "Rol{" +
                "admin='" + admin + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return "rol"; //en vez de un valor nulo devuelve el rol del usuario
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        String admin = resultSet.getString("admin");
        String usuario = resultSet.getString("usuario");
        //o devuelve o admin o usuario
        return new Rol(admin, usuario);
    }
}
