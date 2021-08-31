package util;

import javax.swing.JOptionPane;

public class Controlar {
    public static void start(){
        int controle1;
        int controle3;
      for (int i = 0; i < 999; i++) {
            int controle = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para Alterar \n2 - para Cadastrar \n3 - para Excluir \n0 para sair"));
            if(controle == 1)
            {
        
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
                   
                }
            }
            
               
            
                
        }
    }
}