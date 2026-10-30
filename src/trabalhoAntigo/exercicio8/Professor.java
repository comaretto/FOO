package exercicio8;

public class Professor extends Pessoa {
    boolean efetivo;
    boolean temPosGraduacao;
    boolean ehBacharel;
    int anosExperiencia;

    public Professor() {
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public boolean getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(boolean efetivo) {
        this.efetivo = efetivo;
    }

    public boolean getTemPosGraduacao() {
        return temPosGraduacao;
    }

    public void setTemPosGraduacao(boolean temPosGraduacao) {
        this.temPosGraduacao = temPosGraduacao;
    }

    public boolean getEhBacharel() {
        return ehBacharel;
    }

    public void setEhBacharel(boolean ehBacharel) {
        this.ehBacharel = ehBacharel;
    }
}
