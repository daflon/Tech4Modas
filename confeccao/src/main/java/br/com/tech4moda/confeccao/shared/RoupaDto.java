package br.com.tech4moda.confeccao.shared;

import java.util.List;

public class RoupaDto {
  private String id;
  private String modelo;
  private List<String> materiais;
  private String tamanho;

  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
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
