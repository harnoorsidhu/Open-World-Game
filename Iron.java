package As4.lkj.gf;




/**
 * Write a description of class Iron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Iron extends WeaponDecorator
{
   public Iron(Weapon weapon) {
        this.weapon = weapon;
    }
     public String getDescription() {
        return "iron "+ weapon.getDescription() ;
    }

    public int damage() {
        return 1 + weapon.damage();
    }
     public int durability() {
        return 1 + weapon.durability();
    }
}
