package model;
import java.util.Date;
/**
*
* @author Marley
*/
public class ModelCompra {

    private int comId;
    private int proId;
    private int forId;
    private int pagId;
    private int usuId;
    private Date comData_compra;
    private Date comData_recebimento;

    /**
    * Construtor
    */
    public ModelCompra(){}

    /**
    * seta o valor de comId
    * @param pComId
    */
    public void setComId(int pComId){
        this.comId = pComId;
    }
    /**
    * @return pk_comId
    */
    public int getComId(){
        return this.comId;
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
    * seta o valor de forId
    * @param pForId
    */
    public void setForId(int pForId){
        this.forId = pForId;
    }
    /**
    * @return fk_forId
    */
    public int getForId(){
        return this.forId;
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

    /**
    * seta o valor de comData_compra
    * @param pComData_compra
    */
    public void setComData_compra(Date pComData_compra){
        this.comData_compra = pComData_compra;
    }
    /**
    * @return comData_compra
    */
    public Date getComData_compra(){
        return this.comData_compra;
    }

    /**
    * seta o valor de comData_recebimento
    * @param pComData_recebimento
    */
    public void setComData_recebimento(Date pComData_recebimento){
        this.comData_recebimento = pComData_recebimento;
    }
    /**
    * @return comData_recebimento
    */
    public Date getComData_recebimento(){
        return this.comData_recebimento;
    }

    @Override
    public String toString(){
        return "ModelCompra {" + "::comId = " + this.comId + "::proId = " + this.proId + "::forId = " + this.forId + "::pagId = " + this.pagId + "::usuId = " + this.usuId + "::comData_compra = " + this.comData_compra + "::comData_recebimento = " + this.comData_recebimento +  "}";
    }
}