package br.com.zup.Projeto.PontosDeColeta;

import javax.persistence.*;

@Entity
@Table(name = "coordenadas")
public class Coordenadas
{
    @Column(nullable = false)
    private double grausLatitude;
    @Column(nullable = true)
    private double minutosLatitude;
    @Column(nullable = false)
    private double grausLongitude;
    @Column(nullable = true)
    private double minutosLongitude;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
