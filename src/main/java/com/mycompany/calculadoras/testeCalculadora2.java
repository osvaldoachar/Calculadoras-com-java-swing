package com.mycompany.calculadoras;
import javax.swing.JOptionPane;

public class testeCalculadora2{
    public static void main(String[] args){
        
        double n1, n2, total = 0;
        String operador;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Número: "));
        operador = JOptionPane.showInputDialog("Escolha Um Operador: (+, -, *, /) ");
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Número: "));
        
        switch (operador){
            case "+": total = n1 + n2; break;
            case "-": total = n1 - n2; break;
            case "*": total = n1 * n2; break;
            case "/": total = n1 / n2; break;
            default: JOptionPane.showMessageDialog(null, "Operador Inválido!");
        }
       JOptionPane.showMessageDialog(null, n1+ " "+operador+" "+ n2 + " = " + total);
    }
}