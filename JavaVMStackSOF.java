public class JavaVMStackSOF{
    private int stackLength=1;
    public void stackLead(){
	stackLength++;
	stackLeak();}
    public static void main(String[]args) throws Throwable{
	    JavaVMStackSOF oom=new JavaVmStackSOF();
	    try{
		oom.stackLeak();
	    }catch(Throwable e){
		System.out.println("stack Length"+oom.stackLength);
		throw e;
	    }
	}
	}
