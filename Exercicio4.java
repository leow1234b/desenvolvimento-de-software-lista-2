public class Exercicio4 {
   public static void executar(){

   

    double numero1 = Prompt.lerDecimal("Digite o primeiro número:");
        double numero2 = Prompt.lerDecimal("Digite o segundo número:");

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        String resultado = "Soma: " + soma + "\n" +
                           "Subtração: " + subtracao + "\n" +
                           "Multiplicação: " + multiplicacao + "\n" +
                           "Divisão: " + divisao;

        Prompt.imprimir(resultado);



}
    
    
        
    }


