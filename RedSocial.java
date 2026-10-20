public class RedSocial {
    public void enviarSolicitud(Usuario remitente, Usuario receptor) {
        String mensaje = "solicitud de amistad de " + remitente.getNombre();
        receptor.recibirNotificaciones(mensaje);
        System.out.println("solicitud enviada correctamente");

    }
}
