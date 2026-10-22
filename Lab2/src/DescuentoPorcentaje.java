public class DescuentoPorcentaje implements Promocion {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }


    @Override
    public double aplicar(double subtotal) {
        return subtotal - subtotal * porcentaje / 100;
    }
}