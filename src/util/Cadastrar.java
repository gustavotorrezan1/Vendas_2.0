/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ControllerFornecedor;
import controller.ControllerPessoa;
import javax.swing.JOptionPane;
import model.ModelFornecedor;
import model.ModelPessoa;

/**
 *
 * @author GustavoTorrezani
 */
public class Cadastrar {
         public static void cadastro_pessoa(){
         //cadastrar pessoa    
            ModelPessoa ModelPessoa = new ModelPessoa();
            ControllerPessoa ControllerPessoa = new ControllerPessoa();
            ModelPessoa = new ModelPessoa();
            ModelPessoa.setPesNome(JOptionPane.showInputDialog("Informe o nome do usuário"));
            ModelPessoa.setPesCnpj(JOptionPane.showInputDialog("Informe o CNPJ (se houver) do usuário"));
            ModelPessoa.setPesCpf(JOptionPane.showInputDialog("Informe o CPF (se houver) do usuário"));
            ModelPessoa.setPesTelefone(JOptionPane.showInputDialog("Informe o telefone do usuário"));
            ModelPessoa.setPesEmail(JOptionPane.showInputDialog("Informe o email do usuário"));
            ModelPessoa.setPesCep(JOptionPane.showInputDialog("Informe o CEP do usuário"));
            ModelPessoa.setPesEstado(JOptionPane.showInputDialog("Informe o Estado do usuário"));
            ModelPessoa.setPesCidade(JOptionPane.showInputDialog("Informe o cidade do usuário"));
            ModelPessoa.setPesBairro(JOptionPane.showInputDialog("Informe o bairro do usuário"));
            ModelPessoa.setPesRua(JOptionPane.showInputDialog("Informe o rua do usuário"));
            ModelPessoa.setPesNum_rua(JOptionPane.showInputDialog("Informe o número da rua do usuário"));
            ControllerPessoa.salvarPessoaController(ModelPessoa);
}
         public static void cadastro_fornecedor(){
             ModelFornecedor ModelFornecedor = new ModelFornecedor();
             ControllerFornecedor ControllerFornecedor = new ControllerFornecedor();
             ModelFornecedor = new ModelFornecedor();
             ModelFornecedor.setForEmpresa(JOptionPane.showInputDialog("Informe o nome da empresa"));
             ModelFornecedor.setForRepresentante(JOptionPane.showInputDialog("Informe o nome do Representante"));
             ModelPessoa ModelPessoa = new ModelPessoa();
             //ControllerPessoa ControllerPessoa = new ControllerPessoa();
            // ModelPessoa.setPesNome(JOptionPane.showInputDialog("Informe o nome do usuário"));
             //ControllerPessoa.getPessoaController(PesNome);
             
             
             
             //fazer o cadastro dos produtos e do pagamento e usuario
             
         
         }
                 
}

