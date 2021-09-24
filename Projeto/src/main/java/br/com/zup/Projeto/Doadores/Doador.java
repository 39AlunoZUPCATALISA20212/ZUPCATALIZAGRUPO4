package br.com.zup.Projeto.Doadores;

import javax.persistence.*;

@Entity
@Table(name = "doadores")
public class Doador
{
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(nullable = false)
    private String cep;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
}
