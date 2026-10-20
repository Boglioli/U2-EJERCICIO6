public class Usuario {
    public String nombre;
    private String[] notificaciones;
    private int cantidadNotificaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        notificaciones = new String[10];
        this.cantidadNotificaciones = 0;
    }

    public void recibirNotificaciones(String mensaje) {
       notificaciones[cantidadNotificaciones] = mensaje;
       cantidadNotificaciones++;
    }
    public void mostrarNotificaciones() {
        for (int i = 0; i < cantidadNotificaciones; i++) {
            System.out.println(notificaciones[i]);
        }
    }
    public String getNombre() {
        return nombre;
    }
}