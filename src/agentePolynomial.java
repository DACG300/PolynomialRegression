import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class agentePolynomial extends Agent {

    protected void setup() {
        System.out.println("Agente Polynomial inicializado.");

        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println("Ejecutando acción única con OneShotBehaviour.");
                Printf printer = new Printf();
                printer.Print();

            }
        });
    }
}