public class JavaVMStackSOF{
    public int stackLength=1;
    public void stackLeak(){
	stackLength++ ;
	stackLeak();}
    public static void main(String[]args) throws Throwable{
	    JavaVMStackSOF oom=new JavaVMStackSOF();
	    try{
		oom.stackLeak();
	    }catch(Throwable e){
		System.out.println("stack Length"+oom.stackLength);
		throw e;
	    }
	}
	}
