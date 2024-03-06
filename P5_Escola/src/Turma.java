class Turma{
    private int numero;
    private String professor;
    private int vagas;
    private Aluno[] alunos;
    private int qtdadeAlunos;

    public Turma(int nro,String nomeProf,int vagas){
        if (nro <= 0 || nomeProf.length() < 2 || vagas <= 0){
            throw new IllegalArgumentException("Valor inválido");
        }

        this.numero = nro;
        this.professor = nomeProf;
        this.vagas = vagas;
        this.alunos = new Aluno[vagas];
        this.qtdadeAlunos = 0;
    }

    public void novoAluno(Aluno aluno){
        if (qtdadeAlunos == vagas){
            throw new IllegalStateException("Turma cheia!");
        }

        alunos[qtdadeAlunos] = aluno;
        qtdadeAlunos++;
    }
    
    public Aluno recuperaAlunoPorMatricula(long matricula){
        for (int i = 0; i < qtdadeAlunos; i++){
            if (alunos[i].getMatricula() == matricula){
                return alunos[i];
            }
        }
        return null;
    }

    public void notaAluno(long matricula, float[] notas) {
        Aluno a = recuperaAlunoPorMatricula(matricula);
        if (a == null){
            throw new IllegalArgumentException("Aluno não encontrado");
        }
        for (int i = 0; i < notas.length; i++){
            a.setNota(i+1, notas[i]);
        }
    }
}