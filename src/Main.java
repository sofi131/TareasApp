import com.ceica.Controllers.TaskController;
import com.ceica.Models.User;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        TaskController taskController=new TaskController();
        taskController.login("admin","1234");
//        System.out.println(taskController.completeTask(2));
        System.out.println(taskController.getAllTaskByUser());
        System.out.println(taskController.deleteTask("Deberes"));
//        System.out.println("----");
//        System.out.println(taskController.getAllTask());
    }
}