package one.digitalinovation.gof;

/**
 * Singleton "preguicoso"
 * 
 * @author GannJobs
 *
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy(); 
		}
		return instancia;
	}
}
