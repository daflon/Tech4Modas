package br.com.tech4moda.producoes.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4moda.producoes.model.Roupa;


@FeignClient(name = "confeccao", fallback = ConfeccaoClientFallback.class)
public interface ConfeccaoClient {

    @RequestMapping(value = "/catalogo/{id}", method=RequestMethod.GET)
    Roupa obterRoupa(@PathVariable String id);
    
}

@Component
class ConfeccaoClientFallback implements ConfeccaoClient {
    @Override
    public Roupa obterRoupa(String id) {
        return new Roupa();
    }
}