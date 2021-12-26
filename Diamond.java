package As4.lkj.gf;




/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond extends WeaponDecorator
{
   public Diamond(Weapon weapon) {
        this.weapon = weapon;
    }
     public String getDescription() {
        return "Diamond " +weapon.getDescription() ;
    }

    public int damage() {
        return 2 + weapon.damage();
    }
     public int durability() {
        return 1 + weapon.durability();
    }
}