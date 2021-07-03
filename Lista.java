import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p> Clase concreta para modelar la estructura de datos Lista</p>
 * <p>Esta clase implementa una Lista genérica, es decir que es homogénea pero
 * puede tener elementos de cualquier tipo.
 * @author Luis Manuel Martinez Damaso <luismanuel@ciencias.unam.mx>
 * @version 1.0
 * @param <T>
 */
public class Lista<T> implements Listable<T>{

    /* Clase interna para construir la estructura */
    protected class Nodo{
        /* Referencias a los nodos anterior y siguiente */
        public Nodo anterior, siguiente;
        /* El elemento que almacena un nodo */
        public T elemento;

        /* Unico constructor de la clase */
        public Nodo(T elemento){
	       this.elemento = elemento;
        }
        public boolean equals(Nodo n){
            return false;
        }
    }

    
    private class IteradorLista implements Iterator<T>{
        /* La lista a recorrer*/
        /* Elementos del centinela que recorre la lista*/
        private Lista<T>.Nodo siguiente;

        public IteradorLista(){
            siguiente = cabeza;
        }

        @Override
        public boolean hasNext() {
            return (siguiente != null);
        }

        @Override
        public T next() {
            if(siguiente == null){
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    
    /* Atributos de la lista */
    protected Nodo cabeza, cola;
    protected int longitud;

    /**
     *  Constructor por omisión de la clase, no recibe parámetros.
     *  Crea una nueva lista con longitud 0.
     **/
    public Lista(){
        //Aquí va tu código.
    }

    /**
     *  Constructor copia de la clase. Recibe una lista con elementos.
     *  Crea una nueva lista exactamente igual a la que recibimos como parámetro.
     * @param l
     **/
    public Lista(Lista<T> l){
        //Aquí va tu código.
    }

    /**
     *  Constructor de la clase que recibe parámetros.
     *  Crea una nueva lista con los elementos de la estructura iterable que recibe como parámetro.
     * @param iterable
     **/
    public Lista(Iterable<T> iterable){
        //Aquí va tu código.
    }
    
    /**
     * Método que nos dice si las lista está vacía.
     * @return <code>true</code> si el conjunto está vacío, <code>false</code>
     * en otro caso.
     */
    @Override
    public boolean esVacia(){
        //Aquí va tu código.
    }
    
    /**
     * Método para eliminar todos los elementos de una lista
     */
    @Override
    public void vaciar(){
        //Aquí va tu código.
    }
    
    /**
     * Método para obtener el tamaño de la lista
     * @return tamanio Número de elementos de la lista.
     **/
    @Override
    public int getTamanio(){
        //Aquí va tu código.
    }
    
    /**
     * Método para agregar un elemento a la lista.
     * @param elemento Objeto que se agregará a la lista.
     */
    @Override
    public void agregar(T elemento){
        //Aquí va tu código.
    }
    
    /**
     * Método para agregar al final un elemento a la lista.
     * @param elemento Objeto que se agregará al inicio de la lista.
     */
    public void agregarAlFinal(T elemento) throws IllegalArgumentException {
        //Aquí va tu código.
    }

    /**
     * Método para obtener el primer elemento.
     */
    @Override
    public T getPrimero() throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método para obtener el último elemento.
     */
    public T getUltimo() throws NoSuchElementException {
        //Aquí va tu código.
    }
    
    /**
     * Método para verificar si un elemento pertenece a la lista.
     * @param elemento Objeto que se va a buscar en la lista.
     * @return <code>true</code> si el elemento esta en el lista y false en otro caso.
     */
    @Override
    public boolean contiene(T elemento) throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método para eliminar un elemento de la lista.
     * @param elemento Objeto que se eliminara de la lista.
     * todo
     */
    @Override
    public void eliminar(T elemento) throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método para eliminar el primer elemento de la lista.
     */
    @Override
    public void eliminarPrimero() throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método para eliminar el primer elemento de la lista.
     */
    public void eliminarUltimo() throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método que devuelve la posición en la lista que tiene la primera
     * aparición del <code> elemento</code>.
     * @param elemento El elemnto del cuál queremos saber su posición.
     * @return i la posición del elemento en la lista, -1, si no se encuentra en ésta.
     */
    @Override
    public int indiceDe(T elemento) throws NoSuchElementException {
        //Aquí va tu código.
    }

    /**
     * Método que nos devuelve el elemento que esta en la posición i
     * @param i La posición cuyo elemento deseamos conocer.
     * @return <code> elemento </code> El elemento que contiene la lista,
     * <code>null</code> si no se encuentra
     * @throws IndexOutOfBoundsException Si el índice es < 0 o >longitud()
     */
    @Override
    public T getElemento(int i)throws IndexOutOfBoundsException{
        //Aquí va tu código.
    }

    /**
     * Método que devuelve una copia de la lista, pero en orden inverso
     * @return Una copia con la lista l revés.
     */
    @Override
    public Lista<T> reversa(){
        //Aquí va tu código.
    }

    /**
     * Método que devuelve una copia exacta de la lista
     * @return la copia de la lista.
     */
    @Override
    public Lista<T> copia(){
        //Aquí va tu código.
    }

    /**
     * Método que nos dice si una lista es igual que otra.
     * @param o objeto a comparar con la lista.
     * @return <code>true</code> si son iguales, <code>false</code> en otro caso.
     */
    @Override
    public boolean equals(Object o){
        @SuppressWarnings("unchecked") Lista<T> lista = (Lista<T>) o;
        //Aquí va tu código.
    }

    /**
     * Método que devuelve un iterador sobre la lista
     * @return java.util.Iterador -- iterador sobre la lista
     */
    @Override
    public java.util.Iterator<T> iterator(){
        return new IteradorLista();
    }


    @Override
    public String toString() {
        if (esVacia()) {
            return "[]";
        }
        Nodo nodo = cabeza;
        String cad = "[" + nodo.elemento;
        while (nodo.siguiente != null) {
            nodo = nodo.siguiente;
            cad += ", " + nodo.elemento;
        }
        return cad + "]";
    }
      
    
    /* Método auxiliar para obtener una referencia a un nodo con un elemento
    específico. Si no existe tal nodo, devuelve <code> null </code> */
    private Nodo getNodo(T elem) throws NoSuchElementException {
        //Aquí va tu código.
    }

}
