package TestingUnitario;

public class Testing {

	public static int sumarPositivos(int[] b) {
		if (b == null) {
			throw new NullPointerException(" El arreglo b no puede ser null!");
		}
		int suma = 0;
		for (int i = 0; i < b.length; ++i) {
			if (b[i] > 0) {
				suma += b[i];
			}
		}
		return suma;
	}

	public static boolean buscar(int[] b, int x) {
		int i = 0;
		while (i < b.length && b[i] != x) {
			++i;
		}
		if (i < b.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int maximo(int[] arreglo) {
		if (arreglo == null || arreglo.length == 0) {
			return 0;
		}
		int max = arreglo[0];
		for (int i = 1; i < arreglo.length; ++i) {
			max = Math.max(max, arreglo[i]);
		}
		return max;
	}

	// Escribir tests unitarios para el siguiente método, recordando que las
	// excepciones que
	// potencialmente lanza un método forman parte de su interfaz pública:
	public int segundoMayor(int[] arreglo) {
		if (arreglo.length < 2) {
			throw new IllegalArgumentException(" Pocos elementos!");
		}
		int max = Math.max(arreglo[0], arreglo[1]);
		int ret = Math.min(arreglo[0], arreglo[1]);
		for (int i = 2; i < arreglo.length; ++i) {
			if (arreglo[i] > max) {
				ret = max;
				max = arreglo[i];
			} else if (arreglo[i] > ret) {
				ret = arreglo[i];
			}
		}
		return ret;
	}

	public static boolean ceroDuplicado(int[] a, int n) {
		if (a == null)
			throw new IllegalArgumentException();
		int x = 0;
		for (int i = 0; i < n; ++i)
			if (a[i] == 0)
				++x;
		return x == 2;
	}
}
