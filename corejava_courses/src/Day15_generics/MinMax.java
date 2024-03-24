//Generic Interface

package Day15_generics;

//generic interface 
public interface MinMax<T extends Comparable<T>> {
	
	T min();
	
	T max();
}
