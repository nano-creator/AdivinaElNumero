import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {
        System.out.printf("Hola, ¿cuál es tu nombre?\n");
        String nombreJugador = entrada.nextLine();
        System.out.printf("bienvenido %s, vamos a comenzar\n", nombreJugador);

    while (juegoActivo) {
        int intentos = 0;
        int min = 0;
        int max = 100;
        int numeroJuego = (int)(Math.random() * ((max - min) + 1));

        //System.out.println(numeroJuego);
        System.out.printf("%s, he escogido un número entre %d y %d, adivinalo\n", nombreJugador, min, max);
        int numeroJugador;
        do {
            System.out.println("escoge un número");
            numeroJugador = entrada.nextInt();

            if (numeroJuego < numeroJugador) {
                System.out.println("Muy alto, adivina otra vez");
            } else if (numeroJuego > numeroJugador) {
                System.out.println("Muy bajo, adivina otra vez");
            }
            intentos++;
            juegoActivo = false;
        } while (numeroJuego != numeroJugador);
        System.out.printf("felicitaciones %s, has acertado, en %d intentos", nombreJugador, intentos);
    }
    }
}
