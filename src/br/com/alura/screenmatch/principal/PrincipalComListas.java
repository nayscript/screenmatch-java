package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.avalia(9);

        Serie lost = new Serie(2000, "Lost");

        Filme outroFilme = new Filme(2023, "Avatar");
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme(2003,"Dogville");
        filmeDoPaulo.avalia(10);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                // se item é um Filme, chama a variável filme e verifica se a clasiificação é maior que 2
                System.out.println("Classificação " + filme.getClassificacao());
                //imprime a classificacao
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Ordenada " + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        //dentro de lista, busca um metodo de comparacao, dizendo como e o que quero comparar de titulo
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
