package moviesproject;

import java.awt.*;
import javax.swing.*;

public class MoviesProject extends javax.swing.JFrame {
    public MoviesProject() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SectionPanal1 = new javax.swing.JPanel();
        TitleOfMostPopular = new javax.swing.JLabel();
        imagePanal1 = new javax.swing.JPanel();
        godfather = new javax.swing.JLabel();
        MovieName1 = new javax.swing.JLabel();
        MovieType1 = new javax.swing.JLabel();
        imagePanal2 = new javax.swing.JPanel();
        monsterinc = new javax.swing.JLabel();
        MovieName2 = new javax.swing.JLabel();
        MovieType2 = new javax.swing.JLabel();
        imagePanal3 = new javax.swing.JPanel();
        godzilla = new javax.swing.JLabel();
        MovieName3 = new javax.swing.JLabel();
        MovieType3 = new javax.swing.JLabel();
        imagePanal4 = new javax.swing.JPanel();
        homealone = new javax.swing.JLabel();
        MovieName4 = new javax.swing.JLabel();
        MovieType4 = new javax.swing.JLabel();
        RateUs = new javax.swing.JButton();
        SectionPanal2 = new javax.swing.JPanel();
        HallOfMovies = new javax.swing.JLabel();
        chossingLabel = new javax.swing.JLabel();
        Hall_1btn = new javax.swing.JButton();
        Hall_2btn = new javax.swing.JButton();
        Hall_3btn = new javax.swing.JButton();
        Hall_4btn = new javax.swing.JButton();
        Hall_5btn = new javax.swing.JButton();
        SectionPanal3 = new javax.swing.JPanel();
        ViewTicketsBtn = new javax.swing.JButton();
        BookingBtn = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        AddMovie = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        MyAccount1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOKING SYSTEM");
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(50, 30, 1400, 900));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1460, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1380, 900));

        SectionPanal1.setBackground(java.awt.Color.black);
        SectionPanal1.setAutoscrolls(true);
        SectionPanal1.setPreferredSize(new java.awt.Dimension(350, 600));

        TitleOfMostPopular.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        TitleOfMostPopular.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        TitleOfMostPopular.setForeground(new java.awt.Color(255, 255, 255));
        TitleOfMostPopular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleOfMostPopular.setText("Most Popular Movies :");

        imagePanal1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        imagePanal1.setPreferredSize(new java.awt.Dimension(225, 225));

        godfather.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        godfather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/godfather.jpg"))); // NOI18N
        godfather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godfather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                godfatherMouseClicked(evt);
            }
        });

        MovieName1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieName1.setForeground(new java.awt.Color(255, 255, 255));
        MovieName1.setText("Movie Name: THE GODFATHER");

        MovieType1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        MovieType1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieType1.setForeground(new java.awt.Color(255, 255, 255));
        MovieType1.setText("Movie Type : ACTION");

        javax.swing.GroupLayout imagePanal1Layout = new javax.swing.GroupLayout(imagePanal1);
        imagePanal1.setLayout(imagePanal1Layout);
        imagePanal1Layout.setHorizontalGroup(
            imagePanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(imagePanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MovieType1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MovieName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(imagePanal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(godfather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagePanal1Layout.setVerticalGroup(
            imagePanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(godfather, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MovieName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieType1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanal2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        imagePanal2.setPreferredSize(new java.awt.Dimension(225, 225));

        monsterinc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monsterinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/Monsterinc.jpg"))); // NOI18N
        monsterinc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monsterinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monsterincMouseClicked(evt);
            }
        });

        MovieName2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieName2.setForeground(new java.awt.Color(255, 255, 255));
        MovieName2.setText("Movie Name: MONSTER INC");

        MovieType2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieType2.setForeground(new java.awt.Color(255, 255, 255));
        MovieType2.setText("Movie Type : ANIMATION");

        javax.swing.GroupLayout imagePanal2Layout = new javax.swing.GroupLayout(imagePanal2);
        imagePanal2.setLayout(imagePanal2Layout);
        imagePanal2Layout.setHorizontalGroup(
            imagePanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(imagePanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MovieType2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MovieName2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(imagePanal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterinc, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
        );
        imagePanal2Layout.setVerticalGroup(
            imagePanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterinc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MovieName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieType2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanal3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        imagePanal3.setPreferredSize(new java.awt.Dimension(225, 225));

        godzilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        godzilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/5.jpg"))); // NOI18N
        godzilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godzilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                godzillaMouseClicked(evt);
            }
        });

        MovieName3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieName3.setForeground(new java.awt.Color(255, 255, 255));
        MovieName3.setText("Movie Name: GODzilla");

        MovieType3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieType3.setForeground(new java.awt.Color(255, 255, 255));
        MovieType3.setText("Movie Type : SCI-FI");

        javax.swing.GroupLayout imagePanal3Layout = new javax.swing.GroupLayout(imagePanal3);
        imagePanal3.setLayout(imagePanal3Layout);
        imagePanal3Layout.setHorizontalGroup(
            imagePanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(godzilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(imagePanal3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(imagePanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MovieType3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MovieName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanal3Layout.setVerticalGroup(
            imagePanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(godzilla)
                .addGap(18, 18, 18)
                .addComponent(MovieName3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieType3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanal4.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        imagePanal4.setPreferredSize(new java.awt.Dimension(225, 225));

        homealone.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        homealone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homealone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesproject/images/homealone.jpg"))); // NOI18N
        homealone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homealone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homealoneMouseClicked(evt);
            }
        });

        MovieName4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieName4.setForeground(new java.awt.Color(255, 255, 255));
        MovieName4.setText("Movie Name: HOME ALONE");

        MovieType4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        MovieType4.setForeground(new java.awt.Color(255, 255, 255));
        MovieType4.setText("Movie Type : COMEDY");

        javax.swing.GroupLayout imagePanal4Layout = new javax.swing.GroupLayout(imagePanal4);
        imagePanal4.setLayout(imagePanal4Layout);
        imagePanal4Layout.setHorizontalGroup(
            imagePanal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homealone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(imagePanal4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(imagePanal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MovieType4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MovieName4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanal4Layout.setVerticalGroup(
            imagePanal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanal4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homealone, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MovieName4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieType4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RateUs.setBackground(java.awt.Color.red);
        RateUs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RateUs.setText("Rate Us");
        RateUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RateUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RateUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RateUsMouseExited(evt);
            }
        });
        RateUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SectionPanal1Layout = new javax.swing.GroupLayout(SectionPanal1);
        SectionPanal1.setLayout(SectionPanal1Layout);
        SectionPanal1Layout.setHorizontalGroup(
            SectionPanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal1Layout.createSequentialGroup()
                .addGroup(SectionPanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SectionPanal1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TitleOfMostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SectionPanal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagePanal1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(imagePanal2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SectionPanal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagePanal3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(imagePanal4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SectionPanal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RateUs, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        SectionPanal1Layout.setVerticalGroup(
            SectionPanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TitleOfMostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SectionPanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagePanal1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanal2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SectionPanal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanal4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanal3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(RateUs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanal1.getAccessibleContext().setAccessibleName("");

        SectionPanal2.setBackground(java.awt.Color.black);

        HallOfMovies.setBackground(java.awt.SystemColor.menuText);
        HallOfMovies.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        HallOfMovies.setForeground(new java.awt.Color(255, 255, 255));
        HallOfMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HallOfMovies.setText("Halls Of Movie");

        chossingLabel.setBackground(new java.awt.Color(0, 0, 0));
        chossingLabel.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        chossingLabel.setForeground(new java.awt.Color(255, 255, 255));
        chossingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chossingLabel.setText("Choose Hall:");

        Hall_1btn.setBackground(new java.awt.Color(0, 0, 0));
        Hall_1btn.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Hall_1btn.setForeground(new java.awt.Color(255, 255, 255));
        Hall_1btn.setText("ANIMATION");
        Hall_1btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hall_1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hall_1btnActionPerformed(evt);
            }
        });

        Hall_2btn.setBackground(new java.awt.Color(0, 0, 0));
        Hall_2btn.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Hall_2btn.setForeground(new java.awt.Color(255, 255, 255));
        Hall_2btn.setText("ACTION");
        Hall_2btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hall_2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hall_2btnActionPerformed(evt);
            }
        });

        Hall_3btn.setBackground(new java.awt.Color(0, 0, 0));
        Hall_3btn.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Hall_3btn.setForeground(new java.awt.Color(255, 255, 255));
        Hall_3btn.setText("HORROR");
        Hall_3btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hall_3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hall_3btnActionPerformed(evt);
            }
        });

        Hall_4btn.setBackground(new java.awt.Color(0, 0, 0));
        Hall_4btn.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Hall_4btn.setForeground(new java.awt.Color(255, 255, 255));
        Hall_4btn.setText("COMEDY");
        Hall_4btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hall_4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hall_4btnActionPerformed(evt);
            }
        });

        Hall_5btn.setBackground(new java.awt.Color(0, 0, 0));
        Hall_5btn.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Hall_5btn.setForeground(new java.awt.Color(255, 255, 255));
        Hall_5btn.setText("SCI-FI");
        Hall_5btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hall_5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hall_5btnActionPerformed(evt);
            }
        });

        SectionPanal3.setBackground(java.awt.Color.black);
        SectionPanal3.setAutoscrolls(true);
        SectionPanal3.setPreferredSize(new java.awt.Dimension(300, 200));

        ViewTicketsBtn.setBackground(java.awt.SystemColor.infoText);
        ViewTicketsBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewTicketsBtn.setText("Your Reservation's");
        ViewTicketsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewTicketsBtn.setFocusPainted(false);
        ViewTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTicketsBtnActionPerformed(evt);
            }
        });

        BookingBtn.setBackground(java.awt.SystemColor.infoText);
        BookingBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BookingBtn.setForeground(new java.awt.Color(255, 255, 255));
        BookingBtn.setText("Book A Ticket");
        BookingBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookingBtn.setFocusPainted(false);
        BookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingBtnActionPerformed(evt);
            }
        });

        delete.setBackground(java.awt.SystemColor.infoText);
        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete A Ticket");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        AddMovie.setBackground(java.awt.SystemColor.infoText);
        AddMovie.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        AddMovie.setForeground(new java.awt.Color(255, 255, 255));
        AddMovie.setText("+");
        AddMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieActionPerformed(evt);
            }
        });

        Register.setBackground(java.awt.SystemColor.infoText);
        Register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("Register");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Logout.setBackground(java.awt.SystemColor.infoText);
        Logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        MyAccount1.setBackground(java.awt.SystemColor.infoText);
        MyAccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MyAccount1.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount1.setText("My Account");
        MyAccount1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SectionPanal3Layout = new javax.swing.GroupLayout(SectionPanal3);
        SectionPanal3.setLayout(SectionPanal3Layout);
        SectionPanal3Layout.setHorizontalGroup(
            SectionPanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(SectionPanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MyAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SectionPanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BookingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(ViewTicketsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        SectionPanal3Layout.setVerticalGroup(
            SectionPanal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MyAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SectionPanal2Layout = new javax.swing.GroupLayout(SectionPanal2);
        SectionPanal2.setLayout(SectionPanal2Layout);
        SectionPanal2Layout.setHorizontalGroup(
            SectionPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SectionPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hall_3btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chossingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hall_4btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hall_2btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hall_1btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hall_5btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HallOfMovies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SectionPanal3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SectionPanal2Layout.setVerticalGroup(
            SectionPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SectionPanal2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SectionPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SectionPanal3, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SectionPanal2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(HallOfMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(chossingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Hall_1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Hall_2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Hall_3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Hall_4btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Hall_5btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SectionPanal1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SectionPanal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SectionPanal1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
            .addComponent(SectionPanal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTicketsBtnActionPerformed
        // TODO add your handling code here:
        try{
        Reservations reservations = new Reservations();
        reservations.setVisible(true);
        reservations.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "You Have not Booked Yet!");
        }
    }//GEN-LAST:event_ViewTicketsBtnActionPerformed

    private void Hall_5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hall_5btnActionPerformed
        Hall_5 hall1Frame = new Hall_5();
        hall1Frame.setVisible(true);
    }//GEN-LAST:event_Hall_5btnActionPerformed

    private void Hall_4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hall_4btnActionPerformed
        Hall_4 hall1Frame = new Hall_4();
        hall1Frame.setVisible(true);
    }//GEN-LAST:event_Hall_4btnActionPerformed

    private void Hall_3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hall_3btnActionPerformed
        Hall_3 hall1Frame = new Hall_3();
        hall1Frame.setVisible(true);
    }//GEN-LAST:event_Hall_3btnActionPerformed

    private void Hall_2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hall_2btnActionPerformed
        Hall_2 hall1Frame = new Hall_2();
        hall1Frame.setVisible(true);
    }//GEN-LAST:event_Hall_2btnActionPerformed

    private void Hall_1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hall_1btnActionPerformed
        Hall_1 hall1Frame = new Hall_1();
        hall1Frame.setVisible(true);

    }//GEN-LAST:event_Hall_1btnActionPerformed

    private void BookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingBtnActionPerformed
        
        Ticketing t = new Ticketing();
        t.setSize(800,500);
        t.setLayout(null);
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0, 0, 800, 500);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.add(Background);
        t.setVisible(true);
        
    }//GEN-LAST:event_BookingBtnActionPerformed

    private void godfatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godfatherMouseClicked
        // TODO add your handling code here:
        JFrame information = new JFrame("Information");
        information.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        information.setBounds(450,50,700,500);
        JTextArea info = new JTextArea();
        info.setFont(new Font("Verdana",Font.BOLD,12));
        JScrollPane scroll = new JScrollPane(info);
        info.append("The Godfather is a 1972 American epic crime drama film[2] directed by Francis Ford Coppola, who co-wrote the screenplay with Mario Puzo, based on Puzo's best-selling 1969 novel of the same title. The film stars Marlon Brando, Al Pacino, James Caan, Richard Castellano, Robert Duvall, Sterling Hayden, John Marley, Richard Conte and Diane Keaton. It is the first installment in The Godfather trilogy, chronicling the Corleone family under patriarch Vito Corleone (Brando) from 1945 to 1955. It focuses on the transformation of his youngest son, Michael Corleone (Pacino), from reluctant family outsider to ruthless mafia boss.\n" +
"\n" +
"Paramount Pictures obtained the rights to the novel for $80,000, before it gained popularity.[3][4] Studio executives had trouble finding a director; the first few candidates turned down the position before Coppola signed on to direct the film but disagreement followed over casting several characters, in particular, Vito (Marlon Brando) and Michael (Al Pacino). Filming took place primarily on location around New York City and in Sicily, and was completed ahead of schedule. The musical score was composed principally by Nino Rota, with additional pieces by Carmine Coppola.\n" +
"\n" +
"The Godfather premiered at the Loew's State Theatre on March 14, 1972, and was widely released in the United States on March 24, 1972. It was the highest-grossing film of 1972, and was for a time the highest-grossing film ever made, earning between $250 and $291 million at the box office. The film was acclaimed by critics and audiences, who praised its performances—particularly those of Brando and Pacino—direction, screenplay, writing, story, cinematography, editing, score, and portrayal of the mafia. The Godfather launched the successful careers of Coppola, Pacino, and other relative newcomers in the cast and crew. At the 45th Academy Awards, the film won Best Picture, Best Actor (Brando), and Best Adapted Screenplay (for Puzo and Coppola). In addition, the seven other Oscar nominations included Pacino, Caan, and Duvall all for Best Supporting Actor, and Coppola for Best Director.\n" +
"\n" +
"The Godfather is regarded as one of the greatest and most influential films ever made, as well as a landmark of the gangster genre.[5] It was selected for preservation in the U.S. National Film Registry of the Library of Congress in 1990, being deemed \"culturally, historically, or aesthetically significant\" and is ranked the second-greatest film in American cinema (behind Citizen Kane) by the American Film Institute. It was followed by sequels The Godfather Part II (1974) and The Godfather Part III (1990). Pauline Kael wrote that \"If ever there was a great example of how the best popular movies come out of a merger of commerce and art, The Godfather is it.\"\n"
                +"__________________________________________________________________\n"+"Most Crowded Show Time : 19:00 PM");
        information.setResizable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);
        info.setEditable(false);
        information.add(scroll);
        information.setVisible(true);
    
    }//GEN-LAST:event_godfatherMouseClicked

    private void monsterincMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monsterincMouseClicked
        // TODO add your handling code here:
        JFrame information = new JFrame("Information");
        information.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        information.setBounds(450,50,700,500);
        JTextArea info = new JTextArea();
        info.setFont(new Font("Verdana",Font.BOLD,12));
        JScrollPane scroll = new JScrollPane(info);
        info.append("Monsters, Inc. (also known as Monsters, Incorporated) is a 2001 American animated comedy film produced by Pixar Animation Studios for Walt Disney Pictures.[2] Featuring the voices of John Goodman, Billy Crystal, Steve Buscemi, James Coburn, Mary Gibbs and Jennifer Tilly, the film was directed by Pete Docter (in his feature directorial debut), co-directed by Lee Unkrich and David Silverman, and produced by Darla K. Anderson, from a screenplay by Andrew Stanton and Daniel Gerson. The film centers on two monsters, the hairy James P. \"Sulley\" Sullivan (Goodman) and his one-eyed partner and best friend Mike Wazowski (Crystal), who are employed at the titular energy-producing factory Monsters, Inc., which generates power by scaring human children. However, the monster world believes that the children are toxic, and when a little human girl Boo (Gibbs) sneaks into the factory, she must be returned home before it is too late.\n" +
"\n" +
"Docter began developing the film in 1996, and wrote the story with Jill Culton, Jeff Pidgeon and Ralph Eggleston, following the idea conceived in a lunch in 1994 attended during the near completion of Toy Story (1995). Stanton wrote the screenplay with Gerson. The characters went through many incarnations over the film's five-year production process. The technical team and animators found new ways to simulate fur and cloth realistically for the film. Randy Newman, who composed the music for Pixar's three prior films, returned to compose the score for its fourth.\n" +
"\n" +
"Monsters, Inc. premiered at the El Capitan Theatre on October 28, 2001, and was released in theaters in the United States on November 2. Upon its release, it received critical acclaim and was a commercial success,[3] grossing over $528 million worldwide to become the third highest-grossing film of 2001.[1] The film won the Academy Award for Best Original Song for \"If I Didn't Have You\" and was nominated for the first Best Animated Feature, but lost to DreamWorks' Shrek, and was also nominated for Best Original Score and Best Sound Editing. Monsters, Inc. saw a 3D re-release in theaters on December 19, 2012. A prequel titled Monsters University, which was directed by Dan Scanlon, was released on June 21, 2013. A television series titled Monsters at Work premiered on Disney+ on July 7, 2021.\n"+
                "__________________________________________________________________\n"+"Most Crowded Show Time : 17:00 PM");
        information.setResizable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);
        info.setEditable(false);
        information.add(scroll);
        information.setVisible(true);
    }//GEN-LAST:event_monsterincMouseClicked

    private void godzillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godzillaMouseClicked
        // TODO add your handling code here:
        JFrame information = new JFrame("Information");
        information.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        information.setBounds(450,50,700,500);
        JTextArea info = new JTextArea();
        info.setFont(new Font("Verdana",Font.BOLD,12));
        JScrollPane scroll = new JScrollPane(info);
        info.append("Godzilla is a 2014 American monster film directed by Gareth Edwards. Produced by Legendary Pictures and distributed by Warner Bros. Pictures, it is a reboot of Toho Co., Ltd.'s Godzilla franchise,[6] and the first film in the MonsterVerse. It is also the 30th film in the Godzilla franchise, and the second Godzilla film to be completely produced by a Hollywood studio.[a] The film stars Aaron Taylor-Johnson, Ken Watanabe, Elizabeth Olsen, Juliette Binoche, Sally Hawkins, David Strathairn, and Bryan Cranston. In the film, an American soldier attempts to return to his family while caught in the crossfire of an ancient rivalry between Godzilla and two parasitic monsters known as MUTOs.\n" +
"\n" +
"The project began as an IMAX short film in 2004 but was transferred to Legendary in 2009 to be redeveloped as a feature film. The film was officially announced in March 2010 and Edwards was announced as the director in January 2011. Principal photography began in March 2013 in the United States and Canada and ended in July 2013.\n" +
"\n" +
"Godzilla was theatrically released on May 16, 2014, to generally positive reviews from critics, who praised the direction, visual effects, music, cinematography, respect to the source material, and Cranston's performance, but criticized the script, characters, and Godzilla's insufficient screen time.[10] The film was a box office success, grossing $529 million worldwide against a production budget of $160 million, print and advertisement costs of $100 million,[11] and a break-even point of $380 million.[12] The film's success prompted Toho to produce a reboot of their own and Legendary to proceed with sequels and a shared cinematic franchise.\n"+"In 1954, Godzilla, a prehistoric alpha predator, is lured to Bikini Atoll in an attempt to kill him with a nuclear bomb. In 1999, Monarch scientists Ishiro Serizawa and Vivienne Graham investigate the skeleton of a monster similar to Godzilla in a cavern unearthed by a collapsed uranium mine in the Philippines. They also find two giant spores, one dormant and one hatched, along with a trail leading to the sea. In Japan, the Janjira Nuclear Power Plant experiences unusual seismic activity. Supervisor Joe Brody sends his wife Sandra to lead a team of technicians into the reactor. A tremor breaches the reactor, forcing Joe to close the reactor door before Sandra and her team can escape while the plant collapses.\n"+
                "__________________________________________________________________\n"+"Most Crowded Show Time : 21:00 PM");
        information.setResizable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);
        info.setEditable(false);
        information.add(scroll);
        information.setVisible(true);
    }//GEN-LAST:event_godzillaMouseClicked

    private void homealoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homealoneMouseClicked
        // TODO add your handling code here:
        JFrame information = new JFrame("Information");
        information.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        information.setBounds(450,50,700,500);
        JTextArea info = new JTextArea();
        info.setFont(new Font("Verdana",Font.BOLD,12));
        JScrollPane scroll = new JScrollPane(info);
        info.append("Home Alone is a 1990 American Christmas comedy film directed by Chris Columbus and written and produced by John Hughes. The first film in the Home Alone franchise, the film stars Macaulay Culkin, Joe Pesci, Daniel Stern, John Heard, and Catherine O'Hara. Culkin plays Kevin McCallister, a boy who defends his suburban Chicago home from a home invasion by a pair of robbers after his family accidentally leaves him behind on their Christmas vacation to Paris.\n" +
"\n" +
"Hughes conceived Home Alone while on vacation, with Warner Bros. being originally intended to finance and distribute the film. However, Warner Bros. shut down the production after it exceeded its assigned budget. 20th Century Fox assumed responsibilities following secret meetings with Hughes. Columbus and Culkin were hired soon afterwards. Filming took place between February and May 1990 on location across Illinois.\n" +
"\n" +
"Home Alone premiered in Chicago on November 10, 1990, and was theatrically released in the United States on November 16. While the film's reception was initially mixed, in later years reception has been generally positive, with praise for its cast, humor, and music. Home Alone grossed $476.7 million worldwide, becoming the highest-grossing live-action comedy until the release of The Hangover Part II (2011), and made Culkin a child star. Moreover, it was the second-highest-grossing film of 1990, behind Ghost.[4] It was nominated for the Golden Globe Award for Best Motion Picture – Musical or Comedy, and Best Actor in a Motion Picture – Musical or Comedy for Culkin, and for the Academy Award for Best Original Score for John Williams, and Best Original Song for \"Somewhere in My Memory\". Home Alone has since been considered one of the best Christmas films.[5][6] A sequel, Home Alone 2: Lost in New York, was released in 1992.\n" +
"\n" +
"In 2023, Home Alone was selected for preservation in the National Film Registry by the Library of Congress as \"culturally, historically, or aesthetically significant\".\n"+"The McCallister family is preparing to spend Christmas in Paris, gathering at Kate and Peter's home in a Chicago suburb on the night before their departure. Kate and Peter's youngest son, Kevin, is the subject of ridicule by his siblings and cousins due to his immature behavior. Kevin inadvertently ruins the family dinner after a scuffle with his oldest brother Buzz, in which Kevin's airplane ticket is unknowingly thrown away, resulting in Kate sending him up to the attic. Kevin berates his mother for allowing the rest of the family to pick on him and wishes that his family would disappear. During the night, heavy winds create a power outage, disabling the alarm clocks and causing the family to oversleep. In the confusion and rush to get to the airport, Kevin is accidentally left behind.\n"+
                "__________________________________________________________________\n"+"Most Crowded Show Time : 15:00 PM");
        information.setResizable(false);
        info.setLineWrap(true);
        info.setWrapStyleWord(true);
        info.setEditable(false);
        information.add(scroll);
        information.setVisible(true);
    }//GEN-LAST:event_homealoneMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        Deletion t = new Deletion();
        setTitle("Ticket ID Input");
        setSize(300, 100);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void AddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieActionPerformed

    String movieName = JOptionPane.showInputDialog(null, "Enter movie name:");
    if (movieName != null && !movieName.isEmpty()) {
        // Create an instance of the other frame
        Ticketing otherFrame = new Ticketing();
        // Pass the movie name to the other frame
        otherFrame.addMovieToChoice(movieName);
    }
    }//GEN-LAST:event_AddMovieActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
         MyForm newFrame = new MyForm();
        newFrame.setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
       Logout newFrame = new Logout();
    }//GEN-LAST:event_LogoutActionPerformed

    private void MyAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount1ActionPerformed
        // TODO add your handling code here:
        AccountInfoFrame newFrame = new AccountInfoFrame();
        newFrame.setVisible(true);
    }//GEN-LAST:event_MyAccount1ActionPerformed

    private void RateUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateUsActionPerformed
        UserOpinionFrame newFrame = new UserOpinionFrame();
        newFrame.setVisible(true);
        newFrame.setResizable(false);
    }//GEN-LAST:event_RateUsActionPerformed

    private void RateUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateUsMouseEntered
        RateUs.setBackground(Color.BLUE);
        RateUs.setForeground(Color.WHITE);
    }//GEN-LAST:event_RateUsMouseEntered

    private void RateUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateUsMouseExited
        // TODO add your handling code here:
        RateUs.setBackground(Color.RED);
        RateUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_RateUsMouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviesProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MoviesProject().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMovie;
    private javax.swing.JButton BookingBtn;
    private javax.swing.JLabel HallOfMovies;
    private javax.swing.JButton Hall_1btn;
    private javax.swing.JButton Hall_2btn;
    private javax.swing.JButton Hall_3btn;
    private javax.swing.JButton Hall_4btn;
    private javax.swing.JButton Hall_5btn;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel MovieName1;
    private javax.swing.JLabel MovieName2;
    private javax.swing.JLabel MovieName3;
    private javax.swing.JLabel MovieName4;
    private javax.swing.JLabel MovieType1;
    private javax.swing.JLabel MovieType2;
    private javax.swing.JLabel MovieType3;
    private javax.swing.JLabel MovieType4;
    private javax.swing.JButton MyAccount1;
    private javax.swing.JButton RateUs;
    private javax.swing.JButton Register;
    private javax.swing.JPanel SectionPanal1;
    private javax.swing.JPanel SectionPanal2;
    private javax.swing.JPanel SectionPanal3;
    private javax.swing.JLabel TitleOfMostPopular;
    private javax.swing.JButton ViewTicketsBtn;
    private javax.swing.JLabel chossingLabel;
    private javax.swing.JButton delete;
    private javax.swing.JLabel godfather;
    private javax.swing.JLabel godzilla;
    private javax.swing.JLabel homealone;
    private javax.swing.JPanel imagePanal1;
    private javax.swing.JPanel imagePanal2;
    private javax.swing.JPanel imagePanal3;
    private javax.swing.JPanel imagePanal4;
    private javax.swing.JLabel monsterinc;
    // End of variables declaration//GEN-END:variables
}
