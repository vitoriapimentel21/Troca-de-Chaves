import java.util.Scanner;

public class TrocaDeChaves {
    public static void main(String[] args) {

        // Vamos começar criando uma entrada para o número gerador e o módulo primo...
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que número será escolhido como o número gerador?");
        int numGerador = entrada.nextInt();
        System.out.println("Que número será escolhido como o módulo primo?");
        int moduloPrimo = entrada.nextInt();

        /* As chaves confidenciais dos usuários 1 e 2 seão geradas aleatoriamente. Neste caso, para fins de simplicidade, limitamos a escolha até no máximo o número 10 (Excluindo-se o 0) */

        int min = 1;
        int max = 11;
        double chaveConfUsuario1 = Math.floor(Math.random()*(max-min+1)+min);
        double chaveConfUsuario2 = Math.floor(Math.random()*(max-min+1)+min);

        System.out.println(" ");
        System.out.println("Gerando-se aleatoriamente, as chaves confidenciais do usuário 1 e do usuário 2 são, respectivamente: "+chaveConfUsuario1+ " e "+chaveConfUsuario2);
        System.out.println(" ");
 
        // Agora vamos começar com as operações matemáticas...

        double resultadoUsuario1 = Math.pow(numGerador,chaveConfUsuario1) % moduloPrimo;
        double resultadoUsuario2 = Math.pow(numGerador,chaveConfUsuario2) % moduloPrimo;
        
        double segredoCompartilhado1 = Math.pow(resultadoUsuario2, chaveConfUsuario1) % moduloPrimo;
        double segredoCompartilhado2 = Math.pow(resultadoUsuario1, chaveConfUsuario2) % moduloPrimo;

        // Agora vamos verificar se deu certo...

        if (segredoCompartilhado1 == segredoCompartilhado2) {
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Depois de fazermos as operações matemáticas necessárias, podemos afirmar que...\nA troca de chaves ocorreu de forma correta! Sendo o segredo compartilhado: "+segredoCompartilhado1);
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        } else{
            System.out.println("A troca de chaves não deu certo!");
        } 
    }
}
