import java.util.*;

public class RuntimeConstantPoolOOM{
    public static void main(String[]args){
	List<String>list=new ArrayList<String>();
	int i=0;
	while(true){
	    list.add(String.valueOf(i++).intern());
	}}}