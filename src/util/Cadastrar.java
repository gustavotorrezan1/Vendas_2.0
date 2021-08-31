/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ControllerCliente;
import controller.ControllerCompra;
import controller.ControllerFornecedor;
import controller.ControllerPagamento;
import controller.ControllerPessoa;
import controller.ControllerProduto;
import controller.ControllerUsuario;
import controller.ControllerVenda;
import javax.swing.JOptionPane;
import model.ModelCliente;
import model.ModelCompra;
import model.ModelFornecedor;
import model.ModelPagamento;
import model.ModelPessoa;
import model.ModelProduto;
import model.ModelUsuario;
import model.ModelVenda;

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
        JOptionPane.showMessageDialog(null, "Consute o id no bancos de dados");

    }

    public static void cadastro_fornecedor() {
        ModelPessoa ModelPessoa = new ModelPessoa();
        ModelPessoa = new ModelPessoa();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
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
        ModelCliente.setPesId(Integer.valueOf(JOptionPane.showInputDialog("Informe o ID da Pessoa")));

    }

    public static void cadastro_produto() {
        ModelProduto ModelProduto = new ModelProduto();
        ControllerProduto controllerProduto = new ControllerProduto();
        ModelProduto = new ModelProduto();
        ModelProduto.setProDescricao(JOptionPane.showInputDialog("Informe a descrição do produto"));
        ModelProduto.setProNomeLongo(JOptionPane.showInputDialog("Informe o nome do Produto"));
        ModelProduto.setProCod_bar(JOptionPane.showInputDialog("Informe o codigo de barras do Produto"));
        ModelProduto.setProPreco_ven(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de venda do Produto")));
        ModelProduto.setProPreco_cus(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de custo do Produto")));
        ModelProduto.setProCategoria(JOptionPane.showInputDialog("Informe a categoria  do Produto"));
        ModelProduto.setProTipo_un(JOptionPane.showInputDialog("Informe o tipo do Produto"));
        ModelProduto.setProQnt_estoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade no estoque do Produto")));
        ModelProduto.setForId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Fornecedor")));
        controllerProduto.salvarProdutoController(ModelProduto);
    }

    public static void cadastro_pagamento() {
        ModelPagamento ModelPagamento = new ModelPagamento();
        ControllerPagamento controllerPagamento = new ControllerPagamento();
        ModelPagamento = new ModelPagamento();
        ModelPagamento.setPagTipo_pagamento(JOptionPane.showInputDialog("Informe o tipo de pagamento"));
        ModelPagamento.setPagValor_pagemento(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pagamento")));
        controllerPagamento.salvarPagamentoController(ModelPagamento);
    }

    public static void cadastro_usuario() {
        ModelUsuario ModelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ModelUsuario = new ModelUsuario();
        ModelUsuario.setUsuLogin(JOptionPane.showInputDialog("Informe o Login"));
        ModelUsuario.setUsuSenha(JOptionPane.showInputDialog("Informe a senha"));
        ModelUsuario.setPesId(JOptionPane.showInputDialog("Informe o Id da pessoa"));
        controllerUsuario.salvarUsuarioController(ModelUsuario);
    }

    public static void cadastro_venda() {
        ModelVenda ModelVenda = new ModelVenda();
        ControllerVenda controllerVenda = new ControllerVenda();
        ModelVenda = new ModelVenda();
        ModelVenda.setPagId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Pagamento")));
        ModelVenda.setProId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Produto")));
        ModelVenda.setUsuId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Usuário")));
        ModelVenda.setVenId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Venda")));
        controllerVenda.salvarVendaController(ModelVenda);
    }
        public static void cadastro_compra() {
        ModelCompra ModelCompra = new ModelCompra();
        ControllerCompra controllerCompra = new ControllerCompra();
        ModelCompra = new ModelCompra();
        ModelCompra.setPagId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Pagamento")));
        ModelCompra.setProId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Produto")));
        ModelCompra.setUsuId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Usuário")));
        ModelCompra.setForId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Fornecedor")));
        controllerCompra.salvarCompraController(ModelCompra);
    }

}
