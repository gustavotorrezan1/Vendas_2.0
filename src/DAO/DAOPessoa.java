package DAO;
//
import model.ModelPessoa;
import connections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Marley
*/
public class DAOPessoa extends ConexaoMySql {

    /**
    * grava Pessoa
    * @param pModelPessoa
    * @return int
    */
    public int salvarPessoaDAO(ModelPessoa pModelPessoa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Pessoa ("
                    + "pk_pes_id,"
                    + "pes_nome,"
                    + "pes_cpf,"
                    + "pes_cnpj,"
                    + "pes_telefone,"
                    + "pes_email,"
                    + "pes_cep,"
                    + "pes_estado,"
                    + "pes_cidade,"
                    + "pes_bairro,"
                    + "pes_rua,"
                    + "pes_num_rua"
                + ") VALUES ("
                    + "'" + pModelPessoa.getPesId() + "',"
                    + "'" + pModelPessoa.getPesNome() + "',"
                    + "'" + pModelPessoa.getPesCpf() + "',"
                    + "'" + pModelPessoa.getPesCnpj() + "',"
                    + "'" + pModelPessoa.getPesTelefone() + "',"
                    + "'" + pModelPessoa.getPesEmail() + "',"
                    + "'" + pModelPessoa.getPesCep() + "',"
                    + "'" + pModelPessoa.getPesEstado() + "',"
                    + "'" + pModelPessoa.getPesCidade() + "',"
                    + "'" + pModelPessoa.getPesBairro() + "',"
                    + "'" + pModelPessoa.getPesRua() + "',"
                    + "'" + pModelPessoa.getPesNum_rua() + "'"
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
    * recupera Pessoa
    * @param pPesId
    * @return ModelPessoa
    */
    public ModelPessoa getPessoaDAO(int pPesId){
        ModelPessoa modelPessoa = new ModelPessoa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pes_id,"
                    + "pes_nome,"
                    + "pes_cpf,"
                    + "pes_cnpj,"
                    + "pes_telefone,"
                    + "pes_email,"
                    + "pes_cep,"
                    + "pes_estado,"
                    + "pes_cidade,"
                    + "pes_bairro,"
                    + "pes_rua,"
                    + "pes_num_rua"
                 + " FROM"
                     + " Pessoa"
                 + " WHERE"
                     + " pk_pes_id = '" + pPesId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPessoa.setPesId(this.getResultSet().getInt(1));
                modelPessoa.setPesNome(this.getResultSet().getString(2));
                modelPessoa.setPesCpf(this.getResultSet().getString(3));
                modelPessoa.setPesCnpj(this.getResultSet().getString(4));
                modelPessoa.setPesTelefone(this.getResultSet().getString(5));
                modelPessoa.setPesEmail(this.getResultSet().getString(6));
                modelPessoa.setPesCep(this.getResultSet().getString(7));
                modelPessoa.setPesEstado(this.getResultSet().getString(8));
                modelPessoa.setPesCidade(this.getResultSet().getString(9));
                modelPessoa.setPesBairro(this.getResultSet().getString(10));
                modelPessoa.setPesRua(this.getResultSet().getString(11));
                modelPessoa.setPesNum_rua(this.getResultSet().getString(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelPessoa;
    }

    /**
    * recupera uma lista de Pessoa
        * @return ArrayList
    */
    public ArrayList<ModelPessoa> getListaPessoaDAO(){
        ArrayList<ModelPessoa> listamodelPessoa = new ArrayList();
        ModelPessoa modelPessoa = new ModelPessoa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pes_id,"
                    + "pes_nome,"
                    + "pes_cpf,"
                    + "pes_cnpj,"
                    + "pes_telefone,"
                    + "pes_email,"
                    + "pes_cep,"
                    + "pes_estado,"
                    + "pes_cidade,"
                    + "pes_bairro,"
                    + "pes_rua,"
                    + "pes_num_rua"
                 + " FROM"
                     + " Pessoa"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPessoa = new ModelPessoa();
                modelPessoa.setPesId(this.getResultSet().getInt(1));
                modelPessoa.setPesNome(this.getResultSet().getString(2));
                modelPessoa.setPesCpf(this.getResultSet().getString(3));
                modelPessoa.setPesCnpj(this.getResultSet().getString(4));
                modelPessoa.setPesTelefone(this.getResultSet().getString(5));
                modelPessoa.setPesEmail(this.getResultSet().getString(6));
                modelPessoa.setPesCep(this.getResultSet().getString(7));
                modelPessoa.setPesEstado(this.getResultSet().getString(8));
                modelPessoa.setPesCidade(this.getResultSet().getString(9));
                modelPessoa.setPesBairro(this.getResultSet().getString(10));
                modelPessoa.setPesRua(this.getResultSet().getString(11));
                modelPessoa.setPesNum_rua(this.getResultSet().getString(12));
                listamodelPessoa.add(modelPessoa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPessoa;
    }

    /**
    * atualiza Pessoa
    * @param pModelPessoa
    * @return boolean
    */
    public boolean atualizarPessoaDAO(ModelPessoa pModelPessoa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Pessoa SET "
                    + "pk_pes_id = '" + pModelPessoa.getPesId() + "',"
                    + "pes_nome = '" + pModelPessoa.getPesNome() + "',"
                    + "pes_cpf = '" + pModelPessoa.getPesCpf() + "',"
                    + "pes_cnpj = '" + pModelPessoa.getPesCnpj() + "',"
                    + "pes_telefone = '" + pModelPessoa.getPesTelefone() + "',"
                    + "pes_email = '" + pModelPessoa.getPesEmail() + "',"
                    + "pes_cep = '" + pModelPessoa.getPesCep() + "',"
                    + "pes_estado = '" + pModelPessoa.getPesEstado() + "',"
                    + "pes_cidade = '" + pModelPessoa.getPesCidade() + "',"
                    + "pes_bairro = '" + pModelPessoa.getPesBairro() + "',"
                    + "pes_rua = '" + pModelPessoa.getPesRua() + "',"
                    + "pes_num_rua = '" + pModelPessoa.getPesNum_rua() + "'"
                + " WHERE "
                    + "pk_pes_id = '" + pModelPessoa.getPesId() + "'"
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
    * exclui Pessoa
    * @param pPesId
    * @return boolean
    */
    public boolean excluirPessoaDAO(int pPesId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Pessoa "
                + " WHERE "
                    + "pk_pes_id = '" + pPesId + "'"
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