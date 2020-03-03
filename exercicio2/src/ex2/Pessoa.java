package ex2;

import java.util.Random;

public abstract class Pessoa implements Observer {
		
		private boolean querosair = false;
		private Random gerador = new Random();
	
		@Override
		public void update(Entrega e) {
			System.out.println(e.getEntrega());
			querosair = gerador.nextDouble() <= 0.1;
		}
		
		public void entrega(Entrega e) {
			// TODO Auto-generated method stub
			System.out.println(e.getEntrega());
			
		}
		
		public boolean querosair() {
			return this.querosair;
		}
		
}
