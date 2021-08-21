package controller;

import model.ModelFornecedor;
import DAO.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author Gustavo Torrezani
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pForId
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pForId){
        return this.daoFornecedor.getFornecedorDAO(pForId);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pForId
    * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pForId
    * @return boolean
    */
    public boolean excluirFornecedorController(int pForId){
        return this.daoFornecedor.excluirFornecedorDAO(pForId);
    }
}