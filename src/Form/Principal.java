/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Clases.NuevoPdf;
import Clases.Variables;
import MySQL.Funcion;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 *
 * @author Acer
 */
public class Principal extends javax.swing.JFrame {

    static Statement st; 
    static ResultSet Comando;
    static Boolean estado_BotonPerfil = false;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Funcion.CrearConexion();
        st=Funcion.conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(44, 44, 44));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Filtro de Dominios");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 70));

        jButton5.setBackground(new java.awt.Color(44, 44, 44));
        jButton5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Perfil de Usuario");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 70));

        jButton6.setBackground(new java.awt.Color(44, 44, 44));
        jButton6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Usuarios Monitoreados");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setOpaque(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 70));

        jButton7.setBackground(new java.awt.Color(44, 44, 44));
        jButton7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reporte General");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setOpaque(true);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/LOGO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setBackground(new java.awt.Color(44, 44, 44));
        jButton8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Configuración");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setOpaque(true);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 650));

        jTabbedPane2.setBackground(java.awt.Color.white);
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        jPanel9.setBackground(Color.white);
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel9.setEnabled(false);
        jPanel9.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel9.setName(""); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(Color.white);
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel7.setEnabled(false);
        jPanel7.setMaximumSize(new java.awt.Dimension(724, 278));
        jPanel7.setName(""); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Nombre de Usuario:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Nick de Usuario:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 320, 30));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 320, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Ocupación:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField6.setMaximumSize(new java.awt.Dimension(6, 24));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 320, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jPasswordField1.setEditable(false);
        jPasswordField1.setText("jPasswordField1");
        jPanel7.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 320, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setText("Editar Datos");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));
        jPanel4.setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel8.setBackground(new java.awt.Color(243, 243, 243));
        jPanel8.setPreferredSize(new java.awt.Dimension(870, 660));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel8);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, -5, 870, 660);

        jTabbedPane2.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(243, 243, 243));

        jLabel5.setText("Administrador");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel5)
                .addContainerGap(641, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(74, 74, 74))
        );

        jTabbedPane2.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(243, 243, 243));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab4", jPanel6);

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setLayout(null);
        jTabbedPane2.addTab("tab1", jPanel2);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 920, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
        Color azul = new Color(0, 153, 255);
        jButton5.setBackground(azul);
        
        try {
            Comando = Funcion.Select(st, "SELECT * FROM usuario_principal;");
            while (Comando.next()) {
                jTextField5.setText(String.valueOf(Comando.getObject("nombre_usuario")));
                jTextField6.setText(String.valueOf(Comando.getObject("cargo_usuario")));
                jTextField10.setText(String.valueOf(Comando.getObject("apodo_usuario")));
                jPasswordField1.setText(String.valueOf(Comando.getObject("contrasena_usuario")));
            }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
        Color azul = new Color(0, 153, 255);
        jButton6.setBackground(azul);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            // TODO add your handling code here:
        int i = 0;
        int Altura = 0;
        Color gris = new Color(44, 44, 44);
        jTabbedPane2.setSelectedIndex(2);
        Color azul = new Color(0, 153, 255);
        jButton7.setBackground(azul);
        JLabel VERMAS = null;
        try {
            //Consultamos todos los clientes
            //ResultSet Comandos = Funcion.Select(st, "SELECT * FROM cliente;");
            /*while(Comandos.next()){
                i++;
            }
            JLabel[] VERMAS = new JLabel[i];
            Funcion.CerrarConsulta(Comandos);*/
            //Comandos = Funcion.Select(st, "SELECT * FROM cliente;");
            int cont = 0;
            //Ciclo para crear un panel para cada uno
            while (i<10) {
                //Creamos un panel con alineacion a la izquierda
                JPanel Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                jPanel8.add(Panel);
                //Tamaño del panel
                Panel.setSize(700, 140);
                // La posicion y del panel ira incrementando para que no se encimen
                Altura = 30 + (i * 150);
                Panel.setLocation(50, Altura);
                Panel.setBackground(Color.white);
                Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                //Creamos label para mostrar los datos del cliente, el codigo html es para que al llegar al final del panel
                //se pase a la siguiente linea y para el margen izquierdo
                JLabel RFC = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "RFC: " + "FRFOFO20402'3"));
                JLabel Nombre = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Nombre: " + "Juan Camaney"));
                JLabel Direccion = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Direccion: " + "Avenida Siempre Viva No 2"));
                JLabel Correo = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:50px;'>%s</div><html>", Panel.getWidth(), "Correo: " + "hola@quehace.com"));
                VERMAS = new JLabel(String.format("<html><div WIDTH=%d style='margin-left:450px;'><u>Ver mas</u></div><html>", Panel.getWidth()));
                VERMAS.setToolTipText(String.valueOf(i));
                MouseListener ml = new MouseListener() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    //System.out.println("Released!");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    //System.out.println("Pressed!");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //System.out.println("Exited!");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //System.out.println("Entered!");
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    JLabel source = (JLabel) e.getSource();
                    System.out.println(source.getToolTipText());
                    
                }
        };
        VERMAS.addMouseListener(ml);
