import java.io.*;

public class Metodos{

    private int resultadoex1 = 1;
    private int posicaodovetor = 0;
    private int posicaodovetor2 =0;
    private int somadovetorex4 = 0;
    private int maiornumero = 0;
    private int posicaodovetor3 = 0;

    public Metodos(){}

    public int exercicio1(int numerofatorial){

        if(numerofatorial > 0){
            resultadoex1 = resultadoex1 * numerofatorial;
            exercicio1(numerofatorial - 1);
        }

        return resultadoex1;
    }

    public int exercicio2(int numeroquevaidiminuir){
        if(numeroquevaidiminuir > 0){
            System.out.print(numeroquevaidiminuir + ", ");
            exercicio2(numeroquevaidiminuir - 1);
        }
        else{
            System.out.println("0");
        }
        return numeroquevaidiminuir;
    }

    public void exercicio3(int[] n){
        
        if(posicaodovetor < n.length -1){
            System.out.print(n[posicaodovetor] + ", ");
            posicaodovetor++;
            exercicio3(n);
        }
        else{
            System.out.println("12");
        }
    }

    public int exercicio4(int[] n){
        
        if(posicaodovetor2 < n.length){
            somadovetorex4 = somadovetorex4 + n[posicaodovetor2];
            posicaodovetor2 ++;
            exercicio4(n);
        }
        return somadovetorex4;
    }

    public int exercicio5(int[] n){
        if(posicaodovetor3 < n.length){
            if (maiornumero < n[posicaodovetor3]){
                maiornumero = n[posicaodovetor3];
            }
    
            posicaodovetor3 ++;
            exercicio5(n);
        }
        return maiornumero;
    }
}
