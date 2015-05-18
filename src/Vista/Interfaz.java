package Vista;

import Modelo.Conexion;
import java.sql.Connection;

public class Interfaz extends javax.swing.JFrame {
    
    Conexion conexion;
    public Interfaz() {
        initComponents();
        conexion= new Conexion();
        Connection con = conexion.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscadorJugador = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ClasificacionJornada = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Equipos = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btbLimpiar = new javax.swing.JButton();
        btnClasificacion = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnEquipo = new javax.swing.JButton();
        jcbCalendario = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        BuscadorJugador.setTitle("Buscador Jugador");
        BuscadorJugador.setAlwaysOnTop(true);
        BuscadorJugador.setResizable(false);
        BuscadorJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscadorJugadorKeyPressed(evt);
            }
        });

        jLabel3.setText("Información Jugador");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Altura:");

        jLabel7.setText("Peso:");

        jLabel8.setText("Posición:");

        jButton1.setText("Estadisticas");

        jLabel9.setText("Apellidos:");

        jLabel6.setText("Equipo:");

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout BuscadorJugadorLayout = new javax.swing.GroupLayout(BuscadorJugador.getContentPane());
        BuscadorJugador.getContentPane().setLayout(BuscadorJugadorLayout);
        BuscadorJugadorLayout.setHorizontalGroup(
            BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscadorJugadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(BuscadorJugadorLayout.createSequentialGroup()
                        .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscadorJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BuscadorJugadorLayout.createSequentialGroup()
                        .addGap(0, 258, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(43, 43, 43))
        );
        BuscadorJugadorLayout.setVerticalGroup(
            BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscadorJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscadorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel12.setText("Clasificación");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout ClasificacionJornadaLayout = new javax.swing.GroupLayout(ClasificacionJornada.getContentPane());
        ClasificacionJornada.getContentPane().setLayout(ClasificacionJornadaLayout);
        ClasificacionJornadaLayout.setHorizontalGroup(
            ClasificacionJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClasificacionJornadaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ClasificacionJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        ClasificacionJornadaLayout.setVerticalGroup(
            ClasificacionJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClasificacionJornadaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_equipo", "Nombre", "Localidad", "Estadio"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout EquiposLayout = new javax.swing.GroupLayout(Equipos.getContentPane());
        Equipos.getContentPane().setLayout(EquiposLayout);
        EquiposLayout.setHorizontalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        EquiposLayout.setVerticalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liga ACB");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Buscador:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, 20));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 240, 20));

        btbLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btbLimpiar.setForeground(new java.awt.Color(0, 0, 255));
        btbLimpiar.setText("Limpiar");
        btbLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 60, 20));

        btnClasificacion.setForeground(new java.awt.Color(255, 102, 0));
        btnClasificacion.setText("Clasificación");
        getContentPane().add(btnClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnEstadisticas.setForeground(new java.awt.Color(255, 102, 0));
        btnEstadisticas.setText("Estadísticas");
        getContentPane().add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 91, -1));

        btnEquipo.setForeground(new java.awt.Color(255, 102, 0));
        btnEquipo.setText("Equipos");
        btnEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEquipoMouseClicked(evt);
            }
        });
        btnEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 91, -1));

        jcbCalendario.setForeground(new java.awt.Color(255, 102, 0));
        jcbCalendario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        jcbCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCalendarioActionPerformed(evt);
            }
        });
        getContentPane().add(jcbCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 29));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Calendario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Local", "Visitante", "Puntos Locales", "Puntos Visitantes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 384, 178));

        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Clasif. Jornada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Jornada");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/promo_startapp_acb.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCalendarioActionPerformed
        jcbCalendario.addItem("Jornada 1");
        jcbCalendario.addItem("Jornada 2");
        jcbCalendario.addItem("Jornada 3");
        jcbCalendario.addItem("Jornada 4");
        jcbCalendario.addItem("Jornada 5");
        jcbCalendario.addItem("Jornada 6");
        jcbCalendario.addItem("Jornada 7");
        jcbCalendario.addItem("Jornada 8");
        jcbCalendario.addItem("Jornada 9");
        jcbCalendario.addItem("Jornada 10");
        jcbCalendario.addItem("Jornada 11");
        jcbCalendario.addItem("Jornada 12");
        jcbCalendario.addItem("Jornada 13");
        jcbCalendario.addItem("Jornada 14");
        jcbCalendario.addItem("Jornada 15");
        jcbCalendario.addItem("Jornada 16");
        jcbCalendario.addItem("Jornada 17");
        jcbCalendario.addItem("Jornada 18");
        jcbCalendario.addItem("Jornada 19");
        jcbCalendario.addItem("Jornada 20");
        jcbCalendario.addItem("Jornada 21");
        jcbCalendario.addItem("Jornada 22");
        jcbCalendario.addItem("Jornada 23");
        jcbCalendario.addItem("Jornada 24");
        jcbCalendario.addItem("Jornada 25");
        jcbCalendario.addItem("Jornada 26");
        jcbCalendario.addItem("Jornada 27");
        jcbCalendario.addItem("Jornada 28");
        jcbCalendario.addItem("Jornada 29");
        jcbCalendario.addItem("Jornada 30");
        jcbCalendario.addItem("Jornada 31");
        jcbCalendario.addItem("Jornada 32");
        jcbCalendario.addItem("Jornada 33");
        jcbCalendario.addItem("Jornada 34");
        

    // TODO add your handling code here:
    }//GEN-LAST:event_jcbCalendarioActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
       
        BuscadorJugador.setSize(500,400);
        BuscadorJugador.setLocation(200,200);
        BuscadorJugador.setResizable(false);
        BuscadorJugador.setVisible(true);
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLimpiarActionPerformed
        txtBuscar.setText("");
    }//GEN-LAST:event_btbLimpiarActionPerformed

    private void BuscadorJugadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorJugadorKeyPressed
        
    }//GEN-LAST:event_BuscadorJugadorKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquipoActionPerformed

    private void btnEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEquipoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEquipoMouseClicked


    public static void main(String args[]) {
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscadorJugador;
    private javax.swing.JDialog ClasificacionJornada;
    private javax.swing.JDialog Equipos;
    private javax.swing.JButton btbLimpiar;
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnEquipo;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox jcbCalendario;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
