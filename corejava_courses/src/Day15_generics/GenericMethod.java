//Generic Method

package Day15_generics;

public class GenericMethod {
	//generic method
	public <E> void displayArrayElement(E[] elements) {
		for(E element : elements) {
			System.out.println("Element is " + element);
		}
	}

}
