import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class CadFuncionario {
    public static final int TAM = 5;
    private List<Funcionario> funcionarios;

    public CadFuncionario() {
        funcionarios = new LinkedList<>(); 
        Random r = new Random();

		for (int i = 0; i < TAM; i++) {
			int matricula = r.nextInt(300) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(3);
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			funcionarios.add(f);
		}

		funcionarios.add(new Funcionario(180,"Zezinho Especial",5000,3,false));
    }

    public void foreach(Consumer<Funcionario> op) {
        for(Funcionario f : funcionarios) { op.accept(f); }
    }

    public int qtdadeFuncAtendem(Predicate<Funcionario> condicao) {
        int cont = 0;

        for(Funcionario f : funcionarios) {
            if(condicao.test(f)) cont++;
        }
        return cont;
    }

    //1c
	public double somatorioCondicao(/* ??? */){
		return 0.0;
	}

	//1d
	public void alteraCondicao(/* ??? */){

	}

	//1e
	public List<String> getCamposCondicao(/* ??? */){
		return new LinkedList<>();
	}

    @Override
    public String toString() {
        return "CadFuncionario [funcionarios=" + funcionarios + "]";
    }

}
