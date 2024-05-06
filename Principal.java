
import java.util.Scanner;
import modelo.Pelicula;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while   (opcion != 9){
            String  menu = """
                    Bienvenido a ScreenMatch
                    1 - Registrar Nueva pelicula
                    2 - Registrar Nueva Serie

                    9 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 :
                    System.out.println("Ingrese el Nombre de la Pelicula");
                    String  nombre = teclado.nextLine();
                    System.out.println("Ingrese el Año de Lanzamiento de la Pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la Duracion en minutos de la Pelicula");
                    int DuracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setfechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.settiempoDeDuracionEnMinutos(DuracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9 :
                    System.out.println("Saliendo del Programa");
                    break;
                default:
                    System.out.println("Opcion No valida");
                
            }
        }

    }
}
