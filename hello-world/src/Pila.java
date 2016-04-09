
public class Pila<T> {
	private T[] elements;
	private int position = -1;
	
	public Pila()
	{
		this(100);
	}
	public Pila(int size)
	{
		elements= (T[]) new Object[size];
	}
	
	public T pop() throws Exception
	{
		if (position < 0)
		{
			throw new Exception("Underflow");
		}
			
		return elements[position--];
	}
	
	public void push(T elem) throws Exception
	{
		if (position > elements.length-1)
		{
			throw new Exception("Overflow");
		}
		elements[++position]=elem;
	}
}
