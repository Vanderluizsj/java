
package quick.sort;

public class Main {

    public static void quickSort(int v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
                System.out.println("pivo é"+ pivo);
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
                                
			}
		}
		if (dir > esquerda)
			quickSort(v, esquerda, dir);

		if (esq < direita)
			quickSort(v, esq, direita);

	}

	public static void main(String args[]) {

		int vetor[] = { 45, 5, 10, 2, 1 };
		quickSort(vetor, 0, vetor.length - 1);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}

	}
}