public class Exercicio3 {
    public static void executar() {
        int numeroA = Prompt.lerInteiro("Digite o primeiro número:");
        int numeroB = Prompt.lerInteiro("Digite o segundo número:");

        if (numeroA > numeroB) {
            Prompt.lerInteiro(numeroA + " é maior que " + numeroB);
        } else if (numeroB > numeroA) {
            Prompt.lerInteiro(numeroB + " é maior que " + numeroA);
        } else {
            Prompt.lerInteiro("Os números são iguais, a sequência de números informados é inválida.");
        }
    }
}
    

