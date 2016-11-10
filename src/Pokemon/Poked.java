package Pokemon;

import java.util.Scanner;

/**
 * Created by Douglas Maciel on 13/07/2016.
 */
public class Poked {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String nome;


    public int idade;
    public String tipo;

    public void Cadastro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = ler.next();
        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o tipo: ");
        tipo = ler.next();
    }
}
