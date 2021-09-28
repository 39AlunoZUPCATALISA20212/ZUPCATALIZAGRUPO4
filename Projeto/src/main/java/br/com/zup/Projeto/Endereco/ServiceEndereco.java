package br.com.zup.Projeto.Endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEndereco
{
    @Autowired
    private RepositoryEndereco repositoryEndereco;

    public Endereco createEndereco(Endereco endereco)
    {
        Endereco createEndereco = null;
        createEndereco = repositoryEndereco.save(endereco);
        return createEndereco;
    }
}
