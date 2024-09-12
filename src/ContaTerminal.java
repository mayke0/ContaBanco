import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia !");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite a Agencia !");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
