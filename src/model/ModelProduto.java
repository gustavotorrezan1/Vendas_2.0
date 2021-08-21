package model;
/**
*
* @author Gustavo Torrezani
*/
public class ModelProduto {

    private int proId;
    private String proDescricao;
    private String proNomeLongo;
    private String proCod_bar;
    private double proPreco_ven;
    private double proPreco_cus;
    private String proCategoria;
    private String proTipo_un;
    private int proQnt_estoque;
    private int forId;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de proId
    * @param pProId
    */
    public void setProId(int pProId){
        this.proId = pProId;
    }
    /**
    * @return pk_proId
    */
    public int getProId(){
        return this.proId;
    }

    /**
    * seta o valor de proDescricao
    * @param pProDescricao
    */
    public void setProDescricao(String pProDescricao){
        this.proDescricao = pProDescricao;
    }
    /**
    * @return proDescricao
    */
    public String getProDescricao(){
        return this.proDescricao;
    }

    /**
    * seta o valor de proNomeLongo
    * @param pProNomeLongo
    */
    public void setProNomeLongo(String pProNomeLongo){
        this.proNomeLongo = pProNomeLongo;
    }
    /**
    * @return proNomeLongo
    */
    public String getProNomeLongo(){
        return this.proNomeLongo;
    }

    /**
    * seta o valor de proCod_bar
    * @param pProCod_bar
    */
    public void setProCod_bar(String pProCod_bar){
        this.proCod_bar = pProCod_bar;
    }
    /**
    * @return proCod_bar
    */
    public String getProCod_bar(){
        return this.proCod_bar;
    }

    /**
    * seta o valor de proPreco_ven
    * @param pProPreco_ven
    */
    public void setProPreco_ven(double pProPreco_ven){
        this.proPreco_ven = pProPreco_ven;
    }
    /**
    * @return proPreco_ven
    */
    public double getProPreco_ven(){
        return this.proPreco_ven;
    }

    /**
    * seta o valor de proPreco_cus
    * @param pProPreco_cus
    */
    public void setProPreco_cus(double pProPreco_cus){
        this.proPreco_cus = pProPreco_cus;
    }
    /**
    * @return proPreco_cus
    */
    public double getProPreco_cus(){
        return this.proPreco_cus;
    }

    /**
    * seta o valor de proCategoria
    * @param pProCategoria
    */
    public void setProCategoria(String pProCategoria){
        this.proCategoria = pProCategoria;
    }
    /**
    * @return proCategoria
    */
    public String getProCategoria(){
        return this.proCategoria;
    }

    /**
    * seta o valor de proTipo_un
    * @param pProTipo_un
    */
    public void setProTipo_un(String pProTipo_un){
        this.proTipo_un = pProTipo_un;
    }
    /**
    * @return proTipo_un
    */
    public String getProTipo_un(){
        return this.proTipo_un;
    }

    /**
    * seta o valor de proQnt_estoque
    * @param pProQnt_estoque
    */
    public void setProQnt_estoque(int pProQnt_estoque){
        this.proQnt_estoque = pProQnt_estoque;
    }
    /**
    * @return proQnt_estoque
    */
    public int getProQnt_estoque(){
        return this.proQnt_estoque;
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

    @Override
    public String toString(){
        return "ModelProduto {" + "::proId = " + this.proId + "::proDescricao = " + this.proDescricao + "::proNomeLongo = " + this.proNomeLongo + "::proCod_bar = " + this.proCod_bar + "::proPreco_ven = " + this.proPreco_ven + "::proPreco_cus = " + this.proPreco_cus + "::proCategoria = " + this.proCategoria + "::proTipo_un = " + this.proTipo_un + "::proQnt_estoque = " + this.proQnt_estoque + "::forId = " + this.forId +  "}";
    }
}