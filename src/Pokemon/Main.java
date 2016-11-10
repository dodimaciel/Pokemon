package Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Douglas Maciel on 13/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Poked> array = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        int swt = 0;
        String remov;

        do {
            System.out.println("1- Para adicionar: ");
            System.out.println("2- Para Remover");
            swt = l.nextInt();

            switch (swt) {
                case 1:
                    Poked list = new Poked();
                    list.Cadastro();
                    if (array.contains(list)) {
                        System.out.println("Contem na array");
                    } else {
                        array.add(list);
                    }
                    break;
                case 2:{
                    Poked lista = new Poked();
                    System.out.println("Digite um nome para ser removido: ");
                    remov = l.next();

                    if(array.contains(remov)){
                        array.remove(lista);

                    } else {
                        System.out.println("no");
                    }

                    break;
                }
    }
} while(swt!=0);

    }
}