/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package my.spellchecker;
/**
 *
 * @author earapogiorgi
 */
public class SpellCheckerUI extends javax.swing.JFrame {
    /**
     * Creates new form SpellCheckerUI
     */
    public SpellCheckerUI() {
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

        spellCheckDialog = new javax.swing.JDialog();
        popUpTextPanel = new javax.swing.JPanel();
        wrongWordsScrollPane = new javax.swing.JScrollPane();
        wrongWordsList = new javax.swing.JList();
        altWordButton = new javax.swing.JButton();
        saveOriginalWordButton = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        alternativeWordDialog = new javax.swing.JDialog();
        altWordPanel = new javax.swing.JPanel();
        altWordScrollPane = new javax.swing.JScrollPane();
        altWordList = new javax.swing.JList();
        cancelButton2 = new javax.swing.JButton();
        saveAltWordButton = new javax.swing.JButton();
        textPanel = new javax.swing.JPanel();
        textScrollPane = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        spellCheckButton = new javax.swing.JButton();

        spellCheckDialog.setMinimumSize(new java.awt.Dimension(340, 400));

        popUpTextPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Wrong Spelled Words", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        wrongWordsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        wrongWordsScrollPane.setViewportView(wrongWordsList);

        altWordButton.setText("Find Alternative");
        altWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altWordButtonActionPerformed(evt);
            }
        });

        saveOriginalWordButton.setText("Save Word");

        cancelButton1.setText("Cancel");

        javax.swing.GroupLayout popUpTextPanelLayout = new javax.swing.GroupLayout(popUpTextPanel);
        popUpTextPanel.setLayout(popUpTextPanelLayout);
        popUpTextPanelLayout.setHorizontalGroup(
            popUpTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wrongWordsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popUpTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popUpTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(altWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveOriginalWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cancelButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        popUpTextPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {altWordButton, cancelButton1, saveOriginalWordButton});

        popUpTextPanelLayout.setVerticalGroup(
            popUpTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popUpTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popUpTextPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(altWordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveOriginalWordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton1))
                    .addComponent(wrongWordsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout spellCheckDialogLayout = new javax.swing.GroupLayout(spellCheckDialog.getContentPane());
        spellCheckDialog.getContentPane().setLayout(spellCheckDialogLayout);
        spellCheckDialogLayout.setHorizontalGroup(
            spellCheckDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popUpTextPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        spellCheckDialogLayout.setVerticalGroup(
            spellCheckDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popUpTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        alternativeWordDialog.setMinimumSize(new java.awt.Dimension(300, 280));

        altWordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alternative Words", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        altWordList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        altWordScrollPane.setViewportView(altWordList);

        cancelButton2.setText("Close");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        saveAltWordButton.setText("Save Word");

        javax.swing.GroupLayout altWordPanelLayout = new javax.swing.GroupLayout(altWordPanel);
        altWordPanel.setLayout(altWordPanelLayout);
        altWordPanelLayout.setHorizontalGroup(
            altWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altWordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altWordScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(altWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton2)
                    .addComponent(saveAltWordButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        altWordPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton2, saveAltWordButton});

        altWordPanelLayout.setVerticalGroup(
            altWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altWordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(altWordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(altWordPanelLayout.createSequentialGroup()
                        .addComponent(saveAltWordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton2))
                    .addComponent(altWordScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout alternativeWordDialogLayout = new javax.swing.GroupLayout(alternativeWordDialog.getContentPane());
        alternativeWordDialog.getContentPane().setLayout(alternativeWordDialogLayout);
        alternativeWordDialogLayout.setHorizontalGroup(
            alternativeWordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(altWordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        alternativeWordDialogLayout.setVerticalGroup(
            alternativeWordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(altWordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        textTextArea.setColumns(20);
        textTextArea.setRows(5);
        textTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textScrollPane.setViewportView(textTextArea);

        spellCheckButton.setText("Spell Check");
        spellCheckButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spellCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellCheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(textPanelLayout.createSequentialGroup()
                        .addComponent(spellCheckButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spellCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spellCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellCheckButtonActionPerformed
        DataInput.inputFromUser(textTextArea.getText());
        spellCheckDialog.setVisible(true);
    }//GEN-LAST:event_spellCheckButtonActionPerformed

    private void altWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altWordButtonActionPerformed
        alternativeWordDialog.setVisible(true);
    }//GEN-LAST:event_altWordButtonActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SpellCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpellCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpellCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpellCheckerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpellCheckerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altWordButton;
    private javax.swing.JList altWordList;
    private javax.swing.JPanel altWordPanel;
    private javax.swing.JScrollPane altWordScrollPane;
    private javax.swing.JDialog alternativeWordDialog;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JPanel popUpTextPanel;
    private javax.swing.JButton saveAltWordButton;
    private javax.swing.JButton saveOriginalWordButton;
    private javax.swing.JButton spellCheckButton;
    private javax.swing.JDialog spellCheckDialog;
    private javax.swing.JPanel textPanel;
    private javax.swing.JScrollPane textScrollPane;
    private javax.swing.JTextArea textTextArea;
    private javax.swing.JList wrongWordsList;
    private javax.swing.JScrollPane wrongWordsScrollPane;
    // End of variables declaration//GEN-END:variables
}