package edu.alonso.tema1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
class Carta {
    private String nombre;
    private int valor;
 
    public Carta(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public int getValor() {
        return valor;
    }
 
    @Override
    public String toString() {
        return nombre;
    }
}
 
class Mazo {
    private ArrayList<Carta> cartas;
 
    public Mazo() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] nombres = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] valores = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
 
        for (String palo : palos) {
            for (int i = 0; i < nombres.length; i++) {
                cartas.add(new Carta(nombres[i] + " de " + palo, valores[i]));
            }
        }
        Collections.shuffle(cartas);
    }
 
    public Carta robar() {
        return cartas.remove(0);
    }
}
 
class Jugador {
    private ArrayList<Carta> mano;
    private int puntuacion;
 
    public Jugador() {
        mano = new ArrayList<>();
        puntuacion = 0;
    }
 
    public void agregarCarta(Carta carta) {
        mano.add(carta);
        puntuacion += carta.getValor();
        if (puntuacion > 21) {
            ajustarAses();
        }
    }
 
    private void ajustarAses() {
        for (Carta carta : mano) {
            if (carta.getValor() == 11 && puntuacion > 21) {
                puntuacion -= 10; // Cambia el valor del As de 11 a 1
            }
        }
    }
 
    public int getPuntuacion() {
        return puntuacion;
    }
 
    public void mostrarMano() {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
 
    public void resetMano() {
        mano.clear();
        puntuacion = 0;
    }
}
 
public class Gambling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mazo mazo = new Mazo();
        Jugador jugador = new Jugador();
        Jugador crupier = new Jugador();
 
        int saldo = 1000;  // El jugador comienza con 1000 unidades de dinero
        int apuesta;
 
        System.out.println("=== Bienvenido al Blackjack con apuestas ===");
 
        // Ciclo del juego
        while (true) {
            System.out.println("\nTu saldo actual es: $" + saldo);
            if (saldo <= 0) {
                System.out.println("Te has quedado sin dinero. ¡Juego terminado!");
                break;
            }
 
            // Colocación de apuesta
            do {
                System.out.print("¿Cuánto deseas apostar? (máximo $" + saldo + "): ");
                apuesta = scanner.nextInt();
                if (apuesta > saldo || apuesta <= 0) {
                    System.out.println("Apuesta inválida. Inténtalo de nuevo.");
                }
            } while (apuesta > saldo || apuesta <= 0);
 
            // Repartir cartas iniciales
            jugador.resetMano();
            crupier.resetMano();
            jugador.agregarCarta(mazo.robar());
            jugador.agregarCarta(mazo.robar());
            crupier.agregarCarta(mazo.robar());
            crupier.agregarCarta(mazo.robar());
 
            // Turno del jugador
            boolean turnoJugador = true;
            while (turnoJugador) {
                System.out.println("\nTu mano:");
                jugador.mostrarMano();
                System.out.println("Puntuación: " + jugador.getPuntuacion());
 
                if (jugador.getPuntuacion() > 21) {
                    System.out.println("Te pasaste de 21. ¡Pierdes!");
                    saldo -= apuesta;
                    turnoJugador = false;
                    break;
                }
 
                System.out.print("¿Quieres robar otra carta? (s/n): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("s")) {
                    jugador.agregarCarta(mazo.robar());
                } else {
                    turnoJugador = false;
                }
            }
 
            // Si el jugador no perdió automáticamente, el crupier juega
            if (jugador.getPuntuacion() <= 21) {
                // Turno del crupier
                System.out.println("\nTurno del crupier...");
                while (crupier.getPuntuacion() < 17) {
                    crupier.agregarCarta(mazo.robar());
                }
 
                System.out.println("\nMano del crupier:");
                crupier.mostrarMano();
                System.out.println("Puntuación del crupier: " + crupier.getPuntuacion());
 
                // Determinar el ganador
                int puntuacionJugador = jugador.getPuntuacion();
                int puntuacionCrupier = crupier.getPuntuacion();
 
                if (puntuacionCrupier > 21 || (puntuacionJugador <= 21 && puntuacionJugador > puntuacionCrupier)) {
                    System.out.println("¡Felicidades, has ganado!");
                    saldo += apuesta;
                } else if (puntuacionJugador == puntuacionCrupier) {
                    System.out.println("Es un empate. Recuperas tu apuesta.");
                } else {
                    System.out.println("El crupier gana.");
                    saldo -= apuesta;
                }
            }
 
            // Preguntar si desea jugar otra ronda
            System.out.print("\n¿Quieres jugar otra ronda? (s/n): ");
            String jugarOtra = scanner.next();
            if (jugarOtra.equalsIgnoreCase("n")) {
                System.out.println("Gracias por jugar. Te vas con un saldo de $" + saldo);
                break;
            }
 
            mazo = new Mazo(); // Baraja un nuevo mazo para la siguiente ronda
        }
 
        scanner.close();
    }
}