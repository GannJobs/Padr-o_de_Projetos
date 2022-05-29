import one.digitalinovation.gofFacade.Facade;
import one.digitalinovation.gofStrategy.Comportamento;
import one.digitalinovation.gofStrategy.ComportamentoAgressivo;
import one.digitalinovation.gofStrategy.ComportamentoDefensivo;
import one.digitalinovation.gofStrategy.ComportamentoNormal;
import one.digitalinovation.gofStrategy.Robo;

public class teste {

	public static void main(String[] args) {
		// Strategy

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();

		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14798815");
	}

}
