
package ChessInit;

import javax.swing.JPanel;

public class King {
    
  public String[] showMoves(JPanel panel)
    {
        String name = panel.getName();
        int no = Integer.parseInt(name.substring(name.length()-2, name.length()));
        
        /*
        81 82 83 84 85 86 87 88
        77 72 73 74 75 76 77 78
        61 62 63 64 65 66 67 68
        51 52 53 54 55 56 57 58
        41 42 43 44 45 46 47 48
        31 32 33 34 35 36 37 38
        21 22 23 24 25 26 27 28
        11 12 13 14 15 16 17 18     
        */

        int possibleMoves[] = new int[8];
        String moves[] = new String[8];
        
        possibleMoves[0] = no+1;
        possibleMoves[1] = no-1;
        possibleMoves[2] = no+10;
        possibleMoves[3] = no-10;
        possibleMoves[4] = no+11;
        possibleMoves[5] = no-11;
        possibleMoves[6] = no+9;
        possibleMoves[7] = no-9;
        
        for(int i=0;i<8;i++)
        {
            int n = possibleMoves[i];
            if(( n >=11&&n<=18) ||(n>=21&&n<=28) || (n>=31&&n<=38) || (n>=41&&n<=48) || (n>=51&&n<=58) || (n>=61&&n<=68) || (n>=71&&n<=78) || (n>=81&&n<=88) )
            {
                moves[i] = "SQUARE"+possibleMoves[i];
            }
            else
            {
                moves[i] = null;
            }
        }        
        return moves;
    }
}
