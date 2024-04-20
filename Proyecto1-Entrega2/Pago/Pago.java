package Pago;
import java.util.Date;

public class Pago {
    // Crear el constructor de la clase Pago
    private int idPago;
    private Date fechaPago;
    private String metodoPago;
    private double montoPago;

    public Pago() {
        // Inicializar las variables de la clase Pago
        this.idPago = 0;
        this.fechaPago = null;
        this.metodoPago = "";
        this.montoPago = 0.0;
    }

    public void registroPago(Pieza pieza, Usuario usuario, Date fechaPago, String metodoPago, double montoPago) {
        // Registrar un pago
    }

    public Pago getPago(idPago) {
        // Obtener un pago
        return null;
    }

    public void eliminarPago(idPago) {
        // Eliminar un pago
    }
}
