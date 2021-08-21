package DAO;

import model.ModelPagamento;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Maria
*/
public class DAOPagamento extends ConexaoMySql {

    /**
    * grava Pagamento
    * @param pModelPagamento
    * @return int
    */
    public int salvarPagamentoDAO(ModelPagamento pModelPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Pagamento ("
                    + "pk_pag_id,"
                    + "pag_tipo_pagamento,"
                    + "pag_valor_pagemento,"
                    + "pag_data_pagamento"
                + ") VALUES ("
                    + "'" + pModelPagamento.getPagId() + "',"
                    + "'" + pModelPagamento.getPagTipo_pagamento() + "',"
                    + "'" + pModelPagamento.getPagValor_pagemento() + "',"
                    + "'" + pModelPagamento.getPagData_pagamento() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Pagamento
    * @param pPagId
    * @return ModelPagamento
    */
    public ModelPagamento getPagamentoDAO(int pPagId){
        ModelPagamento modelPagamento = new ModelPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pag_id,"
                    + "pag_tipo_pagamento,"
                    + "pag_valor_pagemento,"
                    + "pag_data_pagamento"
                 + " FROM"
                     + " Pagamento"
                 + " WHERE"
                     + " pk_pag_id = '" + pPagId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPagamento.setPagId(this.getResultSet().getInt(1));
                modelPagamento.setPagTipo_pagamento(this.getResultSet().getString(2));
                modelPagamento.setPagValor_pagemento(this.getResultSet().getDouble(3));
                modelPagamento.setPagData_pagamento(this.getResultSet().getDate(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelPagamento;
    }

    /**
    * recupera uma lista de Pagamento
        * @return ArrayList
    */
    public ArrayList<ModelPagamento> getListaPagamentoDAO(){
        ArrayList<ModelPagamento> listamodelPagamento = new ArrayList();
        ModelPagamento modelPagamento = new ModelPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pag_id,"
                    + "pag_tipo_pagamento,"
                    + "pag_valor_pagemento,"
                    + "pag_data_pagamento"
                 + " FROM"
                     + " Pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPagamento = new ModelPagamento();
                modelPagamento.setPagId(this.getResultSet().getInt(1));
                modelPagamento.setPagTipo_pagamento(this.getResultSet().getString(2));
                modelPagamento.setPagValor_pagemento(this.getResultSet().getDouble(3));
                modelPagamento.setPagData_pagamento(this.getResultSet().getDate(4));
                listamodelPagamento.add(modelPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPagamento;
    }

    /**
    * atualiza Pagamento
    * @param pModelPagamento
    * @return boolean
    */
    public boolean atualizarPagamentoDAO(ModelPagamento pModelPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Pagamento SET "
                    + "pk_pag_id = '" + pModelPagamento.getPagId() + "',"
                    + "pag_tipo_pagamento = '" + pModelPagamento.getPagTipo_pagamento() + "',"
                    + "pag_valor_pagemento = '" + pModelPagamento.getPagValor_pagemento() + "',"
                    + "pag_data_pagamento = '" + pModelPagamento.getPagData_pagamento() + "'"
                + " WHERE "
                    + "pk_pag_id = '" + pModelPagamento.getPagId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Pagamento
    * @param pPagId
    * @return boolean
    */
    public boolean excluirPagamentoDAO(int pPagId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Pagamento "
                + " WHERE "
                    + "pk_pag_id = '" + pPagId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}