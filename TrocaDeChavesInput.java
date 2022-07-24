import java.util.Scanner;

public class TrocaDeChavesInput {
    public static void main(String[] args) {

        // Vamos começar criando uma entrada...
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que número será escolhido como o número gerador?");
        int numGerador = entrada.nextInt();
        System.out.println("Que número será escolhido como o módulo primo?");
        int moduloPrimo = entrada.nextInt();
        System.out.println("Qual será o número confidencial do usuário 1?");
        int chaveConfUsuario1 = entrada.nextInt();
        System.out.println("Qual será o número confidencial do usuário 2?");
        int chaveConfUsuario2 = entrada.nextInt();

 
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