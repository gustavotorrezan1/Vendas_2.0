package DAO;
//
import model.ModelFornecedor;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gustavo Torrezani
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Fornecedor ("
                    + "pk_for_id,"
                    + "for_empresa,"
                    + "for_representante,"
                    + "fk_pes_id"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getForId() + "',"
                    + "'" + pModelFornecedor.getForEmpresa() + "',"
                    + "'" + pModelFornecedor.getForRepresentante() + "',"
                    + "'" + pModelFornecedor.getPesId() + "'"
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
    * recupera Fornecedor
    * @param pForId
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pForId){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_for_id,"
                    + "for_empresa,"
                    + "for_representante,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Fornecedor"
                 + " WHERE"
                     + " pk_for_id = '" + pForId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setForId(this.getResultSet().getInt(1));
                modelFornecedor.setForEmpresa(this.getResultSet().getString(2));
                modelFornecedor.setForRepresentante(this.getResultSet().getString(3));
                modelFornecedor.setPesId(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_for_id,"
                    + "for_empresa,"
                    + "for_representante,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setForId(this.getResultSet().getInt(1));
                modelFornecedor.setForEmpresa(this.getResultSet().getString(2));
                modelFornecedor.setForRepresentante(this.getResultSet().getString(3));
                modelFornecedor.setPesId(this.getResultSet().getInt(4));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Fornecedor SET "
                    + "pk_for_id = '" + pModelFornecedor.getForId() + "',"
                    + "for_empresa = '" + pModelFornecedor.getForEmpresa() + "',"
                    + "for_representante = '" + pModelFornecedor.getForRepresentante() + "',"
                    + "fk_pes_id = '" + pModelFornecedor.getPesId() + "'"
                + " WHERE "
                    + "pk_for_id = '" + pModelFornecedor.getForId() + "'"
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
    * exclui Fornecedor
    * @param pForId
    * @return boolean
    */
    public boolean excluirFornecedorDAO(int pForId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Fornecedor "
                + " WHERE "
                    + "pk_for_id = '" + pForId + "'"
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