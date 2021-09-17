package br.com.zup.Projeto.PontosDeColeta;

import br.com.zup.Projeto.Entidades.Entidades;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PontoDeColeta
{
    @ManyToOne
    Coordenadas coordenadas;
    @ManyToMany
    List<Entidades> entidades = new ArrayList<Entidades>();
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;


}
