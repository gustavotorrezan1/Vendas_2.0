/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ControllerCliente;
import controller.ControllerFornecedor;
import controller.ControllerPagamento;
import controller.ControllerPessoa;
import controller.ControllerProduto;
import controller.ControllerUsuario;
import javax.swing.JOptionPane;
import model.ModelCliente;
import model.ModelFornecedor;
import model.ModelPagamento;
import model.ModelPessoa;
import model.ModelProduto;
import model.ModelUsuario;

/**
 *
 * @author GustavoTorrezani
 */
public class Cadastrar {

    public static void cadastro_pessoa() {
        // cadastrar pessoa
        ModelPessoa ModelPessoa = new ModelPessoa();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
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
        controllerPessoa.salvarPessoaController(ModelPessoa);
        controllerPessoa = new ControllerPessoa();
        controllerPessoa.getPessoaDAO(ModelPessoa.getPesNome());
    }

    public static void cadastro_fornecedor() {
        ModelFornecedor ModelFornecedor = new ModelFornecedor();
        ControllerFornecedor ControllerFornecedor = new ControllerFornecedor();
        ModelFornecedor = new ModelFornecedor();
        ModelFornecedor.setForEmpresa(JOptionPane.showInputDialog("Informe o nome da empresa"));
        ModelFornecedor.setForRepresentante(JOptionPane.showInputDialog("Informe o nome do Representante"));
        ModelFornecedor.setPesId(Integer.valueOf(JOptionPane.showInputDialog("Informe o ID da Pessoa")));
        ControllerFornecedor.salvarFornecedorController(ModelFornecedor);

    }

    public static void cadastro_cliente() {
        ModelCliente ModelCliente = new ModelCliente();
        ControllerCliente ControllerCliente = new ControllerCliente();
        ModelCliente = new ModelCliente();
        ModelCliente.setCliId(Integer.valueOf(JOptionPane.showInputDialog("Informe o ID da Pessoa")));

    }

    public static void cadastro_produto() {
        ModelProduto ModelProduto = new ModelProduto();
        ControllerProduto ControllerProduto = new ControllerProduto();
        ModelProduto = new ModelProduto();
        ModelProduto.setProDescricao(JOptionPane.showInputDialog("Informe a descri��o do produto"));
        ModelProduto.setProNomeLongo(JOptionPane.showInputDialog("Informe o nome do Produto"));
        ModelProduto.setProCod_bar(JOptionPane.showInputDialog("Informe o codigo de barras do Produto"));
        ModelProduto.setProPreco_ven(Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o de venda do Produto")));
        ModelProduto.setProPreco_cus(Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o de custo do Produto")));
        ModelProduto.setProCategoria(JOptionPane.showInputDialog("Informe a categoria  do Produto"));
        ModelProduto.setProTipo_un(JOptionPane.showInputDialog("Informe o tipo do Produto"));
        ModelProduto.setProQnt_estoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade no estoque do Produto")));

        //ModelProduto ModelProduto = new ModelProduto();
        //ControllerPessoa ControllerPessoa = new ControllerPessoa();
        // ModelPessoa.setPesNome(JOptionPane.showInputDialog("Informe o nome do usuário"));
        //ControllerPessoa.getPessoaController(PesNome);
    }

    public static void cadastro_pagamento() {
        ModelPagamento ModelPagamento = new ModelPagamento();
        ControllerPagamento ControllerPagamento = new ControllerPagamento();
        ModelPagamento = new ModelPagamento();
        // ModelPagamento.setPagTipo(JOptionPane.showInputDialog("Informe o tipo de pagamento"));
        // ModelPagamento.setPagValor(JOptionPane.showInputDialog("Informe o valor do pagamento"));
//        ModelPagamento.setPagData(JOptionPane.showInputDialog("Informe a data do pagamento"));
    }

    public static void cadastro_usuario() {
        // ModelPagamento ModelUsuario = new ModelUsusario();
        ControllerUsuario ControllerUsuario = new ControllerUsuario();
        //ModelUsuario = new ModelUsuario();
        //ModelUsuario.setUsuLogin(JOptionPane.showInputDialog("Informe o tipo de pagamento"));
        //ModelUsuario.setUsuSenha(JOptionPane.showInputDialog("Informe o valor do pagamento"));
    }

    // fazer o cadastro dos produtos e do pagamento e usuario
}
