
public class program {

	public program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		planta p = new planta();
		Animalcarnivoro c = new Animalcarnivoro();
		Animalherbivoro h = new Animalherbivoro();
		p.alimentarse();
		c.alimentarse();
		h.alimentarse();

	}

}

abstract class Servivo {
	
	
	
	abstract void alimentarse();
	
}

class planta extends Servivo{
	
	public void alimentarse(){
		
		System.out.println("Vitaminas Solares");
	}
}

abstract class animal extends Servivo{
	
	 abstract public void alimentarse();
		
}

class Animalcarnivoro extends animal{
	
public void alimentarse(){
		
		System.out.println("Alimentacion de carne");
	}
	
}

class Animalherbivoro extends animal{
	
public void alimentarse(){
		
		System.out.println("Alimentacion de hierbas");
	}
	
}





