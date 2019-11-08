 package contagemnumeros;

import java.util.Scanner;

/**
 *
 * @author jeremias
 */
public class ContagemNumeros {

    public static void main(String[] args) {

        int valorRecebido = 0;
        int dezPrimeiros[] = new int [11];
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o valor inicial:");
        valorRecebido = ler.nextInt() + 1;
        int cont = valorRecebido + 10;
        
        System.out.println("Em uma sequência do numeral: " + (valorRecebido-1) + " até 100"
                + "\nos 10 primeiros números são:");
        
        for(int i = 1; valorRecebido <= 100; i++){
                
            if(valorRecebido < cont){
                dezPrimeiros[i] = valorRecebido;
                System.out.println(i+" -> "+dezPrimeiros[i]);
            }
            
            //System.out.println(valorRecebido);
            valorRecebido++;
        }
        
    }
    
}
