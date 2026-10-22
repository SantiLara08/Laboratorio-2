public class SinPromocion implements Promocion {

    @Override
    public int aplicar(double subtotal) {
        return subtotal;
    }

}