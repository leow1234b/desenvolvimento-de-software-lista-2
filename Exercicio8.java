public class Exercicio8 {
    public static void executar(){
        int numero = Prompt.lerInteiro("Digite um número: ");
        
        
        if (numero >= 50) {
            Prompt.lerInteiro("O número é maior ou igual a 50.");
        } else {
            Prompt.lerInteiro("O número é menor que 50.");
        }
    }

}

