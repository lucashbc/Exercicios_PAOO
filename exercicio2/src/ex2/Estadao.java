package ex2;

public interface Estadao {
	public void addEstadaoDiaria(Observer o);
	public void removeEstadaoDiaria(Observer o);
	public void notifyObserversEstadaoD();
	
	public void addEstadaoSemanal(Observer o);
	public void removeEstadaoSemanal(Observer o);
	
	public void notifyObserversEstadao();
	
}
