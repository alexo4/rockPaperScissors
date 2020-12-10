
package rockpaperscissorsgui;

import java.awt.Toolkit;
import java.util.Random;


public class RockPaperScissorsGUI {
    
    static Random rand = new Random();
    
    public static void main(String[] args) {
        
       
       Game game = new Game();
       
       Toolkit tk = Toolkit.getDefaultToolkit(); 
       int xSize = (int)tk.getScreenSize().getWidth();//gets height and width of screen
       int ySize = (int)tk.getScreenSize().getHeight();
       game.setSize(xSize,ySize);//width, height
       game.setVisible(true);
    
    }
}
    