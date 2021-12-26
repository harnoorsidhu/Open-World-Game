package As4.lkj.gf;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harno
 */ 
import javax.swing.*; 
import java.util.*; 
public class GameDriver {
    public static void main(String[] arhs){
        System.out.println("Jatt Di Game");
        Character player = new Character();
        HUD hud = new HUD(player);
        Achievements achivements = new Achievements(player); 
        Weapon playerHamWeapon = new FoodAdapter(new Ham());
         boolean poison=false;
         boolean hamWeapon=false;
         int Switcher=0;
         ArrayList<String> enhance=new ArrayList<String>();
          enhance.add("iron");enhance.add("ham");enhance.add("bread");
         enhance.add("pizza");enhance.add("gold");enhance.add("diamond");enhance.add("magic");enhance.add("poison");
         Random r = new Random();
          int re = JOptionPane.showConfirmDialog(null, "Sword" + " :pick up?",null, JOptionPane.YES_NO_OPTION);
          player.updateSword(new Sword());
          String[] buttons = {"sword", "ham"};
          
          
           Weapon playerSword = player.getSword();
          while(!poison){
              String word = enhance.get(r.nextInt(enhance.size()));
              int result = JOptionPane.showConfirmDialog(null, word + " :pick up?",null, JOptionPane.YES_NO_OPTION);
              if(!(word.equals("pizza")||word.equals("ham")||word.equals("bread")||word.equals("poison"))){
              if(hamWeapon&&result==0){
                  Switcher=JOptionPane.showOptionDialog(null, "Select the weapon to enhance: ", null,JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons[1]);
              }
              }
       
        if(word.equals("iron")&&result==0&&Switcher==0){
            System.out.println("Added Iron");
            playerSword = new Iron(playerSword);
        player.updateSword(playerSword);   
        }
        else if(word.equals("iron")&&result==0&&Switcher==1){
            System.out.println("Added IronHam");
            playerHamWeapon = new Iron(playerHamWeapon);
        player.updateHamWeapon(playerHamWeapon); 
        }
        else if(word.equals("ham")&&result==0){
            if(!hamWeapon){
                int hammer = JOptionPane.showConfirmDialog(null,  "Do you want to use the ham as a weapon",null, JOptionPane.YES_NO_OPTION);
                if(hammer==0){
                      playerHamWeapon = new FoodAdapter(new Ham());
                     player.updateHamWeapon(playerHamWeapon); 
                     hamWeapon=true;}
                
            }else{
            System.out.println("Ate the ham");
            player.eatFood(new Ham());  }
        }
        
        else if(word.equals("bread")&&result==0){
            System.out.println("Ate the bread");
            player.eatFood(new Bread());  
        }
        else if(word.equals("pizza")&&result==0){
            System.out.println("Ate the Pizza");
            player.eatFood(new Pizza());  
        }
        else if(word.equals("gold")&&result==0&&Switcher==0){
             System.out.println("Added Gold");
             playerSword = new Gold(playerSword);
        player.updateSword(playerSword);
        }
        else if(word.equals("gold")&&result==0&&Switcher==1){
            System.out.println("Added GoldHam");
           playerHamWeapon = new Gold(playerHamWeapon);
        player.updateHamWeapon(playerHamWeapon); 
        }
        else if(word.equals("diamond")&&result==0&&Switcher==0){
             System.out.println("Added Diamond");
             playerSword = new Diamond(playerSword);
        player.updateSword(playerSword);
        }
        else if(word.equals("diamond")&&result==0&&Switcher==1){
            System.out.println("Added DiamondHam");
            playerHamWeapon = new Diamond(playerHamWeapon);
        player.updateHamWeapon(playerHamWeapon); 
        }
        else if(word.equals("magic")&&result==0&&Switcher==0){
             System.out.println("Added Magic");
             playerSword = new Magic(playerSword);
        player.updateSword(playerSword);
        } 
        else if(word.equals("magic")&&result==0&&Switcher==1){
            System.out.println("Added Magic");
           playerHamWeapon = new Magic(playerHamWeapon);
        player.updateHamWeapon(playerHamWeapon); 
        }
        else if(word.equals("poison")&&result==0){
              poison=true;
              System.out.println("Ate the Poison");
              System.out.println("Jatt is Dead ");
        }
       
        
    }
         
         
        }
}
