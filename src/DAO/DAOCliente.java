package DAO;

import model.ModelCliente;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Maria
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Cliente ("
                    + "pk_cli_id,"
                    + "fk_pes_id"
                + ") VALUES ("
                    + "'" + pModelCliente.getCliId() + "',"
                    + "'" + pModelCliente.getPesId() + "'"
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
    * recupera Cliente
    * @param pCliId
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pCliId){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_cli_id,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Cliente"
                 + " WHERE"
                     + " pk_cli_id = '" + pCliId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCliId(this.getResultSet().getInt(1));
                modelCliente.setPesId(this.getResultSet().getInt(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_cli_id,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCliId(this.getResultSet().getInt(1));
                modelCliente.setPesId(this.getResultSet().getInt(2));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Cliente SET "
                    + "pk_cli_id = '" + pModelCliente.getCliId() + "',"
                    + "fk_pes_id = '" + pModelCliente.getPesId() + "'"
                + " WHERE "
                    + "pk_cli_id = '" + pModelCliente.getCliId() + "'"
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
    * exclui Cliente
    * @param pCliId
    * @return boolean
    */
    public boolean excluirClienteDAO(int pCliId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Cliente "
                + " WHERE "
                    + "pk_cli_id = '" + pCliId + "'"
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