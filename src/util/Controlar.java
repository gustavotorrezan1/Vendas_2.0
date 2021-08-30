/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

public class Controlar {
    public static void start(){
        int controle1;
        int controle3;
      for (int i = 0; i < 999; i++) {
            int controle = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para Procurar \n2 - para Cadastrar \n3 - para Excluir \n0 para sair"));
            if(controle == 1)
            {
                 Cadastrar.cadastro_fornecedor();
            }
            if(controle == 2)
            {
                int controle2 = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para cadastrar Fornecedor \n2 - para Produto \n3 para cadastrar Cliente"));
                if(controle2 == 1)
                {
                    Cadastrar.cadastro_pessoa();
                    Cadastrar.cadastro_fornecedor();
                }
                if(controle2 == 2)
                {
                    int controle2_1 = Integer.valueOf(JOptionPane.showInputDialog("Deseja cadastrar um fornecedor antes? \n Digite: \n1 - Sim \n2 - Não"));
                    if(controle2_1 == 1)
                    {
                        Cadastrar.cadastro_pessoa();
                        Cadastrar.cadastro_fornecedor();
                    }
                    else
                    {
                    Cadastrar.cadastro_produto();
                    }
                }
            }
            
               
            
                
        }
    }
}