package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }

    public int getTemporadas() {

        return temporadas;
    }

    public int getMinutosPorEpisodio() {

        return minutosPorEpisodio;
    }

    public boolean isAtiva() {

        return ativa;
    }

    public int getEpisodiosPorTemporada() {

        return episodiosPorTemporada;
    }

    public void setTemporadas(int temporadas) {

        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {

        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {

        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
    return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}


