public class App {
    public static void impConta(ContaBancaria conta) {
        System.out.println("Número da conta:" + conta.getNumero() + ", saldo:" + conta.getSaldo());
        if(conta instanceof ContaLimite) {
            ContaLimite c = (ContaLimite)conta;
            System.out.println("Limite:" + c.getLimite());
        }
    }

    public static void fazDeposito(ContaBancaria[] list, double valor) {
        if(list == null) {
            throw new IllegalArgumentException("Lista vazia");
        }
        if(valor <= 0.0) {
            throw new IllegalArgumentException("Valor minimo não alcançado");
        }
        for(int i = 0; i < list.length; i++) {
            list[i].deposito(valor);
        }
    }

    public static void cobraJuros(ContaBancaria[] list, double valorTaxa) {
        if(list == null) {
            throw new IllegalArgumentException("Lista vazia");
        }
        if(valorTaxa <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        for(ContaBancaria conta : list) {
            conta.retirada(valorTaxa);
        }
    }

    public static void impContasArray(ContaBancaria[] list) {
        for(ContaBancaria conta : list) {
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());

            if(conta instanceof ContaLimite) {
                ContaLimite cl = (ContaLimite) conta;
                System.out.println("Limite:" + cl.getLimite());
            }
        }
    }

    public static void main(String args[]){
        ContaBancaria[] lista = new ContaBancaria[7];
        ContaLimite cl = new ContaLimite(100, "Luizinho", 3000, 1500, 0.15);
        cl.retirada(3500);
        cl.deposito(1200);
        
        ContaRemunerada cr = new ContaRemunerada(120,"Lala Pato", 2500, 0.05);
        cr.deposito(4000);
        
        for(int i = 0; i < 5; i++) {
            lista[i] = new ContaBancaria(i * 100, "p", i * 1000);
        }
        impContasArray(lista);
    }
}
