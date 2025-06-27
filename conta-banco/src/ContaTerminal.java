import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Exibir as mensagens para o nosso usuário
        int usuario = scanner.nextInt();
        System.out.printf("Digite o Usuário: %d \n", usuario);
        String agencia = scanner.nextLine();
        System.out.printf("Digite sua Agência: %s \n", agencia);
        String nomeCliente = scanner.nextLine();
        System.out.printf("Digite seu nome: $s \n", nomeCliente);
        Double saldoDepositado = scanner.nextDouble();
        System.out.printf("Deposite um valor: %d \n", saldoDepositado);
        // Obter pela scanner os valores digitados no terminal
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, \n conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, usuario, saldoDepositado);
        // Exibir a mensagem conta criada
        scanner.close();
    }
}
