package DAO;

import model.ModelVenda;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Maria
*/
public class DAOVenda extends ConexaoMySql {

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Venda ("
                    + "pk_ven_id,"
                    + "fk_pag_id,"
                    + "fk_pro_id,"
                    + "fk_cli_id,"
                    + "fk_usu_id"
                + ") VALUES ("
                    + "'" + pModelVenda.getVenId() + "',"
                    + "'" + pModelVenda.getPagId() + "',"
                    + "'" + pModelVenda.getProId() + "',"
                    + "'" + pModelVenda.getCliId() + "',"
                    + "'" + pModelVenda.getUsuId() + "'"
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
    * recupera Venda
    * @param pVenId
    * @return ModelVenda
    */
    public ModelVenda getVendaDAO(int pVenId){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_ven_id,"
                    + "fk_pag_id,"
                    + "fk_pro_id,"
                    + "fk_cli_id,"
                    + "fk_usu_id"
                 + " FROM"
                     + " Venda"
                 + " WHERE"
                     + " pk_ven_id = '" + pVenId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setVenId(this.getResultSet().getInt(1));
                modelVenda.setPagId(this.getResultSet().getInt(2));
                modelVenda.setProId(this.getResultSet().getInt(3));
                modelVenda.setCliId(this.getResultSet().getInt(4));
                modelVenda.setUsuId(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_ven_id,"
                    + "fk_pag_id,"
                    + "fk_pro_id,"
                    + "fk_cli_id,"
                    + "fk_usu_id"
                 + " FROM"
                     + " Venda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setVenId(this.getResultSet().getInt(1));
                modelVenda.setPagId(this.getResultSet().getInt(2));
                modelVenda.setProId(this.getResultSet().getInt(3));
                modelVenda.setCliId(this.getResultSet().getInt(4));
                modelVenda.setUsuId(this.getResultSet().getInt(5));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Venda SET "
                    + "pk_ven_id = '" + pModelVenda.getVenId() + "',"
                    + "fk_pag_id = '" + pModelVenda.getPagId() + "',"
                    + "fk_pro_id = '" + pModelVenda.getProId() + "',"
                    + "fk_cli_id = '" + pModelVenda.getCliId() + "',"
                    + "fk_usu_id = '" + pModelVenda.getUsuId() + "'"
                + " WHERE "
                    + "pk_ven_id = '" + pModelVenda.getVenId() + "'"
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
    * exclui Venda
    * @param pVenId
    * @return boolean
    */
    public boolean excluirVendaDAO(int pVenId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Venda "
                + " WHERE "
                    + "pk_ven_id = '" + pVenId + "'"
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