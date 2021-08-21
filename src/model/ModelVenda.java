package model;
/**
*
* @author Maria
*/
public class ModelVenda {

    private int venId;
    private int pagId;
    private int proId;
    private int cliId;
    private int usuId;

    /**
    * Construtor
    */
    public ModelVenda(){}

    /**
    * seta o valor de venId
    * @param pVenId
    */
    public void setVenId(int pVenId){
        this.venId = pVenId;
    }
    /**
    * @return pk_venId
    */
    public int getVenId(){
        return this.venId;
    }

    /**
    * seta o valor de pagId
    * @param pPagId
    */
    public void setPagId(int pPagId){
        this.pagId = pPagId;
    }
    /**
    * @return fk_pagId
    */
    public int getPagId(){
        return this.pagId;
    }

    /**
    * seta o valor de proId
    * @param pProId
    */
    public void setProId(int pProId){
        this.proId = pProId;
    }
    /**
    * @return fk_proId
    */
    public int getProId(){
        return this.proId;
    }

    /**
    * seta o valor de cliId
    * @param pCliId
    */
    public void setCliId(int pCliId){
        this.cliId = pCliId;
    }
    /**
    * @return fk_cliId
    */
    public int getCliId(){
        return this.cliId;
    }

    /**
    * seta o valor de usuId
    * @param pUsuId
    */
    public void setUsuId(int pUsuId){
        this.usuId = pUsuId;
    }
    /**
    * @return fk_usuId
    */
    public int getUsuId(){
        return this.usuId;
    }

    @Override
    public String toString(){
        return "ModelVenda {" + "::venId = " + this.venId + "::pagId = " + this.pagId + "::proId = " + this.proId + "::cliId = " + this.cliId + "::usuId = " + this.usuId +  "}";
    }
}