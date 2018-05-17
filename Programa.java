class Conta{
int numero;
String	titular;
double salario;  
double	saldo;
  void saca(double quantidade){
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo;
  }
}
public class Programa {
public static void main (String [] args) {
Conta minhaConta;
minhaConta = new Conta();
minhaConta.titular = "Duke";
minhaConta.saldo = 1000.0;
System.out.println("Saldo atual: " + minhaConta.saldo);
}
}