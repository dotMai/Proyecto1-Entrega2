package Usuario.Usuario;

public class Cliente {

    // Crear el constructor de la clase Cliente
    private String nombre;
        private int id;
        private String correo;
        private String login;
        private String password;
        private int VMC;

    public Cliente() {
        this.nombre = "";
        this.id = 0;
        this.correo = "";
        this.login = "";
        this.password = "";
        this.VMC = 0;

    }

    // Crear los métodos de la clase Cliente

    public void AgregarCliente(nombre, id, correo, login, password, VMC) {
        // Crear un cliente
    }

    public int AgregarVMC() {
        // Agregar VMC
        return 0;
    }

    public Inventario getInventario() {
        // Obtener el inventario
        return null;
    }

    public Oferta getOferta() {
        // Obtener una oferta
        return null;
    }

    public Subasta getSubasta() {
        // Obtener una subasta
        return null;
    }
}
