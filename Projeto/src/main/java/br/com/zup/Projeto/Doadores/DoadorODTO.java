package br.com.zup.Projeto.Doadores;

public class DoadorODTO extends DoadorIDTO
{
    private int id;

    public DoadorODTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
