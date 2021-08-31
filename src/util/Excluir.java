package util;

import controller.ControllerCliente;
import controller.ControllerCompra;
import controller.ControllerFornecedor;
import controller.ControllerPagamento;
import controller.ControllerProduto;
import controller.ControllerUsuario;
import controller.ControllerVenda;
import javax.swing.JOptionPane;

/**
 *
 * @author GustavoTorrezani
 */
public class Excluir {

    public static void deletar_fornecedor() {
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Fornecedor"));
        controllerFornecedor.excluirFornecedorController(pesId);
    }

    public static void deletar_cliente() {
        ControllerCliente controllerCliente = new ControllerCliente();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Cliente"));
        controllerCliente.excluirClienteController(pesId);
    }

    public static void deletar_usuario() {
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Usuário"));
        controllerUsuario.excluirUsuarioController(pesId);
    }

    public static void deletar_produto() {
        ControllerProduto controllerProduto = new ControllerProduto();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Produto"));
        controllerProduto.excluirProdutoController(pesId);
    }

    public static void deletar_Venda() {
        ControllerVenda controllerVenda = new ControllerVenda();
        ControllerPagamento controllerPagamento = new ControllerPagamento();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id da Venda"));
        controllerVenda.excluirVendaController(pesId);
        pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Pagamento"));
        controllerPagamento.excluirPagamentoController(pesId);
    }

    public static void deletar_Compra() {
        ControllerCompra controllerCompra = new ControllerCompra();
        ControllerPagamento controllerPagamento = new ControllerPagamento();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id da Compra"));
        controllerCompra.excluirCompraController(pesId);
        pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do Pagamento"));
        controllerPagamento.excluirPagamentoController(pesId);
    }
}
