package DAO;
//
import model.ModelProduto;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gustavo Torrezani
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Produto ("
                    + "pk_pro_id,"
                    + "pro_descricao,"
                    + "pro_nome_longo,"
                    + "pro_cod_bar,"
                    + "pro_preco_ven,"
                    + "pro_preco_cus,"
                    + "pro_categoria,"
                    + "pro_tipo_un,"
                    + "pro_qnt_estoque,"
                    + "fk_for_id"
                + ") VALUES ("
                    + "'" + pModelProduto.getProId() + "',"
                    + "'" + pModelProduto.getProDescricao() + "',"
                    + "'" + pModelProduto.getProNomeLongo() + "',"
                    + "'" + pModelProduto.getProCod_bar() + "',"
                    + "'" + pModelProduto.getProPreco_ven() + "',"
                    + "'" + pModelProduto.getProPreco_cus() + "',"
                    + "'" + pModelProduto.getProCategoria() + "',"
                    + "'" + pModelProduto.getProTipo_un() + "',"
                    + "'" + pModelProduto.getProQnt_estoque() + "',"
                    + "'" + pModelProduto.getForId() + "'"
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
    * recupera Produto
    * @param pProId
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pProId){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pro_id,"
                    + "pro_descricao,"
                    + "pro_nome_longo,"
                    + "pro_cod_bar,"
                    + "pro_preco_ven,"
                    + "pro_preco_cus,"
                    + "pro_categoria,"
                    + "pro_tipo_un,"
                    + "pro_qnt_estoque,"
                    + "fk_for_id"
                 + " FROM"
                     + " Produto"
                 + " WHERE"
                     + " pk_pro_id = '" + pProId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setProId(this.getResultSet().getInt(1));
                modelProduto.setProDescricao(this.getResultSet().getString(2));
                modelProduto.setProNomeLongo(this.getResultSet().getString(3));
                modelProduto.setProCod_bar(this.getResultSet().getString(4));
                modelProduto.setProPreco_ven(this.getResultSet().getDouble(5));
                modelProduto.setProPreco_cus(this.getResultSet().getDouble(6));
                modelProduto.setProCategoria(this.getResultSet().getString(7));
                modelProduto.setProTipo_un(this.getResultSet().getString(8));
                modelProduto.setProQnt_estoque(this.getResultSet().getInt(9));
                modelProduto.setForId(this.getResultSet().getInt(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pro_id,"
                    + "pro_descricao,"
                    + "pro_nome_longo,"
                    + "pro_cod_bar,"
                    + "pro_preco_ven,"
                    + "pro_preco_cus,"
                    + "pro_categoria,"
                    + "pro_tipo_un,"
                    + "pro_qnt_estoque,"
                    + "fk_for_id"
                 + " FROM"
                     + " Produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setProId(this.getResultSet().getInt(1));
                modelProduto.setProDescricao(this.getResultSet().getString(2));
                modelProduto.setProNomeLongo(this.getResultSet().getString(3));
                modelProduto.setProCod_bar(this.getResultSet().getString(4));
                modelProduto.setProPreco_ven(this.getResultSet().getDouble(5));
                modelProduto.setProPreco_cus(this.getResultSet().getDouble(6));
                modelProduto.setProCategoria(this.getResultSet().getString(7));
                modelProduto.setProTipo_un(this.getResultSet().getString(8));
                modelProduto.setProQnt_estoque(this.getResultSet().getInt(9));
                modelProduto.setForId(this.getResultSet().getInt(10));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Produto SET "
                    + "pk_pro_id = '" + pModelProduto.getProId() + "',"
                    + "pro_descricao = '" + pModelProduto.getProDescricao() + "',"
                    + "pro_nome_longo = '" + pModelProduto.getProNomeLongo() + "',"
                    + "pro_cod_bar = '" + pModelProduto.getProCod_bar() + "',"
                    + "pro_preco_ven = '" + pModelProduto.getProPreco_ven() + "',"
                    + "pro_preco_cus = '" + pModelProduto.getProPreco_cus() + "',"
                    + "pro_categoria = '" + pModelProduto.getProCategoria() + "',"
                    + "pro_tipo_un = '" + pModelProduto.getProTipo_un() + "',"
                    + "pro_qnt_estoque = '" + pModelProduto.getProQnt_estoque() + "',"
                    + "fk_for_id = '" + pModelProduto.getForId() + "'"
                + " WHERE "
                    + "pk_pro_id = '" + pModelProduto.getProId() + "'"
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
    * exclui Produto
    * @param pProId
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pProId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Produto "
                + " WHERE "
                    + "pk_pro_id = '" + pProId + "'"
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