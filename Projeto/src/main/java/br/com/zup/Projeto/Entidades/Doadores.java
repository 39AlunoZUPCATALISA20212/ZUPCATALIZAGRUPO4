package br.com.zup.Projeto.Entidades;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

public enum Doadores
{
    ALIMENTOS,
    HIGIENEPESSOAL,
    MEDICAMENTOS,
    VESTIMENTAS,
    MIDIA,
    MIDIAEDUCATIVA,
    BENSDECONSUMO,
    BENSDECONSUMODURAVEIS,
    MATERIAPRIMA,
    MATERIALRECICLADO,
}
