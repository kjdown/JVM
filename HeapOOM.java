import java.util.*;

public class HeapOOM{
    static class A{}
    public static void main(String[] args){
	List<A>list=new ArrayList<A>();

	while(true){
	    list.add(new A());
	}
    }
}