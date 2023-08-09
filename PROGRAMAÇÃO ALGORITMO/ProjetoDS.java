package projetods;
import java.util.Scanner;

public class ProjetoDS {
    public static void main(String[] args) {
        //scanner recebe valores do teclado
        Scanner mensagem = new Scanner(System.in);
        
        String nome;
        int ano_nasc, ano_atual = 2023;
        int idade;
        
        System.out.println("Digite seu nome");
        nome= mensagem.nextLine();
        System.out.println("Qual o ano de nascimento");
        ano_nasc = mensagem.nextInt();
        System.out.println("Seu nome é " + nome);
        
        idade = ano_atual - ano_nasc;
        
        System.out.println("Sua idade é: " + idade);
    }
}
