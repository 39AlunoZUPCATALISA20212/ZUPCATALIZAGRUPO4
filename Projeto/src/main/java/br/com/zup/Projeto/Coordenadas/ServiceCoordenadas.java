package br.com.zup.Projeto.Coordenadas;

import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

@Service
public class ServiceCoordenadas
{
    public double distancia(Coordenadas coordenadasA, Coordenadas coordenadasB)
    {
        double distancia = 0;
        distancia = sqrt( pow( coordenadasB.getLongitude() - coordenadasA.getLongitude() , 2 ) + pow( coordenadasB.getLatitude() - coordenadasA.getLatitude() , 2 ) );
        return distancia;
    }
}
