package DAO;

import model.ModelCompra;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Marley
*/
public class DAOCompra extends ConexaoMySql {

    /**
    * grava Compra
    * @param pModelCompra
    * @return int
    */
    public int salvarCompraDAO(ModelCompra pModelCompra){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Compra ("
                    + "pk_com_id,"
                    + "fk_pro_id,"
                    + "fk_for_id,"
                    + "fk_pag_id,"
                    + "fk_usu_id,"
                    + "com_data_compra,"
                    + "com_data_recebimento"
                + ") VALUES ("
                    + "'" + pModelCompra.getComId() + "',"
                    + "'" + pModelCompra.getProId() + "',"
                    + "'" + pModelCompra.getForId() + "',"
                    + "'" + pModelCompra.getPagId() + "',"
                    + "'" + pModelCompra.getUsuId() + "',"
                    + "'" + pModelCompra.getComData_compra() + "',"
                    + "'" + pModelCompra.getComData_recebimento() + "'"
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
    * recupera Compra
    * @param pComId
    * @return ModelCompra
    */
    public ModelCompra getCompraDAO(int pComId){
        ModelCompra modelCompra = new ModelCompra();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_com_id,"
                    + "fk_pro_id,"
                    + "fk_for_id,"
                    + "fk_pag_id,"
                    + "fk_usu_id,"
                    + "com_data_compra,"
                    + "com_data_recebimento"
                 + " FROM"
                     + " Compra"
                 + " WHERE"
                     + " pk_com_id = '" + pComId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCompra.setComId(this.getResultSet().getInt(1));
                modelCompra.setProId(this.getResultSet().getInt(2));
                modelCompra.setForId(this.getResultSet().getInt(3));
                modelCompra.setPagId(this.getResultSet().getInt(4));
                modelCompra.setUsuId(this.getResultSet().getInt(5));
                modelCompra.setComData_compra(this.getResultSet().getDate(6));
                modelCompra.setComData_recebimento(this.getResultSet().getDate(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCompra;
    }

    /**
    * recupera uma lista de Compra
        * @return ArrayList
    */
    public ArrayList<ModelCompra> getListaCompraDAO(){
        ArrayList<ModelCompra> listamodelCompra = new ArrayList();
        ModelCompra modelCompra = new ModelCompra();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_com_id,"
                    + "fk_pro_id,"
                    + "fk_for_id,"
                    + "fk_pag_id,"
                    + "fk_usu_id,"
                    + "com_data_compra,"
                    + "com_data_recebimento"
                 + " FROM"
                     + " Compra"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCompra = new ModelCompra();
                modelCompra.setComId(this.getResultSet().getInt(1));
                modelCompra.setProId(this.getResultSet().getInt(2));
                modelCompra.setForId(this.getResultSet().getInt(3));
                modelCompra.setPagId(this.getResultSet().getInt(4));
                modelCompra.setUsuId(this.getResultSet().getInt(5));
                modelCompra.setComData_compra(this.getResultSet().getDate(6));
                modelCompra.setComData_recebimento(this.getResultSet().getDate(7));
                listamodelCompra.add(modelCompra);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCompra;
    }

    /**
    * atualiza Compra
    * @param pModelCompra
    * @return boolean
    */
    public boolean atualizarCompraDAO(ModelCompra pModelCompra){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Compra SET "
                    + "pk_com_id = '" + pModelCompra.getComId() + "',"
                    + "fk_pro_id = '" + pModelCompra.getProId() + "',"
                    + "fk_for_id = '" + pModelCompra.getForId() + "',"
                    + "fk_pag_id = '" + pModelCompra.getPagId() + "',"
                    + "fk_usu_id = '" + pModelCompra.getUsuId() + "',"
                    + "com_data_compra = '" + pModelCompra.getComData_compra() + "',"
                    + "com_data_recebimento = '" + pModelCompra.getComData_recebimento() + "'"
                + " WHERE "
                    + "pk_com_id = '" + pModelCompra.getComId() + "'"
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
    * exclui Compra
    * @param pComId
    * @return boolean
    */
    public boolean excluirCompraDAO(int pComId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Compra "
                + " WHERE "
                    + "pk_com_id = '" + pComId + "'"
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