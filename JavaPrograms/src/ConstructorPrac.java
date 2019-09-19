import java.lang.reflect.Constructor;

public class ConstructorPrac extends BaseClass{
	public void BaseClass() {
		System.out.println("ashfd");
	}
	public static void main(String[] args) throws Throwable, IllegalAccessException {
		// TODO Auto-generated method stub
		//1
		BaseClass bc=new BaseClass();
		//2
		BaseClass bc1= BaseClass.class.newInstance();
		//3
		Constructor<BaseClass> bc2 =BaseClass.class.getConstructor();
		BaseClass obj1 = bc2.newInstance();  
		//4
		BaseClass bc3 = new BaseClass();
		
	}

}
