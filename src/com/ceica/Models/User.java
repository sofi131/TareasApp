package com.ceica.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
//Creamos un usuario en el que si es admin tiene que poner unos parámetros específicos (si fuese uno...)
//Seguramente haya que poner varios admines...


public class User extends ModeloBase {
    private int iduser;
    private String username;
    private String password;
    private Rol rol;

    public User() {
    }


    @Override
    protected String getNombreTabla() {
        return "user";
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }
//creado a partir de TaskController
    public User login(String username, String password) {
        String sql="select iduser,username,idrol,description from"
                + "user left join rol on user.idrol=rol.idrol";
    }
}



