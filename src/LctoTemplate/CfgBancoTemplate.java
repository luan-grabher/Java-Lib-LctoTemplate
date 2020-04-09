package LctoTemplate;

public class CfgBancoTemplate {
    private Integer empresa = 0;
    private String nomeBanco = "Banco";
    private String filtroNomeArquivoOriginal = "";
    private Integer contaBanco = 0;
    private Integer historicoPadraoDebito = 1005; //SCI
    private Integer historicoPadraoCredito = 1002; //SCI
    private boolean filtrarMesAno = true;

    public CfgBancoTemplate() {
    }

    public boolean isFiltrarMesAno() {
        return filtrarMesAno;
    }

    public void setFiltrarMesAno(boolean filtrarMesAno) {
        this.filtrarMesAno = filtrarMesAno;
    }
    

    public String getFiltroNomeArquivoOriginal() {
        return filtroNomeArquivoOriginal;
    }

    public void setFiltroNomeArquivoOriginal(String filtroNomeArquivoOriginal) {
        this.filtroNomeArquivoOriginal = filtroNomeArquivoOriginal;
    }
    
    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(Integer contaBanco) {
        this.contaBanco = contaBanco;
    }

    public Integer getHistoricoPadraoDebito() {
        return historicoPadraoDebito;
    }

    public void setHistoricoPadraoDebito(Integer historicoPadraoDebito) {
        this.historicoPadraoDebito = historicoPadraoDebito;
    }

    public Integer getHistoricoPadraoCredito() {
        return historicoPadraoCredito;
    }

    public void setHistoricoPadraoCredito(Integer historicoPadraoCredito) {
        this.historicoPadraoCredito = historicoPadraoCredito;
    }
    
    
}
