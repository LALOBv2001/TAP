package Ejercicio;

public class PruebaClaseHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Proceso1 Hilo1=new Proceso1();//Proceso de extender de Thread	 
      Thread Hilo2= new Thread(new Proceso2());//Proceso de implementar Runnable
      Hilo1.start();
      Hilo2.start();
	}

}
