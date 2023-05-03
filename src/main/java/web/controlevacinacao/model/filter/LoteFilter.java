package web.controlevacinacao.model.filter;

import java.time.LocalDate;

import web.controlevacinacao.model.Status;

public class LoteFilter {

    private Long codigo;


	private LocalDate validadeInicial;
    private LocalDate validadeFinal;
    private Integer nroDosesDoLoteInicial;
    private Integer nroDosesDoLoteFinal;
	private Integer nroDosesAtualInicial;
    private Integer nroDosesAtualFinal;
	private String nomeVacina;
	private Status status;
    
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public LocalDate getValidadeInicial() {
        return validadeInicial;
    }
    public void setValidadeInicial(LocalDate validadeInicial) {
        this.validadeInicial = validadeInicial;
    }
    public LocalDate getValidadeFinal() {
        return validadeFinal;
    }
    public void setValidadeFinal(LocalDate validadeFinal) {
        this.validadeFinal = validadeFinal;
    }
    public Integer getNroDosesDoLoteInicial() {
        return nroDosesDoLoteInicial;
    }
    public void setNroDosesDoLoteInicial(Integer nroDosesDoLoteInicial) {
        this.nroDosesDoLoteInicial = nroDosesDoLoteInicial;
    }
    public Integer getNroDosesDoLoteFinal() {
        return nroDosesDoLoteFinal;
    }
    public void setNroDosesDoLoteFinal(Integer nroDosesDoLoteFinal) {
        this.nroDosesDoLoteFinal = nroDosesDoLoteFinal;
    }
    public Integer getNroDosesAtualInicial() {
        return nroDosesAtualInicial;
    }
    public void setNroDosesAtualInicial(Integer nroDosesAtualInicial) {
        this.nroDosesAtualInicial = nroDosesAtualInicial;
    }
    public Integer getNroDosesAtualFinal() {
        return nroDosesAtualFinal;
    }
    public void setNroDosesAtualFinal(Integer nroDosesAtualFinal) {
        this.nroDosesAtualFinal = nroDosesAtualFinal;
    }
    public String getNomeVacina() {
        return nomeVacina;
    }
    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LoteFilter other = (LoteFilter) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "LoteFilter [codigo=" + codigo + ", validadeInicial=" + validadeInicial + ", validadeFinal="
                + validadeFinal + ", nroDosesDoLoteInicial=" + nroDosesDoLoteInicial + ", nroDosesDoLoteFinal="
                + nroDosesDoLoteFinal + ", nroDosesAtualInicial=" + nroDosesAtualInicial + ", nroDosesAtualFinal="
                + nroDosesAtualFinal + ", nomeVacina=" + nomeVacina + ", status=" + status + "]";
    }

    
    
}
