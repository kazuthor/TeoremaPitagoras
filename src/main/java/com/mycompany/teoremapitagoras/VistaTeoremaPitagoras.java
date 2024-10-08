/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teoremapitagoras;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class VistaTeoremaPitagoras extends javax.swing.JFrame {

    /**
     * Creates new form VistaTeoremaPitagoras
     */
     public VistaTeoremaPitagoras() {
        initComponents();
        
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            
            double x1 = Double.parseDouble(txtcoordX1.getText());
            double y1 = Double.parseDouble(txtcoordY1.getText());
            double x2 = Double.parseDouble(txtcoordX2.getText());
            double y2 = Double.parseDouble(txtcoordY2.getText());

            
            Punto punto1 = new Punto(x1, y1);
            Punto punto2 = new Punto(x2, y2);

            
            Lado lado1 = new Lado(punto1, punto2);
            
            Punto punto3 = new Punto(x1, y2); 
            Lado lado2 = new Lado(punto2, punto3);

            
            TrianguloRectangulo triangulo = new TrianguloRectangulo();
            triangulo.setLado1(lado1);
            triangulo.setLado2(lado2);

            
            double hipotenusa = triangulo.calcularHipotenusa();
            txtResultadoHipotenusa.setText(String.valueOf(hipotenusa));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos para las coordenadas.", "Error", JOptionPane.ERROR_MESSAGE);
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

        lblpunto1 = new javax.swing.JLabel();
        lblpunto2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblcoordx1 = new javax.swing.JLabel();
        lblcoordy1 = new javax.swing.JLabel();
        lblcoordx2 = new javax.swing.JLabel();
        lblcoordy2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtcoordX1 = new javax.swing.JTextField();
        txtcoordY1 = new javax.swing.JTextField();
        txtcoordX2 = new javax.swing.JTextField();
        txtcoordY2 = new javax.swing.JTextField();
        txtResultadoHipotenusa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblpunto1.setText("Punto 1:");

        lblpunto2.setText("Punto 2:");

        btnCalcular.setText("Calcular");

        lblcoordx1.setText("X1:");

        lblcoordy1.setText("Y1:");

        lblcoordx2.setText("X2:");

        lblcoordy2.setText("Y2:");

        lblResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpunto1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcoordy1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcoordY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcoordx1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcoordX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcoordx2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcoordX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblpunto2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcoordy2)
                            .addComponent(lblResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcoordY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpunto1)
                    .addComponent(lblpunto2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcoordx1)
                    .addComponent(lblcoordx2)
                    .addComponent(txtcoordX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcoordX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcoordy1)
                    .addComponent(lblcoordy2)
                    .addComponent(txtcoordY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcoordY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(txtResultadoHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularHipotenusa() {
        try {
            // Leer coordenadas de los campos de texto
            double x1 = Double.parseDouble(txtcoordX1.getText());
            double y1 = Double.parseDouble(txtcoordY1.getText());
            double x2 = Double.parseDouble(txtcoordX2.getText());
            double y2 = Double.parseDouble(txtcoordY2.getText());

            // Crear puntos
            Punto punto1 = new Punto(x1, y1);
            Punto punto2 = new Punto(x2, y2);

            // Crear lados (con la distancia entre los puntos)
            Lado lado1 = new Lado(punto1, punto2);

            // Crear triángulo rectángulo
            TrianguloRectangulo triangulo = new TrianguloRectangulo();
            triangulo.setLado1(lado1);

            // Calcular la hipotenusa
            double hipotenusa = triangulo.calcularHipotenusa();

            // Mostrar el resultado
            txtResultadoHipotenusa.setText(String.valueOf(hipotenusa));
        } catch (NumberFormatException e) {
            txtResultadoHipotenusa.setText("Error");
        }
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
            java.util.logging.Logger.getLogger(VistaTeoremaPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTeoremaPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTeoremaPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTeoremaPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTeoremaPitagoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblcoordx1;
    private javax.swing.JLabel lblcoordx2;
    private javax.swing.JLabel lblcoordy1;
    private javax.swing.JLabel lblcoordy2;
    private javax.swing.JLabel lblpunto1;
    private javax.swing.JLabel lblpunto2;
    private javax.swing.JTextField txtResultadoHipotenusa;
    private javax.swing.JTextField txtcoordX1;
    private javax.swing.JTextField txtcoordX2;
    private javax.swing.JTextField txtcoordY1;
    private javax.swing.JTextField txtcoordY2;
    // End of variables declaration//GEN-END:variables
}
