package one.digitalinovation.gof;

/**
 * Singleton "Economico"
 * 
 * @author GannJobs
 *
 */

public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
