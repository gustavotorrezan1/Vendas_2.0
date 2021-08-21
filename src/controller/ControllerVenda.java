package controller;

import model.ModelVenda;
import DAO.DAOVenda;
import java.util.ArrayList;

/**
*
* @author Maria
*/
public class ControllerVenda {

    private DAOVenda daoVenda = new DAOVenda();

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }

    /**
    * recupera Venda
    * @param pVenId
    * @return ModelVenda
    */
    public ModelVenda getVendaController(int pVenId){
        return this.daoVenda.getVendaDAO(pVenId);
    }

    /**
    * recupera uma lista deVenda
    * @param pVenId
    * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaController(){
        return this.daoVenda.getListaVendaDAO();
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.atualizarVendaDAO(pModelVenda);
    }

    /**
    * exclui Venda
    * @param pVenId
    * @return boolean
    */
    public boolean excluirVendaController(int pVenId){
        return this.daoVenda.excluirVendaDAO(pVenId);
    }
}