package br.com.zup.Projeto.Doadores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceDoador
{
    @Autowired
    private RepositoryDoadores repositoryDoadores;

    public Doador createDoador(Doador doador)
    {
        Doador createDoador = null;
        createDoador = repositoryDoadores.save(doador);
        return createDoador;
    }

    public Iterable<Doador> readDoador()
    {
        Iterable<Doador> readDoador = null;
        readDoador = repositoryDoadores.findAll();
        return readDoador;
    }
    public Doador readDoadorId(int id)
    {
        Optional<Doador> doadorOptional;
        doadorOptional = repositoryDoadores.findById(id);
        if(doadorOptional.isEmpty())
            throw  new RuntimeException("fail");
        else
            return doadorOptional.get();
    }

}
