
package moviesproject;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hall_5 extends javax.swing.JFrame {

    public Hall_5() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        aquaman = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        intersteller = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        predestination = new javax.swing.JLabel();
        showtime1 = new javax.swing.JLabel();
        showtime2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tenet = new javax.swing.JLabel();
        showtime3 = new javax.swing.JLabel();
        showtime4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        godzilla = new javax.swing.JLabel();
        showtime5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SCIENTIFIC FICTION SECTION");
        setBounds(new java.awt.Rectangle(450, 50, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        aquaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/aquaman.jpg"))); // NOI18N
        aquaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aquaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquamanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aquaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aquaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        intersteller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/intersteller.jpg"))); // NOI18N
        intersteller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        intersteller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                interstellerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intersteller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intersteller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        predestination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/predestination.jpg"))); // NOI18N
        predestination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        predestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                predestinationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(predestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(predestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime1.setBackground(new java.awt.Color(255, 255, 255));
        showtime1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime1.setText("Show Time : 13:00");

        showtime2.setBackground(new java.awt.Color(255, 255, 255));
        showtime2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime2.setText("Show Time : 15:00");

        tenet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/tenet.jpg"))); // NOI18N
        tenet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tenet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tenet, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tenet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime3.setBackground(new java.awt.Color(255, 255, 255));
        showtime3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime3.setText("Show Time : 17:00");

        showtime4.setBackground(new java.awt.Color(255, 255, 255));
        showtime4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        showtime4.setText("Show Time : 19:00");

        godzilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/5.jpg"))); // NOI18N
        godzilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godzilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                godzillaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(godzilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(godzilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showtime5.setBackground(new java.awt.Color(255, 255, 255));
        showtime5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
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
                        .addGap(0, 9, Short.MAX_VALUE))
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
                .addGap(18, 18, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void aquamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquamanMouseClicked
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
    }//GEN-LAST:event_aquamanMouseClicked

    private void interstellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interstellerMouseClicked
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
    }//GEN-LAST:event_interstellerMouseClicked

    private void predestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_predestinationMouseClicked
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
    }//GEN-LAST:event_predestinationMouseClicked

    private void tenetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenetMouseClicked
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
    }//GEN-LAST:event_tenetMouseClicked

    private void godzillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godzillaMouseClicked
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
    }//GEN-LAST:event_godzillaMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hall_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aquaman;
    private javax.swing.JLabel godzilla;
    private javax.swing.JLabel intersteller;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel predestination;
    private javax.swing.JLabel showtime1;
    private javax.swing.JLabel showtime2;
    private javax.swing.JLabel showtime3;
    private javax.swing.JLabel showtime4;
    private javax.swing.JLabel showtime5;
    private javax.swing.JLabel tenet;
    // End of variables declaration//GEN-END:variables
}
