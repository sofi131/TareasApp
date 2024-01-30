import com.ceica.Controladores.LoginController;
import com.ceica.Controladores.TareasController;

import java.util.Scanner;
//habrá que poner si quieres entrar como admin o como usuario
// y a partir de ahí hacer un menú de administrador y otro de usuario.
public class Main {
    public static void main(String[] args) {
        String usr,pass;
        TareasController tareas=new TareasController();
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenido a AppTareas");
        System.out.println(".... Enter para empezar");
        leer.nextLine();
        do{
            System.out.println("Login de AppTareas");
            System.out.print("Introduce Usuario: ");
            usr=leer.nextLine();
            System.out.print("Introduce password");
            pass=leer.nextLine();
            if(LoginController.login(usr,pass)){
                System.out.println("Estoy en AppTareas");
                menuPrincipalTareas(leer,tareas);//leer tipo scanner y que guarde los datos en tareas

            }else{
                System.out.println("Usuario o Contraseña incorrecta");
            }
        }while(true);
    }

    private static void menuPrincipalTareas(Scanner leer, TareasController tareas) {
        //esto ya se hará luego
        //si eres el usuario puedes hacer un crud de tus tareas: ver tarea, crearla, editarla o eliminarla.
        //el admin también puede hacer crud y ver las tareas de todos los usuarios.
    }
}