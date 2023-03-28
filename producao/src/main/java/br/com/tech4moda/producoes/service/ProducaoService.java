package br.com.tech4moda.producoes.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4moda.producoes.shared.ProducaoCompletoDto;
import br.com.tech4moda.producoes.shared.ProducaoDto;

public interface ProducaoService {
    
    List<ProducaoCompletoDto> obterProducao();
    Optional<ProducaoDto> obterProducaoPorId(String id);
    void excluirProducao(String id);
    ProducaoCompletoDto CadastrarProducao(ProducaoCompletoDto producao);
    Optional<ProducaoDto> atualizarProducaoPorId(String id, ProducaoDto dto);

}
