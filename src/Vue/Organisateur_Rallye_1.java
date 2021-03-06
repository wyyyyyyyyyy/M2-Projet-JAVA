/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import FFRAG.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 21611929
 */
public class Organisateur_Rallye_1 extends javax.swing.JFrame {

    /**
     * Creates new form Organisateur_Rallye_1
     */
    private Model_F mf; 
    private String nomR;
    private String lieu;
    
    public Organisateur_Rallye_1() throws ParseException {
        initComponents();
        this.mf = new Model_F();
        this.nomR = "";
        this.lieu = "";
        
        this.NomRallye1.setEnabled(false);
        this.jTextFieldLieu.setEnabled(false);
        this.jComboBoxRallye.setEnabled(false);
    
        for(Rallye r : mf.getListRallye()){
        this.jComboBoxRallye.addItem(r.getNom());
        }
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jButtonValiderRallye1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLieu = new javax.swing.JTextField();
        NomRallye1 = new javax.swing.JTextField();
        jRadioButtonSelectionRallye = new javax.swing.JRadioButton();
        jComboBoxRallye = new javax.swing.JComboBox<>();
        jRadioButtonCreationRallye = new javax.swing.JRadioButton();
        jButtonValiderRallye2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonValiderRallye1.setText("Etape Suivant");
        jButtonValiderRallye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonValiderRallye1MouseClicked(evt);
            }
        });

        jLabel5.setText("NomRallye");

        jLabel8.setText("Lieu");

        jTextFieldLieu.setText(" ");

        NomRallye1.setText(" ");

        buttonGroup.add(jRadioButtonSelectionRallye);
        jRadioButtonSelectionRallye.setText("Selection Rallye");
        jRadioButtonSelectionRallye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonSelectionRallyeMouseClicked(evt);
            }
        });
        jRadioButtonSelectionRallye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSelectionRallyeActionPerformed(evt);
            }
        });

        buttonGroup.add(jRadioButtonCreationRallye);
        jRadioButtonCreationRallye.setText("Creation Rallye");
        jRadioButtonCreationRallye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonCreationRallyeMouseClicked(evt);
            }
        });

        jButtonValiderRallye2.setText("Retour");
        jButtonValiderRallye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonValiderRallye2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jRadioButtonSelectionRallye))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jComboBoxRallye, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(NomRallye1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonValiderRallye2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonValiderRallye1)
                .addGap(206, 206, 206))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jRadioButtonCreationRallye)
                    .addContainerGap(572, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NomRallye1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSelectionRallye)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxRallye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValiderRallye1)
                    .addComponent(jButtonValiderRallye2))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jRadioButtonCreationRallye)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderRallye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonValiderRallye1MouseClicked
        // TODO add your handling code here:
        if(this.jRadioButtonSelectionRallye.isSelected()==true){
            this.nomR = this.jComboBoxRallye.getSelectedItem().toString();
            try {
                for(Rallye r : this.mf.getListRallye()){
                    if(r.getNom().equals(this.nomR)){
                        this.lieu = r.getLieu();
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(Organisateur_Rallye_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            this.nomR = this.NomRallye1.getText();
            this.lieu = this.jTextFieldLieu.getText();
        }
        
        if(this.NomRallye1.getText().isEmpty()||this.jTextFieldLieu.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error", "Entrer des info completes", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.dispose();
            Organisateur_Rallye_2 OR2;
            try {
                OR2 = new Organisateur_Rallye_2(this.nomR,this.lieu);
                OR2.setVisible(true);
                OR2.setLocationRelativeTo(null);
            } catch (ParseException ex) {
                Logger.getLogger(Organisateur_Rallye_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
    }//GEN-LAST:event_jButtonValiderRallye1MouseClicked

    private void jRadioButtonSelectionRallyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSelectionRallyeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSelectionRallyeActionPerformed

    private void jButtonValiderRallye2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonValiderRallye2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Organisateur_MenuPrincipale mp = new Organisateur_MenuPrincipale();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonValiderRallye2MouseClicked

    private void jRadioButtonCreationRallyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonCreationRallyeMouseClicked
        // TODO add your handling code here:
        this.NomRallye1.setEnabled(true);
        this.jTextFieldLieu.setEnabled(true);
        this.jComboBoxRallye.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonCreationRallyeMouseClicked

    private void jRadioButtonSelectionRallyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonSelectionRallyeMouseClicked
        // TODO add your handling code here:
        this.NomRallye1.setEnabled(false);
        this.jTextFieldLieu.setEnabled(false);
        this.jComboBoxRallye.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonSelectionRallyeMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomRallye1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonValiderRallye1;
    private javax.swing.JButton jButtonValiderRallye2;
    private javax.swing.JComboBox<String> jComboBoxRallye;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonCreationRallye;
    private javax.swing.JRadioButton jRadioButtonSelectionRallye;
    private javax.swing.JTextField jTextFieldLieu;
    // End of variables declaration//GEN-END:variables
}
