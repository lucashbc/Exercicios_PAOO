package ex2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Editora implements Estadao, MarieClaire {
		private List<Observer> observersE =    //lista de observadores do estadao diario
				new LinkedList<>();
		
		private List<Observer> observersES =    //lista de observadores de estadao semanal
				new LinkedList<>();

		private List<Observer> observersM =    //lista de observadores de Marie claire
				new LinkedList<>();
		
		Calendar cal = Calendar.getInstance();

		

		@Override
		public void addMarie(Observer o) {
			// TODO Auto-generated method stub
			observersM.add(o);
			
		}



		@Override
		public void removeMarie(Observer o) {
			// TODO Auto-generated method stub
			observersM.remove(o);
		}




		@Override
		public void notifyObserversMarie() {
			// TODO Auto-generated method stub
			
		}





		@Override
		public void addEstadaoDiaria(Observer o) {
			// TODO Auto-generated method stub
			observersE.add(o);
		}




		@Override
		public void removeEstadaoDiaria(Observer o) {
			// TODO Auto-generated method stub
			observersE.remove(o);
		}


		@Override
		public void notifyObserversEstadao() {
			// TODO Auto-generated method stub
			List<Observer> aux = new ArrayList<>();
			Entrega e = new Entrega();
			e.setEntrega("Estadao");
			for(Observer o : observersE) {
				o.update(e);
				if(!((Pessoa)o).querosair()){
					aux.add(o);
				}
			}
			observersE.clear();
			observersE.addAll(aux);
		}


		@Override
		public void removeEstadaoSemanal(Observer o) {
			// TODO Auto-generated method stub
			observersES.remove(o);
		}


		@Override
		public void addEstadaoSemanal(Observer o) {
			// TODO Auto-generated method stub
			observersES.add(o);
		}

		@Override
		public void notifyObserversEstadaoD() {
			// TODO Auto-generated method stub
			
			
		}
		
		public void notifyObservers() {
			Entrega e = new Entrega();
			
			List<Observer> auxE = new ArrayList<>();         //diario
			List<Observer> auxES = new ArrayList<>();		//semanal
			List<Observer> auxM = new ArrayList<>();		//marie
			
			e.setEntrega("Estadao diario");
			for(Observer o: observersE) {	
				o.update(e);
				if(!((Pessoa)o).querosair()) {
					auxE.add(o);						
				}
			}
			observersE.clear();
			observersE.addAll(auxE);
			
			if(cal.get(Calendar.DAY_OF_WEEK) == 7 || cal.get(Calendar.DAY_OF_WEEK) == 1 ) {                 //dia da semana entre segunda e sexta(2-6)
				e.setEntrega("Marie claude");
				for(Observer o: observersM) {
					o.update(e);
					if(!((Pessoa)o).querosair()) { 
						auxM.add(o);
					}
						
				}
				observersM.clear();
				observersM.addAll(auxM);
				
				e.setEntrega("Estadao finais de semana");
				for(Observer o: observersES ) {
					o.update(e);
					if(!((Pessoa)o).querosair()) {
						auxES.add(o);	
						}
				}	
				observersES.clear();
				observersES.addAll(auxES);
			}
			cal.add(Calendar.DATE, 1);
		}
		
		
		public void iniciar() {
			//Calendar cal = Calendar.getInstance();
			
			
			while(!observersES.isEmpty() || !observersE.isEmpty() || !observersM.isEmpty()) {
				System.out.println("Hoje é: " +cal.getTime());
				notifyObservers();
				System.out.println("===================================================");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			System.out.println("Falimos!!!!");
		}



			
		}
