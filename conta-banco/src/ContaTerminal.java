import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Exibir as mensagens para o nosso usuário
        System.out.println("Digite o Usuário: ");
        int usuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite sua Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu nome:  ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Deposite um valor:  ");
        Float saldoDepositado = scanner.nextFloat();
        // Obter pela scanner os valores digitados no terminal
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, \n conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, usuario, saldoDepositado);
        // Exibir a mensagem conta criada
        scanner.close();
    }
}
