package controller;

import model.ModelCompra;
import DAO.DAOCompra;
import java.util.ArrayList;

/**
*
* @author Marley
*/
public class ControllerCompra {

    private DAOCompra daoCompra = new DAOCompra();

    /**
    * grava Compra
    * @param pModelCompra
    * @return int
    */
    public int salvarCompraController(ModelCompra pModelCompra){
        return this.daoCompra.salvarCompraDAO(pModelCompra);
    }

    /**
    * recupera Compra
    * @param pComId
    * @return ModelCompra
    */
    public ModelCompra getCompraController(int pComId){
        return this.daoCompra.getCompraDAO(pComId);
    }

    /**
    * recupera uma lista deCompra
    * @param pComId
    * @return ArrayList
    */
    public ArrayList<ModelCompra> getListaCompraController(){
        return this.daoCompra.getListaCompraDAO();
    }

    /**
    * atualiza Compra
    * @param pModelCompra
    * @return boolean
    */
    public boolean atualizarCompraController(ModelCompra pModelCompra){
        return this.daoCompra.atualizarCompraDAO(pModelCompra);
    }

    /**
    * exclui Compra
    * @param pComId
    * @return boolean
    */
    public boolean excluirCompraController(int pComId){
        return this.daoCompra.excluirCompraDAO(pComId);
    }
}