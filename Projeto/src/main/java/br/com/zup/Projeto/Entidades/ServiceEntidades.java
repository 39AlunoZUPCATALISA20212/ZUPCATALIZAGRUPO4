package br.com.zup.Projeto.Entidades;

import br.com.zup.Projeto.TiposDeDoador.OsTiposDeDoador;
import br.com.zup.Projeto.TiposDeDoador.ServiceTiposDeDoador;
import br.com.zup.Projeto.TiposDeDoador.TiposDeDoador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEntidades
{
    @Autowired
    private RepositoryEntidades repositoryEntidades;
    @Autowired
    private ServiceTiposDeDoador serviceTiposDeDoador;

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
    public Iterable<Entidade> readEntidadesDoador(Iterable<TiposDeDoador> iterable)
    {
        Iterable<Entidade> readEntidatesDoador = null;
        readEntidatesDoador = repositoryEntidades.findAllBydoadoresIn(iterable);
        return readEntidatesDoador;
    }
    public Iterable<Entidade> readEntidadesEnumString (String string)
    {
        TiposDeDoador readEntidadeEnumString = null;
        readEntidadeEnumString = serviceTiposDeDoador.readTiposDeDoadorTiposDeDoador(OsTiposDeDoador.valueOf(string));
        return readEntidadesDoador(List.of(readEntidadeEnumString));
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
