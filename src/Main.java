import com.ceica.Controllers.TaskController;
import com.ceica.Models.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskController taskController = new TaskController();
        taskController.login("admin", "1234");
        taskController.completeTask(2);
        //no va????
       // taskController.deleteTask(2);
        System.out.println(taskController.getAllTaskByUser());
    }
}