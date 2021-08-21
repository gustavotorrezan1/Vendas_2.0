package DAO;

import model.ModelUsuario;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Marley
*/
public class DAOUsuario extends ConexaoMySql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Usuario ("
                    + "pk_usu_id,"
                    + "usu_nivel_permissao,"
                    + "fk_pes_id"
                + ") VALUES ("
                    + "'" + pModelUsuario.getUsuId() + "',"
                    + "'" + pModelUsuario.getUsuNivel_permissao() + "',"
                    + "'" + pModelUsuario.getPesId() + "'"
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
    * recupera Usuario
    * @param pUsuId
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pUsuId){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_usu_id,"
                    + "usu_nivel_permissao,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Usuario"
                 + " WHERE"
                     + " pk_usu_id = '" + pUsuId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setUsuId(this.getResultSet().getInt(1));
                modelUsuario.setUsuNivel_permissao(this.getResultSet().getString(2));
                modelUsuario.setPesId(this.getResultSet().getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_usu_id,"
                    + "usu_nivel_permissao,"
                    + "fk_pes_id"
                 + " FROM"
                     + " Usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsuId(this.getResultSet().getInt(1));
                modelUsuario.setUsuNivel_permissao(this.getResultSet().getString(2));
                modelUsuario.setPesId(this.getResultSet().getInt(3));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Usuario SET "
                    + "pk_usu_id = '" + pModelUsuario.getUsuId() + "',"
                    + "usu_nivel_permissao = '" + pModelUsuario.getUsuNivel_permissao() + "',"
                    + "fk_pes_id = '" + pModelUsuario.getPesId() + "'"
                + " WHERE "
                    + "pk_usu_id = '" + pModelUsuario.getUsuId() + "'"
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
    * exclui Usuario
    * @param pUsuId
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pUsuId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Usuario "
                + " WHERE "
                    + "pk_usu_id = '" + pUsuId + "'"
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