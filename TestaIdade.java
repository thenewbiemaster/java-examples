// Anotações Gerais
// codigo JAVA = semantica codigo javascript, sem panico.
// nada muda mesmo, porém java é mais completo, por primeiras impressões;
// Seria o mesmo que, declara a variavel aqui
// int idade = 18;
// global scope;
// se declara variavel global, evita erro compilação, onde int i por exemplo.
public class TestaIdade {
  // ideal dependendo do caso, é declarar a variavel globalmente, fora da função para acesso por outras funções, depende de segurança;
  // problemas de segurança, dependendo da informação;
  // escopo =  encapsulamento;  
public static void main (String [] args) {
// declara um variavel do tipo inteiro, já inicializada
int idade = 18;
// passa a condicão para a expressão booleana, nunca muda isto. ATENÇÃO!!
if (idade == 20 && idade < 20) {
	System.out.println("Você é maior de idade!");
}else{
	System.out.println("Voce não tem idade suficiente.");
}
// imprime conteudo de idade
System.out.println("Sua idade atual é: " + idade);
// declara uma nova variavel
int idadeNoAnoQueVem;
// inicializa a variavel, que recebe idade + 1
idadeNoAnoQueVem = idade + 1;
System.out.println("Sua idade ano que vem será: "+ idadeNoAnoQueVem);
}
}