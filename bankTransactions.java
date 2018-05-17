public class bankTransactions {

    public static void main(String[] args) {

        // inicialização das variáveis para o programa
        double saldo = 8002.55;
        double saque = 1000;
        double deposito = 1500;
        double transferencia = 2015.55;
        int contaOrigem = 554412;
        int contaDestino = 1244;
        double saldoJaneiro = 1515.66;
        double saldoFevereiro = 1000;
        double saldoMarco = 45000;
        double mediaTrimestreA = (saldoJaneiro + saldoFevereiro + saldoMarco) / 3;

        // testa a condição para ver se o saldo é maior que 0.
        if (saldo > 0) {
            System.out.println("Você tem saldo em sua conta.");
        } else {
            System.out.println("Você não tem saldo em sua conta.");
        }
        // teste de output como se fosse um extrato bancário
        System.out.println("Sua média no trimestre A foi de: R$ " + mediaTrimestreA);
        System.out.println("Seu saldo inicial é de: R$ " + saldo);
        System.out.println("Transferência efetuada, valor: R$ " + transferencia + " na conta: " + contaDestino);
        System.out.println("Deposito efetuado, valor: R$ " + deposito + " na conta: " + contaOrigem);
        System.out.println("Seu saldo atual é de: R$ " + (saldo - transferencia - deposito));
    }
}
