package com.ceica.Models;
import java.sql.*;

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

//-------------------------------------toString-------------------------------
    @Override
    public String toString() {
        return "Task{" +
                "idtask=" + idtask +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", create_time=" + create_time +
                ", deadline=" + deadline +
                ", status=" + status +
                '}';
    }

    @Override
    protected String getNombreTabla() {
       // return "task";
        return null;
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
