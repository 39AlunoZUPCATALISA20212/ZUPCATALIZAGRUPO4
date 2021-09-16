package br.com.zup.Projeto.Destinatario;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "destinatarios")
public class Destinatario
{
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = true)
    private String telefone;
    @Column(nullable = true, unique = true)
    private String cpf;
    @Column(nullable = true)
    private String cep;
    @Column(nullable = true)
    private LocalTime idade;
    @Column(nullable = true)
    private EstadoCivil estadoCivil;
    @Column(nullable = true)
    private int dependentes;
    @Column(nullable = true)
    private double renda;
    @Column(nullable = true)
    private OrigemRenda origemRenda;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
