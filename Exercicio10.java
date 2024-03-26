public class Exercicio10 {
    public static void executar(){
        int numero = Prompt.lerInteiro("Digite um número de 1 a 5: ");

        switch (numero) {
            case 1:
                Prompt.lerLinha("Um");
                break;
            case 2:
                Prompt.lerLinha("Dois");
                break;
            case 3:
                Prompt.lerDecimal("Três");
                break;
            case 4:
                Prompt.lerDecimal("Quatro");
                break;
            case 5:
                Prompt.lerLinha("Cinco");
                break;
            default:
                Prompt.lerLinha("Número inválido!");
                break;
        }

    }
}
