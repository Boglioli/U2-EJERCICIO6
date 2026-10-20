public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");

        RedSocial redSocial = new RedSocial();
        redSocial.enviarSolicitud(usuario1, usuario2);

        System.out.println("Notificaciones de " + usuario2.getNombre() + ":");
        usuario2.mostrarNotificaciones();
    }
}
