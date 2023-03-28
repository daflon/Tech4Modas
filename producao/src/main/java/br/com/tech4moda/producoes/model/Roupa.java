package br.com.tech4moda.producoes.model;

import java.util.List;

public class Roupa {
  private String modelo;
  private List<String> materiais;
  private String tamanho;
  
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

  
  
}
