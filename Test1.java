public class Test1{
    public static void main(String[] args)throws Exception{
	Class clazz=Class.forName("java.lang.String");
	System.out.println(clazz.getClassLoader());
	Class clazz2=Class.forName("");
    }
}
class C{}