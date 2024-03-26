public class Exercicio12 {
    public static void executar(){
        int mes = Prompt.lerInteiro("Digite o número do mês (1 a 12): ");

        
        switch (mes) {
            case 1:
                Prompt.lerLinha("Janeiro");
                break;
            case 2:
                Prompt.lerLinha("Fevereiro");
                break;
            case 3:
                Prompt.lerLinha("Março");
                break;
            case 4:
                Prompt.lerLinha("Abril");
                break;
            case 5:
                Prompt.lerLinha("Maio");
                break;
            case 6:
                Prompt.lerLinha("Junho");
                break;
            case 7:
                Prompt.lerLinha("Julho");
                break;
            case 8:
                Prompt.lerLinha("Agosto");
                break;
            case 9:
                Prompt.lerLinha("Setembro");
                break;
            case 10:
                Prompt.lerLinha("Outubro");
                break;
            case 11:
                Prompt.lerLinha("Novembro");
                break;
            case 12:
                Prompt.lerLinha("Dezembro");
                break;
            default:
                Prompt.lerLinha("Mês inválido!");
                break;
        }
    }
}
    

