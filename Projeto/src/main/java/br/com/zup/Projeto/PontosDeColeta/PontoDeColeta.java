package br.com.zup.Projeto.PontosDeColeta;

import br.com.zup.Projeto.Entidades.*;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Type;

import javax.annotation.Generated;
import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "pontosdecoleta")
public class PontoDeColeta
{
    @ManyToOne
    private Coordenadas coordenadas;
    private String nome;
    private String telefone;
    private String cep;
    /*@ManyToOne(targetEntity = Entidades.class)
    private List<Entidades> entidades;*/
    /*@ElementCollection()
    @Enumerated()
    @OrderColumn()
    @Type(type = "br.com.zup.Projeto.Entidades.Doacoes")
    @Column(name = "doadores", table = "doadores")
    @MapKeyColumn(name = "doadores", table = "doadores",  )*/
    //private Set<Doadores> doadores = EnumSet.noneOf(Doadores.class);
    //@ElementCollection(targetClass = Doacoes.class)



    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "Doacoes", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private List<Doacoes> doacoes;

    //List<Destinatarios> destinatarios;
    //List<Donativos> donativos;
    private LocalTime funcionamento;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;




}
