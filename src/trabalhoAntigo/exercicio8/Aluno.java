package exercicio8;

public class Aluno extends Pessoa{
    boolean auxilioEstudantil;
    double rendaFamiliar;
    boolean projetoExtensao;

    public Aluno() {
    }

    public boolean getAuxilioEstudantil() {
        return auxilioEstudantil;
    }

    public void setAuxilioEstudantil(boolean auxilioEstudantil) {
        this.auxilioEstudantil = auxilioEstudantil;
    }

    public double getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(double rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public boolean getProjetoExtensao() {
        return projetoExtensao;
    }

    public void setProjetoExtensao(boolean projetoExtensao) {
        this.projetoExtensao = projetoExtensao;
    }
}
