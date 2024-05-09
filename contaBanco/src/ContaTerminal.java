import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta ;
        String agencia ;
        String nomeCliente ;
        double saldo ;

        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                **************************************************
                            Abertura de Conta
                **************************************************            
                """);
        System.out.println("Por favor digite seu nome ");
        nomeCliente = leitura.nextLine();

        System.out.println("Por favor digite o número da agencia ");
        agencia = leitura.nextLine();

        System.out.println("Por favor digite o número da conta ");
        numeroConta = leitura.nextInt() ;


        System.out.println("Por favor digite o valor do primeiro depósito ");
        saldo = leitura.nextFloat();

        System.out.println(String.format("""
                ***************Olá %s************************ 
                obrigado por criar uma conta em 
                nosso banco, sua agência é %s, conta %d 
                e seu saldo %.2f já está disponível para saque
                *********************************************
                
                """,nomeCliente,agencia,numeroConta,saldo));

    }
}
