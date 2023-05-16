package esercitazioneCerchio;

import java.util.Scanner;

	class Cerchio {
	    private double raggio;

	    public Cerchio(double r) {
	        raggio = r;
	    }

	    public double diametro() {
	        return raggio * 2;
	    }

	    public double perimetro() {
	        return 2 * Math.PI * raggio;
	    }

	    public double area() {
	        return Math.PI * Math.pow(raggio, 2);
	    }

	    public Cerchio sommaRaggio(Cerchio c) {
	        double nuovoRaggio = this.raggio + c.raggio;
	        return new Cerchio(nuovoRaggio);
	    }
	}

