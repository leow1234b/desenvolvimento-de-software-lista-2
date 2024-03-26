public class Exercicio15 {
public static void executar(){

    int[] vetor = new int[5];
    int i = 0;

    while (i < 5) {
        int numero = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");

        if (i == 0 || numero > vetor[i - 1]) {
            vetor[i] = numero;
            i++;
        } else {
            Prompt.imprimir("O número digitado deve ser maior que o anterior. Tente novamente.");
        }
    }

    Prompt.imprimir("Vetor preenchido:");
    for (i = 0; i < 5; i++) {
        Prompt.imprimir(vetor[i] + " ");
    }



}


}


    
    

