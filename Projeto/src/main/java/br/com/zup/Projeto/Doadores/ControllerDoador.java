package br.com.zup.Projeto.Doadores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/doador")
@RestController
public class ControllerDoador
{
    @Autowired
    private ServiceDoador serviceDoador;
    @PostMapping
    public Doador postDoador(@RequestBody Doador doador)
    {
        Doador postDoador = null;
        postDoador = serviceDoador.createDoador(doador);
        return postDoador;
    }
    @GetMapping("{ID}")
    public Doador getDoador(@PathVariable(name = "ID") int doadorId)
    {
        Doador getDoador = null;
        getDoador = serviceDoador.readDoadorId(doadorId);
        return getDoador;
    }
}
