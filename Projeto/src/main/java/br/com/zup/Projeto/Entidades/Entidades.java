package br.com.zup.Projeto.Entidades;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "entidades")
@Entity
public class Entidades
{
    @Column(nullable = false)
    private String razaoSocial;
    @Column(nullable = false)
    private String nomeFantasia;
    @Column(nullable = false)
    private String enderecoWeb;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(unique = true, nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String cep;
    private Doadores doadores;
    private Doacoes doacoes;
    private Destinatarios destinatarios;
    private Donativos donativos;
    private LocalTime funcionamento;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;



}
