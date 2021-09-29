package br.com.zup.Projeto.Entidades;

import br.com.zup.Projeto.Endereco.Endereco;
import br.com.zup.Projeto.TiposDeBeneficiario.TiposDeBeneficiario;
import br.com.zup.Projeto.TiposDeDoacoes.TiposDeDoacoes;
import br.com.zup.Projeto.TiposDeDoador.TiposDeDoador;
import br.com.zup.Projeto.TiposDeDonativos.TiposDeDonativos;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalTime;
import java.util.List;

public class EntidadeIDTO
{
    private String razaoSocial;
    private String nomeFantasia;
    private String enderecoWeb;
    private String email;
    private String telefone;
    private String cnpj;
    private Endereco endereco;
    private List<String> beneficiarios;
    private List<String> donativos;
    private List<String> doadores;
    private List<String> doacoes;
    private LocalTime funcionamento;

    public EntidadeIDTO() {
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEnderecoWeb() {
        return enderecoWeb;
    }

    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<String> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(List<String> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public List<String> getDonativos() {
        return donativos;
    }

    public void setDonativos(List<String> donativos) {
        this.donativos = donativos;
    }

    public List<String> getDoadores() {
        return doadores;
    }

    public void setDoadores(List<String> doadores) {
        this.doadores = doadores;
    }

    public List<String> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<String> doacoes) {
        this.doacoes = doacoes;
    }

    public LocalTime getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(LocalTime funcionamento) {
        this.funcionamento = funcionamento;
    }
}
