package br.com.tech4moda.producoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4moda.producoes.service.ProducaoService;
import br.com.tech4moda.producoes.shared.ProducaoCompletoDto;
import br.com.tech4moda.producoes.shared.ProducaoDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/producao")
public class ProducaoController {
    
    @Autowired
    private ProducaoService servico;

    //Cadastrar producao
    @PostMapping
    public ResponseEntity<ProducaoCompletoDto> cadastrarProducao(@RequestBody @Valid ProducaoCompletoDto producao)
    {
        return new ResponseEntity<>(servico.CadastrarProducao(producao),HttpStatus.CREATED);
    }

    //Buscar Producao
    @GetMapping
    public ResponseEntity<List<ProducaoCompletoDto>> obterProducao()
    {
        return new ResponseEntity<>(servico.obterProducao(),HttpStatus.OK);
    } 

    //Buscar producao por id
    @GetMapping("/{id}")
    public ResponseEntity<ProducaoDto> obterProducaoPorId(@PathVariable String id)
    {
        Optional<ProducaoDto> retorno = servico.obterProducaoPorId(id);
        
        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }    
    }

    //Deletar Producao
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirProducao(@PathVariable String id)
    {
        servico.excluirProducao(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Atualizar producao
    @PutMapping("/{id}")
    public ResponseEntity<ProducaoDto> atualizarProducao(@PathVariable String id, @Valid ProducaoDto producao){
        Optional<ProducaoDto> retorno = servico.atualizarProducaoPorId(id, producao);

        if(retorno.isPresent()){
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
