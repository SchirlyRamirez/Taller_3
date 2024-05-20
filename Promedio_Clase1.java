import java.util.Scanner;
public class Promedio_Clase1 {


    private String nombreCurso;

    public Promedio_Clase1(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        int sumaNotas = 0;  // Se define la variable sumaNotas para almacenar la suma de todas las notas
        int nota; // Se define la variable nota para almacenar cada nota ingresada por el usuario

        for (int contadorGrado = 1; contadorGrado <= 10; contadorGrado++) {
            System.out.print("Ingrese Nota " + contadorGrado + ": ");
            nota = sc.nextInt(); // Se asigna el valor de la nota ingresada a la variable grado
            sumaNotas += nota; // Se suma la nota ingresada a la suma total de notas
        }

        System.out.println("La suma de las notas es: " + sumaNotas);
        double promedio = (double) sumaNotas / 10; // Se calcula el promedio dividiendo la suma de notas entre el total de notas (10)
        System.out.println("El promedio es de: " + promedio);
        sc.close();
    }

    public static void main(String[] args) {
        Promedio_Clase1 clase = new Promedio_Clase1("Matemáticas");
        System.out.println("Curso: " + clase.getNombreCurso());
        clase.calcularPromedio();
    }
}