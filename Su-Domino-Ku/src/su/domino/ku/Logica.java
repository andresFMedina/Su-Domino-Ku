package su.domino.ku;

import java.util.ArrayList;
import java.util.List;

public class Logica {

    private List<String> secuencia;
    private int tablero[][];
    
    static Tablero tablerito = new Tablero();
    private List<Ficha> fichas;

    public Logica() {
        generarFichas();
        inicializarTablero();
        verTodo();
        busquedaAmplitud();
    }

    public void generarFichas() {
        fichas = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i < j + 1) {
                    int s = j + 2;
                    int z = i + 1;
                    Ficha fichita = new Ficha(cont + 1, z, s);
                    /*String ficha = cont + ";" + z + ";" + s + ";" + "no uso";
                     System.out.println(ficha);*/
                    fichas.add(fichita);
                    cont++;
                }
            }
        }
    }

    public void inicializarTablero() {
        tablero = tablerito.tablero;
        
    }

    public void verTodo() {
        System.out.println("Fichas");
        for (int i = 0; i < fichas.size(); i++) {
            System.out.println("Id: " + fichas.get(i).getId() + " Valor A: " + fichas.get(i).getValorA() + " Valor B: " + fichas.get(i).getValorB());
        }

        System.out.println("\nTablero");
        int aux1 = 2;
        int aux2 = 2;

        for (int i = 0; i < tablero.length; i++) {
            aux1 = 2;
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
                if (j == aux1) {
                    System.out.print("| ");
                    aux1 += 3;
                }
            }
            if (i == aux2 && i != 8) {
                System.out.println("\n---------------------");
                aux2 += 3;
            } else {
                System.out.println("");
            }
        }
    }

    public void busquedaAmplitud() {
        BusquedaAmplitud ba=new BusquedaAmplitud(tablero, fichas);
        ba.busquedaAmplitud();
    }

    
            
}
