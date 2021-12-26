package As4.lkj.gf;






/**
 * ACS-3913 - Assignment 2
 */

public class TestDriver{
    public static void main(String[] args){
        Character player = new Character();
        HUD hud = new HUD(player);
        Achievements achivements = new Achievements(player); 
        
        /*** PART A ***/
        
        player.updateSword(new Sword());                        // HUD display, stats for Sword
        
        Weapon playerSword = player.getSword();
        playerSword = new Iron(playerSword);
        player.updateSword(playerSword);                        // stats changed         
        playerSword = new Gold(playerSword);
        player.updateSword(playerSword);                        // ^
        playerSword = new Diamond(playerSword);
        player.updateSword(playerSword);                        // ^
        playerSword = new Magic(playerSword);
        player.updateSword(playerSword);                        // ^ + achievement
        System.out.println("\n" + 
            player.getSword().getDescription() +"\n");          // demo description string
        player.eatFood(new Bread());                            // health bar increases
        player.eatFood(new Ham());                              // ^
        player.eatFood(new Pizza());                            // ^ + achievement
        player.eatFood(new Pizza());                            // ^ + achievement

        /*** PART B ***/

        /*** PART B ***/

        
        Weapon playerHamWeapon = new FoodAdapter(new Ham());
        player.updateHamWeapon(playerHamWeapon);                // stats for Ham    
        playerHamWeapon = new Diamond(playerHamWeapon);
        player.updateHamWeapon(playerHamWeapon);                // stats changed
        
        

    }
}
