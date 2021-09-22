package br.com.zup.Projeto.PontosDeColeta;

import br.com.zup.Projeto.Coordenadas.Coordenadas;
import br.com.zup.Projeto.Entidades.*;
import br.com.zup.Projeto.TiposDeBeneficiario.TiposDeBeneficiario;
import br.com.zup.Projeto.TiposDeDoacoes.TiposDeDoacoes;
import br.com.zup.Projeto.TiposDeDoador.TiposDeDoador;
import br.com.zup.Projeto.TiposDeDonativos.TiposDeDonativos;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "pontosdecoleta")
public class PontoDeColeta
{
    @ManyToOne
    private Coordenadas coordenadas;
    private String nome;
    private String telefone;
    private String cep;
    @ManyToOne(targetEntity = Entidade.class)
    private List<Entidade> entidades;
    private List<TiposDeBeneficiario> beneficiarios;
    private List<TiposDeDonativos> donativos;
    private List<TiposDeDoador> doadores;
    private List<TiposDeDoacoes> doacoes;
    private LocalTime funcionamento;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;




}
 /*@ElementCollection()
    @Enumerated()
    @OrderColumn()
    @Type(type = "br.com.zup.Projeto.Entidades.Doacoes")
    @Column(name = "doadores", table = "doadores")
    @MapKeyColumn(name = "doadores", table = "doadores",  )*/
//private Set<Doadores> doadores = EnumSet.noneOf(Doadores.class);
//@ElementCollection(targetClass = Doacoes.class)



    /*@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "Doacoes", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)*/