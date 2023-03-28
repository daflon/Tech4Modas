package br.com.tech4moda.producoes.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4moda.producoes.httpClient.ConfeccaoClient;
import br.com.tech4moda.producoes.model.Producao;
import br.com.tech4moda.producoes.repository.ProducaoRepository;
import br.com.tech4moda.producoes.shared.ProducaoCompletoDto;
import br.com.tech4moda.producoes.shared.ProducaoDto;

@Service
public class ProducaoServiceImp implements ProducaoService{

    @Autowired
    private ProducaoRepository repository;

    @Autowired
    private ConfeccaoClient roupaClient;

    @Override
    public List<ProducaoCompletoDto> obterProducao() {
        List<Producao> producao = repository.findAll();
        List<ProducaoCompletoDto> dto = producao.stream().map(p -> new ModelMapper().map(p, ProducaoCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<ProducaoDto> obterProducaoPorId(String id) {
        
        Optional<Producao> producao = repository.findById(id);
        if(producao.isPresent()){
            ProducaoDto producaoComRoupa = new ModelMapper().map(producao, ProducaoDto.class);
            producaoComRoupa.setDadosRoupa(roupaClient.obterRoupa(producaoComRoupa.getIdRoupa()));
            return Optional.of(producaoComRoupa);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public void excluirProducao(String id) {
        repository.deleteById(id);
    }

    @Override
    public ProducaoCompletoDto CadastrarProducao(ProducaoCompletoDto dto) {
        Producao producao = new ModelMapper().map(dto, Producao.class);

        repository.save(producao);
        return new ModelMapper().map(producao,ProducaoCompletoDto.class);
    }

    @Override
    public Optional<ProducaoDto> atualizarProducaoPorId(String id, ProducaoDto dto) {
        Optional<Producao> retorno = repository.findById(id);

        if(retorno.isPresent()){
            Producao producaoRetorno = new ModelMapper().map(dto, Producao.class);
            producaoRetorno.setId(id);
            repository.save(producaoRetorno);
            return Optional.of(new ModelMapper().map(producaoRetorno, ProducaoDto.class));
        }else{
            return Optional.empty();
        }
    }   
}
