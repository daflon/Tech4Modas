package br.com.tech4moda.producoes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("producao")
public class Producao {
    @Id
    private String id;
    private String nomeCliente;
    private String idRoupa;
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
