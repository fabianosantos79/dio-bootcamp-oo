package br.com.dio.desafio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @java.lang.Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @java.lang.Override
    public String toString() {
        return "Curso {" +
                "Título = '" + getTitulo() + '\'' +
                ", Descrição = '" + getDescricao() + '\'' +
                ", Carga Horária = " + cargaHoraria +
                '}';
    }
}
