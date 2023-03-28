package br.com.tech4moda.confeccao.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("roupas")
public class Roupa {
  @Id
  private String id;
  private String modelo;
  private List<String> materiais;
  private String tamanho;
  private Double valor;

  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public List<String> getMateriais() {
    return materiais;
  }
  public void setMateriais(List<String> materiais) {
    this.materiais = materiais;
  }
  public String getTamanho() {
    return tamanho;
  }
  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  } 
}
