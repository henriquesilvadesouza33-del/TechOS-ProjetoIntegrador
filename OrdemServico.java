package com.mycompany.techos_projetointegrador;

public class OrdemServico {
    private int numeroOS;
    private String equipamento;
    private String defeito;
    private double valorOrcamento;
    private Cliente cliente; 

    public OrdemServico(int numeroOS, String equipamento, String defeito, Cliente cliente) {
        this.numeroOS = numeroOS;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.valorOrcamento = 0.0;
        this.cliente = cliente;
    }

    public int getNumeroOS() { return numeroOS; }
    public void setNumeroOS(int numeroOS) { this.numeroOS = numeroOS; }
    public String getEquipamento() { return equipamento; }
    public void setEquipamento(String equipamento) { this.equipamento = equipamento; }
    public String getDefeito() { return defeito; }
    public void setDefeito(String defeito) { this.defeito = defeito; }
    public double getValorOrcamento() { return valorOrcamento; }
    public void setValorOrcamento(double valorOrcamento) { this.valorOrcamento = valorOrcamento; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
