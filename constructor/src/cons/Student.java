package cons;
class Animal{
	Animal(String name){
		System.out.println("Animal");
	}
	
}
class parrot extends Animal{
	parrot(){
		super("Keerthana");
		System.out.println("Parrot class");
	}
}

public class Student {

	public static void main(String[] args) {
		parrot p=new parrot();
		

	}

}
