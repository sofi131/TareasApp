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
            if (LoginController.login(usr, pass)) {
                System.out.println("Estoy en AppTareas");
                if(LoginController.isAdmin(usr)){ // Verificar si es admin
                    menuAdmin(leer, tareas); // Mostrar menú para admin
                } else {
                    menuUsuario(leer, tareas); // Mostrar menú para usuario
                }
            } else {
                System.out.println("Usuario o Contraseña incorrecta");
            }
        } while (true);
    }
//
//    El administrador, podrá crear/editar/borrar/ver usuarios (rol user) y ver las tareas de todos los usuario (rol user).
//    Cada usuario con el rol user, podrá crear/editar/ver/borrar (CRUD) sus tareas
    private static void menuAdmin(Scanner leer, TareasController tareas) {
        System.out.println("\n--- Menú Administrador ---");
        System.out.println("1. Crear usuario");
        System.out.println("2. Editar usuario");
        System.out.println("3. Borrar usuario");
        System.out.println("4. Ver usuarios");
        System.out.println("5. Ver tareas de todos los usuarios");
        System.out.println("6. Salir");
        String op="";
        String menuAdmin= """
                1. Crear usuario
                2. Editar usuario
                3. Borrar usuario
                4. Ver usuarios
                5. Ver tareas de todos los usuarios
                6. Salir
                """;
        do{
            System.out.println(menuAdmin);
            op=leer.nextLine();
            switch (op){
                case "1":
                    //lógica
                    break;
                case "2":
                    //lógica
                    break;
                case "3":
                    //lógica
                case "4":
                    //lógica
                case "5":
                    //lógica
                case "6":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(! "6".equals(op));
    }

    private static void menuUsuario(Scanner leer, TareasController tareas) {
        System.out.println("\n--- Menú Administrador ---");
        System.out.println("1. Crear usuario");
        System.out.println("2. Editar usuario");
        System.out.println("3. Borrar usuario");
        System.out.println("4. Ver usuarios");
        System.out.println("5. Ver tareas de todos los usuarios");
        System.out.println("6. Salir");
        String op="";
        String menuAdmin= """
                1. Crear usuario
                2. Editar usuario
                3. Borrar usuario
                4. Ver usuarios
                5. Ver tareas de todos los usuarios
                6. Salir
                """;
        do{
            System.out.println(menuAdmin);
            op=leer.nextLine();
            switch (op){
                case "1":
                    //lógica
                    break;
                case "2":
                    //lógica
                    break;
                case "3":
                    //lógica
                case "4":
                    //lógica
                case "5":
                    //lógica
                case "6":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(! "6".equals(op));
    }
}