//package Cliente.src;

//import Cliente.src.JogoDaVelha;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author letic
 */
public class PlayScreen extends javax.swing.JFrame {
    public String nickname;
    public char type;
    public boolean canContinue = false;

    /**
     * Creates new form PlayScreen
     */
    public PlayScreen() {
        type = ' ';
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setEnabled(true);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton1.getBackground() != Color.blue && jButton1.getBackground() != Color.red) {
                        jButton1.setBackground(Color.red);
                        returnToServer(0, 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton2.getBackground() != Color.blue && jButton2.getBackground() != Color.red) {
                        jButton2.setBackground(Color.red);
                        returnToServer(0, 1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton3.getBackground() != Color.blue && jButton3.getBackground() != Color.red) {
                        jButton3.setBackground(Color.red);
                        returnToServer(0, 2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton5.getBackground() != Color.blue && jButton5.getBackground() != Color.red) {
                        jButton5.setBackground(Color.red);
                        returnToServer(1, 1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton6.getBackground() != Color.blue && jButton6.getBackground() != Color.red) {
                        jButton6.setBackground(Color.red);
                        returnToServer(1, 2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton7.getBackground() != Color.blue && jButton7.getBackground() != Color.red) {
                        jButton7.setBackground(Color.red);
                        returnToServer(2, 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton8.getBackground() != Color.blue && jButton8.getBackground() != Color.red) {
                        jButton8.setBackground(Color.red);
                        returnToServer(2, 1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton9.getBackground() != Color.blue && jButton9.getBackground() != Color.red) {
                        jButton9.setBackground(Color.red);
                        returnToServer(2, 2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (jButton4.getBackground() != Color.blue && jButton4.getBackground() != Color.red) {
                        jButton4.setBackground(Color.red);
                        returnToServer(1, 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Jogo da Velha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void waitServerMessage() throws Exception {
        String data = JogoDaVelha.tcpConnection.receiveData();
        System.out.println(data);
        String[] datas = data.split(",");
        if (datas.length == 5 && !datas[4].equals("")) {
            this.setVisible(false);
            if ('X' == datas[4].charAt(0)) {
                JogoDaVelha.resultScreen.setLabelWin(true);
            } else {
                JogoDaVelha.resultScreen.setLabelLost(true);
            }
            JogoDaVelha.tcpConnection.closeConnection();
            JogoDaVelha.resultScreen.setVisible(true);
        }
        nickname = datas[0];
        type = datas[1].charAt(0);

        if (Integer.valueOf(datas[2]) != -1 && Integer.valueOf(datas[3]) != -1) {
            canContinue = true;
        }
        
        if (Integer.valueOf(datas[2]) == 0) {
            if (Integer.valueOf(datas[3]) == 0) {
                if (type == 'X') {
                    jButton1.setBackground(Color.red);
                } else {
                    jButton1.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 1) {
                if (type == 'X') {
                    jButton2.setBackground(Color.red);
                } else {
                    jButton2.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 2) {
                if (type == 'X') {
                    jButton3.setBackground(Color.red);
                } else {
                    jButton3.setBackground(Color.blue);
                }
            }
        } else if (Integer.valueOf(datas[2]) == 1) {
            if (Integer.valueOf(datas[3]) == 0) {
                if (type == 'X') {
                    jButton4.setBackground(Color.red);
                } else {
                    jButton4.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 1) {
                if (type == 'X') {
                    jButton5.setBackground(Color.red);
                } else {
                    jButton5.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 2) {
                if (type == 'X') {
                    jButton6.setBackground(Color.red);
                } else {
                    jButton6.setBackground(Color.blue);
                }
            }
        } else if (Integer.valueOf(datas[2]) == 2) {
            if (Integer.valueOf(datas[3]) == 0) {
                if (type == 'X') {
                    jButton7.setBackground(Color.red);
                } else {
                    jButton7.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 1) {
                if (type == 'X') {
                    jButton8.setBackground(Color.red);
                } else {
                    jButton8.setBackground(Color.blue);
                }
            }
            if (Integer.valueOf(datas[3]) == 2) {
                if (type == 'X') {
                    jButton9.setBackground(Color.red);
                } else {
                    jButton9.setBackground(Color.blue);
                }
            }
        }
        System.out.println(data);
    }
    
    public void returnToServer(int x, int y) throws Exception {
        String sendToServer = nickname+","+type+","+Integer.toString(x)+","+Integer.toString(y)+",";
        JogoDaVelha.tcpConnection.sendData(sendToServer);
        this.setEnabled(false);
        waitServerMessage();
        this.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
