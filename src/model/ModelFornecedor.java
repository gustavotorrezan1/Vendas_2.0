package model;
/**
*
* @author Gustavo Torrezani
*/
public class ModelFornecedor {
//
    private int forId;
    private String forEmpresa;
    private String forRepresentante;
    private int pesId;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de forId
    * @param pForId
    */
    public void setForId(int pForId){
        this.forId = pForId;
    }
    /**
    * @return pk_forId
    */
    public int getForId(){
        return this.forId;
    }

    /**
    * seta o valor de forEmpresa
    * @param pForEmpresa
    */
    public void setForEmpresa(String pForEmpresa){
        this.forEmpresa = pForEmpresa;
    }
    /**
    * @return forEmpresa
    */
    public String getForEmpresa(){
        return this.forEmpresa;
    }

    /**
    * seta o valor de forRepresentante
    * @param pForRepresentante
    */
    public void setForRepresentante(String pForRepresentante){
        this.forRepresentante = pForRepresentante;
    }
    /**
    * @return forRepresentante
    */
    public String getForRepresentante(){
        return this.forRepresentante;
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
        return "ModelFornecedor {" + "::forId = " + this.forId + "::forEmpresa = " + this.forEmpresa + "::forRepresentante = " + this.forRepresentante + "::pesId = " + this.pesId +  "}";
    }
}