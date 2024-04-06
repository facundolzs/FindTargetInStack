package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import stack.Stack;

public class App extends javax.swing.JFrame {

    Stack originalStack = new Stack();
    Stack auxiliarStack = new Stack();

    // for background image
    Background background = new Background();

    public App() {
        this.setContentPane(background);
        initComponents();
        this.setTitle("Stack - Find target");
        this.setContentPane(background);
        setResizable(false);
        txtArea_visualizeData.setEditable(false);
        txtField_target.setEnabled(false);
        button_search.setEnabled(false);
        button_reset.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Background();
        txtField_target = new javax.swing.JTextField();
        button_fill = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        button_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_visualizeData = new javax.swing.JTextArea();
        label_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtField_target.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtField_target.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_targetActionPerformed(evt);
            }
        });

        button_fill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        button_fill.setForeground(new java.awt.Color(35, 35, 35));
        button_fill.setText("Fill");
        button_fill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fillActionPerformed(evt);
            }
        });

        button_search.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        button_search.setForeground(new java.awt.Color(35, 35, 35));
        button_search.setText("Search");
        button_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        button_reset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        button_reset.setForeground(new java.awt.Color(35, 35, 35));
        button_reset.setText("Reset");
        button_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resetActionPerformed(evt);
            }
        });

        txtArea_visualizeData.setColumns(20);
        txtArea_visualizeData.setFont(new java.awt.Font("Lato Medium", 0, 16)); // NOI18N
        txtArea_visualizeData.setForeground(new java.awt.Color(44, 112, 183));
        txtArea_visualizeData.setRows(5);
        jScrollPane1.setViewportView(txtArea_visualizeData);

        label_info.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        label_info.setForeground(new java.awt.Color(35, 35, 35));
        label_info.setText("Enter target:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(button_fill)
                            .addGap(18, 18, 18)
                            .addComponent(button_search)
                            .addGap(18, 18, 18)
                            .addComponent(button_reset))
                        .addComponent(txtField_target))
                    .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_info, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtField_target, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_fill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
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

    private void txtField_targetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_targetActionPerformed
    }//GEN-LAST:event_txtField_targetActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        int target = Integer.parseInt(txtField_target.getText());

        while (!originalStack.isEmpty() && target != (int) originalStack.peek()) {
            auxiliarStack.push(originalStack.pop());
        }

        if (originalStack.isEmpty()) {
            JOptionPane.showMessageDialog(null, target + " was not found.", "Search result", JOptionPane.ERROR_MESSAGE);
            txtField_target.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, target + " was found successfully.", "Search result", JOptionPane.INFORMATION_MESSAGE);
            txtField_target.setText(null);
        }

        while (!auxiliarStack.isEmpty()) {
            originalStack.push(auxiliarStack.pop());
        }

    }//GEN-LAST:event_button_searchActionPerformed

    private void button_fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fillActionPerformed
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            originalStack.push(random.nextInt(-99, 100));
        }

        JOptionPane.showMessageDialog(null, "The stack was successfully filled!");
        txtArea_visualizeData.setText(originalStack.toString());

        button_search.setEnabled(true);
        button_reset.setEnabled(true);
        txtField_target.setEnabled(true);
    }//GEN-LAST:event_button_fillActionPerformed

    private void button_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resetActionPerformed
        originalStack.clear();
        JOptionPane.showMessageDialog(null, "The stack was successfully restarted!");

        txtArea_visualizeData.setText(null);
        txtField_target.setText(null);

        button_search.setEnabled(false);
        button_reset.setEnabled(false);
        txtField_target.setEnabled(false);
    }//GEN-LAST:event_button_resetActionPerformed

    private class Background extends JPanel {

        private Image image;

        @Override
        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/img/background.jpg")).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_fill;
    private javax.swing.JButton button_reset;
    private javax.swing.JButton button_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_info;
    private javax.swing.JTextArea txtArea_visualizeData;
    private javax.swing.JTextField txtField_target;
    // End of variables declaration//GEN-END:variables
}
