package model;
/**
*
* @author Marley
*/
public class ModelUsuario {

    private int usuId;
    private String usuNivel_permissao;
    private int pesId;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de usuId
    * @param pUsuId
    */
    public void setUsuId(int pUsuId){
        this.usuId = pUsuId;
    }
    /**
    * @return pk_usuId
    */
    public int getUsuId(){
        return this.usuId;
    }

    /**
    * seta o valor de usuNivel_permissao
    * @param pUsuNivel_permissao
    */
    public void setUsuNivel_permissao(String pUsuNivel_permissao){
        this.usuNivel_permissao = pUsuNivel_permissao;
    }
    /**
    * @return usuNivel_permissao
    */
    public String getUsuNivel_permissao(){
        return this.usuNivel_permissao;
    }

    /**
    * seta o valor de pesId
    * @param pPesId
    */
    public void setPesId(int pPesId){
        this.pesId = pPesId;
    }
    /**
    * @return fk_pesId
    */
    public int getPesId(){
        return this.pesId;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::usuId = " + this.usuId + "::usuNivel_permissao = " + this.usuNivel_permissao + "::pesId = " + this.pesId +  "}";
    }
}