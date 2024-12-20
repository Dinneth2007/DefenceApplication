/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defenseapplication;

import javax.swing.JTextArea;

/**
 *
 * @author ha
 */
public class HelicopterView extends javax.swing.JFrame implements VehicleObservable{

    /**
     * Creates new form HelicopterView
     */
    MainView mainView;
    int strengthvalue;
    String name="Helicopter";
    public HelicopterView(MainView mainView) {
        this.mainView=mainView;
        setVisible(true);
        setTitle("Helicopter");
        
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

        AreaLabel = new javax.swing.JLabel();
        ShootBtn = new javax.swing.JButton();
        MOBtn = new javax.swing.JButton();
        LOBtn = new javax.swing.JButton();
        PositionCheckBox = new javax.swing.JCheckBox();
        SoldierCountLabel = new javax.swing.JLabel();
        AmmoCountLabel = new javax.swing.JLabel();
        SoldierCountSpinner = new javax.swing.JSpinner();
        AmmoCountSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatTextArea = new javax.swing.JTextArea();
        MsgTextField = new javax.swing.JTextField();
        SendBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaLabel.setText("Area Not Cleared");

        ShootBtn.setText("Shoot");
        ShootBtn.setEnabled(false);

        MOBtn.setText("Missile Operations");
        MOBtn.setEnabled(false);
        MOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBtnActionPerformed(evt);
            }
        });

        LOBtn.setText("Laser Operations");
        LOBtn.setEnabled(false);

        PositionCheckBox.setText("Position");
        PositionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionCheckBoxActionPerformed(evt);
            }
        });

        SoldierCountLabel.setText("Soldier Count");

        AmmoCountLabel.setText("Ammo Count");

        ChatTextArea.setColumns(20);
        ChatTextArea.setRows(5);
        jScrollPane1.setViewportView(ChatTextArea);

        SendBtn.setText("Send");
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(SendBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MOBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LOBtn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PositionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AmmoCountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(SoldierCountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SoldierCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(MOBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LOBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoldierCountLabel)
                            .addComponent(SoldierCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AmmoCountLabel)
                            .addComponent(AmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PositionCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ShootBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MsgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOBtnActionPerformed

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed
        sendMsgToMain();
    }//GEN-LAST:event_SendBtnActionPerformed

    private void PositionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionCheckBoxActionPerformed
        // TODO add your handling code here:
        enableBtns();
    }//GEN-LAST:event_PositionCheckBoxActionPerformed
    public void sendMsgToMain(){
         mainView.getTextArea().append("Helicopter : "+MsgTextField.getText()+"\n");
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HelicopterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelicopterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelicopterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelicopterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmmoCountLabel;
    private javax.swing.JSpinner AmmoCountSpinner;
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JTextArea ChatTextArea;
    private javax.swing.JButton LOBtn;
    private javax.swing.JButton MOBtn;
    private javax.swing.JTextField MsgTextField;
    private javax.swing.JCheckBox PositionCheckBox;
    private javax.swing.JButton SendBtn;
    private javax.swing.JButton ShootBtn;
    private javax.swing.JLabel SoldierCountLabel;
    private javax.swing.JSpinner SoldierCountSpinner;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateAreaClear(boolean isSelected) {
        if(isSelected){
      AreaLabel.setText("Area Cleared");
        }else{
            AreaLabel.setText("Area Not Cleared");
        }
    }

    @Override
    public void RecieveMassegetoVehicle(String massege) {
        ChatTextArea.append("main : "+massege+"\n");
        
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public int SendAmmoCount() {
       return (Integer)AmmoCountSpinner.getValue();
    }

    @Override
    public int SendSoldierCount() {
        return (Integer)SoldierCountSpinner.getValue();
    }

    @Override
    public void RecievePrivateMsg(String msg) {
         ChatTextArea.append("main(private) : "+msg+"\n");
    }

    @Override
    public boolean isPositioned() {
        return PositionCheckBox.isSelected()?true:false;
    }
    public void enableBtns(){
       if(strengthvalue>=10&&strengthvalue<50){
           ShootBtn.setEnabled(true);
       }else if(strengthvalue>=50&&strengthvalue<75){
           MOBtn.setEnabled(true);
       }else{
           LOBtn.setEnabled(true);
       }
    }

    @Override
    public void setStrengthLevel(int strengthvalue) {
       this.strengthvalue=strengthvalue;
    }
   

   
}
