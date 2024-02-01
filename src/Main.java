import com.ceica.Controllers.TaskController;

//habrá que poner si quieres entrar como admin o como usuario
// y a partir de ahí hacer un menú de administrador y otro de usuario.
public class Main {
    public static void main(String[] args) {

        TaskController taskController=new TaskController();
//        System.out.println(taskController.createUser("lola","123",2));

        //cambiar contraseña

        System.out.println(taskController.editPassword("lolo","1111"));
    }
}