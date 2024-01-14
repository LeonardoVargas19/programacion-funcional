package figura;

public class Cuadrado implements FiguraGeometrica {
    private int lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }
}
