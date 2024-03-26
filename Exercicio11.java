import java.util.Arrays;

public class Exercicio11 {
    public static void executar(){
        
       int[] numeros = new int[3];

        
        for (int i = 0; i < 3; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
        }

        
        Arrays.sort(numeros);

        
        Prompt.imprimir("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
    
    
    
    

        
        

        
        
        
        
    
                
    
    
                
                
                
            
    
        
        
    

