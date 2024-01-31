package com.ceica.Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
//Creamos un usuario en el que si es admin tiene que poner unos parámetros específicos (si fuese uno...)
//Seguramente haya que poner varios admines...
public class User extends ModeloBase {
    private int iduser;
    private String usurname;
    private String password;
    private Rol rol;

    public User() {
    }

    public User(int iduser, String usurname, String password, Rol rol) {
        this.iduser = iduser;
        this.usurname = usurname;
        this.password = password;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", usurname='" + usurname + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return null;
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }

//    public static boolean getUsuario(String usr, String pass) {
//        Connection conn = bbdd.Conexion.conectar();
//        String sql = "select * from usuario where nombreUsuario=? and password=? and rol='admin'";
//        try {
//            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1, usr);
//            pst.setString(2, pass);
//            ResultSet resultSet = pst.executeQuery();
//            if (resultSet.next()) {
//                String rol = resultSet.getString("rol");
//                if (rol.equals("admin") && pass.equals("1234")) {
//
//                    return true;
//                } else if (rol.equals("usuario")) {
//                    return true;
//                }
//            }
//            return false;
//        } catch (SQLException e) {
//            return false;
//        } finally {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//
//            }
//        }
    }


