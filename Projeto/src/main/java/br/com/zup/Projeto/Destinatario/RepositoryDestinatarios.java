package br.com.zup.Projeto.Destinatario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDestinatarios extends CrudRepository<Destinatario, Integer>{}
