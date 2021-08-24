package model;
/**
*
* @author Gustavo Torrezani
*/
public class ModelUsuario {

    private int usuId;
    private String usuLogin;
    private String usuSenha;
    private String pesId;

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
    * seta o valor de usuLogin
    * @param pUsuLogin
    */
    public void setUsuLogin(String pUsuLogin){
        this.usuLogin = pUsuLogin;
    }
    /**
    * @return usuLogin
    */
    public String getUsuLogin(){
        return this.usuLogin;
    }

    /**
    * seta o valor de usuSenha
    * @param pUsuSenha
    */
    public void setUsuSenha(String pUsuSenha){
        this.usuSenha = pUsuSenha;
    }
    /**
    * @return usuSenha
    */
    public String getUsuSenha(){
        return this.usuSenha;
    }

    /**
    * seta o valor de pesId
    * @param pPesId
    */
    public void setPesId(String pPesId){
        this.pesId = pPesId;
    }
    /**
    * @return fk_pesId
    */
    public String getPesId(){
        return this.pesId;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::usuId = " + this.usuId + "::usuLogin = " + this.usuLogin + "::usuSenha = " + this.usuSenha + "::pesId = " + this.pesId +  "}";
    }
}