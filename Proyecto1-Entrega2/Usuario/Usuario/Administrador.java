package Usuario.Usuario;

public class Administrador extends Empleado {

    // Crear el constructor de la clase Administrador
    private String nombre;
        private int id;
        private String correo;
        private String login;
        private String password;
    
    public Administrador() {
        
    // Inicializar las variables de la clase Administrador
        this.nombre = "";
        this.id = 0;
        this.correo = "";
        this.login = "";
        this.password = "";
    }

    // Crear los métodos de la clase Administrador

    public void AgregarPieza(nombre, id, precio) {
        // Agregar una pieza al inventario

    }

    public void EliminarPieza(id) {
        // Eliminar una pieza del inventario

    }

    public Inventario getInventario() {
        // Obtener el inventario
        return null
    }

    public Boolean validarInformacion() {
        // Validar la información de un usuario
        return null
    }

}
