package one.digitalinovation.gof;

/**
 * Singleton "apressado"
 * 
 * @author GannJobs
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager(); 
	
	private SingletonEager() {
		super();
	}
	
	public SingletonEager getInstancia() {
		return instancia;
	}
}
