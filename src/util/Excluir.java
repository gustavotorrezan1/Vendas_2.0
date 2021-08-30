
package util;

import controller.ControllerFornecedor;
import controller.ControllerPessoa;
import javax.swing.JOptionPane;
import model.ModelPessoa;

/**
 *
 * @author GustavoTorrezani
 */
public class Excluir {

    public static void deletar_fornecedor() {
        ModelPessoa modelPessoa = new ModelPessoa();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id do fornecedor"));
        ModelPessoa ModelPessoa = new ModelPessoa();
        controllerPessoa.getPessoaController(pesId);
        controllerPessoa.excluirPessoaController(pesId);
        controllerFornecedor.excluirFornecedorController(pesId);
    }
    public static void deletar_cliente(){
        
    }
}
