package VIEW;
import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import MODEL.ConeccionDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTestEstudiante extends javax.swing.JFrame {

    DefaultTableModel modelo;
    boolean inputsHabilitados = false;
    ArrayList<Estudiante> lstEstudiantes = new ArrayList<>();

    public FormTestEstudiante() {
        initComponents();
        modelo = (DefaultTableModel) this.jTable1.getModel();
        jButton5.setEnabled(false);
        jButton7.setEnabled(false);
        jTextPane2.setEnabled(false);
        jTextPane3.setEnabled(false);
        jButton1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Conectar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Insertar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nota1", "Nota2", "Promedio", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nota 2:");

        jScrollPane2.setViewportView(jTextPane1);

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jScrollPane3.setViewportView(jTextPane2);

        jButton8.setText("Cerrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota 1:");

        jScrollPane4.setViewportView(jTextPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(25, 25, 25)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conectarDB();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        while(modelo.getRowCount() > 0)
            this.modelo.removeRow(0);
        ArrayList<Estudiante> lstEst = new ArrayList<Estudiante>();
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);
        lstEst = procesarEstudiantes.getLstEstudiantes();
        for (Estudiante est : lstEst) 
            this.modelo.addRow(new Object[]{est.nombreEst, est.jTextPane2, est.jTextPane3, est.promedio, est.estado});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String nombreEst = jButton7.getText();
        String jTextPane2Text = jTextPane2.getText();
        String jTextPane3Text = jTextPane3.getText();

        // Verificar que los campos de entrada contengan datos válidos
        if (nombreEst.isEmpty() || jTextPane2Text.isEmpty() || jTextPane3Text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los datos.");
            return;
        }

        try {
            double jTextPane2Value = Double.parseDouble(jTextPane2Text);
            double jTextPane3Value = Double.parseDouble(jTextPane3Text);

            // Verificar que las notas estén en el rango válido (0-10)
            if (jTextPane2Value < 0 || jTextPane2Value > 10 || jTextPane3Value < 0 || jTextPane3Value > 10) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas (0-10).");
                return;
            }

            // Calcular promedio y estado
            double promedio = (jTextPane2Value + jTextPane3Value) / 2;
            String estado = (promedio >= 7) ? "Aprobado" : "Reprobado";

            // Crear el objeto Estudiante con los valores calculados
            Estudiante estudiante = new Estudiante(nombreEst, jTextPane2Value, jTextPane3Value, promedio, estado);

            // jButton6 los datos en la tabla y en la base de datos
            modelo.addRow(new Object[]{nombreEst, jTextPane2Value, jTextPane3Value, promedio, estado});
            lstEstudiantes.add(estudiante); // Agregar el nuevo estudiante a la lista
            ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes); // Pasar la lista al constructor
            procesarEstudiantes.insertarEstudiante(estudiante);

            // Deshabilitar los campos de entrada y deshabilitar nuevamente el botón "jButton5"
            jButton7.setEnabled(false);
            jTextPane2.setEnabled(false);
            jTextPane3.setEnabled(false);
            inputsHabilitados = false;
            jButton6.setEnabled(true);
            jButton5.setEnabled(false);

            // Restablecer los campos de entrada y deshabilitarlos nuevamente
            jButton7.setText("");
            jTextPane2.setText("");
            jTextPane3.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas.");
        }
    }                                       

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para eliminar.");
            return;
        }

        // Obtener el nombre del estudiante seleccionado
        String nombreEst = (String) jTable1.getValueAt(filaSeleccionada, 0);

        // Eliminar el estudiante de la lista y la base de datos
        eliminarEstudiante(nombreEst);

        // Actualizar la tabla y la lista de estudiantes
        actualizarTabla();
        lstEstudiantes = getListaEstudiantes();

        JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente.");
    }


    private void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        lstEstudiantes = getListaEstudiantes();
        for (Estudiante est : lstEstudiantes) {
            modelo.addRow(new Object[]{est.nombreEst, est.jTextPane2, est.jTextPane3, est.promedio, est.estado});
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        insertarDatos();
        if (!inputsHabilitados) {
            // Habilitar los campos de entrada cuando se presiona el botón "jButton6"
            jButton7.setEnabled(true);
            jTextPane2.setEnabled(true);
            jTextPane3.setEnabled(true);
            inputsHabilitados = true;

            // Deshabilitar el botón "jButton6" y habilitar el botón "jButton5"
            jButton6.setEnabled(false);
            jButton5.setEnabled(true);
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para eliminar.");
            return;
        }

        // Obtener el nombre del estudiante seleccionado
        String nombreEst = (String) jTable1.getValueAt(filaSeleccionada, 0);

        // Eliminar el estudiante de la lista y la base de datos
        eliminarEstudiante(nombreEst);

        // Actualizar la tabla y la lista de estudiantes
        actualizarTabla();
        lstEstudiantes = getListaEstudiantes();

        JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente.");
    }

    private void eliminarEstudiante(String nombreEstudiante) {
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes);
        procesarEstudiantes.eliminarEstudiante(nombreEstudiante);
    }

    private void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        lstEstudiantes = getListaEstudiantes();
        for (Estudiante est : lstEstudiantes) {
            modelo.addRow(new Object[]{est.nombreEst, est.nota1, est.nota2, est.promedio, est.estado});
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    private ArrayList<Estudiante> getListaEstudiantes() {
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes);
        return procesarEstudiantes.getLstEstudiantes();
    }

    private void conectarDB() {
        ConeccionDB coneccionDB = new ConeccionDB();
        coneccionDB.setConcDB("jdbc:sqlite:bd/dbTest1.db"); // Establecer la URL de conexión a la base de datos
    }

    private void insertarDatos() {
        jButton7.setEnabled(true);
        jTextPane2.setEnabled(true);
        jTextPane3.setEnabled(true);
        Guardar.setEnabled(true);
    }
    
    private void activar(){
        Actualizar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTestEstudiante().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables

}
