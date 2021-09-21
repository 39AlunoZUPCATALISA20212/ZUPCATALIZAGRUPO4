package br.com.zup.Projeto.Doar;

import br.com.zup.Projeto.Doadores.Doador;
import br.com.zup.Projeto.Entidades.Doacoes;
import br.com.zup.Projeto.Entidades.Entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "doacoes")
public class Doacao
{
    @ManyToOne
    private Doador doador;
    @ManyToOne
    private Entidades entidade;
    private Doacoes doacao;
    private LocalDateTime horario;

}
