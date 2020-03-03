package exercicio1;

public abstract class Character {
	WeaponBehavior weapon;
	
	
	public void fight() {};
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	};
}
