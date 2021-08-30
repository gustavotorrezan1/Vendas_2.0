package controller;

import model.ModelPessoa;
import DAO.DAOPessoa;
import java.util.ArrayList;

/**
*
* @author Marley
*/
public class ControllerPessoa {

    private DAOPessoa daoPessoa = new DAOPessoa();

    /**
    * grava Pessoa
    * @param pModelPessoa
    * @return int
    */
    public int salvarPessoaController(ModelPessoa pModelPessoa){
        return this.daoPessoa.salvarPessoaDAO(pModelPessoa);
    }

    /**
    * recupera Pessoa
    * @param pPesId
    * @return ModelPessoa
    */
    public ModelPessoa getPessoaController(int pPesId){
        return this.daoPessoa.getPessoaDAO(pPesId);
    }

    /**
    * recupera uma lista dePessoa
    * @param pPesId
    * @return ArrayList
    */
    public ArrayList<ModelPessoa> getListaPessoaController(){
        return this.daoPessoa.getListaPessoaDAO();
    }

    /**
    * atualiza Pessoa
    * @param pModelPessoa
    * @return boolean
    */
    public boolean atualizarPessoaController(ModelPessoa pModelPessoa){
        return this.daoPessoa.atualizarPessoaDAO(pModelPessoa);
    }

    /**
    * exclui Pessoa
    * @param pPesId
    * @return boolean
    */
    public boolean excluirPessoaController(int pPesId){
        return this.daoPessoa.excluirPessoaDAO(pPesId);
    }
}