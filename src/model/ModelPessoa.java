package model;
/**
*
* @author Marley
*/
public class ModelPessoa {
//
    private int pesId;
    private String pesNome;
    private String pesCpf;
    private String pesCnpj;
    private String pesTelefone;
    private String pesEmail;
    private String pesCep;
    private String pesEstado;
    private String pesCidade;
    private String pesBairro;
    private String pesRua;
    private String pesNum_rua;

    /**
    * Construtor
    */
    public ModelPessoa(){}

    /**
    * seta o valor de pesId
    * @param pPesId
    */
    public void setPesId(int pPesId){
        this.pesId = pPesId;
    }
    /**
    * @return pk_pesId
    */
    public int getPesId(){
        return this.pesId;
    }

    /**
    * seta o valor de pesNome
    * @param pPesNome
    */
    public void setPesNome(String pPesNome){
        this.pesNome = pPesNome;
    }
    /**
    * @return pesNome
    */
    public String getPesNome(){
        return this.pesNome;
    }

    /**
    * seta o valor de pesCpf
    * @param pPesCpf
    */
    public void setPesCpf(String pPesCpf){
        this.pesCpf = pPesCpf;
    }
    /**
    * @return pesCpf
    */
    public String getPesCpf(){
        return this.pesCpf;
    }

    /**
    * seta o valor de pesCnpj
    * @param pPesCnpj
    */
    public void setPesCnpj(String pPesCnpj){
        this.pesCnpj = pPesCnpj;
    }
    /**
    * @return pesCnpj
    */
    public String getPesCnpj(){
        return this.pesCnpj;
    }

    /**
    * seta o valor de pesTelefone
    * @param pPesTelefone
    */
    public void setPesTelefone(String pPesTelefone){
        this.pesTelefone = pPesTelefone;
    }
    /**
    * @return pesTelefone
    */
    public String getPesTelefone(){
        return this.pesTelefone;
    }

    /**
    * seta o valor de pesEmail
    * @param pPesEmail
    */
    public void setPesEmail(String pPesEmail){
        this.pesEmail = pPesEmail;
    }
    /**
    * @return pesEmail
    */
    public String getPesEmail(){
        return this.pesEmail;
    }

    /**
    * seta o valor de pesCep
    * @param pPesCep
    */
    public void setPesCep(String pPesCep){
        this.pesCep = pPesCep;
    }
    /**
    * @return pesCep
    */
    public String getPesCep(){
        return this.pesCep;
    }

    /**
    * seta o valor de pesEstado
    * @param pPesEstado
    */
    public void setPesEstado(String pPesEstado){
        this.pesEstado = pPesEstado;
    }
    /**
    * @return pesEstado
    */
    public String getPesEstado(){
        return this.pesEstado;
    }

    /**
    * seta o valor de pesCidade
    * @param pPesCidade
    */
    public void setPesCidade(String pPesCidade){
        this.pesCidade = pPesCidade;
    }
    /**
    * @return pesCidade
    */
    public String getPesCidade(){
        return this.pesCidade;
    }

    /**
    * seta o valor de pesBairro
    * @param pPesBairro
    */
    public void setPesBairro(String pPesBairro){
        this.pesBairro = pPesBairro;
    }
    /**
    * @return pesBairro
    */
    public String getPesBairro(){
        return this.pesBairro;
    }

    /**
    * seta o valor de pesRua
    * @param pPesRua
    */
    public void setPesRua(String pPesRua){
        this.pesRua = pPesRua;
    }
    /**
    * @return pesRua
    */
    public String getPesRua(){
        return this.pesRua;
    }

    /**
    * seta o valor de pesNum_rua
    * @param pPesNum_rua
    */
    public void setPesNum_rua(String pPesNum_rua){
        this.pesNum_rua = pPesNum_rua;
    }
    /**
    * @return pesNum_rua
    */
    public String getPesNum_rua(){
        return this.pesNum_rua;
    }

    @Override
    public String toString(){
        return "ModelPessoa {" + "::pesId = " + this.pesId + "::pesNome = " + this.pesNome + "::pesCpf = " + this.pesCpf + "::pesCnpj = " + this.pesCnpj + "::pesTelefone = " + this.pesTelefone + "::pesEmail = " + this.pesEmail + "::pesCep = " + this.pesCep + "::pesEstado = " + this.pesEstado + "::pesCidade = " + this.pesCidade + "::pesBairro = " + this.pesBairro + "::pesRua = " + this.pesRua + "::pesNum_rua = " + this.pesNum_rua +  "}";
    }
}