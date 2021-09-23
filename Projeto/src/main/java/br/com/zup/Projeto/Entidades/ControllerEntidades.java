package br.com.zup.Projeto.Entidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping()
@RestController
public class ControllerEntidades
{
    @Autowired
    private ServiceEntidades serviceEntidades;
    @RequestMapping(value = "/{doadores}", method = RequestMethod.GET)
    public Iterable<Entidade> getEntidades(@PathVariable(name = "doadores") String string)
    {
        Iterable<Entidade> getEntidades = null;
        getEntidades = serviceEntidades.readEntidadesEnumString(string);
        return getEntidades;
    }
}
