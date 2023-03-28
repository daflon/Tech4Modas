package br.com.tech4moda.confeccao.shared;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class RoupaCompletoDto {
  private String id;
  @NotEmpty(message="Campo modelo deve ser informado")
  @NotBlank(message="Tem que informar os caracteres")
  private String modelo;
  private List<String> materiais;
  @Size(min=1, max=2, message="Informe P, M, G ou GG")
  private String tamanho;
  @Positive(message="Valor deve ser informado")
  private Double valor;
  
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
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
 
}
