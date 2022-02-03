import java.util.TreeSet;

class TreeSetMethod
 {
    public static void main(String[] args) {

        TreeSet<Integer> Number = new TreeSet<>();

        // Using the add() method  inserts the specified element to the set

        Number.add(2);
        Number.add(4);
        Number.add(6);
        System.out.println(Number);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
		numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        // Using the addAll() method  - inserts all the elements of the specified collection to the set
        numbers.addAll(Number);
        System.out.println(numbers);
        System.out.println(numbers);

        // Using the first() method- returns the first element of the set
        int first = numbers.first();
        System.out.println(first);

        // Using the last() method - returns the last element of the set
        int last = numbers.last();
        System.out.println(last);
		
		// Using pollFirst() - returns and removes the first element from the set
        System.out.println( numbers.pollFirst());

        // Using pollLast() - returns and removes the last element from the set
		System.out.println( numbers.pollLast());
        System.out.println(numbers);
		
		// Using higher()-higher(element) - Returns the lowest element among those elements that are greater than the specified element
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()Returns the greatest element among those elements that are less than the specified element.
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
        System.out.println("Using floor: " + numbers.floor(3));
}

}
