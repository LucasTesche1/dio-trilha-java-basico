import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        Float saldo;

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe seu agencia:");
        agencia = sc.nextLine();

        System.out.println("Informe o número da sua conta:");
        numero = sc.nextInt();

        System.out.println("Informe seu saldo:");
        saldo = sc.nextFloat();

        System.out.println("Olá "
        + nome
        + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta "
        + numero + " e seu saldo "
        + saldo + " já está disponível para saque");



        }
    }
