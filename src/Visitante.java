public class Visitante {
    public static void main(String[] args) {
        byte piso = 5;
        short numeroApartamento = 203;
        int cedula = 850123456;
        long telefono = 6789123456L;
        float temperatura = 36.6f;
        double peso = 72.5;
        char genero = 'M';
        boolean residente = false;
        String nombreVisitante = "Juan Perez";

        System.out.println("Información del Visitante:");
        System.out.println("Nombre: " + nombreVisitante);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Género: " + genero);
        System.out.println("Es residente: " + residente);
        System.out.println("Número de Piso: " + piso);
        System.out.println("Número de Apartamento: " + numeroApartamento);
    }
}
