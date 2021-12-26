package As4.lkj.gf;



/**
 * Write a description of class WeaponDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class WeaponDecorator extends Weapon
{
    protected Weapon weapon;
    public abstract String getDescription();
   
}
