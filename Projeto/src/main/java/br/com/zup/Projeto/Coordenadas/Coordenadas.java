package br.com.zup.Projeto.Coordenadas;

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

    public Coordenadas() {
    }

    public double getGrausLatitude() {
        return grausLatitude;
    }

    public void setGrausLatitude(double grausLatitude) {
        this.grausLatitude = grausLatitude;
    }

    public double getMinutosLatitude() {
        return minutosLatitude;
    }

    public void setMinutosLatitude(double minutosLatitude) {
        this.minutosLatitude = minutosLatitude;
    }

    public double getGrausLongitude() {
        return grausLongitude;
    }

    public void setGrausLongitude(double grausLongitude) {
        this.grausLongitude = grausLongitude;
    }

    public double getMinutosLongitude() {
        return minutosLongitude;
    }

    public void setMinutosLongitude(double minutosLongitude) {
        this.minutosLongitude = minutosLongitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
