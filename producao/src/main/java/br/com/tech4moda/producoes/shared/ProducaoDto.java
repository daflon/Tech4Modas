package br.com.tech4moda.producoes.shared;

import br.com.tech4moda.producoes.model.Roupa;

public class ProducaoDto {
    private String nomeCliente;
    private String idRoupa;
    private Roupa dadosRoupa;
    private Double valor;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdRoupa() {
        return idRoupa;
    }
    public void setIdRoupa(String idRoupa) {
        this.idRoupa = idRoupa;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Roupa getDadosRoupa() {
        return dadosRoupa;
    }
    public void setDadosRoupa(Roupa dadosRoupa) {
        this.dadosRoupa = dadosRoupa;
    }
    
            
}
