
package ChessInit;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chess extends javax.swing.JFrame {

    BoardColor boardColor = new BoardColor();
    JPanel lastColoredPanel;
    private JLabel lastClickedLabel;
    String moves[] = new String[64];
    private String lastClickedLabelName = null;
    private  List<Component> allComponents;
    private boolean COMPONENTS = true;
    
    
    public Chess() {
        
        initComponents();
        getContentPane().setBackground(new Color(5, 229, 158));
        this.setLocationRelativeTo(null);
        
        BOARD81.setName("BOARD81");
        BOARD82.setName("BOARD82");
        BOARD83.setName("BOARD83");
        BOARD84.setName("BOARD84");
        BOARD85.setName("BOARD85");
        BOARD86.setName("BOARD86");
        BOARD87.setName("BOARD87");
        BOARD88.setName("BOARD88");
        
        BOARD71.setName("BOARD71");
        BOARD72.setName("BOARD72");
        BOARD73.setName("BOARD73");
        BOARD74.setName("BOARD74");
        BOARD75.setName("BOARD75");
        BOARD76.setName("BOARD76");
        BOARD77.setName("BOARD77");
        BOARD78.setName("BOARD78");
        
        BOARD61.setName("BOARD61");
        BOARD62.setName("BOARD62");
        BOARD63.setName("BOARD63");
        BOARD64.setName("BOARD64");
        BOARD65.setName("BOARD65");
        BOARD66.setName("BOARD66");
        BOARD67.setName("BOARD67");
        BOARD68.setName("BOARD68");
        
        BOARD51.setName("BOARD51");
        BOARD52.setName("BOARD52");
        BOARD53.setName("BOARD53");
        BOARD54.setName("BOARD54");
        BOARD55.setName("BOARD55");
        BOARD56.setName("BOARD56");
        BOARD57.setName("BOARD57");
        BOARD58.setName("BOARD58");
      
        BOARD41.setName("BOARD41");
        BOARD42.setName("BOARD42");
        BOARD43.setName("BOARD43");
        BOARD44.setName("BOARD44");
        BOARD45.setName("BOARD45");
        BOARD46.setName("BOARD46");
        BOARD47.setName("BOARD47");
        BOARD48.setName("BOARD48");
        
        
        BOARD31.setName("BOARD31");
        BOARD32.setName("BOARD32");
        BOARD33.setName("BOARD33");
        BOARD34.setName("BOARD34");
        BOARD35.setName("BOARD35");
        BOARD36.setName("BOARD36");
        BOARD37.setName("BOARD37");
        BOARD38.setName("BOARD38");
        
        BOARD21.setName("BOARD21");
        BOARD22.setName("BOARD22");
        BOARD23.setName("BOARD23");
        BOARD24.setName("BOARD24");
        BOARD25.setName("BOARD25");
        BOARD26.setName("BOARD26");
        BOARD27.setName("BOARD27");
        BOARD28.setName("BOARD28");
        
        BOARD11.setName("BOARD11");
        BOARD12.setName("BOARD12");
        BOARD13.setName("BOARD13");
        BOARD14.setName("BOARD14");
        BOARD15.setName("BOARD15");
        BOARD16.setName("BOARD16");
        BOARD17.setName("BOARD17");
        BOARD18.setName("BOARD18");
        
        SQUARE81.setName("SQUARE81");
        SQUARE82.setName("SQUARE82");
        SQUARE83.setName("SQUARE83");
        SQUARE84.setName("SQUARE84");
        SQUARE85.setName("SQUARE85");
        SQUARE86.setName("SQUARE86");
        SQUARE87.setName("SQUARE87");
        SQUARE88.setName("SQUARE88");
        
        SQUARE71.setName("SQUARE71");
        SQUARE72.setName("SQUARE72");
        SQUARE73.setName("SQUARE73");
        SQUARE74.setName("SQUARE74");
        SQUARE75.setName("SQUARE75");
        SQUARE76.setName("SQUARE76");
        SQUARE77.setName("SQUARE77");
        SQUARE78.setName("SQUARE78");
        
        SQUARE61.setName("SQUARE61");
        SQUARE62.setName("SQUARE62");
        SQUARE63.setName("SQUARE63");
        SQUARE64.setName("SQUARE64");
        SQUARE65.setName("SQUARE65");
        SQUARE66.setName("SQUARE66");
        SQUARE67.setName("SQUARE67");
        SQUARE68.setName("SQUARE68");
        
        SQUARE51.setName("SQUARE51");
        SQUARE52.setName("SQUARE52");
        SQUARE53.setName("SQUARE53");
        SQUARE54.setName("SQUARE54");
        SQUARE55.setName("SQUARE55");
        SQUARE56.setName("SQUARE56");
        SQUARE57.setName("SQUARE57");
        SQUARE58.setName("SQUARE58");
      
        SQUARE41.setName("SQUARE41");
        SQUARE42.setName("SQUARE42");
        SQUARE43.setName("SQUARE43");
        SQUARE44.setName("SQUARE44");
        SQUARE45.setName("SQUARE45");
        SQUARE46.setName("SQUARE46");
        SQUARE47.setName("SQUARE47");
        SQUARE48.setName("SQUARE48");
        
        
        SQUARE31.setName("SQUARE31");
        SQUARE32.setName("SQUARE32");
        SQUARE33.setName("SQUARE33");
        SQUARE34.setName("SQUARE34");
        SQUARE35.setName("SQUARE35");
        SQUARE36.setName("SQUARE36");
        SQUARE37.setName("SQUARE37");
        SQUARE38.setName("SQUARE38");
        
        SQUARE21.setName("SQUARE21");
        SQUARE22.setName("SQUARE22");
        SQUARE23.setName("SQUARE23");
        SQUARE24.setName("SQUARE24");
        SQUARE25.setName("SQUARE25");
        SQUARE26.setName("SQUARE26");
        SQUARE27.setName("SQUARE27");
        SQUARE28.setName("SQUARE28");
        
        SQUARE11.setName("SQUARE11");
        SQUARE12.setName("SQUARE12");
        SQUARE13.setName("SQUARE13");
        SQUARE14.setName("SQUARE14");
        SQUARE15.setName("SQUARE15");
        SQUARE16.setName("SQUARE16");
        SQUARE17.setName("SQUARE17");
        SQUARE18.setName("SQUARE18");       

        allComponents = getAllComponents(this);
    }

      
    public void setWhite(String player1)
    {
        jLabel1.setText(player1);
    }
    public void setBlack(String player2)
    {
        jLabel3.setText(player2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SQUARE81 = new javax.swing.JPanel();
        BOARD81 = new javax.swing.JLabel();
        SQUARE82 = new javax.swing.JPanel();
        BOARD82 = new javax.swing.JLabel();
        SQUARE83 = new javax.swing.JPanel();
        BOARD83 = new javax.swing.JLabel();
        SQUARE84 = new javax.swing.JPanel();
        BOARD84 = new javax.swing.JLabel();
        SQUARE85 = new javax.swing.JPanel();
        BOARD85 = new javax.swing.JLabel();
        SQUARE86 = new javax.swing.JPanel();
        BOARD86 = new javax.swing.JLabel();
        SQUARE87 = new javax.swing.JPanel();
        BOARD87 = new javax.swing.JLabel();
        SQUARE88 = new javax.swing.JPanel();
        BOARD88 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        SQUARE71 = new javax.swing.JPanel();
        BOARD71 = new javax.swing.JLabel();
        SQUARE72 = new javax.swing.JPanel();
        BOARD72 = new javax.swing.JLabel();
        SQUARE73 = new javax.swing.JPanel();
        BOARD73 = new javax.swing.JLabel();
        SQUARE74 = new javax.swing.JPanel();
        BOARD74 = new javax.swing.JLabel();
        SQUARE75 = new javax.swing.JPanel();
        BOARD75 = new javax.swing.JLabel();
        SQUARE76 = new javax.swing.JPanel();
        BOARD76 = new javax.swing.JLabel();
        SQUARE77 = new javax.swing.JPanel();
        BOARD77 = new javax.swing.JLabel();
        SQUARE78 = new javax.swing.JPanel();
        BOARD78 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        SQUARE61 = new javax.swing.JPanel();
        BOARD61 = new javax.swing.JLabel();
        SQUARE62 = new javax.swing.JPanel();
        BOARD62 = new javax.swing.JLabel();
        SQUARE63 = new javax.swing.JPanel();
        BOARD63 = new javax.swing.JLabel();
        SQUARE64 = new javax.swing.JPanel();
        BOARD64 = new javax.swing.JLabel();
        SQUARE65 = new javax.swing.JPanel();
        BOARD65 = new javax.swing.JLabel();
        SQUARE66 = new javax.swing.JPanel();
        BOARD66 = new javax.swing.JLabel();
        SQUARE67 = new javax.swing.JPanel();
        BOARD67 = new javax.swing.JLabel();
        SQUARE68 = new javax.swing.JPanel();
        BOARD68 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        SQUARE51 = new javax.swing.JPanel();
        BOARD51 = new javax.swing.JLabel();
        SQUARE52 = new javax.swing.JPanel();
        BOARD52 = new javax.swing.JLabel();
        SQUARE53 = new javax.swing.JPanel();
        BOARD53 = new javax.swing.JLabel();
        SQUARE54 = new javax.swing.JPanel();
        BOARD54 = new javax.swing.JLabel();
        SQUARE55 = new javax.swing.JPanel();
        BOARD55 = new javax.swing.JLabel();
        SQUARE56 = new javax.swing.JPanel();
        BOARD56 = new javax.swing.JLabel();
        SQUARE57 = new javax.swing.JPanel();
        BOARD57 = new javax.swing.JLabel();
        SQUARE58 = new javax.swing.JPanel();
        BOARD58 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        SQUARE41 = new javax.swing.JPanel();
        BOARD41 = new javax.swing.JLabel();
        SQUARE42 = new javax.swing.JPanel();
        BOARD42 = new javax.swing.JLabel();
        SQUARE43 = new javax.swing.JPanel();
        BOARD43 = new javax.swing.JLabel();
        SQUARE44 = new javax.swing.JPanel();
        BOARD44 = new javax.swing.JLabel();
        SQUARE45 = new javax.swing.JPanel();
        BOARD45 = new javax.swing.JLabel();
        SQUARE46 = new javax.swing.JPanel();
        BOARD46 = new javax.swing.JLabel();
        SQUARE47 = new javax.swing.JPanel();
        BOARD47 = new javax.swing.JLabel();
        SQUARE48 = new javax.swing.JPanel();
        BOARD48 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        SQUARE31 = new javax.swing.JPanel();
        BOARD31 = new javax.swing.JLabel();
        SQUARE32 = new javax.swing.JPanel();
        BOARD32 = new javax.swing.JLabel();
        SQUARE33 = new javax.swing.JPanel();
        BOARD33 = new javax.swing.JLabel();
        SQUARE34 = new javax.swing.JPanel();
        BOARD34 = new javax.swing.JLabel();
        SQUARE35 = new javax.swing.JPanel();
        BOARD35 = new javax.swing.JLabel();
        SQUARE36 = new javax.swing.JPanel();
        BOARD36 = new javax.swing.JLabel();
        SQUARE37 = new javax.swing.JPanel();
        BOARD37 = new javax.swing.JLabel();
        SQUARE38 = new javax.swing.JPanel();
        BOARD38 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        SQUARE21 = new javax.swing.JPanel();
        BOARD21 = new javax.swing.JLabel();
        SQUARE22 = new javax.swing.JPanel();
        BOARD22 = new javax.swing.JLabel();
        SQUARE23 = new javax.swing.JPanel();
        BOARD23 = new javax.swing.JLabel();
        SQUARE24 = new javax.swing.JPanel();
        BOARD24 = new javax.swing.JLabel();
        SQUARE25 = new javax.swing.JPanel();
        BOARD25 = new javax.swing.JLabel();
        SQUARE26 = new javax.swing.JPanel();
        BOARD26 = new javax.swing.JLabel();
        SQUARE27 = new javax.swing.JPanel();
        BOARD27 = new javax.swing.JLabel();
        SQUARE28 = new javax.swing.JPanel();
        BOARD28 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        SQUARE11 = new javax.swing.JPanel();
        BOARD11 = new javax.swing.JLabel();
        SQUARE12 = new javax.swing.JPanel();
        BOARD12 = new javax.swing.JLabel();
        SQUARE13 = new javax.swing.JPanel();
        BOARD13 = new javax.swing.JLabel();
        SQUARE14 = new javax.swing.JPanel();
        BOARD14 = new javax.swing.JLabel();
        SQUARE15 = new javax.swing.JPanel();
        BOARD15 = new javax.swing.JLabel();
        SQUARE16 = new javax.swing.JPanel();
        BOARD16 = new javax.swing.JLabel();
        SQUARE17 = new javax.swing.JPanel();
        BOARD17 = new javax.swing.JLabel();
        SQUARE18 = new javax.swing.JPanel();
        BOARD18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Turn = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(8, 8));

        jPanel1.setBackground(new java.awt.Color(5, 229, 158));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE81.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE81.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE81.setToolTipText("");
        SQUARE81.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackrook.png"))); // NOI18N
        BOARD81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD81MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE81Layout = new javax.swing.GroupLayout(SQUARE81);
        SQUARE81.setLayout(SQUARE81Layout);
        SQUARE81Layout.setHorizontalGroup(
            SQUARE81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE81Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD81)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE81Layout.setVerticalGroup(
            SQUARE81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE81Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE81);

        SQUARE82.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE82.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE82.setToolTipText("");
        SQUARE82.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackknight.png"))); // NOI18N
        BOARD82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD82MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE82Layout = new javax.swing.GroupLayout(SQUARE82);
        SQUARE82.setLayout(SQUARE82Layout);
        SQUARE82Layout.setHorizontalGroup(
            SQUARE82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE82Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD82)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE82Layout.setVerticalGroup(
            SQUARE82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE82Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE82);

        SQUARE83.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE83.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE83.setToolTipText("");
        SQUARE83.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackbishop.png"))); // NOI18N
        BOARD83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD83MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE83Layout = new javax.swing.GroupLayout(SQUARE83);
        SQUARE83.setLayout(SQUARE83Layout);
        SQUARE83Layout.setHorizontalGroup(
            SQUARE83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE83Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD83)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE83Layout.setVerticalGroup(
            SQUARE83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE83Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE83);

        SQUARE84.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE84.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE84.setToolTipText("");
        SQUARE84.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackqueen.png"))); // NOI18N
        BOARD84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD84MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE84Layout = new javax.swing.GroupLayout(SQUARE84);
        SQUARE84.setLayout(SQUARE84Layout);
        SQUARE84Layout.setHorizontalGroup(
            SQUARE84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE84Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE84Layout.setVerticalGroup(
            SQUARE84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE84Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE84);

        SQUARE85.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE85.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE85.setToolTipText("");
        SQUARE85.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackking.png"))); // NOI18N
        BOARD85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD85MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE85Layout = new javax.swing.GroupLayout(SQUARE85);
        SQUARE85.setLayout(SQUARE85Layout);
        SQUARE85Layout.setHorizontalGroup(
            SQUARE85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE85Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE85Layout.setVerticalGroup(
            SQUARE85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE85Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE85);

        SQUARE86.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE86.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE86.setToolTipText("");
        SQUARE86.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackbishop.png"))); // NOI18N
        BOARD86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD86MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE86Layout = new javax.swing.GroupLayout(SQUARE86);
        SQUARE86.setLayout(SQUARE86Layout);
        SQUARE86Layout.setHorizontalGroup(
            SQUARE86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE86Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE86Layout.setVerticalGroup(
            SQUARE86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE86Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE86);

        SQUARE87.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE87.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE87.setToolTipText("");
        SQUARE87.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackknight.png"))); // NOI18N
        BOARD87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD87MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE87Layout = new javax.swing.GroupLayout(SQUARE87);
        SQUARE87.setLayout(SQUARE87Layout);
        SQUARE87Layout.setHorizontalGroup(
            SQUARE87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE87Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD87)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE87Layout.setVerticalGroup(
            SQUARE87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE87Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE87);

        SQUARE88.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE88.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE88.setToolTipText("");
        SQUARE88.setPreferredSize(new java.awt.Dimension(138, 70));

        BOARD88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackrook.png"))); // NOI18N
        BOARD88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD88MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE88Layout = new javax.swing.GroupLayout(SQUARE88);
        SQUARE88.setLayout(SQUARE88Layout);
        SQUARE88Layout.setHorizontalGroup(
            SQUARE88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE88Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD88)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE88Layout.setVerticalGroup(
            SQUARE88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE88Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(SQUARE88);

        jPanel2.add(jPanel1);

        jPanel10.setBackground(new java.awt.Color(5, 229, 158));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE71.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE71.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE71.setToolTipText("");

        BOARD71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE71Layout = new javax.swing.GroupLayout(SQUARE71);
        SQUARE71.setLayout(SQUARE71Layout);
        SQUARE71Layout.setHorizontalGroup(
            SQUARE71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE71Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE71Layout.setVerticalGroup(
            SQUARE71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE71Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE71);

        SQUARE72.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE72.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE72.setToolTipText("");

        BOARD72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD72MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE72Layout = new javax.swing.GroupLayout(SQUARE72);
        SQUARE72.setLayout(SQUARE72Layout);
        SQUARE72Layout.setHorizontalGroup(
            SQUARE72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE72Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD72)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE72Layout.setVerticalGroup(
            SQUARE72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE72Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE72);

        SQUARE73.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE73.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE73.setToolTipText("");

        BOARD73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD73MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE73Layout = new javax.swing.GroupLayout(SQUARE73);
        SQUARE73.setLayout(SQUARE73Layout);
        SQUARE73Layout.setHorizontalGroup(
            SQUARE73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE73Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE73Layout.setVerticalGroup(
            SQUARE73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE73Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE73);

        SQUARE74.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE74.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE74.setToolTipText("");

        BOARD74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD74MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE74Layout = new javax.swing.GroupLayout(SQUARE74);
        SQUARE74.setLayout(SQUARE74Layout);
        SQUARE74Layout.setHorizontalGroup(
            SQUARE74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE74Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD74)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE74Layout.setVerticalGroup(
            SQUARE74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE74Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE74);

        SQUARE75.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE75.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE75.setToolTipText("");

        BOARD75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD75MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE75Layout = new javax.swing.GroupLayout(SQUARE75);
        SQUARE75.setLayout(SQUARE75Layout);
        SQUARE75Layout.setHorizontalGroup(
            SQUARE75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE75Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE75Layout.setVerticalGroup(
            SQUARE75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE75Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE75);

        SQUARE76.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE76.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE76.setToolTipText("");

        BOARD76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD76MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE76Layout = new javax.swing.GroupLayout(SQUARE76);
        SQUARE76.setLayout(SQUARE76Layout);
        SQUARE76Layout.setHorizontalGroup(
            SQUARE76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE76Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD76)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE76Layout.setVerticalGroup(
            SQUARE76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE76Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE76);

        SQUARE77.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE77.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE77.setToolTipText("");

        BOARD77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD77MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE77Layout = new javax.swing.GroupLayout(SQUARE77);
        SQUARE77.setLayout(SQUARE77Layout);
        SQUARE77Layout.setHorizontalGroup(
            SQUARE77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE77Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE77Layout.setVerticalGroup(
            SQUARE77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE77Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE77);

        SQUARE78.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE78.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE78.setToolTipText("");

        BOARD78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/blackpawn.png"))); // NOI18N
        BOARD78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD78MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE78Layout = new javax.swing.GroupLayout(SQUARE78);
        SQUARE78.setLayout(SQUARE78Layout);
        SQUARE78Layout.setHorizontalGroup(
            SQUARE78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE78Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD78)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE78Layout.setVerticalGroup(
            SQUARE78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE78Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.add(SQUARE78);

        jPanel2.add(jPanel10);

        jPanel27.setBackground(new java.awt.Color(5, 229, 158));
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE61.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE61.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE61.setToolTipText("");
        SQUARE61.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE61Layout = new javax.swing.GroupLayout(SQUARE61);
        SQUARE61.setLayout(SQUARE61Layout);
        SQUARE61Layout.setHorizontalGroup(
            SQUARE61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE61Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE61Layout.setVerticalGroup(
            SQUARE61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE61Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE61);

        SQUARE62.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE62.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE62.setToolTipText("");
        SQUARE62.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE62Layout = new javax.swing.GroupLayout(SQUARE62);
        SQUARE62.setLayout(SQUARE62Layout);
        SQUARE62Layout.setHorizontalGroup(
            SQUARE62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE62Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE62Layout.setVerticalGroup(
            SQUARE62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE62Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE62);

        SQUARE63.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE63.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE63.setToolTipText("");
        SQUARE63.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE63Layout = new javax.swing.GroupLayout(SQUARE63);
        SQUARE63.setLayout(SQUARE63Layout);
        SQUARE63Layout.setHorizontalGroup(
            SQUARE63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE63Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE63Layout.setVerticalGroup(
            SQUARE63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE63Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE63);

        SQUARE64.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE64.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE64.setToolTipText("");
        SQUARE64.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE64Layout = new javax.swing.GroupLayout(SQUARE64);
        SQUARE64.setLayout(SQUARE64Layout);
        SQUARE64Layout.setHorizontalGroup(
            SQUARE64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE64Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD64)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE64Layout.setVerticalGroup(
            SQUARE64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE64Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE64);

        SQUARE65.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE65.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE65.setToolTipText("");
        SQUARE65.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE65Layout = new javax.swing.GroupLayout(SQUARE65);
        SQUARE65.setLayout(SQUARE65Layout);
        SQUARE65Layout.setHorizontalGroup(
            SQUARE65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE65Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE65Layout.setVerticalGroup(
            SQUARE65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE65Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE65);

        SQUARE66.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE66.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE66.setToolTipText("");
        SQUARE66.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE66Layout = new javax.swing.GroupLayout(SQUARE66);
        SQUARE66.setLayout(SQUARE66Layout);
        SQUARE66Layout.setHorizontalGroup(
            SQUARE66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE66Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE66Layout.setVerticalGroup(
            SQUARE66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE66Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE66);

        SQUARE67.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE67.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE67.setToolTipText("");
        SQUARE67.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD67MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE67Layout = new javax.swing.GroupLayout(SQUARE67);
        SQUARE67.setLayout(SQUARE67Layout);
        SQUARE67Layout.setHorizontalGroup(
            SQUARE67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE67Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE67Layout.setVerticalGroup(
            SQUARE67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE67Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE67);

        SQUARE68.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE68.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE68.setToolTipText("");
        SQUARE68.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD68MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE68Layout = new javax.swing.GroupLayout(SQUARE68);
        SQUARE68.setLayout(SQUARE68Layout);
        SQUARE68Layout.setHorizontalGroup(
            SQUARE68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE68Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE68Layout.setVerticalGroup(
            SQUARE68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE68Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.add(SQUARE68);

        jPanel2.add(jPanel27);

        jPanel36.setBackground(new java.awt.Color(5, 229, 158));
        jPanel36.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE51.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE51.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE51.setToolTipText("");
        SQUARE51.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD51MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE51Layout = new javax.swing.GroupLayout(SQUARE51);
        SQUARE51.setLayout(SQUARE51Layout);
        SQUARE51Layout.setHorizontalGroup(
            SQUARE51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE51Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE51Layout.setVerticalGroup(
            SQUARE51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE51Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE51);

        SQUARE52.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE52.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE52.setToolTipText("");
        SQUARE52.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE52Layout = new javax.swing.GroupLayout(SQUARE52);
        SQUARE52.setLayout(SQUARE52Layout);
        SQUARE52Layout.setHorizontalGroup(
            SQUARE52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE52Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE52Layout.setVerticalGroup(
            SQUARE52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE52Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE52);

        SQUARE53.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE53.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE53.setToolTipText("");
        SQUARE53.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD53MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE53Layout = new javax.swing.GroupLayout(SQUARE53);
        SQUARE53.setLayout(SQUARE53Layout);
        SQUARE53Layout.setHorizontalGroup(
            SQUARE53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE53Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE53Layout.setVerticalGroup(
            SQUARE53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE53Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE53);

        SQUARE54.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE54.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE54.setToolTipText("");
        SQUARE54.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD54MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE54Layout = new javax.swing.GroupLayout(SQUARE54);
        SQUARE54.setLayout(SQUARE54Layout);
        SQUARE54Layout.setHorizontalGroup(
            SQUARE54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE54Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE54Layout.setVerticalGroup(
            SQUARE54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE54Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE54);

        SQUARE55.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE55.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE55.setToolTipText("");
        SQUARE55.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE55Layout = new javax.swing.GroupLayout(SQUARE55);
        SQUARE55.setLayout(SQUARE55Layout);
        SQUARE55Layout.setHorizontalGroup(
            SQUARE55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE55Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE55Layout.setVerticalGroup(
            SQUARE55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE55Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE55);

        SQUARE56.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE56.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE56.setToolTipText("");
        SQUARE56.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE56Layout = new javax.swing.GroupLayout(SQUARE56);
        SQUARE56.setLayout(SQUARE56Layout);
        SQUARE56Layout.setHorizontalGroup(
            SQUARE56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE56Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE56Layout.setVerticalGroup(
            SQUARE56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE56Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE56);

        SQUARE57.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE57.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE57.setToolTipText("");
        SQUARE57.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD57MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE57Layout = new javax.swing.GroupLayout(SQUARE57);
        SQUARE57.setLayout(SQUARE57Layout);
        SQUARE57Layout.setHorizontalGroup(
            SQUARE57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE57Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE57Layout.setVerticalGroup(
            SQUARE57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE57Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE57);

        SQUARE58.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE58.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE58.setToolTipText("");
        SQUARE58.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE58Layout = new javax.swing.GroupLayout(SQUARE58);
        SQUARE58.setLayout(SQUARE58Layout);
        SQUARE58Layout.setHorizontalGroup(
            SQUARE58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE58Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE58Layout.setVerticalGroup(
            SQUARE58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE58Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.add(SQUARE58);

        jPanel2.add(jPanel36);

        jPanel45.setBackground(new java.awt.Color(5, 229, 158));
        jPanel45.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE41.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE41.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE41.setToolTipText("");
        SQUARE41.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE41Layout = new javax.swing.GroupLayout(SQUARE41);
        SQUARE41.setLayout(SQUARE41Layout);
        SQUARE41Layout.setHorizontalGroup(
            SQUARE41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE41Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE41Layout.setVerticalGroup(
            SQUARE41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE41Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE41);

        SQUARE42.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE42.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE42.setToolTipText("");
        SQUARE42.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE42Layout = new javax.swing.GroupLayout(SQUARE42);
        SQUARE42.setLayout(SQUARE42Layout);
        SQUARE42Layout.setHorizontalGroup(
            SQUARE42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE42Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE42Layout.setVerticalGroup(
            SQUARE42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE42Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE42);

        SQUARE43.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE43.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE43.setToolTipText("");
        SQUARE43.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE43Layout = new javax.swing.GroupLayout(SQUARE43);
        SQUARE43.setLayout(SQUARE43Layout);
        SQUARE43Layout.setHorizontalGroup(
            SQUARE43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE43Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE43Layout.setVerticalGroup(
            SQUARE43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE43Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE43);

        SQUARE44.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE44.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE44.setToolTipText("");
        SQUARE44.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE44Layout = new javax.swing.GroupLayout(SQUARE44);
        SQUARE44.setLayout(SQUARE44Layout);
        SQUARE44Layout.setHorizontalGroup(
            SQUARE44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE44Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE44Layout.setVerticalGroup(
            SQUARE44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE44Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE44);

        SQUARE45.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE45.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE45.setToolTipText("");
        SQUARE45.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE45Layout = new javax.swing.GroupLayout(SQUARE45);
        SQUARE45.setLayout(SQUARE45Layout);
        SQUARE45Layout.setHorizontalGroup(
            SQUARE45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE45Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE45Layout.setVerticalGroup(
            SQUARE45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE45Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE45);

        SQUARE46.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE46.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE46.setToolTipText("");
        SQUARE46.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE46Layout = new javax.swing.GroupLayout(SQUARE46);
        SQUARE46.setLayout(SQUARE46Layout);
        SQUARE46Layout.setHorizontalGroup(
            SQUARE46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE46Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE46Layout.setVerticalGroup(
            SQUARE46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE46Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE46);

        SQUARE47.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE47.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE47.setToolTipText("");
        SQUARE47.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE47Layout = new javax.swing.GroupLayout(SQUARE47);
        SQUARE47.setLayout(SQUARE47Layout);
        SQUARE47Layout.setHorizontalGroup(
            SQUARE47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE47Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE47Layout.setVerticalGroup(
            SQUARE47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE47Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE47);

        SQUARE48.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE48.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE48.setToolTipText("");
        SQUARE48.setPreferredSize(new java.awt.Dimension(132, 88));

        BOARD48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE48Layout = new javax.swing.GroupLayout(SQUARE48);
        SQUARE48.setLayout(SQUARE48Layout);
        SQUARE48Layout.setHorizontalGroup(
            SQUARE48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE48Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE48Layout.setVerticalGroup(
            SQUARE48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE48Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel45.add(SQUARE48);

        jPanel2.add(jPanel45);

        jPanel54.setBackground(new java.awt.Color(5, 229, 158));
        jPanel54.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE31.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE31.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE31.setToolTipText("");

        BOARD31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE31Layout = new javax.swing.GroupLayout(SQUARE31);
        SQUARE31.setLayout(SQUARE31Layout);
        SQUARE31Layout.setHorizontalGroup(
            SQUARE31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE31Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE31Layout.setVerticalGroup(
            SQUARE31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE31);

        SQUARE32.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE32.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE32.setToolTipText("");

        BOARD32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE32Layout = new javax.swing.GroupLayout(SQUARE32);
        SQUARE32.setLayout(SQUARE32Layout);
        SQUARE32Layout.setHorizontalGroup(
            SQUARE32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE32Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE32Layout.setVerticalGroup(
            SQUARE32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE32Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE32);

        SQUARE33.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE33.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE33.setToolTipText("");

        BOARD33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE33Layout = new javax.swing.GroupLayout(SQUARE33);
        SQUARE33.setLayout(SQUARE33Layout);
        SQUARE33Layout.setHorizontalGroup(
            SQUARE33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE33Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE33Layout.setVerticalGroup(
            SQUARE33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE33Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE33);

        SQUARE34.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE34.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE34.setToolTipText("");

        BOARD34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE34Layout = new javax.swing.GroupLayout(SQUARE34);
        SQUARE34.setLayout(SQUARE34Layout);
        SQUARE34Layout.setHorizontalGroup(
            SQUARE34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE34Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE34Layout.setVerticalGroup(
            SQUARE34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE34Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE34);

        SQUARE35.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE35.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE35.setToolTipText("");

        BOARD35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE35Layout = new javax.swing.GroupLayout(SQUARE35);
        SQUARE35.setLayout(SQUARE35Layout);
        SQUARE35Layout.setHorizontalGroup(
            SQUARE35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE35Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE35Layout.setVerticalGroup(
            SQUARE35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE35Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE35);

        SQUARE36.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE36.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE36.setToolTipText("");

        BOARD36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE36Layout = new javax.swing.GroupLayout(SQUARE36);
        SQUARE36.setLayout(SQUARE36Layout);
        SQUARE36Layout.setHorizontalGroup(
            SQUARE36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE36Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE36Layout.setVerticalGroup(
            SQUARE36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE36Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE36);

        SQUARE37.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE37.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE37.setToolTipText("");

        BOARD37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/black.png"))); // NOI18N
        BOARD37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE37Layout = new javax.swing.GroupLayout(SQUARE37);
        SQUARE37.setLayout(SQUARE37Layout);
        SQUARE37Layout.setHorizontalGroup(
            SQUARE37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE37Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE37Layout.setVerticalGroup(
            SQUARE37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE37Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE37);

        SQUARE38.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE38.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE38.setToolTipText("");

        BOARD38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/white.png"))); // NOI18N
        BOARD38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE38Layout = new javax.swing.GroupLayout(SQUARE38);
        SQUARE38.setLayout(SQUARE38Layout);
        SQUARE38Layout.setHorizontalGroup(
            SQUARE38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE38Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE38Layout.setVerticalGroup(
            SQUARE38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE38Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.add(SQUARE38);

        jPanel2.add(jPanel54);

        jPanel63.setBackground(new java.awt.Color(5, 229, 158));
        jPanel63.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE21.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE21.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE21.setToolTipText("");

        BOARD21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE21Layout = new javax.swing.GroupLayout(SQUARE21);
        SQUARE21.setLayout(SQUARE21Layout);
        SQUARE21Layout.setHorizontalGroup(
            SQUARE21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE21Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE21Layout.setVerticalGroup(
            SQUARE21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE21);

        SQUARE22.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE22.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE22.setToolTipText("");

        BOARD22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE22Layout = new javax.swing.GroupLayout(SQUARE22);
        SQUARE22.setLayout(SQUARE22Layout);
        SQUARE22Layout.setHorizontalGroup(
            SQUARE22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE22Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE22Layout.setVerticalGroup(
            SQUARE22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE22Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE22);

        SQUARE23.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE23.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE23.setToolTipText("");

        BOARD23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE23Layout = new javax.swing.GroupLayout(SQUARE23);
        SQUARE23.setLayout(SQUARE23Layout);
        SQUARE23Layout.setHorizontalGroup(
            SQUARE23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE23Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE23Layout.setVerticalGroup(
            SQUARE23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE23Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE23);

        SQUARE24.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE24.setForeground(new java.awt.Color(0, 102, 102));

        BOARD24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE24Layout = new javax.swing.GroupLayout(SQUARE24);
        SQUARE24.setLayout(SQUARE24Layout);
        SQUARE24Layout.setHorizontalGroup(
            SQUARE24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE24Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE24Layout.setVerticalGroup(
            SQUARE24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE24);

        SQUARE25.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE25.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE25.setToolTipText("");

        BOARD25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE25Layout = new javax.swing.GroupLayout(SQUARE25);
        SQUARE25.setLayout(SQUARE25Layout);
        SQUARE25Layout.setHorizontalGroup(
            SQUARE25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE25Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE25Layout.setVerticalGroup(
            SQUARE25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE25);

        SQUARE26.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE26.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE26.setToolTipText("");

        BOARD26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE26Layout = new javax.swing.GroupLayout(SQUARE26);
        SQUARE26.setLayout(SQUARE26Layout);
        SQUARE26Layout.setHorizontalGroup(
            SQUARE26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE26Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE26Layout.setVerticalGroup(
            SQUARE26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE26);

        SQUARE27.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE27.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE27.setToolTipText("");

        BOARD27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE27Layout = new javax.swing.GroupLayout(SQUARE27);
        SQUARE27.setLayout(SQUARE27Layout);
        SQUARE27Layout.setHorizontalGroup(
            SQUARE27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE27Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE27Layout.setVerticalGroup(
            SQUARE27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE27Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE27);

        SQUARE28.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE28.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE28.setToolTipText("");

        BOARD28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitepawn.png"))); // NOI18N
        BOARD28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE28Layout = new javax.swing.GroupLayout(SQUARE28);
        SQUARE28.setLayout(SQUARE28Layout);
        SQUARE28Layout.setHorizontalGroup(
            SQUARE28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE28Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE28Layout.setVerticalGroup(
            SQUARE28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE28Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.add(SQUARE28);

        jPanel2.add(jPanel63);

        jPanel72.setBackground(new java.awt.Color(5, 229, 158));
        jPanel72.setLayout(new java.awt.GridLayout(1, 0));

        SQUARE11.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE11.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE11.setToolTipText("");

        BOARD11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whiterook.png"))); // NOI18N
        BOARD11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE11Layout = new javax.swing.GroupLayout(SQUARE11);
        SQUARE11.setLayout(SQUARE11Layout);
        SQUARE11Layout.setHorizontalGroup(
            SQUARE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE11Layout.setVerticalGroup(
            SQUARE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE11);

        SQUARE12.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE12.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE12.setToolTipText("");

        BOARD12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whiteknight.png"))); // NOI18N
        BOARD12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE12Layout = new javax.swing.GroupLayout(SQUARE12);
        SQUARE12.setLayout(SQUARE12Layout);
        SQUARE12Layout.setHorizontalGroup(
            SQUARE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE12Layout.setVerticalGroup(
            SQUARE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE12);

        SQUARE13.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE13.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE13.setToolTipText("");

        BOARD13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitebishop.png"))); // NOI18N
        BOARD13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE13Layout = new javax.swing.GroupLayout(SQUARE13);
        SQUARE13.setLayout(SQUARE13Layout);
        SQUARE13Layout.setHorizontalGroup(
            SQUARE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE13Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE13Layout.setVerticalGroup(
            SQUARE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE13);

        SQUARE14.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE14.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE14.setToolTipText("");

        BOARD14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitequeen.png"))); // NOI18N
        BOARD14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE14Layout = new javax.swing.GroupLayout(SQUARE14);
        SQUARE14.setLayout(SQUARE14Layout);
        SQUARE14Layout.setHorizontalGroup(
            SQUARE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE14Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE14Layout.setVerticalGroup(
            SQUARE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE14);

        SQUARE15.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE15.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE15.setToolTipText("");

        BOARD15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whiteking.png"))); // NOI18N
        BOARD15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE15Layout = new javax.swing.GroupLayout(SQUARE15);
        SQUARE15.setLayout(SQUARE15Layout);
        SQUARE15Layout.setHorizontalGroup(
            SQUARE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE15Layout.setVerticalGroup(
            SQUARE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE15);

        SQUARE16.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE16.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE16.setToolTipText("");

        BOARD16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whitebishop.png"))); // NOI18N
        BOARD16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE16Layout = new javax.swing.GroupLayout(SQUARE16);
        SQUARE16.setLayout(SQUARE16Layout);
        SQUARE16Layout.setHorizontalGroup(
            SQUARE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE16Layout.setVerticalGroup(
            SQUARE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE16);

        SQUARE17.setBackground(new java.awt.Color(0, 204, 204));
        SQUARE17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE17.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE17.setToolTipText("");

        BOARD17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whiteknight.png"))); // NOI18N
        BOARD17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE17Layout = new javax.swing.GroupLayout(SQUARE17);
        SQUARE17.setLayout(SQUARE17Layout);
        SQUARE17Layout.setHorizontalGroup(
            SQUARE17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE17Layout.setVerticalGroup(
            SQUARE17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE17);

        SQUARE18.setBackground(new java.awt.Color(255, 255, 255));
        SQUARE18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SQUARE18.setForeground(new java.awt.Color(255, 255, 255));
        SQUARE18.setToolTipText("");

        BOARD18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/whiterook.png"))); // NOI18N
        BOARD18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOARD18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOARD18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SQUARE18Layout = new javax.swing.GroupLayout(SQUARE18);
        SQUARE18.setLayout(SQUARE18Layout);
        SQUARE18Layout.setHorizontalGroup(
            SQUARE18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE18Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BOARD18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SQUARE18Layout.setVerticalGroup(
            SQUARE18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SQUARE18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BOARD18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.add(SQUARE18);

        jPanel2.add(jPanel72);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Player2");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("BLACK:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Player1");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("WHITE:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("QUIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("TURN:");

        Turn.setBackground(new java.awt.Color(255, 255, 255));
        Turn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Turn.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout TurnLayout = new javax.swing.GroupLayout(Turn);
        Turn.setLayout(TurnLayout);
        TurnLayout.setHorizontalGroup(
            TurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        TurnLayout.setVerticalGroup(
            TurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Turn, jButton1, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(COMPONENTS)
        {
            int option = JOptionPane.showConfirmDialog(null,"Are you sure??\nThe Current Progress will be lost\nClick Yes to quit",null,JOptionPane.YES_NO_OPTION);
            if(option==0)
            {
                Login i = new Login();
                i.setVisible(true);
                this.setVisible(false);
            }
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Thanks for Playing\nHave a Nice Day","THANKS",JOptionPane.INFORMATION_MESSAGE);
                Login i = new Login();
                i.setVisible(true);
                this.setVisible(false);            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public JLabel getBOARD11() {
        return BOARD11;
    }

    public JLabel getBOARD1188() {
        return BOARD88;
    }

    public JLabel getBOARD12() {
        return BOARD12;
    }

    public JLabel getBOARD13() {
        return BOARD13;
    }

    public JLabel getBOARD14() {
        return BOARD14;
    }

    public JLabel getBOARD15() {
        return BOARD15;
    }

    public JLabel getBOARD16() {
        return BOARD16;
    }

    public JLabel getBOARD17() {
        return BOARD17;
    }

    public JLabel getBOARD18() {
        return BOARD18;
    }

    public JLabel getBOARD21() {
        return BOARD21;
    }

    public JLabel getBOARD22() {
        return BOARD22;
    }

    public JLabel getBOARD23() {
        return BOARD23;
    }

    public JLabel getBOARD24() {
        return BOARD24;
    }

    public JLabel getBOARD25() {
        return BOARD25;
    }

    public JLabel getBOARD26() {
        return BOARD26;
    }

    public JLabel getBOARD27() {
        return BOARD27;
    }

    public JLabel getBOARD28() {
        return BOARD28;
    }

    public JLabel getBOARD31() {
        return BOARD31;
    }

    public JLabel getBOARD32() {
        return BOARD32;
    }

    public JLabel getBOARD33() {
        return BOARD33;
    }

    public JLabel getBOARD34() {
        return BOARD34;
    }

    public JLabel getBOARD35() {
        return BOARD35;
    }

    public JLabel getBOARD36() {
        return BOARD36;
    }

    public JLabel getBOARD37() {
        return BOARD37;
    }

    public JLabel getBOARD38() {
        return BOARD38;
    }

    public JLabel getBOARD41() {
        return BOARD41;
    }

    public JLabel getBOARD42() {
        return BOARD42;
    }

    public JLabel getBOARD43() {
        return BOARD43;
    }

    public JLabel getBOARD44() {
        return BOARD44;
    }

    public JLabel getBOARD45() {
        return BOARD45;
    }

    public JLabel getBOARD46() {
        return BOARD46;
    }

    public JLabel getBOARD47() {
        return BOARD47;
    }

    public JLabel getBOARD48() {
        return BOARD48;
    }

    public JLabel getBOARD51() {
        return BOARD51;
    }

    public JLabel getBOARD52() {
        return BOARD52;
    }

    public JLabel getBOARD53() {
        return BOARD53;
    }

    public JLabel getBOARD54() {
        return BOARD54;
    }

    public JLabel getBOARD55() {
        return BOARD55;
    }

    public JLabel getBOARD56() {
        return BOARD56;
    }

    public JLabel getBOARD57() {
        return BOARD57;
    }

    public JLabel getBOARD58() {
        return BOARD58;
    }

    public JLabel getBOARD61() {
        return BOARD61;
    }

    public JLabel getBOARD62() {
        return BOARD62;
    }

    public JLabel getBOARD63() {
        return BOARD63;
    }

    public JLabel getBOARD64() {
        return BOARD64;
    }

    public JLabel getBOARD65() {
        return BOARD65;
    }

    public JLabel getBOARD66() {
        return BOARD66;
    }

    public JLabel getBOARD67() {
        return BOARD67;
    }

    public JLabel getBOARD68() {
        return BOARD68;
    }

    public JLabel getBOARD71() {
        return BOARD71;
    }

    public JLabel getBOARD72() {
        return BOARD72;
    }

    public JLabel getBOARD73() {
        return BOARD73;
    }

    public JLabel getBOARD74() {
        return BOARD74;
    }

    public JLabel getBOARD75() {
        return BOARD75;
    }

    public JLabel getBOARD76() {
        return BOARD76;
    }

    public JLabel getBOARD77() {
        return BOARD77;
    }

    public JLabel getBOARD78() {
        return BOARD78;
    }

    public JLabel getBOARD81() {
        return BOARD81;
    }

    public JLabel getBOARD82() {
        return BOARD82;
    }

    public JLabel getBOARD83() {
        return BOARD83;
    }

    public JLabel getBOARD84() {
        return BOARD84;
    }

    public JLabel getBOARD85() {
        return BOARD85;
    }

    public JLabel getBOARD86() {
        return BOARD86;
    }

    public JLabel getBOARD87() {
        return BOARD87;
    }
    public JLabel getBOARD88() {
        return BOARD87;
    }

    public JPanel getSQUARE11() {
        return SQUARE11;
    }

    public JPanel getSQUARE12() {
        return SQUARE12;
    }

    public JPanel getSQUARE13() {
        return SQUARE13;
    }

    public JPanel getSQUARE14() {
        return SQUARE14;
    }

    public JPanel getSQUARE15() {
        return SQUARE15;
    }

    public JPanel getSQUARE16() {
        return SQUARE16;
    }

    public JPanel getSQUARE17() {
        return SQUARE17;
    }

    public JPanel getSQUARE18() {
        return SQUARE18;
    }

    public JPanel getSQUARE21() {
        return SQUARE21;
    }

    public JPanel getSQUARE22() {
        return SQUARE22;
    }

    public JPanel getSQUARE23() {
        return SQUARE23;
    }

    public JPanel getSQUARE24() {
        return SQUARE24;
    }

    public JPanel getSQUARE25() {
        return SQUARE25;
    }

    public JPanel getSQUARE26() {
        return SQUARE26;
    }

    public JPanel getSQUARE27() {
        return SQUARE27;
    }

    public JPanel getSQUARE28() {
        return SQUARE28;
    }

    public JPanel getSQUARE31() {
        return SQUARE31;
    }

    public JPanel getSQUARE32() {
        return SQUARE32;
    }

    public JPanel getSQUARE33() {
        return SQUARE33;
    }

    public JPanel getSQUARE34() {
        return SQUARE34;
    }

    public JPanel getSQUARE35() {
        return SQUARE35;
    }

    public JPanel getSQUARE36() {
        return SQUARE36;
    }

    public JPanel getSQUARE37() {
        return SQUARE37;
    }

    public JPanel getSQUARE38() {
        return SQUARE38;
    }

    public JPanel getSQUARE41() {
        return SQUARE41;
    }

    public JPanel getSQUARE42() {
        return SQUARE42;
    }

    public JPanel getSQUARE43() {
        return SQUARE43;
    }

    public JPanel getSQUARE44() {
        return SQUARE44;
    }

    public JPanel getSQUARE45() {
        return SQUARE45;
    }

    public JPanel getSQUARE46() {
        return SQUARE46;
    }

    public JPanel getSQUARE47() {
        return SQUARE47;
    }

    public JPanel getSQUARE48() {
        return SQUARE48;
    }

    public JPanel getSQUARE51() {
        return SQUARE51;
    }

    public JPanel getSQUARE52() {
        return SQUARE52;
    }

    public JPanel getSQUARE53() {
        return SQUARE53;
    }

    public JPanel getSQUARE54() {
        return SQUARE54;
    }

    public JPanel getSQUARE55() {
        return SQUARE55;
    }

    public JPanel getSQUARE56() {
        return SQUARE56;
    }

    public JPanel getSQUARE57() {
        return SQUARE57;
    }

    public JPanel getSQUARE58() {
        return SQUARE58;
    }

    public JPanel getSQUARE61() {
        return SQUARE61;
    }

    public JPanel getSQUARE62() {
        return SQUARE62;
    }

    public JPanel getSQUARE63() {
        return SQUARE63;
    }

    public JPanel getSQUARE64() {
        return SQUARE64;
    }

    public JPanel getSQUARE65() {
        return SQUARE65;
    }

    public JPanel getSQUARE66() {
        return SQUARE66;
    }

    public JPanel getSQUARE67() {
        return SQUARE67;
    }

    public JPanel getSQUARE68() {
        return SQUARE68;
    }

    public JPanel getSQUARE71() {
        return SQUARE71;
    }

    public JPanel getSQUARE72() {
        return SQUARE72;
    }

    public JPanel getSQUARE73() {
        return SQUARE73;
    }

    public JPanel getSQUARE74() {
        return SQUARE74;
    }

    public JPanel getSQUARE75() {
        return SQUARE75;
    }

    public JPanel getSQUARE76() {
        return SQUARE76;
    }

    public JPanel getSQUARE77() {
        return SQUARE77;
    }

    public JPanel getSQUARE78() {
        return SQUARE78;
    }

    public JPanel getSQUARE81() {
        return SQUARE81;
    }

    public JPanel getSQUARE82() {
        return SQUARE82;
    }

    public JPanel getSQUARE83() {
        return SQUARE83;
    }

    public JPanel getSQUARE84() {
        return SQUARE84;
    }

    public JPanel getSQUARE85() {
        return SQUARE85;
    }

    public JPanel getSQUARE86() {
        return SQUARE86;
    }

    public JPanel getSQUARE87() {
        return SQUARE87;
    }

    public JPanel getSQUARE88() {
        return SQUARE88;
    }

    public boolean checkStatus(JLabel label)
    {
        if(label.getIcon().toString().contains("black"))
        {
            if(Turn.getBackground().equals(new Color(0,204,204)))
            {
                return true;
            }
        }
        else
        {
            if(Turn.getBackground().equals(new Color(255,255,255)))
            {
                return true;
            }
        }
        return false;
    }   
    
    public void detectCoin(JLabel label,JPanel panel)
    {        
        if(lastClickedLabelName==null)
        {
            if(checkStatus(label) == true)
            {
                moves = null;
                String coin = label.getIcon().toString();
                if(coin.endsWith("knight.png"))
                {
                    Knight k = new Knight();
                    moves = k.showMoves(panel);
                    lastClickedLabelName = label.getName();
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel,label.getIcon().toString());
                }
                else if(coin.endsWith("pawn.png"))
                {
                    Pawn p = new Pawn();
                    moves = p.showMoves(panel, label);
                    lastClickedLabelName = label.getName();                
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel,label.getIcon().toString());
                }
                else if(coin.endsWith("rook.png"))
                {
                    Rook r = new Rook();
                    moves = r.showMoves(panel);
                    lastClickedLabelName = label.getName();
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel,label.getIcon().toString());                
                }
                else if(coin.endsWith("bishop.png"))
                {
                    Bishop b = new Bishop();
                    moves = b.showMoves(panel);
                    lastClickedLabelName = label.getName();
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel,label.getIcon().toString());
                }
                else if(coin.endsWith("queen.png"))
                {
                    Queen q = new Queen();
                    moves = q.showMoves(panel);
                    lastClickedLabelName = label.getName();
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel,label.getIcon().toString());                
                }
                else if(coin.endsWith("king.png"))
                {
                    King k = new King();
                    moves = k.showMoves(panel);
                    lastClickedLabelName = label.getName();
                    lastClickedLabel = label;
                    lastColoredPanel = boardColor.setColor(panel, label.getIcon().toString());
                }
            }
        }
        else 
        {          
            String LastClickediconName = lastClickedLabel.getIcon().toString();
                if(LastClickediconName.endsWith("knight.png"))
                {
                    boardColor.removeColor(lastColoredPanel);                
                    for(int i=0;i<moves.length;i++)
                    {
                        if(moves[i]!=null && moves[i].equals(panel.getName()))
                        {
                            String crossField = label.getIcon().toString();
                            if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                            {                                
                                if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                                {
                                    Transform t = new Transform();
                                    t.movePos(lastClickedLabel, label);                                    
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }
                                    toggleTurn();
                                    break;
                                }    
                            }
                            else
                            {
                                Transform t = new Transform();
                                t.movePos(lastClickedLabel, label);
                                toggleTurn();                                  
                                break;
                            }
                        }
                    }
                    lastColoredPanel = null;
                    lastClickedLabelName = null;
                }
                else if(LastClickediconName.endsWith("pawn.png"))
                {
                    boardColor.removeColor(lastColoredPanel);
                    for(int i=0;i<moves.length;i++)
                    {                        
                        if(moves[i]!=null && moves[i].equals(panel.getName()))
                        {
                            ////System.out.println("pawn"+moves[i]+" "+i);
                            String crossField = label.getIcon().toString();
                            if(i>=2)
                            {
                                if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                                {                                
                                   if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                                   {
                                        Transform t = new Transform();
                                        t.movePos(lastClickedLabel, label);  
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }                                        
                                        toggleTurn();
                                        break;
                                   }    
                                }
                            }
                            else
                            {
                                if((crossField.endsWith("white.png")) || (crossField.endsWith("black.png")))
                                {
                                        Transform t = new Transform();
                                        t.movePos(lastClickedLabel, label);
                                        toggleTurn();                                        
                                        break;                                
                                }
                            }
                        }
                    }
                    lastColoredPanel = null;
                    lastClickedLabelName = null;                
                }
                else if(LastClickediconName.endsWith("rook.png"))
                {
                    boardColor.removeColor(lastColoredPanel);
                    if(IntermediateCheckForRowsAndColumns(lastClickedLabel,label)==true)                        
                    {
                        for(int i=0;i<moves.length;i++)
                        {          
                            if(moves[i]!=null && moves[i].equals(panel.getName()))
                            {                            
                                String crossField = label.getIcon().toString();
                                //////System.out.println(crossField+"hei");
                                if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                                {                                
                                    if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                                    {
                                        Transform t = new Transform();
                                        t.movePos(lastClickedLabel, label);
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }                                        
                                        toggleTurn();                                   
                                        break;
                                    }    
                                }
                                else
                                {
                                    Transform t = new Transform();
                                    t.movePos(lastClickedLabel, label);
                                    toggleTurn();                                  
                                    break;
                                }
                            }                                                   
                        }
                    }
                    lastColoredPanel = null;
                    lastClickedLabelName = null;  
                }
                else if(LastClickediconName.endsWith("bishop.png"))
                {
                    boardColor.removeColor(lastColoredPanel);
                    if(IntermediateCheckForDiagonals(lastClickedLabel,label)==true)
                    {
                        for(int i=0;i<moves.length;i++)
                        {                    
                            ////System.out.println("moves"+moves[i]);
                            if(moves[i]!=null && moves[i].equals(panel.getName()))
                            {                        
                                String crossField = label.getIcon().toString();
                                if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                                {                                
                                    if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                                    {
                                        Transform t = new Transform();
                                        t.movePos(lastClickedLabel, label);
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }                                        
                                        toggleTurn();                                         
                                        break;
                                    }    
                                }
                                else
                                {
                                    Transform t = new Transform();
                                    t.movePos(lastClickedLabel, label);
                                    toggleTurn();                                   
                                    break;
                                }
                            }
                        }
                    }
                    lastColoredPanel = null;
                    lastClickedLabelName = null;  
                }
                else if(LastClickediconName.endsWith("queen.png"))
                {
                    boardColor.removeColor(lastColoredPanel);               
                    if(checkQueenPath(lastClickedLabel,label)==true)
                    {
                        for(int i=0;i<moves.length;i++)
                        {                    
                            //////System.out.println("moves"+moves[i]);
                            if(moves[i]!=null && moves[i].equals(panel.getName()))
                            {                        
                                String crossField = label.getIcon().toString();
                                //////System.out.println(crossField+"hei");
                                if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                                {                                
                                    if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                                    {
                                        Transform t = new Transform();
                                        t.movePos(lastClickedLabel, label);
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }                                        
                                        toggleTurn();                                       
                                        break;
                                    }    
                                }
                                else
                                {
                                    Transform t = new Transform();
                                    t.movePos(lastClickedLabel, label);
                                    toggleTurn();                                     
                                    break;
                                }
                            }
                        }                    
                    }                
                    lastColoredPanel = null;
                    lastClickedLabelName = null;
                }
                else if(LastClickediconName.endsWith("king.png"))              
                {                
                boardColor.removeColor(lastColoredPanel);                
                for(int i=0;i<moves.length;i++)
                {                    
                    if(moves[i]!=null && moves[i].equals(panel.getName()))
                    {                        
                        String crossField = label.getIcon().toString();
                        if(!(crossField.endsWith("white.png"))&&!(crossField.endsWith("black.png")))
                        {                                
                            if((LastClickediconName.contains("white") && crossField.contains("black")) || (LastClickediconName.contains("black") && crossField.contains("white")) )
                            {
                                Transform t = new Transform();
                                t.movePos(lastClickedLabel, label);
                                    if(crossField.endsWith("whiteking.png") || crossField.endsWith("blackking.png"))
                                    {
                                        if(Turn.getBackground().equals(new Color(255,255,255)))
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nWHITE WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"GAME OVER!!!!\nBLACK WON", "RESULT", JOptionPane.INFORMATION_MESSAGE);
                                            disableComponents();
                                        }
                                    }                                
                                toggleTurn();
                                break;
                            }    
                        }
                        else
                        {
                            Transform t = new Transform();
                            t.movePos(lastClickedLabel, label);                           
                            toggleTurn();
                            break;
                        }
                    }
                }
                lastColoredPanel = null;
                lastClickedLabelName = null;
            }
        }
    }
    
    public void disableComponents()
    {        
       COMPONENTS = false;
    }
    
    public boolean checkQueenPath(JLabel source, JLabel destination)
    {
      
        String start = source.getName();
        String stop = destination.getName();
        int begin = Integer.parseInt(start.substring(start.length()-2,start.length()));
        int end = Integer.parseInt(stop.substring(stop.length()-2,stop.length()));
        
        if(Math.abs(begin-end)%10==0 ||Math.abs(begin-end)<8)
        {
            return IntermediateCheckForRowsAndColumns(source,destination);
        }
        else
        {
            return IntermediateCheckForDiagonals(source,destination);
        }
    }
    
    public boolean IntermediateCheckForDiagonals(JLabel source,JLabel destination)
    {
        String start = source.getName();
        String stop = destination.getName();
        int begin = Integer.parseInt(start.substring(start.length()-2,start.length()));
        int end = Integer.parseInt(stop.substring(stop.length()-2,stop.length()));
        String path[] = new String[8];
        int size = 0;
        if(Math.abs(begin-end)%11==0)
        {
            if(begin>end)
            {
                for(int i=end+11;i<begin;i=i+11,size++)
                {
                    path[size] = "BOARD"+i;
                }
            }
            else
            {
                for(int i=begin+11;i<end;i=i+11,size++)
                {
                    path[size] = "BOARD"+i;
                }
            }
        }
        else
        {
            if(begin>end)
            {
                for(int i=end+9;i<begin;i=i+9,size++)
                {
                    path[size] = "BOARD"+i;
                }
            }
            else
            {
                for(int i=begin+9;i<end;i=i+9,size++)
                {
                    path[size] = "BOARD"+i;
                }
            }
        }
        
        for(int i=0;i<size;i++)
        {
            if(!(path.equals(null) && path[i]!=null))
            {
                ////System.out.println("path"+path[i]);
                JLabel midLabel = (JLabel)getAllComponents(path[i]);
                String midIcons = midLabel.getIcon().toString();
                if(midIcons.endsWith("white.png")||midIcons.endsWith("black.png"))
                {
                    //ok
                }
                else
                {
                    return false;
                }
            }            
        }
        return true;
    }
    
    public boolean IntermediateCheckForRowsAndColumns(JLabel source,JLabel destination)
    {
        String start = source.getName();
        String stop = destination.getName();
        int begin = Integer.parseInt(start.substring(start.length()-2,start.length()));
        int end = Integer.parseInt(stop.substring(stop.length()-2,stop.length()));
        int blast = begin%10;
        int bfirst = begin/10;
        int elast = end%10;
        int efirst = end/10;
        String path[] = new String[8];

        int size=0;
        if(bfirst == efirst)
        {
            if(blast>elast)
            {
                for(int i=0;i<(blast-elast)-1;i++,size++)
                {
                    path[i] = "BOARD"+bfirst+(blast-(i+1));   
                }                
            }
            else
            {
                for(int i=0;i<(elast-blast)-1;i++,size++)
                {
                    path[i] = "BOARD"+bfirst+(blast+(i+1));
                    ////System.out.println("path"+path[i]);
                }
            }
        }
        else
        {
            if(bfirst>efirst)
            {
                for(int i=0;i<(bfirst-efirst)-1;i++,size++)
                {
                    path[i] = "BOARD"+(bfirst-1)+blast;
                }
            }
            else
            {
                for(int i=0;i<(efirst-bfirst)-1;i++,size++)
                {
                    path[i] = "BOARD"+(bfirst+1)+blast;
                }                
            }
        }

        for(int i=0;i<size;i++)
        {
            if(!(path.equals(null) && path[i]!=null))
            {
                JLabel midLabel = (JLabel)getAllComponents(path[i]);
                String midIcons = midLabel.getIcon().toString();
                if(midIcons.endsWith("white.png")||midIcons.endsWith("black.png"))
                {
                    //ok
                }
                else
                {
                    return false;
                }
            }            
        }
        
        return true;
    }
    
  public JLabel getAllComponents(String labelName)
  {
     for(Component c : allComponents)
     {
         String name = c.getName();
         if(name!=null && name.equals(labelName))
         {
             return (JLabel)c;
         }
     }
     return null;
  }
    
 private  List<Component> getAllComponents(final Container c) {
    Component[] comps = c.getComponents();
    List<Component> compList = new ArrayList<Component>();
    for (Component comp : comps) {
        compList.add(comp);
        if (comp instanceof Container)
            compList.addAll(getAllComponents((Container) comp));
    }
    return compList;
}
    
    private void toggleTurn()
    {
        if(Turn.getBackground().equals(new Color(255, 255, 255)))
        {
            Turn.setBackground(new Color(0,204,204));
        }
        else
        {
            Turn.setBackground(new Color(255,255,255));
        }
    }
    
    private void BOARD81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD81MouseClicked

        ////System.out.println("BOARD81 CLICKED");
        if(COMPONENTS)
             detectCoin(getBOARD81(),getSQUARE81());
    }//GEN-LAST:event_BOARD81MouseClicked

    private void BOARD82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD82MouseClicked

          ////System.out.println("BOARD82 CLICKED");
        if(COMPONENTS)
            detectCoin(getBOARD82(),getSQUARE82());
    }//GEN-LAST:event_BOARD82MouseClicked

    private void BOARD83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD83MouseClicked

          ////System.out.println("BOARD83 CLICKED");     
          if(COMPONENTS)
              detectCoin(getBOARD83(),getSQUARE83());
    }//GEN-LAST:event_BOARD83MouseClicked

    private void BOARD84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD84MouseClicked

          ////System.out.println("BOARD84 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD84(),getSQUARE84());
    }//GEN-LAST:event_BOARD84MouseClicked

    private void BOARD85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD85MouseClicked
          
          ////System.out.println("BOARD85 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD85(),getSQUARE85());
    }//GEN-LAST:event_BOARD85MouseClicked

    private void BOARD86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD86MouseClicked

          ////System.out.println("BOARD86 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD86(),getSQUARE86());
    }//GEN-LAST:event_BOARD86MouseClicked

    private void BOARD87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD87MouseClicked
        
          ////System.out.println("BOARD87 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD87(),getSQUARE87());
    }//GEN-LAST:event_BOARD87MouseClicked

    private void BOARD88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD88MouseClicked

          ////System.out.println("BOARD88 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD88(),getSQUARE88());
    }//GEN-LAST:event_BOARD88MouseClicked

    private void BOARD71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD71MouseClicked

          ////System.out.println("BOARD71 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD71(),getSQUARE71());
    }//GEN-LAST:event_BOARD71MouseClicked

    private void BOARD72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD72MouseClicked

          ////System.out.println("BOARD72 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD72(),getSQUARE72());
    }//GEN-LAST:event_BOARD72MouseClicked

    private void BOARD73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD73MouseClicked

          ////System.out.println("BOARD73 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD73(),getSQUARE73());
    }//GEN-LAST:event_BOARD73MouseClicked

    private void BOARD74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD74MouseClicked

          ////System.out.println("BOARD74 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD74(),getSQUARE74());
    }//GEN-LAST:event_BOARD74MouseClicked

    private void BOARD75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD75MouseClicked

          ////System.out.println("BOARD75 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD75(),getSQUARE75());
    }//GEN-LAST:event_BOARD75MouseClicked

    private void BOARD76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD76MouseClicked

          ////System.out.println("BOARD76 CLICKED");
          if(COMPONENTS)detectCoin(getBOARD76(),getSQUARE76());
    }//GEN-LAST:event_BOARD76MouseClicked

    private void BOARD77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD77MouseClicked

          ////System.out.println("BOARD77 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD77(),getSQUARE77());
    }//GEN-LAST:event_BOARD77MouseClicked

    private void BOARD78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD78MouseClicked

          ////System.out.println("BOARD78 CLICKED");
          if(COMPONENTS)
              detectCoin(getBOARD78(),getSQUARE78());
    }//GEN-LAST:event_BOARD78MouseClicked

    private void BOARD61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD61MouseClicked

          ////System.out.println("BOARD61 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD61(),getSQUARE61());
    }//GEN-LAST:event_BOARD61MouseClicked

    private void BOARD62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD62MouseClicked

          ////System.out.println("BOARD62 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD62(),getSQUARE62());
    }//GEN-LAST:event_BOARD62MouseClicked

    private void BOARD63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD63MouseClicked
 
          ////System.out.println("BOARD63 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD63(),getSQUARE63());
    }//GEN-LAST:event_BOARD63MouseClicked

    private void BOARD64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD64MouseClicked

          ////System.out.println("BOARD64 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD64(),getSQUARE64());
    }//GEN-LAST:event_BOARD64MouseClicked

    private void BOARD65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD65MouseClicked

          ////System.out.println("BOARD65 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD65(),getSQUARE65());
    }//GEN-LAST:event_BOARD65MouseClicked

    private void BOARD66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD66MouseClicked

          ////System.out.println("BOARD66 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD66(),getSQUARE66());
    }//GEN-LAST:event_BOARD66MouseClicked

    private void BOARD67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD67MouseClicked

          ////System.out.println("BOARD67 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD67(),getSQUARE67());
    }//GEN-LAST:event_BOARD67MouseClicked

    private void BOARD68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD68MouseClicked

          ////System.out.println("BOARD68 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD68(),getSQUARE68());
    }//GEN-LAST:event_BOARD68MouseClicked

    private void BOARD51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD51MouseClicked

          ////System.out.println("BOARD51 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD51(),getSQUARE51());
    }//GEN-LAST:event_BOARD51MouseClicked

    private void BOARD52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD52MouseClicked

          ////System.out.println("BOARD52 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD52(),getSQUARE52());
    }//GEN-LAST:event_BOARD52MouseClicked

    private void BOARD53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD53MouseClicked

          ////System.out.println("BOARD53 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD53(),getSQUARE53());
    }//GEN-LAST:event_BOARD53MouseClicked

    private void BOARD54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD54MouseClicked

          ////System.out.println("BOARD54 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD54(),getSQUARE54());
    }//GEN-LAST:event_BOARD54MouseClicked

    private void BOARD55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD55MouseClicked

          ////System.out.println("BOARD55 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD55(),getSQUARE55());
    }//GEN-LAST:event_BOARD55MouseClicked

    private void BOARD56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD56MouseClicked

          ////System.out.println("BOARD56 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD56(),getSQUARE56());       
    }//GEN-LAST:event_BOARD56MouseClicked

    private void BOARD57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD57MouseClicked

          ////System.out.println("BOARD57 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD57(),getSQUARE57());
    }//GEN-LAST:event_BOARD57MouseClicked

    private void BOARD58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD58MouseClicked

          ////System.out.println("BOARD58 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD58(),getSQUARE58());
    }//GEN-LAST:event_BOARD58MouseClicked

    private void BOARD48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD48MouseClicked

          ////System.out.println("BOARD48 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD48(),getSQUARE48());
    }//GEN-LAST:event_BOARD48MouseClicked

    private void BOARD47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD47MouseClicked

          ////System.out.println("BOARD47 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD47(),getSQUARE47());
    }//GEN-LAST:event_BOARD47MouseClicked

    private void BOARD46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD46MouseClicked

          ////System.out.println("BOARD46 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD46(),getSQUARE46());
    }//GEN-LAST:event_BOARD46MouseClicked

    private void BOARD45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD45MouseClicked

          ////System.out.println("BOARD45 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD45(),getSQUARE45());
    }//GEN-LAST:event_BOARD45MouseClicked

    private void BOARD44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD44MouseClicked

          ////System.out.println("BOARD44 CLICKED"); 
          if(COMPONENTS)
              detectCoin(getBOARD44(),getSQUARE44());
    }//GEN-LAST:event_BOARD44MouseClicked

    private void BOARD43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD43MouseClicked

          ////System.out.println("BOARD43 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD43(),getSQUARE43());
    }//GEN-LAST:event_BOARD43MouseClicked

    private void BOARD42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD42MouseClicked

          ////System.out.println("BOARD42 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD42(),getSQUARE42());
    }//GEN-LAST:event_BOARD42MouseClicked

    private void BOARD41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD41MouseClicked

          //System.out.println("BOARD41 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD41(),getSQUARE41());
    }//GEN-LAST:event_BOARD41MouseClicked

    private void BOARD31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD31MouseClicked

          //System.out.println("BOARD31 CLICKED");       
          if(COMPONENTS)
              detectCoin(getBOARD31(),getSQUARE31());
    }//GEN-LAST:event_BOARD31MouseClicked

    private void BOARD32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD32MouseClicked

          //System.out.println("BOARD32 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD32(),getSQUARE32());
    }//GEN-LAST:event_BOARD32MouseClicked

    private void BOARD33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD33MouseClicked

          //System.out.println("BOARD33 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD33(),getSQUARE33());
    }//GEN-LAST:event_BOARD33MouseClicked

    private void BOARD34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD34MouseClicked

          //System.out.println("BOARD34 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD34(),getSQUARE34());
    }//GEN-LAST:event_BOARD34MouseClicked

    private void BOARD35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD35MouseClicked

          //System.out.println("BOARD35 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD35(),getSQUARE35());
    }//GEN-LAST:event_BOARD35MouseClicked

    private void BOARD36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD36MouseClicked

          //System.out.println("BOARD36 CLICKED");       
          if(COMPONENTS)
              detectCoin(getBOARD36(),getSQUARE36());
    }//GEN-LAST:event_BOARD36MouseClicked

    private void BOARD37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD37MouseClicked

          //System.out.println("BOARD37 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD37(),getSQUARE37());
    }//GEN-LAST:event_BOARD37MouseClicked

    private void BOARD38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD38MouseClicked

          //System.out.println("BOARD38 CLICKED");      
          if(COMPONENTS)
              detectCoin(getBOARD38(),getSQUARE38());
    }//GEN-LAST:event_BOARD38MouseClicked

    private void BOARD28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD28MouseClicked

          //System.out.println("BOARD28 CLICKED");       
          if(COMPONENTS)
              detectCoin(getBOARD28(),getSQUARE28());
    }//GEN-LAST:event_BOARD28MouseClicked

    private void BOARD27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD27MouseClicked

          //System.out.println("BOARD27 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD27(),getSQUARE27());
    }//GEN-LAST:event_BOARD27MouseClicked

    private void BOARD26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD26MouseClicked

          //System.out.println("BOARD26 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD26(),getSQUARE26());
    }//GEN-LAST:event_BOARD26MouseClicked

    private void BOARD25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD25MouseClicked

          //System.out.println("BOARD25 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD25(),getSQUARE25());
    }//GEN-LAST:event_BOARD25MouseClicked

    private void BOARD24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD24MouseClicked

          //System.out.println("BOARD24 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD24(),getSQUARE24());
    }//GEN-LAST:event_BOARD24MouseClicked

    private void BOARD23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD23MouseClicked

          //System.out.println("BOARD23 CLICKED");       
          if(COMPONENTS)
              detectCoin(getBOARD23(),getSQUARE23());
    }//GEN-LAST:event_BOARD23MouseClicked

    private void BOARD22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD22MouseClicked

          //System.out.println("BOARD22 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD22(),getSQUARE22());
    }//GEN-LAST:event_BOARD22MouseClicked

    private void BOARD21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD21MouseClicked

          //System.out.println("BOARD21 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD21(),getSQUARE21());
    }//GEN-LAST:event_BOARD21MouseClicked

    private void BOARD11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD11MouseClicked

          //System.out.println("BOARD11 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD11(),getSQUARE11());
    }//GEN-LAST:event_BOARD11MouseClicked

    private void BOARD12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD12MouseClicked

          //System.out.println("BOARD12 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD12(),getSQUARE12());
    }//GEN-LAST:event_BOARD12MouseClicked

    private void BOARD13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD13MouseClicked

          //System.out.println("BOARD13 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD13(),getSQUARE13());
    }//GEN-LAST:event_BOARD13MouseClicked

    private void BOARD14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD14MouseClicked

          //System.out.println("BOARD14 CLICKED");       
          if(COMPONENTS)
              detectCoin(getBOARD14(),getSQUARE14());
    }//GEN-LAST:event_BOARD14MouseClicked

    private void BOARD15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD15MouseClicked

          //System.out.println("BOARD15 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD15(),getSQUARE15());
    }//GEN-LAST:event_BOARD15MouseClicked

    private void BOARD16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD16MouseClicked

          //System.out.println("BOARD16 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD16(),getSQUARE16());
    }//GEN-LAST:event_BOARD16MouseClicked

    private void BOARD17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD17MouseClicked

          //System.out.println("BOARD17 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD17(),getSQUARE17());
    }//GEN-LAST:event_BOARD17MouseClicked

    private void BOARD18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOARD18MouseClicked

          //System.out.println("BOARD18 CLICKED");        
          if(COMPONENTS)
              detectCoin(getBOARD18(),getSQUARE18());
    }//GEN-LAST:event_BOARD18MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOARD11;
    private javax.swing.JLabel BOARD12;
    private javax.swing.JLabel BOARD13;
    private javax.swing.JLabel BOARD14;
    private javax.swing.JLabel BOARD15;
    private javax.swing.JLabel BOARD16;
    private javax.swing.JLabel BOARD17;
    private javax.swing.JLabel BOARD18;
    private javax.swing.JLabel BOARD21;
    private javax.swing.JLabel BOARD22;
    private javax.swing.JLabel BOARD23;
    private javax.swing.JLabel BOARD24;
    private javax.swing.JLabel BOARD25;
    private javax.swing.JLabel BOARD26;
    private javax.swing.JLabel BOARD27;
    private javax.swing.JLabel BOARD28;
    private javax.swing.JLabel BOARD31;
    private javax.swing.JLabel BOARD32;
    private javax.swing.JLabel BOARD33;
    private javax.swing.JLabel BOARD34;
    private javax.swing.JLabel BOARD35;
    private javax.swing.JLabel BOARD36;
    private javax.swing.JLabel BOARD37;
    private javax.swing.JLabel BOARD38;
    private javax.swing.JLabel BOARD41;
    private javax.swing.JLabel BOARD42;
    private javax.swing.JLabel BOARD43;
    private javax.swing.JLabel BOARD44;
    private javax.swing.JLabel BOARD45;
    private javax.swing.JLabel BOARD46;
    private javax.swing.JLabel BOARD47;
    private javax.swing.JLabel BOARD48;
    private javax.swing.JLabel BOARD51;
    private javax.swing.JLabel BOARD52;
    private javax.swing.JLabel BOARD53;
    private javax.swing.JLabel BOARD54;
    private javax.swing.JLabel BOARD55;
    private javax.swing.JLabel BOARD56;
    private javax.swing.JLabel BOARD57;
    private javax.swing.JLabel BOARD58;
    private javax.swing.JLabel BOARD61;
    private javax.swing.JLabel BOARD62;
    private javax.swing.JLabel BOARD63;
    private javax.swing.JLabel BOARD64;
    private javax.swing.JLabel BOARD65;
    private javax.swing.JLabel BOARD66;
    private javax.swing.JLabel BOARD67;
    private javax.swing.JLabel BOARD68;
    private javax.swing.JLabel BOARD71;
    private javax.swing.JLabel BOARD72;
    private javax.swing.JLabel BOARD73;
    private javax.swing.JLabel BOARD74;
    private javax.swing.JLabel BOARD75;
    private javax.swing.JLabel BOARD76;
    private javax.swing.JLabel BOARD77;
    private javax.swing.JLabel BOARD78;
    private javax.swing.JLabel BOARD81;
    private javax.swing.JLabel BOARD82;
    private javax.swing.JLabel BOARD83;
    private javax.swing.JLabel BOARD84;
    private javax.swing.JLabel BOARD85;
    private javax.swing.JLabel BOARD86;
    private javax.swing.JLabel BOARD87;
    private javax.swing.JLabel BOARD88;
    private javax.swing.JPanel SQUARE11;
    private javax.swing.JPanel SQUARE12;
    private javax.swing.JPanel SQUARE13;
    private javax.swing.JPanel SQUARE14;
    private javax.swing.JPanel SQUARE15;
    private javax.swing.JPanel SQUARE16;
    private javax.swing.JPanel SQUARE17;
    private javax.swing.JPanel SQUARE18;
    private javax.swing.JPanel SQUARE21;
    private javax.swing.JPanel SQUARE22;
    private javax.swing.JPanel SQUARE23;
    private javax.swing.JPanel SQUARE24;
    private javax.swing.JPanel SQUARE25;
    private javax.swing.JPanel SQUARE26;
    private javax.swing.JPanel SQUARE27;
    private javax.swing.JPanel SQUARE28;
    private javax.swing.JPanel SQUARE31;
    private javax.swing.JPanel SQUARE32;
    private javax.swing.JPanel SQUARE33;
    private javax.swing.JPanel SQUARE34;
    private javax.swing.JPanel SQUARE35;
    private javax.swing.JPanel SQUARE36;
    private javax.swing.JPanel SQUARE37;
    private javax.swing.JPanel SQUARE38;
    private javax.swing.JPanel SQUARE41;
    private javax.swing.JPanel SQUARE42;
    private javax.swing.JPanel SQUARE43;
    private javax.swing.JPanel SQUARE44;
    private javax.swing.JPanel SQUARE45;
    private javax.swing.JPanel SQUARE46;
    private javax.swing.JPanel SQUARE47;
    private javax.swing.JPanel SQUARE48;
    private javax.swing.JPanel SQUARE51;
    private javax.swing.JPanel SQUARE52;
    private javax.swing.JPanel SQUARE53;
    private javax.swing.JPanel SQUARE54;
    private javax.swing.JPanel SQUARE55;
    private javax.swing.JPanel SQUARE56;
    private javax.swing.JPanel SQUARE57;
    private javax.swing.JPanel SQUARE58;
    private javax.swing.JPanel SQUARE61;
    private javax.swing.JPanel SQUARE62;
    private javax.swing.JPanel SQUARE63;
    private javax.swing.JPanel SQUARE64;
    private javax.swing.JPanel SQUARE65;
    private javax.swing.JPanel SQUARE66;
    private javax.swing.JPanel SQUARE67;
    private javax.swing.JPanel SQUARE68;
    private javax.swing.JPanel SQUARE71;
    private javax.swing.JPanel SQUARE72;
    private javax.swing.JPanel SQUARE73;
    private javax.swing.JPanel SQUARE74;
    private javax.swing.JPanel SQUARE75;
    private javax.swing.JPanel SQUARE76;
    private javax.swing.JPanel SQUARE77;
    private javax.swing.JPanel SQUARE78;
    private javax.swing.JPanel SQUARE81;
    private javax.swing.JPanel SQUARE82;
    private javax.swing.JPanel SQUARE83;
    private javax.swing.JPanel SQUARE84;
    private javax.swing.JPanel SQUARE85;
    private javax.swing.JPanel SQUARE86;
    private javax.swing.JPanel SQUARE87;
    private javax.swing.JPanel SQUARE88;
    private javax.swing.JPanel Turn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel72;
    // End of variables declaration//GEN-END:variables
}
