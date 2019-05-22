public abstract class Character 
{
	WeaponBehavior weapon;

	public void setWeapon(WeaponBehavior w)
	{
		this.weapon = w;
	}

	public void useWeapon()
	{
		weapon.useWeapon();
	}

	public void fight()
	{

	}
}