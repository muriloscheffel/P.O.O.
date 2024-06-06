public class Funcionario {
    private int matricula;
	private String nome;
	private double salarioBase;
	private int nroDependentes;
	private boolean insalubridade;

    public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {
        this.insalubridade = insalubridade;
        this.matricula = matricula;
        this.nome = nome;
        this.nroDependentes = nroDependentes;
        this.salarioBase = salarioBase;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getNroDependentes() {
        return nroDependentes;
    }

    public boolean isInsalubridade() {
        return insalubridade;
    }

    public void aumentaSalario(double taxa) { salarioBase += taxa; }

    private double inss() {
        if(getSalarioBase() <= 5000.0) return (getSalarioBase() * 0.045);
        else return 5000.0 * 0.045;
    }

    private double irpf() {
        if(getSalarioBase() <= 2000) return 0.0;
        else if(getSalarioBase() <= 5000) return ((getSalarioBase() - 2000) * 0.12);
        else {
            double p1 = 3000 * 0.12;
            double p2 = (getSalarioBase() - 5000) * 0.275;
            return p1 + p2;
        }
    }

    public double getSalarioBruto() {
        double adcInsalubridade = 0.0;
        double adcDep = 0.0;

        if(isInsalubridade()) adcInsalubridade = getSalarioBase() * 0.1;

        adcDep = getNroDependentes() * (getSalarioBase() * 0.01);

        return getSalarioBase() + adcInsalubridade + adcDep;
    }
    
    public double getSalarioLiquido() { return getSalarioBase() - inss() - irpf(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("matricula=").append(matricula);
        sb.append(", nome=").append(nome);
        sb.append(", salarioBase=").append(salarioBase);
        sb.append(", nroDependentes=").append(nroDependentes);
        sb.append(", insalubridade=").append(insalubridade);
        sb.append('}');
        return sb.toString();
    }

}
    