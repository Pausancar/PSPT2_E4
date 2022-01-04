package es.studium.Ejercicio4;

public class Ejercicio4 extends Thread {
	
	
	public Ejercicio4 (String str) {
		super(str);
	}

	@Override //Porque lo estoy sobreescribiendo
	public void run() {
	
		boolean sigue = true;
		for (int i = 0; i < 100 & sigue; i++) {
			try
			{
				System.out.println(getName() + ":" +i);
				sleep(500);
				if(i==10)
				{
					interrupt();
				}
			}catch(InterruptedException e){
				sigue=false;
				System.out.println(getName() + "ha sido interrumpido");
			}
			
		}
		
		System.out.println("Termina thread " + getName());
	}



	public static void main(String[] args)
	{
		Ejercicio4 t1 = new Ejercicio4("p1");
		t1.start();
	}

}
