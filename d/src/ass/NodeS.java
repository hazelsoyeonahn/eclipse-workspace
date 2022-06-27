package ass;
/*
 * This NodeS<E> class generate doubly linked list 
 * This class help ArrayDeque to have doubly link list behavior.
 */

public class NodeS<E> {
	public E element;
	public NodeS<E> next;
	public NodeS<E> prev;
	
	//constructor of this class
	public NodeS(E element) {
		this.element = element;
		next = null;
		prev = null;
	}

}
