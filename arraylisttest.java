import java.util.*;

public class arraylisttest {
	
	public static void main(String[] args){
		arraylisttest test= new arraylisttest();
		test.sortArraylist();
		//iterating arraylist of book objects
		ArrayList<book> arraylistbooks = new ArrayList<book>();
		arraylistbooks.add(new book(223, "Chaitanya", 26.44));
		arraylistbooks.add(new book(245, "Rahul", 24.43));
		arraylistbooks.add(new book(209, "Ajeet", 32.55));
		test.testArray(arraylistbooks);
		//iterating HashMap
		HashMap<Integer, book> hashmap = new HashMap<Integer, book>();
		book b2= new book(45, "er", 66.54);
		book b1= new book(435, "eddr", 86.54);
		hashmap.put(b1.getId(), b1);
		hashmap.put(b2.getId(), b2);
	    test.testhashMapOfBooks(hashmap);
	}
	
	public void	 sortArraylist(){
		 String[] strings = { "x", "a", "c", "b", "y" };
		    Arrays.parallelSort(strings);
		    System.out.println(Arrays.toString(strings));  
	}
	
	public void testArray(ArrayList<book> booklist){
			   
		   for(book str: booklist){
				System.out.println(str.getId()+"::::::"+str.getAuth()+"::::::"+str.getPrice());
		   }
	     }
	public void testhashMapOfBooks(HashMap hashMap)
	{
		Iterator it = hashMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	}
	
	
	
	
	


