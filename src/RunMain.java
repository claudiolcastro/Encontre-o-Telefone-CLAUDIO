import Exceptions.FraseInvalidaException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) throws FraseInvalidaException {
        String frase;
        String nTelefone;
        int tamanho;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma Frase");

        while (input.hasNext()) {

            frase = input.nextLine().toUpperCase();

            tamanho = frase.length();

            if (tamanho >= 1 && tamanho <= 30) {

                nTelefone = decrypt(frase);

                System.out.println(nTelefone);

            } else {
                throw new FraseInvalidaException();
            }
        }
    }



    //Método para desencriptografar número
    public static String decrypt(String frase){

        frase = frase.replaceAll("A","2");
        frase = frase.replaceAll("B","2");
        frase = frase.replaceAll("C","2");

        frase = frase.replaceAll("D","3");
        frase = frase.replaceAll("E","3");
        frase = frase.replaceAll("F","3");

        frase = frase.replaceAll("G","4");
        frase = frase.replaceAll("H","4");
        frase = frase.replaceAll("I","4");

        frase = frase.replaceAll("J","5");
        frase = frase.replaceAll("K","5");
        frase = frase.replaceAll("L","5");

        frase = frase.replaceAll("M","6");
        frase = frase.replaceAll("N","6");
        frase = frase.replaceAll("O","6");

        frase = frase.replaceAll("P","7");
        frase = frase.replaceAll("Q","7");
        frase = frase.replaceAll("R","7");
        frase = frase.replaceAll("S","7");

        frase = frase.replaceAll("T","8");
        frase = frase.replaceAll("U","8");
        frase = frase.replaceAll("V","8");

        frase = frase.replaceAll("W","9");
        frase = frase.replaceAll("X","9");
        frase = frase.replaceAll("Y","9");
        frase = frase.replaceAll("Z","9");

        return frase;
    }

}
