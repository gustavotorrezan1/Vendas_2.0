package util;

import controller.ControllerCliente;
import controller.ControllerFornecedor;
import controller.ControllerPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author GustavoTorrezani
 */
public class Excluir {

    public static void deletar_fornecedor() {
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do fornecedor"));
        controllerPessoa.getPessoaController(pesId);
        controllerPessoa.excluirPessoaController(pesId);
        controllerFornecedor.excluirFornecedorController(pesId);
    }

    public static void deletar_cliente() {
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        ControllerCliente controllerCliente = new ControllerCliente();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do fornecedor"));
        controllerPessoa.getPessoaController(pesId);
        controllerPessoa.excluirPessoaController(pesId);
        controllerCliente.excluirClienteController(pesId);
    }
}
