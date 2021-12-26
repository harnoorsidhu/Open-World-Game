package As4.lkj.gf;




/**
 * Write a description of class Magic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magic extends WeaponDecorator
{
   public Magic(Weapon weapon) {
        this.weapon = weapon;
    }
     public String getDescription() {
        return  "Magic "+weapon.getDescription() ;
    }

    public int damage() {
        return 3+ weapon.damage();
    }
     public int durability() {
        return 3 + weapon.durability();
    }
}