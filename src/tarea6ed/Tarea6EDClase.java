package tarea6ed;

/**
 *
 * @author cesar
 */
public class Tarea6EDClase {

    private static final int limiteDescuento = 3;

    private void descuentoMin(double precioProducto) {
        double precioTotal;
        precioTotal = precioProducto * 0.95;
        System.out.println("El total a pagar es:" + precioTotal);
        System.out.println("Enviado");
    }

    private void descuentoMax(double precioProducto) {
        double precioTotal;
        precioTotal = precioProducto * 0.8;
        System.out.println("El total a pagar es:" + precioTotal);
        System.out.println("Enviado");
    }

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double precioTotal;

        if (numProductos > limiteDescuento) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            descuentoMax(precioProducto);
        } else {
            descuentoMin(precioProducto);
        }
    }
}
