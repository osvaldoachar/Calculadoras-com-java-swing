 
package com.mycompany.calculadoras;
import javax.swing.JOptionPane;

public class ClasseCalculadoraBUNO {

    double n1;
    double n2;
    double resultado;
    int escolha;
    
    public void escolha(){
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha Uma Operação: "
              + "\n 1 - Adição "
              + "\n 2 - Subtração "
              + "\n 3 - Multiplicação "
              + "\n 4 - Divisão "));
        
        if (escolha == 1){
            soma();
        }
        if (escolha == 2){
            subtracao();
        }
        if (escolha == 3){
            multiplicacao();
        }
        if (escolha == 4 ){
            divisao();
        }
    }
    
    public void soma(){
      n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Primeiro Número: "));
      n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite O Segundo Número:"));
      
      resultado = n1 + n2;
      JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + resultado);
    }
    public void subtracao(){
         n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Primeiro Número: "));
         n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite O Segundo Número:"));
      
      resultado = n1 - n2;
      JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resultado);
    }
    public void multiplicacao(){
         n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Primeiro Número: "));
      n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite O Segundo Número:"));
      
      resultado = n1 * n2;
      JOptionPane.showMessageDialog(null, n1 + " × " + n2 + " = " + resultado);
    }
    public void divisao(){
         n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O Primeiro Número: "));
      n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite O Segundo Número:"));
      
      resultado = n1 / n2;
      JOptionPane.showMessageDialog(null, n1 + " ÷ " + n2 + " = " + resultado);
    }

    
}
