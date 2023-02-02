package java.util;
@FunctionalInterface // Es buena practica colocar el decorador que indica que es una interface funcional y en caso de que la interface tenga mas de dos metodos estaticos marca error de compilacion, no es requerida como tal la anotacion pero si es buena practica
public interface Comparator<T>{
	
	int compare(T o1, T o2); 
	
	boolean equals(Object obj); // se puede implementar metodos de la clase object
	
}