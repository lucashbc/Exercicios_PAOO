package ex2;

import java.util.Calendar;

public class PontoInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		cal.add(cal.DATE, 1);
		System.out.println(cal.getTime());
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		System.out.println(cal.get(cal.DATE));
		*/
		
		Editora e = new Editora();
		e.addEstadaoDiaria(new Jose());
		e.addEstadaoSemanal(new Joao());
		e.addMarie(new Maria());
		e.iniciar();
	
	
	
	}

	

}
