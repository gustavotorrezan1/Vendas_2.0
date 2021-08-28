/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

public class Controlar {
    public static void start(){
        int controle;
        int controle1;
        int controle2;
        int controle3;
      for (int i = 0; i < 999; i++) {
            controle = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para Procurar \n2 - para Cadastrar \n3 - para Excluir \n0 para sair"));
            if(controle == 1)
            {
                
            }
            if(controle == 2)
            {
                controle2 = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para cadastar Pessoa \n2 - para cadastrar Fornecedor \n3 - para Produto \n4 para cadastrar Cliente"));
            }
            
               
            
                
        }
    }
}