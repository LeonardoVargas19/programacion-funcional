import figura.Cuadrado;
import figura.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10,3);
        System.out.println("Datos de un rectangulo");
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado(4);
        System.out.println("Datos del cuadrado");
        System.out.println(cuadrado.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
    }

}