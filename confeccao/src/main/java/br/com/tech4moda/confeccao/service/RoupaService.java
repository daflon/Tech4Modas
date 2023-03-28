package br.com.tech4moda.confeccao.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4moda.confeccao.shared.RoupaCompletoDto;
import br.com.tech4moda.confeccao.shared.RoupaDto;


public interface RoupaService {
  List<RoupaCompletoDto> obterTodas();
  Optional<RoupaDto> obterPorId(String id);
  void excluirPorId(String id);
  RoupaCompletoDto cadastrar(RoupaCompletoDto dto);
  Optional<RoupaCompletoDto> atualizarPorId(String id, RoupaCompletoDto dto);
}
