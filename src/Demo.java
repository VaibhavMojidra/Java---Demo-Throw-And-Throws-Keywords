
public class Demo {

	static boolean isAdult(int age) throws Exception{
		if(age<0) {
			throw new Exception("Age cannot be in negative: "+age);
		}
		if(age<18) {
			return false;
		}
		return  true;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Age 20: "+isAdult(20));
			System.out.println("Age 13: "+isAdult(13));
			System.out.println("Age -1: "+isAdult(-1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
