import java.util.List;

public class MinhaLista {
    public int encontrarMaiorElemento(List<Integer> lista) {
        int maior = Integer.MIN_VALUE;
        for (int num : lista) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public int encontrarMenorElemento(List<Integer> lista) {
        int menor = Integer.MAX_VALUE;
        for (int num : lista) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public double calcularMedia(List<Integer> lista) {
        int soma = 0;
        for (int num : lista) {
            soma += num;
        }
        return (double) soma / lista.size();
    }
}
