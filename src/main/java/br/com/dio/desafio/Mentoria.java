package br.com.dio.desafio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @java.lang.Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @java.lang.Override
    public String toString() {
        return "Mentoria{" +
                "Título = '" + getTitulo() + '\'' +
                ", Descrição = '" + getDescricao() + '\'' +
                ", Data = " + data +
                '}';
    }
}
