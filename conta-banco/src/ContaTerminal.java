import java.util.Scanner; //conhecer e importar a classe scanner

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //obter pela classe scanner os valores digitados pelo terminal

        //exibir as mensagens para nosso usuário
        System.out.print("Por favor, digite o numero da agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o numero da conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        //exibir as mensagens para nosso usuário
        System.out.println("\nOlá" + nomeCliente + ", obrigado por criar uma conta no nosso banco!");
        System.out.println("Sua agência é " + agencia + ",conta " + numeroConta + "e seu saldo é R$" + String.format("%.2f", saldo) + " já está disponível para saque.");
        
        sc.close();

        
        
    }
}
