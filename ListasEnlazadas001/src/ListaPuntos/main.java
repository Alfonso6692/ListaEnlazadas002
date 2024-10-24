package ListaPuntos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicolas bicolas = new Bicolas();
		bicolas.insertarDerecha(3000);
		bicolas.insertarDerecha(2500);
		bicolas.insertarDerecha(3500);

		System.out.print("Lista de sueldo: ");
		bicolas.listar();

		bicolas.modificar(2500, 2600);
		System.out.print("Lista despues de modificar: ");
		bicolas.listar();

		bicolas.eliminarIzquierda();
		System.out.println("Lista despues de eliminar  a la izquieda: ");
		bicolas.listar();

		bicolas.eliminarDerecha();
		System.out.println("Lista despues de eliminar  a la derecha: ");
		bicolas.listar();
	}

}
