
package ChessInit;

import java.awt.Color;
import javax.swing.JPanel;

public class BoardColor{
    
    JPanel currentPanel;
    
    
    public JPanel setColor(JPanel panel,String icon)
    {        
        if(!(icon.endsWith("white.png") || icon.endsWith("black.png")))
        {            
            
            panel.setBackground(new Color(244,241,66));
            currentPanel = panel;
        }
        return currentPanel;
    }
     
    public void removeColor(JPanel panel)
    {
        if(panel!=null)
        {
             String name = panel.getName();
             int no = Integer.parseInt(name.substring(name.length()-2, name.length()));
             int lastNum = no%10;
             int firstNum = no/10;
             
             //System.out.println("FirstNumber"+firstNum+"last"+lastNum);
             if(firstNum%2==0)
             {
                 if(lastNum%2==0)
                 {
                      panel.setBackground(new Color(0,204,204));
                 }
                 else
                 {
                     panel.setBackground(new Color(255,255,255));
                 }
             }
             else
             {
                 if(lastNum%2==0)
                 {
                     panel.setBackground(new Color(255,255,255));
                 }
                 else
                 {
                     panel.setBackground(new Color(0,204,204));
                 }
             }
        }
    }
}
