public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext appContext=new FileSystemXmlApplicationContext("app-context.xml");
    	
   Veg v=(Veg) appContext.getBean("vegetable1");
    	System.out.println(v.getName());

    }
}
