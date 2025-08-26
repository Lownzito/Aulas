public class Aluno {
    private int numeroMatricula;
    final int numeroEscola = 1234;
    char sexo;
    String nome;
    boolean ativo;

    // public Aluno() { }

    public void cadastrarAluno(int numeroMatricula, char sexo, String nome, boolean ativo) {
        setNumeroMatricula(numeroMatricula);
        this.sexo = sexo;
        this.nome = nome;
        this.ativo = ativo;
    }

    public void setNumeroMatricula(int numero) {
        this.numeroMatricula = numero;
    }

    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }
}
