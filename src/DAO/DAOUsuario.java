package DAO;

import model.ModelUsuario;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Gustavo Torrezani
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
                "INSERT INTO usuario ("
                    + "pk_usu_id,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "fk_pes_id"
                + ") VALUES ("
                    + "'" + pModelUsuario.getUsuId() + "',"
                    + "'" + pModelUsuario.getUsuLogin() + "',"
                    + "'" + pModelUsuario.getUsuSenha() + "',"
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
                    + "usu_login,"
                    + "usu_senha,"
                    + "fk_pes_id"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " pk_usu_id = '" + pUsuId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setUsuId(this.getResultSet().getInt(1));
                modelUsuario.setUsuLogin(this.getResultSet().getString(2));
                modelUsuario.setUsuSenha(this.getResultSet().getString(3));
                modelUsuario.setPesId(this.getResultSet().getString(4));
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
                    + "usu_login,"
                    + "usu_senha,"
                    + "fk_pes_id"
                 + " FROM"
                     + " usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setUsuId(this.getResultSet().getInt(1));
                modelUsuario.setUsuLogin(this.getResultSet().getString(2));
                modelUsuario.setUsuSenha(this.getResultSet().getString(3));
                modelUsuario.setPesId(this.getResultSet().getString(4));
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
                "UPDATE usuario SET "
                    + "pk_usu_id = '" + pModelUsuario.getUsuId() + "',"
                    + "usu_login = '" + pModelUsuario.getUsuLogin() + "',"
                    + "usu_senha = '" + pModelUsuario.getUsuSenha() + "',"
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
                "DELETE FROM usuario "
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