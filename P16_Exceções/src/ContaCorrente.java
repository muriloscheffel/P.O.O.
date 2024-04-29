public class ContaCorrente {
    private double saldo;

    /*  EXERCÍCIO 1
     * Analise a classe ContaCorrente abaixo. 
     * Acrescente o tratamento de operações inválidas 
     * (saldo inicial, depósito ou saques nulos ou negativos e 
     * saque maior que o saldo) lançando exceções. 
     * Crie exceções verificadas para tratar problemas com o saldo inicial e 
     * depósito ou retiradas menores ou iguais a zero. 
     * Crie uma exceção não verificada para os 
     * problemas relativos a retiradas maiores que o saldo.
     */



    public ContaCorrente(double saldo) {
        if(saldo < 0) 
            throw new IllegalArgumentException("Saldo inválido");
        
        this.saldo = saldo;
    }

    public void deposito(double valor) { 
        if(valor <= 0)
            throw new IllegalArgumentException("Valor inválido");

        saldo += valor; 
    } 
    
    public void retirada(double valor) {
        if(valor > getSaldo())
            throw new IllegalArgumentException("Saldo insuficiente");

        saldo -= valor; 
    }
     
    public double getSaldo() { 
        return(saldo); 
    }
}
