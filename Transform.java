
package ChessInit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Transform {
    
    public void movePos(JLabel source, JLabel dest)
    {
        if(source!=null && dest!=null)
        {
            dest.setIcon(source.getIcon());        
            String name = source.getName();
            
            int no = Integer.parseInt(name.substring(name.length()-2, name.length()));
            int lastNum = no%10;
            int firstNum = no/10;             
            //System.out.println("FirstNumber"+firstNum+"last"+lastNum);
            if(firstNum%2==0)
            {
                if(lastNum%2==0)
                {                
                       source.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("resources/images/black.png")));
                    
                }
                else
                {                 
                    source.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("resources/images/white.png")));
                }
            }
            else
            {
                if(lastNum%2==0)
                {
                    source.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("resources/images/white.png")));               
                }
                else
                {
                    source.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("resources/images/black.png")));
                }
            }
        }  
    }
}
