public class SinPromocion implements Promocion {

    @Override
    public double aplicar(double subtotal) {
        return subtotal;
    }

}