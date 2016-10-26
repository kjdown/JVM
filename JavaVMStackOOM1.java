public class JavaVMStackOOM1{
    private void dontStop(){
	while(true){
	}
    }

    public void stackLeakByThread(){
	while(true){
	    Thread thread=new Thread(new Runnable(){

		    public void run(){
			dontStop();
		    )
		});
	thread.start();
    }
    }
public static void main(String[]args)throws Throwable{
    JavaVMStackOOM1 oom=new JavaVMStackOOM();
    oom.stackLeakByThread();
}}
