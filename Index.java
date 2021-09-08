import java.io.*;

public class Index {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int numerobase = 5;
        int[] vetorbase = {2, 4, 6, 8, 10, 12};

        System.out.println("Exercicio 1: " + metodos.exercicio1(numerobase));
        System.out.print("Exercicio 2: "); metodos.exercicio2(numerobase);
        System.out.print("Exercicio 3: "); metodos.exercicio3(vetorbase); 
        System.out.println("Exercicio 4: " + metodos.exercicio4(vetorbase));
        System.out.println("Exercicio 5: " + metodos.exercicio5(vetorbase));
    }
}