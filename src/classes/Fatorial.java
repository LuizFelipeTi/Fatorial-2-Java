/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *  Classe que Calcula o Fatorial de um Número
 * @author LUIZ FELIPE
 */
public class Fatorial {
    
    // Atributos são inicializados
    private int num = 0; // Número inserido pelo usuário
    private int fat = 1; // Aramazena o valor do fatorial
    private String formula = ""; // Armazena a fómula fatorial
    
    // Método responsável por inserir o valor que deve ser fatorado
    // O fatorial é calculado e armazenado como fórmula e resultado
    public  void setValor(int n){
        
        num = n; // Atributo num = recebe o número passado por parâmetro
        int f = 1; // Variável recebe o produto dos números do fatorial 
        String s = ""; // Variável concatena os números do fatorial como fórmula
        
        for(int c = n; c > 1; c--){ // Do fatorial até 2
            f *= c; // f recebe o produto dele mesmo com os números.
            s += c + " x "; // Os números são concatenados como fórmula
        }
        s += "1 = "; // Concatena o "1 = " no final da fórmula
        fat = f; // Atributo fat recebe o resultado do fatorial
        formula = s; //atributo fórmula recebe os valores concatenados como forma.
    }
    
    // Retorna o resultado do fatorial
    public int getFatorial(){
        return fat;
    }
    
    // Retorna a fórmula do fatorial
    public String getFormula(){
        return formula;
    }
}
