package util;

import javax.swing.JOptionPane;

public class Controlar {

    public static void start() {
        
        for (int i = 0; i < 999; i++) {
            int controle = Integer.valueOf(JOptionPane.showInputDialog("Digite: \n1 - para Alterar \n2 - para Cadastrar \n3 - para Excluir \n0 para sair"));
            if (controle == 1) {

            }
            if (controle == 2) {
                int controle2 = Integer.valueOf(JOptionPane.showInputDialog("Para inserir digite: \n1 - Fornecedor \n2 - Produto \n3 - Cliente \n4 - Venda \n5 - Compra \n6 - Pagamento \n7 - Usuário"));
                if (controle2 == 1) {
                    Cadastrar.cadastro_pessoa();
                    Cadastrar.cadastro_fornecedor();
                }
                if (controle2 == 2) {
                    Cadastrar.cadastro_produto();
                }
                if (controle2 == 3) {
                    Cadastrar.cadastro_pessoa();
                    Cadastrar.cadastro_cliente();
                }
                if (controle2 == 4) {
                    Cadastrar.cadastro_venda();
                }
                if (controle2 == 5) {
                    Cadastrar.cadastro_compra();
                }
                if (controle2 == 6) {
                    Cadastrar.cadastro_pagamento();
                }
                if (controle2 == 7) {
                    Cadastrar.cadastro_pessoa();
                    Cadastrar.cadastro_usuario();
                }

            }
            if (controle == 3) {
                int controle3 = Integer.valueOf(JOptionPane.showInputDialog("Para excluir digite: \n1 - Fornecedor \n2 - Produto \n3 - Cliente \n4 - Venda \n5 - Compra \n6 - Pagamento \n7 - Usuário"));
                if (controle3 == 1) {
                    Excluir.deletar_fornecedor();
                }
                if (controle3 == 2) {
                    Excluir.deletar_produto();
                }
                if (controle3 == 3) {
                    Excluir.deletar_cliente();
                }
                if (controle3 == 4) {
                    Excluir.deletar_venda();
                }
                if (controle3 == 5) {
                    Excluir.deletar_compra();
                }
                if (controle3 == 6) {
                    Excluir.deletar_pagamento();
                }
                if (controle3 == 7) {
                    Excluir.deletar_usuario();
                }

            }

        }
    }
}
