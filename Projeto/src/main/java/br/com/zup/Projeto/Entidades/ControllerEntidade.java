package br.com.zup.Projeto.Entidades;

import br.com.zup.Projeto.Doadores.Doador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/entidade")
@RestController
public class ControllerEntidade
{
    @Autowired
    private ServiceEntidades serviceEntidades;
    @PostMapping
    public Entidade postEntidade(@RequestBody Entidade entidade)
    {
        Entidade postEntidade = null;
        postEntidade = serviceEntidades.createEntidade(entidade);
        return postEntidade;
    }
    @GetMapping("/{ID}")
    private Entidade getEntidade(@PathVariable(name = "ID") int entidadeId)
    {
        Entidade getEntidade = null;
        getEntidade = serviceEntidades.readEntidadeId(entidadeId);
        return getEntidade;
    }

}
