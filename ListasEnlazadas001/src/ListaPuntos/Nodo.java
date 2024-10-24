package ListaPuntos;

public class Nodo {
	double sueldo;
	Nodo anterior;
	Nodo siguiente;

	public Nodo(double sueldo) {
		this.sueldo = sueldo;
	}
}

class Bicolas {
	private Nodo head;
	private Nodo tail;

	public void insertarIzquierda(double sueldo) {
		Nodo nuevoNodo = new Nodo(sueldo);
		if (head == null) {
			head = tail = nuevoNodo;
		} else {
			nuevoNodo.siguiente = head;
			head.anterior = nuevoNodo;
			head = nuevoNodo;
		}
	}

	public void insertarDerecha(double sueldo) {
		Nodo nuevoNodo = new Nodo(sueldo);
		if (tail == null) {
			head = tail = nuevoNodo;
		} else {
			nuevoNodo.anterior = tail;
			tail.siguiente = nuevoNodo;
			tail = nuevoNodo;
		}
	}

	public Nodo buscar(double sueldo) {
		Nodo actual = head;
		while (actual != null) {
			if (actual.sueldo == sueldo) {
				return actual;
			}
			actual = actual.siguiente;
		}
		return null;
	}

	public boolean modificar(double sueldoActual, double sueldoNuevo) {
		Nodo nodo = buscar(sueldoActual);
		if (nodo != null) {
			nodo.sueldo = sueldoNuevo;
			return true;
		}
		return false;
	}

	public boolean eliminarIzquierda() {
		if (head == null) {
			return false;
		}
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.siguiente;
			head.anterior = null;
		}
		return true;
	}

	public boolean eliminarDerecha() {
		if (tail == null) {
			return false;
		}
		if (head == tail) {
			head = tail = null;
		} else {
			tail = tail.anterior;
			tail.siguiente = null;
		}
		return true;
	}

	public void listar() {
		Nodo actual = head;
		while (actual != null) {
			System.out.print(actual.sueldo + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}

}
