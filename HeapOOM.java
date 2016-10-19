public class HeapOOM{
     clsss OOMObject {}
    public static void main(String[]args){
	List<OOMObject>list=new ArrayList<OOMbject>();

	while(true){
	    list.add(new OOMObject());
	}
    }
}