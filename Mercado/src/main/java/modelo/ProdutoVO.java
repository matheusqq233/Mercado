/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class ProdutoVO {
    
   private long idproduto;
   private String nomepro;
   private int quantidade;
   private double valorcusto;
   private String tipoproduto;

    public String getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(String tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

   
   

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }
   private String datavalidade;

    public long getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(long idproduto) {
        this.idproduto = idproduto;
    }

    public String getNomepro() {
        return nomepro;
    }

    public void setNomepro(String nomepro) {
        this.nomepro = nomepro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorcusto() {
        return valorcusto;
    }

    public void setValorcusto(double valorcusto) {
        this.valorcusto = valorcusto;
    }
    
}
