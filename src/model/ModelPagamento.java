package model;
import java.util.Date;
/**
*
* @author Maria
*/
public class ModelPagamento {

    private int pagId;
    private String pagTipo_pagamento;
    private double pagValor_pagemento;
    private Date pagData_pagamento;

    /**
    * Construtor
    */
    public ModelPagamento(){}

    /**
    * seta o valor de pagId
    * @param pPagId
    */
    public void setPagId(int pPagId){
        this.pagId = pPagId;
    }
    /**
    * @return pk_pagId
    */
    public int getPagId(){
        return this.pagId;
    }

    /**
    * seta o valor de pagTipo_pagamento
    * @param pPagTipo_pagamento
    */
    public void setPagTipo_pagamento(String pPagTipo_pagamento){
        this.pagTipo_pagamento = pPagTipo_pagamento;
    }
    /**
    * @return pagTipo_pagamento
    */
    public String getPagTipo_pagamento(){
        return this.pagTipo_pagamento;
    }

    /**
    * seta o valor de pagValor_pagemento
    * @param pPagValor_pagemento
    */
    public void setPagValor_pagemento(double pPagValor_pagemento){
        this.pagValor_pagemento = pPagValor_pagemento;
    }
    /**
    * @return pagValor_pagemento
    */
    public double getPagValor_pagemento(){
        return this.pagValor_pagemento;
    }

    /**
    * seta o valor de pagData_pagamento
    * @param pPagData_pagamento
    */
    public void setPagData_pagamento(Date pPagData_pagamento){
        this.pagData_pagamento = pPagData_pagamento;
    }
    /**
    * @return pagData_pagamento
    */
    public Date getPagData_pagamento(){
        return this.pagData_pagamento;
    }

    @Override
    public String toString(){
        return "ModelPagamento {" + "::pagId = " + this.pagId + "::pagTipo_pagamento = " + this.pagTipo_pagamento + "::pagValor_pagemento = " + this.pagValor_pagemento + "::pagData_pagamento = " + this.pagData_pagamento +  "}";
    }
}