//Fuente del texto
                RFC.setFont(new Font("Verdana", Font.PLAIN, 13));
                RFC.setForeground(gris);
                Nombre.setFont(new Font("Verdana", Font.PLAIN, 13));
                Nombre.setForeground(gris);
                Direccion.setFont(new Font("Verdana", Font.PLAIN, 13));
                Direccion.setForeground(gris);
                Correo.setFont(new Font("Verdana", Font.PLAIN, 13));
                Correo.setForeground(gris);
                VERMAS.setFont(new Font("Verdana", Font.PLAIN, 13));
                VERMAS.setForeground(azul);                
                VERMAS.setCursor(new Cursor(Cursor.HAND_CURSOR));
                //Añadimos los label al panel correspondiente del cliente
                Panel.add(RFC);
                Panel.add(Nombre);
                Panel.add(Direccion);
                Panel.add(Correo);
                Panel.add(VERMAS);
                i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Dependiendo de cuantos clientes se agregaron, se ajusta el tamaño del panel principal para que el scroll llegue hasta ahi
        jPanel8.setPreferredSize(new Dimension(jPanel8.getWidth(), Altura + 150));
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
        Color azul = new Color(0, 153, 255);
        Color gris = new Color(44, 44, 44);
        jButton4.setBackground(azul);

    }//GEN-LAST:event_jButton4ActionPerformed

    
    
//***************Buton  nueva Factura**********************************//////////////
    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        Color azul = new Color(0, 182, 230);
        jButton5.setBackground(azul);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        Color gris = new Color(44, 44, 44);
        jButton5.setBackground(gris);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    ///*****************button Azul    
    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        Color azul = new Color(0, 182, 230);
        jButton6.setBackground(azul);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        Color azul = new Color(0, 182, 230);
        jButton7.setBackground(azul);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        Color azul = new Color(0, 182, 230);
        jButton4.setBackground(azul);
    }//GEN-LAST:event_jButton4MouseEntered

//******************** Button Gris 
    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        Color gris = new Color(44, 44, 44);
        jButton6.setBackground(gris);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        Color gris = new Color(44, 44, 44);
        jButton7.setBackground(gris);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        Color gris = new Color(44, 44, 44);
        jButton4.setBackground(gris);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        Color azul = new Color(0, 182, 230);
        jButton8.setBackground(azul);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        Color gris = new Color(44, 44, 44);
        jButton8.setBackground(gris);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        Color azul = new Color(0, 153, 255);
        Color gris = new Color(44, 44, 44);
        jButton8.setBackground(azul);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        if(!estado_BotonPerfil){
            jTextField5.setEditable(true);
            jTextField6.setEditable(true);
            jPasswordField1.setEditable(true);
            jButton2.setText("Guardar Cambios");
            estado_BotonPerfil = true;
        }
        else{
            System.out.println("Dentro!!!");
            if(jTextField5.getText().equalsIgnoreCase("") || jTextField6.getText().equalsIgnoreCase("") || jTextField10.getText().equalsIgnoreCase("") || jPasswordField1.getText().toString() != ""){
                String actualizacion;
                actualizacion = "UPDATE usuario_principal SET" +
                        " nombre_usuario = '" + jTextField5.getText() + 
                        "', cargo_usuario = '" + jTextField6.getText() + 
                        "', apodo_usuario = '" + jTextField10.getText() + 
                        "', contrasena_usuario = '" + jPasswordField1.getText() + 
                        "' WHERE apodo_usuario = '" + jTextField10.getText() + "';";
                Funcion.Update(st, actualizacion);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jPasswordField1.setEditable(false);
                jButton2.setText("Editar Datos");  
                estado_BotonPerfil = false;
            }
        }
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////////////////////////////
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
