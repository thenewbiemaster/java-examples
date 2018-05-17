public class BalancoTrimestral { 
public static void main (String [] args) {
int gastosJaneiro = 15000;
int gastosFevereiro = 23000;
int gastosMarco = 17000;
// inicializa uma variavel com o valor das outras, sem modificação;
int gastosTrimestre =	gastosJaneiro +	gastosFevereiro	+	gastosMarco;
// declarando as variaveis aqui, sempre colocar parentese, senao erro de cannot find symbol
int mediaMensal = (gastosTrimestre) / 3;

System.out.println(gastosTrimestre);
System.out.println("Valor da média mensal = " + mediaMensal);
}
}
