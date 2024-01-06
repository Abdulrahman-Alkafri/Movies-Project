
package moviesproject;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hall_2 extends javax.swing.JFrame {

    public Hall_2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        matrix = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fightclub = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        godfather = new javax.swing.JLabel();
        showtime1 = new javax.swing.JLabel();
        showtime2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        leon = new javax.swing.JLabel();
        showtime3 = new javax.swing.JLabel();
        showtime4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        batman = new javax.swing.JLabel();
        showtime5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTION SECTION");
        setBounds(new java.awt.Rectangle(450, 50, 0, 0));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setAutoscrolls(true);

        matrix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/thematrix.jpg"))); // NOI18N
        matrix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        matrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matrixMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(matrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(matrix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fightclub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/fightclub.jpg"))); // NOI18N
        fightclub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fightclub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fightclubMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fightclub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fightclub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        godfather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/godfather.jpg"))); // NOI18N
        godfather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godfather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                godfatherMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(godfather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(godfather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime1.setForeground(new java.awt.Color(255, 255, 255));
        showtime1.setText("Show Time : 13:00");

        showtime2.setBackground(new java.awt.Color(255, 255, 255));
        showtime2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime2.setForeground(new java.awt.Color(255, 255, 255));
        showtime2.setText("Show Time : 15:00");

        leon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/leon.jpg"))); // NOI18N
        leon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leon, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime3.setForeground(new java.awt.Color(255, 255, 255));
        showtime3.setText("Show Time : 17:00");

        showtime4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime4.setForeground(new java.awt.Color(255, 255, 255));
        showtime4.setText("Show Time : 19:00");

        batman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/thedarkknight.jpg"))); // NOI18N
        batman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batmanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(batman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(batman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime5.setForeground(new java.awt.Color(255, 255, 255));
        showtime5.setText("Show Time :  21:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(showtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(showtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(showtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(showtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(showtime5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showtime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showtime3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showtime5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matrixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matrixMouseClicked
        // TODO add your handling code here:
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
    }//GEN-LAST:event_matrixMouseClicked

    private void fightclubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fightclubMouseClicked
        // TODO add your handling code here:
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
    }//GEN-LAST:event_fightclubMouseClicked

    private void godfatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godfatherMouseClicked
        // TODO add your handling code here:
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
    }//GEN-LAST:event_godfatherMouseClicked

    private void leonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leonMouseClicked
        // TODO add your handling code here:
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
    }//GEN-LAST:event_leonMouseClicked

    private void batmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batmanMouseClicked
        // TODO add your handling code here:
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
    }//GEN-LAST:event_batmanMouseClicked
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hall_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batman;
    private javax.swing.JLabel fightclub;
    private javax.swing.JLabel godfather;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel leon;
    private javax.swing.JLabel matrix;
    private javax.swing.JLabel showtime1;
    private javax.swing.JLabel showtime2;
    private javax.swing.JLabel showtime3;
    private javax.swing.JLabel showtime4;
    private javax.swing.JLabel showtime5;
    // End of variables declaration//GEN-END:variables
}
