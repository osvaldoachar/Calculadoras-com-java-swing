 
package com.mycompany.calculadoras;

 //Sessão de importação de classes
import javax.swing.JOptionPane;
import java.lang.Math;

public class Calculadora {
    public static void main(String [] args){
        
        double opcao = Double.parseDouble(JOptionPane.showInputDialog("Escolha Uma Operação: "
                + "\n 1 - Adição "
                + "\n 2 - Subtração "
                + "\n 3 - Multiplicação "
                + "\n 4 - Divisão "
                + "\n 5 - Raiz Quadrada "
                + "\n 6 - Exponenciação  "
                + "\n 7 - Percentagem"));
        
     if (opcao == 1){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Primeiro Número: "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Segundo Número: "));
         
         double soma = n1 + n2;
         
         JOptionPane.showMessageDialog(null, n1+ " + "+n2 + " = " + soma);
     }   
     if(opcao == 2){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Número: "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Número: "));
         
         double sub = n1 - n2;
         
         JOptionPane.showMessageDialog(null,n1 + " - " + n2 + " = " + sub);
     } 
         if(opcao == 3){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Número: "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Número: "));
         
         double mult = n1 * n2;
         
         JOptionPane.showMessageDialog(null,n1 + " x " + n2 + " = " + mult);
     }
             if(opcao == 4){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Número: "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Número: "));
         
         double div = n1 / n2;
         
         JOptionPane.showMessageDialog(null,n1 + " / " + n2 + " = " + div);
     } 
                 if(opcao == 5){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Número Um Número Para Saber A Raiz Quadrada: "));
        
         
        double raiz = Math.sqrt(n1);
         
         JOptionPane.showMessageDialog(null,"A Raiz Quadrada de "+ n1 + " é: " + raiz);
     } 
             if(opcao == 6){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Número Base: "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Expoente: "));
         
          double exp = Math.pow(n1, n2);
         
         JOptionPane.showMessageDialog(null,n1 + " Elevado a " + n2 + " = "+ exp);
     } 
              if(opcao == 7){
         double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite A Percentagem(%): "));
         double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Valor: "));
         
         double  percentagem = (n1/100)*n2;
         
         JOptionPane.showMessageDialog(null,n1 + "% de " + n2 + " é " + percentagem);
     }
    }
}
