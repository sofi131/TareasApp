import com.ceica.Controllers.TaskController;
import com.ceica.Models.User;

//habrá que poner si quieres entrar como admin o como usuario
// y a partir de ahí hacer un menú de administrador y otro de usuario.
public class Main {
    public static void main(String[] args) {
        User user= new User();
        System.out.println(user.login("lolo","1111").toString());

        TaskController taskController=new TaskController();

    }
}