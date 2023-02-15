  package com.mycompany.calculadoras;
import javax.swing.JOptionPane;

public class Teste2{
    public static void main(String[] args){
        
        double n1, n2, total = 0;
        String operador;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Número: "));
        operador = JOptionPane.showInputDialog("Escolha Um Operador: (+, -, /, *) ");
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Número: "));
        
        if (operador.equals("+")){
         total = n1 + n2;
        }
        else if(operador.equals("-")){
                total = n1 - n2;
        }
        else if(operador.equals("*")){
            total = n1 * n2;
        }
        else if (operador.equals("/")){
            total = n1 / n2;
        }else{
            
            JOptionPane.showMessageDialog(null, "Operador Inválido!");
        }
        if (operador.equals("+")){
            JOptionPane.showMessageDialog(null, n1 + " "+operador+" "+ n2 + " = "+ total);
        }
        else if (operador.equals("-")){
            JOptionPane.showMessageDialog(null, n1 + " "+operador+" "+ n2 + " = "+ total);
        }
        else if (operador.equals("*")){
            JOptionPane.showMessageDialog(null, n1 + " "+operador+" "+ n2 + " = "+ total);
        }
        else if (operador.equals("/")){
            JOptionPane.showMessageDialog(null, n1 + " "+operador+" "+ n2 + " = "+ total);
        }else{
            JOptionPane.showMessageDialog(null, "Tente Novamente!"); 
        }
    }
}