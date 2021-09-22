package br.com.zup.Projeto.Entidades;

import br.com.zup.Projeto.Doadores.Doador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceEntidades
{
    @Autowired
    private RepositoryEntidades repositoryEntidades;

    public Entidade createEntidade(Entidade entidade)
    {
        Entidade createEntidade = null;
        createEntidade = repositoryEntidades.save(entidade);
        return createEntidade;
    }
    public Iterable<Entidade> readEntidade()
    {
        Iterable<Entidade> readEntidade = null;
        readEntidade = repositoryEntidades.findAll();
        return readEntidade;
    }
    public Entidade readEntidadeId(int id)
    {
        Optional<Entidade> entidadeOptional;
        entidadeOptional = repositoryEntidades.findById(id);
        if (entidadeOptional.isEmpty())
            throw new RuntimeException("fail");
        else
            return entidadeOptional.get();
    }
    public Entidade updateEntidade(Entidade entidade)
    {
        Entidade updateEntidade = null;
        updateEntidade = repositoryEntidades.save(entidade);
        return updateEntidade;
    }
    public Entidade updateEntidadeId(int id, Entidade entidade)
    {
        readEntidadeId(id);
        Entidade updateEntidadeId = null;
        updateEntidadeId = repositoryEntidades.save(entidade);
        return updateEntidadeId;
    }
    public void deleteEntidade(Entidade entidade)
    {
        repositoryEntidades.delete(entidade);
    }
    public void deleteEntidadeId(int id)
    {
        boolean emptyCatchBlock = false;
        readEntidadeId(id);
        repositoryEntidades.deleteById(id);
        try {readEntidadeId(id);}
        catch (RuntimeException runtimeException)
        {emptyCatchBlock = true;}
    }

}
