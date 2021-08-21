package controller;

import model.ModelPagamento;
import DAO.DAOPagamento;
import java.util.ArrayList;

/**
*
* @author Maria
*/
public class ControllerPagamento {

    private DAOPagamento daoPagamento = new DAOPagamento();

    /**
    * grava Pagamento
    * @param pModelPagamento
    * @return int
    */
    public int salvarPagamentoController(ModelPagamento pModelPagamento){
        return this.daoPagamento.salvarPagamentoDAO(pModelPagamento);
    }

    /**
    * recupera Pagamento
    * @param pPagId
    * @return ModelPagamento
    */
    public ModelPagamento getPagamentoController(int pPagId){
        return this.daoPagamento.getPagamentoDAO(pPagId);
    }

    /**
    * recupera uma lista dePagamento
    * @param pPagId
    * @return ArrayList
    */
    public ArrayList<ModelPagamento> getListaPagamentoController(){
        return this.daoPagamento.getListaPagamentoDAO();
    }

    /**
    * atualiza Pagamento
    * @param pModelPagamento
    * @return boolean
    */
    public boolean atualizarPagamentoController(ModelPagamento pModelPagamento){
        return this.daoPagamento.atualizarPagamentoDAO(pModelPagamento);
    }

    /**
    * exclui Pagamento
    * @param pPagId
    * @return boolean
    */
    public boolean excluirPagamentoController(int pPagId){
        return this.daoPagamento.excluirPagamentoDAO(pPagId);
    }
}