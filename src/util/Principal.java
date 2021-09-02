/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import controller.ControllerPessoa;
import javax.swing.JOptionPane;
import model.ModelPessoa;

/**
 *
 * @author GustavoTorrezani
 */
public class Principal {
    ModelPessoa ModelPessoa = new ModelPessoa();
    ControllerPessoa ControllerPessoa = new ControllerPessoa();
    
     private void main (String[] args) {
         //cadastrar pessoa
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
         /////
         //
         
         
         
         
         
     }
    
}
