import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.aaa");
    	
    	List<String> x = Stream.of(Arrays.asList(names1), Arrays.asList(names2))
    	    .flatMap(Collection::stream)
    	    .distinct()
    	    .collect(Collectors.toList());
    	
    	return x.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}