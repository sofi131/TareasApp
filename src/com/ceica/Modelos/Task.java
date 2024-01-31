package com.ceica.Modelos;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task extends ModeloBase {
    private int idtask;
    private String title;
    private String description;
    private Date create_time;
    private Date deadline;
    //creo su propia clase
    private boolean status;
//constructor vacío
    public Task() {
    }

    //constructor lleno

    public Task(int idtask, String title, String description, Date create_time, Date deadline, boolean status) {
        this.idtask = idtask;
        this.title = title;
        this.description = description;
        this.create_time = create_time;
        this.deadline = deadline;
        this.status = status;
    }


//--------------------------------------------------get-------------------------------------


    public int getIdtask() {
        return idtask;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getDeadline() {
        return deadline;
    }

    public boolean isStatus() {
        return status;
    }

    //-------------------------------------------set--------------------------


    public void setIdtask(int idtask) {
        this.idtask = idtask;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //------------Conexión a tasks //devuelve lista tasks y añade-------------------
    //cambiar LocalDate
    public static List<Task> getProveedores() {
        List<Task> taskList = new ArrayList<>();
        Connection conn = bbdd.Conexion.conectar();
        String sql = "select * from proveedores";
        try {
            Statement stm = conn.createStatement();
            ResultSet respuesta = stm.executeQuery(sql);
            while (respuesta.next()) {
                Task task= new Task();
                task.setIdtask(respuesta.getInt("idProveedor"));
                task.setTitle(respuesta.getString("cif"));
                task.setDescription(respuesta.getString("nombre"));
                task.setDatetime(respuesta.getDate("fecha"));
                task.setDeadline(respuesta.getDate("fecha límite"));
                task.setStatus(Status.valueOf(respuesta.getString("status")));
                taskList.add(task);
            }

        } catch (SQLException e) {
            //throw new RuntimeException(e);

            return taskList;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }
        return taskList;
    }

//-------------------------------------toString-------------------------------
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", datetime=" + datetime +
                ", deadline=" + deadline +
                ", status=" + status +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return "task";
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }
    public enum Status {
        COMPLETADO,
        NO_COMPLETADO
        //Se pueden añadir más status si se necesitasen más (de momento solo estos dos)
        //Tengo una clase enum solo para esto, no sé si aquí sirve solamente o no

    }
}
