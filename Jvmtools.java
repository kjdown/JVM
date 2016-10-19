import java.util.ArrayList;
import java.util.List;

public class Jvmtools{
    
    public static void createlist(int count)throws InterruptedException{
	for(int i=0;i<count;i++){
	    List<_1MObject>list=new ArrayList<_1MObject>();
	    Thread.sleep(100);
	    list.add(new _1MObject());
	}
    }
    public static void main(String[] args)throws InterruptedException{
	createlist(5000);
    }
}