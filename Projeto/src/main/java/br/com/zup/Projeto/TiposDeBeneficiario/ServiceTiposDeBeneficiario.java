package br.com.zup.Projeto.TiposDeBeneficiario;

import br.com.zup.Projeto.TiposDeDoacoes.OsTiposDeDoacoes;
import br.com.zup.Projeto.TiposDeDoacoes.RepositoryTiposDeDoacoes;
import br.com.zup.Projeto.TiposDeDoacoes.TiposDeDoacoes;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTiposDeBeneficiario
{    @Autowired
private RepositoryTiposDeBeneficiario repositoryTiposDeBeneficiario;

    private void servicetiposdebeneficiario()
    {for (OsTiposDeBeneficiario umTipoDeBeneficiario : OsTiposDeBeneficiario.values()) {
        TiposDeBeneficiario maisUmTipoDeBeneficiario = new TiposDeBeneficiario();
        maisUmTipoDeBeneficiario.setTiposDeBeneficiario(umTipoDeBeneficiario);
        repositoryTiposDeBeneficiario.save(maisUmTipoDeBeneficiario);
    }
    }


}
