package com.mycompany.techos_projetointegrador;

public class TechOS_ProjetoIntegrador {

    public static void main(String[] args) {
        System.out.println("--- PROTÓTIPO SISTEMA TECHOS (ETAPA 1) ---");
        
        // 1. Executando o cadastro de um cliente na memória
        Cliente cli = new Cliente(1, "João Silva", "(11) 98888-7777", "123.456.789-00");
        System.out.println("\n[Sucesso] Cliente cadastrado: " + cli.getNome());
        
        // 2. Executando a abertura de uma Ordem de Serviço vinculada ao cliente acima
        OrdemServico os = new OrdemServico(1001, "Notebook Dell Inspiron", "Não liga, led do carregador pisca", cli);
        os.setValorOrcamento(280.00); // Definindo o valor do conserto
        
        // 3. Exibindo os dados na tela para comprovar o funcionamento
        System.out.println("\n============== DADOS DA OS GERADA ==============");
        System.out.println("OS Número: " + os.getNumeroOS());
        System.out.println("Aparelho: " + os.getEquipamento());
        System.out.println("Defeito Relatado: " + os.getDefeito());
        System.out.println("Cliente Responsável: " + os.getCliente().getNome());
        System.out.println("Contato do Cliente: " + os.getCliente().getTelefone());
        System.out.println("Valor do Orçamento: R$ " + os.getValorOrcamento());
        System.out.println("================================================");
    }
}
