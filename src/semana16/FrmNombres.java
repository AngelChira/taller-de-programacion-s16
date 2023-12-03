package semana16;

import javax.swing.JOptionPane;

public class FrmNombres extends javax.swing.JFrame {
    private String[] nombres = {"Angel", "Ana", "Luis", "Marta", "Mar", "Felipe",
            "Diego", "Armando", "Juan", "Jose", "Angela", "Fiorella"};
    
    public void listarNombres(){
        taResult.setText("");
        taResult.append("Nombres\n");
        for (int i = 0; i < nombres.length; i++) {
            taResult.append(nombres[i]+"\n");
        }
    }
    
    public FrmNombres() {
        initComponents();
        listarNombres();       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOption = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        rdbLetraInicio = new javax.swing.JRadioButton();
        rdbLetraDentro = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        btnListar = new javax.swing.JToggleButton();
        btnNombres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rdbLetraFinal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese la letra o las  letras");

        bgOption.add(rdbLetraInicio);
        rdbLetraInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbLetraInicio.setText("Filtrar por letra o letras al inicio del nombre");

        bgOption.add(rdbLetraDentro);
        rdbLetraDentro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbLetraDentro.setText("Filtrar por letra o letras en el nombre");

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNombres.setText("Nombres");
        btnNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Buscar Nombres");

        bgOption.add(rdbLetraFinal);
        rdbLetraFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbLetraFinal.setText("Filtrar por letra o letras al final del nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbLetraInicio)
                                            .addComponent(rdbLetraDentro)
                                            .addComponent(rdbLetraFinal))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtNombre))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbLetraDentro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbLetraInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbLetraFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        boolean encontrado = false;
        if(txtNombre.getText().strip().isEmpty()){
            JOptionPane.showMessageDialog(
                null,
                "Advertencia, ingrese debe ingresar un nombre.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE);
                txtNombre.requestFocus();
            return;
        }
        
        String nombre = txtNombre.getText().strip();
        taResult.setText("");
        if(rdbLetraDentro.isSelected()){
            StringBuffer resultadoBuffer = new StringBuffer();
            resultadoBuffer.append("Nombres que contienen '").append(nombre).append("': \n");

            for (String n : nombres) {
                if (n.toUpperCase().contains(nombre.toUpperCase()) || n.toUpperCase().startsWith(nombre.toUpperCase())) {
                    resultadoBuffer.append(n).append("\n");
                    encontrado = true;
                }
            }
            
            if(encontrado){
                taResult.append(resultadoBuffer.toString());
            } else{
                taResult.append("No se encontro ningun nombre que contenga '"+nombre+"'.");
            }
            
        } else if(rdbLetraInicio.isSelected()){            
            StringBuilder resultadoBuilder = new StringBuilder();
            resultadoBuilder.append("Nombres que comienzan con '").append(nombre).append("': \n");

            for (String n : nombres) {
                if (n.toUpperCase().startsWith(nombre.toUpperCase())) {
                    resultadoBuilder.append(n).append("\n");
                    encontrado = true;
                }
            }
            
            if(encontrado){
                taResult.append(resultadoBuilder.toString());
            } else {
                taResult.append("No se encontro ningun nombre que comienze con '"+nombre+"'.");
            }
            
        } else if(rdbLetraFinal.isSelected()){
            StringBuilder resultadoBuilder = new StringBuilder();
            resultadoBuilder.append("Nombres que terminan con '").append(nombre).append("': \n");

            for (String n : nombres) {
                if (n.toUpperCase().endsWith(nombre.toUpperCase())) {
                    resultadoBuilder.append(n).append("\n");
                    encontrado = true;
                }
            }
            
            if(encontrado){
                taResult.append(resultadoBuilder.toString());
            } else {
                taResult.append("No se encontro ningun nombre que termine con '"+nombre+"'.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null,
                "Advertencia, debe seleccionar una opción.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE);
            listarNombres();
            return;
        }
        txtNombre.setText("");
        bgOption.clearSelection();        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombresActionPerformed
        listarNombres();
    }//GEN-LAST:event_btnNombresActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOption;
    private javax.swing.JToggleButton btnListar;
    private javax.swing.JButton btnNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbLetraDentro;
    private javax.swing.JRadioButton rdbLetraFinal;
    private javax.swing.JRadioButton rdbLetraInicio;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
