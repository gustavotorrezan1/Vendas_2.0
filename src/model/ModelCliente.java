package model;
/**
*
* @author Maria
*/
public class ModelCliente {

    private int cliId;
    private int pesId;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de cliId
    * @param pCliId
    */
    public void setCliId(int pCliId){
        this.cliId = pCliId;
    }
    /**
    * @return pk_cliId
    */
    public int getCliId(){
        return this.cliId;
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
        return "ModelCliente {" + "::cliId = " + this.cliId + "::pesId = " + this.pesId +  "}";
    }
}