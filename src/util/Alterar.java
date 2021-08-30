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
public class Alterar {

    public static void alterar_pessoa() {
        ModelPessoa modelPessoa = new ModelPessoa();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        modelPessoa = new ModelPessoa();
        int pesId = Integer.valueOf(JOptionPane.showInputDialog("Informe id da pessoa"));
        modelPessoa = ControllerPessoa.getPessoaController(pesId);
    }
}
