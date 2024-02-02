package com.ceica.Models;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Task extends ModeloBase {
    private int idtask;
    private String title;
    private String description;
    private Date create_time;
    private Date deadline;
    private boolean status;
    //creo su propia clase
    private User user;
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
//-----------------------------------------getter & setter-------------------------------
    public int getIdtask() {
        return idtask;
    }

    public void setIdtask(int idtask) {
        this.idtask = idtask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
       return "task";
    }
//ponemos task1 porque sino se repite
    public List<Task> getAllByUser(int iduser) {
        List<Task> taskList=new ArrayList<>();
        Task task1=new Task();
        Connection conn=task1.getConnection();
        String sql="SELECT idtask,title,T0.description,create_date,deadline,status,\n" +
                "T1.iduser,username,T2.idrol,T2.description as rol \n" +
                "from task T0 \n" +
                "left join user T1 on T0.iduser=T1.iduser\n" +
                "left join rol T2 on T1.idrol=T2.idrol where T1.iduser=?";
        try {
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1,iduser);
            ResultSet resultSet=pst.executeQuery();
            while (resultSet.next()){
                Task task=new Task();
                task.idtask=resultSet.getInt("idtask");
                task.title=resultSet.getString("title");
                task.description=resultSet.getString("description");
                task.create_time=resultSet.getDate("create_date");
                task.deadline=resultSet.getDate("deadline");
                task.status=resultSet.getBoolean("status");
                User user=new User();
                user.setIduser(resultSet.getInt("iduser"));
                user.setUsername(resultSet.getString("username"));
                Rol rol=new Rol();
                rol.setIdrol(resultSet.getInt("idrol"));
                rol.setDescription(resultSet.getString("rol"));
                user.setRol(rol);
                task.setUser(user);
                taskList.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return taskList;
    }
//ver todas las tareas (admin)
    public List<Task> getAll() {
        List<Task> taskList=new ArrayList<>();
        Task task1=new Task();
        Connection conn=task1.getConnection();
        String sql="SELECT idtask,title,T0.description,create_date,deadline,status,\n" +
                "T1.iduser,username,T2.idrol,T2.description as rol \n" +
                "from task T0 \n" +
                "left join user T1 on T0.iduser=T1.iduser\n" +
                "left join rol T2 on T1.idrol=T2.idrol where T1.iduser=?";
        try {
            Statement st=conn.createStatement();
            ResultSet resultSet=st.executeQuery(sql);
            while (resultSet.next()){
                Task task=new Task();
                task.idtask=resultSet.getInt("idtask");
                task.title=resultSet.getString("title");
                task.description=resultSet.getString("description");
                task.create_time=resultSet.getDate("create_date");
                task.deadline=resultSet.getDate("deadline");
                task.status=resultSet.getBoolean("status");
                User user=new User();
                user.setIduser(resultSet.getInt("iduser"));
                user.setUsername(resultSet.getString("username"));
                Rol rol=new Rol();
                rol.setIdrol(resultSet.getInt("idrol"));
                rol.setDescription(resultSet.getString("rol"));
                user.setRol(rol);
                task.setUser(user);
                taskList.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return taskList;
    }
}
