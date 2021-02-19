package reloj;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RelojGrafico extends javax.swing.JFrame {

    int Run = 0;
    String dia_noche = "";
    int xMouse;
    int yMouse;
    boolean flag = false;
    public int pausa = 1000;
    boolean bandera = false;

    public int getPausa() {
        return pausa;
    }

    public void setPausa(int pausa) {
        this.pausa = pausa;
    }

///////////////////////////////////ALGORITMO DEL RELOJ/////////////////////////////////////////////////
    public RelojGrafico() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        transparente();
        this.tab.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/Icon/gatoicono.png")).getImage());

        new Thread() {

            public void run() {
                while (Run == 0) {
                    Calendar cal = new GregorianCalendar();

                    int am_pm = cal.get(Calendar.AM_PM);

                    if (am_pm == 1) {
                        dia_noche = "PM";
                    } else {
                        dia_noche = "AM";
                    }
                    String tiempo = cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + dia_noche;
                    Reloj.setText(tiempo);
                }
            }
        }.start();
        new Thread() {

            public void run() {

                while (Run == 0) {

                    cambiar();

                }
            }
        }.start();
    }

    public void pequeño() {
        this.setSize(370, 250);
        this.Fondo.setSize(370, 250);
        this.Lienzo.setSize(370, 250);
        this.Cerrar.setBounds(320, 0, 50, 20);

        botonConfiguracion.setBounds(280, 80, 60, 50);
        botonColor.setBounds(280, 140, 60, 50);
        CambiarImagen.setBounds(280, 200, 60, 50);

        checkBox4.setBounds(350, 170, 20, 18);
        checkBox3.setBounds(350, 190, 20, 18);
        checkBox2.setBounds(350, 210, 18, 18);
        checkBox1.setBounds(350, 230, 20, 18);
        Reloj.setBounds(0, 170, 300, 90);
    }

    public void grande() {
        this.setSize(500, 290);
        this.Fondo.setSize(500, 290);
        this.Lienzo.setSize(500, 290);
        this.Cerrar.setBounds(450, 0, 50, 20);
        botonConfiguracion.setBounds(410, 120, 60, 50);
        botonColor.setBounds(410, 180, 60, 50);
        CambiarImagen.setBounds(410, 240, 60, 50);
        checkBox4.setBounds(480, 210, 20, 18);
        checkBox3.setBounds(480, 230, 20, 18);
        checkBox2.setBounds(480, 250, 18, 18);
        checkBox1.setBounds(480, 270, 20, 18);
        Reloj.setBounds(0, 200, 310, 90);
    }

    public void cambiar() {
        boolean flag2 = false;
        int tamAux = 0;
        if (l.getCabeza() != null) {
            if (flag == true) {
                Nodo aux = l.getCabeza();
                if (l.getCabeza() == l.getCola()) {

                    ImageIcon icon = new ImageIcon(aux.getImg());
                    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));

                    Fondo.setText(null);
                    Fondo.setIcon(icono);
                    try {
                        Thread.sleep(pausa);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    try {
                        while (flag2 != true) {
                            ImageIcon icon = new ImageIcon(aux.getImg());
                            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));

                            Fondo.setText(null);
                            Fondo.setIcon(icono);
                            Thread.sleep(pausa);
                            aux = aux.getSgte();
                            tamAux++;
                            if (tamAux == l.getTam()) {
                                flag2 = true;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else {
                System.out.print("");
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Lienzo = new javax.swing.JPanel();
        Reloj = new javax.swing.JLabel();
        botonConfiguracion = new javax.swing.JButton();
        botonColor = new javax.swing.JButton();
        CambiarImagen = new javax.swing.JButton();
        checkBox1 = new javax.swing.JCheckBox();
        Cerrar = new javax.swing.JLabel();
        checkBox2 = new javax.swing.JCheckBox();
        checkBox3 = new javax.swing.JCheckBox();
        checkBox4 = new javax.swing.JCheckBox();
        Fondo = new javax.swing.JLabel();
        Mover = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        Panel4 = new javax.swing.JPanel();
        lbltexto6 = new javax.swing.JLabel();
        cbvtntam = new javax.swing.JComboBox<>();
        btnvtntam = new javax.swing.JButton();
        btnatras4 = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        btnaplicar = new javax.swing.JButton();
        lbltexto = new javax.swing.JLabel();
        btnatras2 = new javax.swing.JButton();
        txttiempo = new javax.swing.JTextField();
        cbsel = new javax.swing.JComboBox<>();
        Panel2 = new javax.swing.JPanel();
        lbltexto4 = new javax.swing.JLabel();
        cbtam = new javax.swing.JComboBox<>();
        btnaplitam = new javax.swing.JButton();
        btnatras3 = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        lbltexto2 = new javax.swing.JLabel();
        cbimagen = new javax.swing.JComboBox<>();
        btbeliminar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        Lienzo.setBackground(new java.awt.Color(0, 0, 0));
        Lienzo.setMaximumSize(new java.awt.Dimension(500, 290));
        Lienzo.setLayout(null);

        Reloj.setFont(new java.awt.Font("Digital-7 Italic", 0, 65)); // NOI18N
        Reloj.setForeground(new java.awt.Color(0, 255, 0));
        Reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reloj.setText("00:00:00");
        Reloj.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Lienzo.add(Reloj);
        Reloj.setBounds(0, 200, 310, 90);

        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/engranajes.png"))); // NOI18N
        botonConfiguracion.setFocusPainted(false);
        botonConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiguracionActionPerformed(evt);
            }
        });
        Lienzo.add(botonConfiguracion);
        botonConfiguracion.setBounds(410, 120, 60, 50);

        botonColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Colores.png"))); // NOI18N
        botonColor.setFocusPainted(false);
        botonColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorActionPerformed(evt);
            }
        });
        Lienzo.add(botonColor);
        botonColor.setBounds(410, 180, 60, 50);

        CambiarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icono_cargar.png"))); // NOI18N
        CambiarImagen.setPreferredSize(new java.awt.Dimension(50, 50));
        CambiarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarImagenActionPerformed(evt);
            }
        });
        Lienzo.add(CambiarImagen);
        CambiarImagen.setBounds(410, 240, 60, 50);

        checkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox1ActionPerformed(evt);
            }
        });
        Lienzo.add(checkBox1);
        checkBox1.setBounds(480, 270, 20, 18);

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cerrar.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Lienzo.add(Cerrar);
        Cerrar.setBounds(450, 0, 50, 20);

        checkBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox2ActionPerformed(evt);
            }
        });
        Lienzo.add(checkBox2);
        checkBox2.setBounds(480, 250, 18, 18);

        checkBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox3ActionPerformed(evt);
            }
        });
        Lienzo.add(checkBox3);
        checkBox3.setBounds(480, 230, 20, 18);

        checkBox4.setText("jCheckBox1");
        checkBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox4ActionPerformed(evt);
            }
        });
        Lienzo.add(checkBox4);
        checkBox4.setBounds(480, 210, 20, 18);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fondo.gif"))); // NOI18N
        Fondo.setAlignmentY(0.0F);
        Fondo.setMaximumSize(new java.awt.Dimension(500, 290));
        Fondo.setMinimumSize(new java.awt.Dimension(200, 200));
        Fondo.setPreferredSize(new java.awt.Dimension(500, 290));
        Lienzo.add(Fondo);
        Fondo.setBounds(0, 0, 500, 290);
        Fondo.getAccessibleContext().setAccessibleDescription("");

        Mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverMouseDragged(evt);
            }
        });
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverMousePressed(evt);
            }
        });
        Lienzo.add(Mover);
        Mover.setBounds(-10, -10, 530, 330);

        tab.setBackground(new java.awt.Color(0, 0, 0));
        tab.setForeground(new java.awt.Color(255, 0, 0));
        tab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tabMouseDragged(evt);
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabMousePressed(evt);
            }
        });

        Panel4.setBackground(new java.awt.Color(0, 0, 0));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltexto6.setFont(new java.awt.Font("Exquisite", 0, 20)); // NOI18N
        lbltexto6.setForeground(new java.awt.Color(255, 255, 255));
        lbltexto6.setText("Seleccione el tamaño deseado de la ventana");
        Panel4.add(lbltexto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, -1));

        cbvtntam.setFont(new java.awt.Font("Exquisite", 1, 18)); // NOI18N
        cbvtntam.setForeground(new java.awt.Color(0, 0, 0));
        cbvtntam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pequeño", "Grande" }));
        Panel4.add(cbvtntam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, 30));

        btnvtntam.setForeground(new java.awt.Color(0, 0, 0));
        btnvtntam.setText("Aplicar");
        btnvtntam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvtntamActionPerformed(evt);
            }
        });
        Panel4.add(btnvtntam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnatras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anterior.png"))); // NOI18N
        btnatras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatras4ActionPerformed(evt);
            }
        });
        Panel4.add(btnatras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 60));

        tab.addTab("Ventana", Panel4);

        Panel1.setBackground(new java.awt.Color(0, 0, 0));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaplicar.setForeground(new java.awt.Color(0, 0, 0));
        btnaplicar.setText("Aplicar");
        btnaplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplicarActionPerformed(evt);
            }
        });
        Panel1.add(btnaplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        lbltexto.setFont(new java.awt.Font("Exquisite", 0, 24)); // NOI18N
        lbltexto.setForeground(new java.awt.Color(255, 255, 255));
        lbltexto.setText("Cambiar imagen cada:");
        Panel1.add(lbltexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 31));

        btnatras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anterior.png"))); // NOI18N
        btnatras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatras2ActionPerformed(evt);
            }
        });
        Panel1.add(btnatras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 60));

        txttiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttiempoKeyTyped(evt);
            }
        });
        Panel1.add(txttiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, -1));

        cbsel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundos", "Minutos" }));
        cbsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbselActionPerformed(evt);
            }
        });
        Panel1.add(cbsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 120, -1));

        tab.addTab("Tiempo", Panel1);

        Panel2.setBackground(new java.awt.Color(0, 0, 0));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltexto4.setFont(new java.awt.Font("Exquisite", 0, 20)); // NOI18N
        lbltexto4.setForeground(new java.awt.Color(255, 255, 255));
        lbltexto4.setText("Seleccione el tamaño de letra deseado");
        Panel2.add(lbltexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 320, -1));

        cbtam.setFont(new java.awt.Font("Exquisite", 1, 18)); // NOI18N
        cbtam.setForeground(new java.awt.Color(0, 0, 0));
        cbtam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Pequeño", "Mediano", "Grande" }));
        Panel2.add(cbtam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, 30));

        btnaplitam.setForeground(new java.awt.Color(0, 0, 0));
        btnaplitam.setText("Aplicar");
        btnaplitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplitamActionPerformed(evt);
            }
        });
        Panel2.add(btnaplitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnatras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anterior.png"))); // NOI18N
        btnatras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatras3ActionPerformed(evt);
            }
        });
        Panel2.add(btnatras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 60));

        tab.addTab("Tamaño", Panel2);

        Panel3.setBackground(new java.awt.Color(0, 0, 0));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltexto2.setFont(new java.awt.Font("Exquisite", 1, 20)); // NOI18N
        lbltexto2.setForeground(new java.awt.Color(255, 255, 255));
        lbltexto2.setText("Seleccione la imagen que desea");
        Panel3.add(lbltexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        cbimagen.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cbimagen.setForeground(new java.awt.Color(0, 0, 0));
        cbimagen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        model();
        Panel3.add(cbimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, 30));

        btbeliminar.setForeground(new java.awt.Color(0, 0, 0));
        btbeliminar.setText("Eliminar");
        btbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbeliminarActionPerformed(evt);
            }
        });
        Panel3.add(btbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anterior.png"))); // NOI18N
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        Panel3.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 60));

        jLabel1.setFont(new java.awt.Font("Exquisite", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" eliminar del programa");
        Panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        tab.addTab("Borrar", Panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(tab)
                    .addGap(52, 52, 52)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void transparente() {

        botonColor.setOpaque(false);
        botonColor.setBorderPainted(false);
        botonColor.setContentAreaFilled(false);

        botonConfiguracion.setOpaque(false);
        botonConfiguracion.setBorderPainted(false);
        botonConfiguracion.setContentAreaFilled(false);

        CambiarImagen.setOpaque(false);
        CambiarImagen.setBorderPainted(false);
        CambiarImagen.setContentAreaFilled(false);

        checkBox1.setOpaque(false);
        checkBox1.setBorderPainted(false);
        checkBox1.setContentAreaFilled(false);

        checkBox2.setOpaque(false);
        checkBox2.setBorderPainted(false);
        checkBox2.setContentAreaFilled(false);

        checkBox3.setOpaque(false);
        checkBox3.setBorderPainted(false);
        checkBox3.setContentAreaFilled(false);

        checkBox4.setOpaque(false);
        checkBox4.setBorderPainted(false);
        checkBox4.setContentAreaFilled(false);

        btnatras.setOpaque(false);
        btnatras.setBorderPainted(false);
        btnatras.setContentAreaFilled(false);

        btnatras2.setOpaque(false);
        btnatras2.setBorderPainted(false);
        btnatras2.setContentAreaFilled(false);

        btnatras3.setOpaque(false);
        btnatras3.setBorderPainted(false);
        btnatras3.setContentAreaFilled(false);

        btnatras4.setOpaque(false);
        btnatras4.setBorderPainted(false);
        btnatras4.setContentAreaFilled(false);

    }

//////////Codigo para mover la aplicacion por la pantalla ///////////////////
    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoverMouseDragged
//Codigo para presionar y mover por la pantalla ////////////////////////////////////
    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoverMousePressed
    //////////////CAMBIAR IMAGEN DE FONDO////////////////////////////
    File fichero;
    ListaCircular l = new ListaCircular();
    private void CambiarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarImagenActionPerformed

        int resultado;

        CargarImagen ventana = new CargarImagen();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG, JPEG, GIF", "jpg", "PNG", "png", "gif", "jpeg", "JPEG");

        ventana.jfchCargarImagen.setFileFilter(filtro);
        resultado = ventana.jfchCargarImagen.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jfchCargarImagen.getSelectedFile();

            try {

                l.agregarAlFinal(fichero.toString(), fichero.getName());

                flag = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);
            }
            model();
        }

    }//GEN-LAST:event_CambiarImagenActionPerformed
/////////////// CERRAR EL WIDGET /////////////////////////
    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void botonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColorActionPerformed

        this.actionPerformed(evt);

    }//GEN-LAST:event_botonColorActionPerformed

    private void checkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox1ActionPerformed
        if (checkBox1.isSelected()) {
            setAlwaysOnTop(true);
        } else {
            setAlwaysOnTop(false);
        }
    }//GEN-LAST:event_checkBox1ActionPerformed

    private void checkBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox2ActionPerformed
        if (checkBox2.isSelected()) {
            botonColor.setVisible(false);
            botonConfiguracion.setVisible(false);
            CambiarImagen.setVisible(false);
        } else {
            botonColor.setVisible(true);
            botonConfiguracion.setVisible(true);
            CambiarImagen.setVisible(true);
        }
    }//GEN-LAST:event_checkBox2ActionPerformed

    private void checkBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox3ActionPerformed
        if (checkBox3.isSelected()) {
            Reloj.setVisible(false);
        } else {
            Reloj.setVisible(true);

        }
    }//GEN-LAST:event_checkBox3ActionPerformed

    private void checkBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox4ActionPerformed
        if (checkBox4.isSelected()) {
            Cerrar.setVisible(false);
        } else {
            Cerrar.setVisible(true);

        }
    }//GEN-LAST:event_checkBox4ActionPerformed

    private void botonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiguracionActionPerformed
        if (this.bandera == true) {
            this.setSize(500, 290);
            tab.setVisible(true);
            Lienzo.setVisible(false);
        } else {

            tab.setVisible(true);
            Lienzo.setVisible(false);
        }


    }//GEN-LAST:event_botonConfiguracionActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        if (this.bandera == true) {
            pordefecto();
            this.setSize(370, 250);
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);

        } else {
            pordefecto();
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        }
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnatras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatras2ActionPerformed

        if (this.bandera == true) {
            pordefecto();
            this.setSize(370, 250);
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        } else {
            pordefecto();
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        }
    }//GEN-LAST:event_btnatras2ActionPerformed

    private void btnaplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarActionPerformed
        if (txttiempo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción");
        }
        if (cbsel.getSelectedIndex() == 1) {
            int aux=Integer.parseInt(this.txttiempo.getText())*1000;
            this.setPausa(aux);
            pordefecto();
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }
        if (cbsel.getSelectedIndex() == 2) {
            this.setPausa(15000);
            pordefecto();
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }
        


    }//GEN-LAST:event_btnaplicarActionPerformed

    private void btbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbeliminarActionPerformed

        if (cbimagen.getItemCount() == 2) {
            JOptionPane.showMessageDialog(null, "Al borrar esta imagen se asignará la imagen por defecto", "Aviso", 1);
            l.eliminar(cbimagen.getSelectedIndex());
            pordefecto();
            model();
            Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fondo.gif")));
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }

        } else {

            l.eliminar(cbimagen.getSelectedIndex());
            pordefecto();
            model();

            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }

        }


    }//GEN-LAST:event_btbeliminarActionPerformed

    private void btnaplitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplitamActionPerformed
        if (cbtam.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción");
        }
        if (cbtam.getSelectedIndex() == 1) {
            pordefecto();
            this.Reloj.setFont(new java.awt.Font("Digital-7 Italic", 0, 45));
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }
        if (cbtam.getSelectedIndex() == 2) {
            pordefecto();
            this.Reloj.setFont(new java.awt.Font("Digital-7 Italic", 0, 55));
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }
        if (cbtam.getSelectedIndex() == 3) {
            pordefecto();
            this.Reloj.setFont(new java.awt.Font("Digital-7 Italic", 0, 65));
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }

    }//GEN-LAST:event_btnaplitamActionPerformed

    private void btnatras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatras3ActionPerformed
        if (this.bandera == true) {
            pordefecto();
            this.setSize(370, 250);
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        } else {
            pordefecto();
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        }
    }//GEN-LAST:event_btnatras3ActionPerformed

    private void btnvtntamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvtntamActionPerformed
        if (cbvtntam.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción");
        }
        if (cbvtntam.getSelectedIndex() == 1) {
            this.bandera = true;
            pequeño();
            pordefecto();
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }
        if (cbvtntam.getSelectedIndex() == 2) {
            this.bandera = false;
            grande();
            pordefecto();
            if (this.bandera == true) {
                pordefecto();
                this.setSize(370, 250);
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);

            } else {
                pordefecto();
                this.Lienzo.setVisible(true);
                this.tab.setVisible(false);
            }
        }

    }//GEN-LAST:event_btnvtntamActionPerformed

    private void btnatras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatras4ActionPerformed
        if (this.bandera == true) {
            pordefecto();
            this.setSize(370, 250);
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        } else {
            pordefecto();
            this.Lienzo.setVisible(true);
            this.tab.setVisible(false);
        }


    }//GEN-LAST:event_btnatras4ActionPerformed

    private void tabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_tabMousePressed

    private void tabMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_tabMouseDragged

    private void txttiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttiempoKeyTyped
        int num = 9;
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor solo ingrese números");
            txttiempo.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor solo ingrese números");
            txttiempo.setCursor(null);
        }
        if (txttiempo.getText().length() >= num) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "El numero excede el valor permitido");
        }
    }//GEN-LAST:event_txttiempoKeyTyped

    private void cbselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbselActionPerformed

    public void actionPerformed(ActionEvent e) {

        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar un color", null);

        if (nuevoColor != null) {
            Reloj.setForeground(nuevoColor);

        }

    }

    public void pordefecto() {
        cbvtntam.setSelectedIndex(0);
        cbsel.setSelectedIndex(0);
        cbtam.setSelectedIndex(0);
        cbimagen.setSelectedIndex(0);
        tab.setSelectedIndex(0);
    }

    public void model() {

        Nodo aux = l.getCabeza();
        int tamaño = 0;

        String Nombre[] = new String[l.getTam()];
        while (tamaño != l.getTam()) {

            Nombre[tamaño] = aux.getNombre();

            tamaño++;
            aux = aux.getSgte();
        }
        /////////////////////////////////CREA EL MODELO SEGUN EL NUMERO DE CLIENTES//////////   

        try {
            String combo[] = new String[tamaño + 1];//SE CREA EL ARREGLO DE NOMBRES EN LA VARIABLE COMBO
            combo[0] = "..."; //SE FIJA EL PRIMER VALOR DEL ARREGLO 

            for (int i = 1; i < combo.length; i++) {
                combo[i] = Nombre[i - 1];  //SE LLENA EL COMBO CON LOS NOMBRES QUE CONTIENE LA VARIABLE SEPARAR
            }
            //SETEA EL NUEVO COMBO CON LOS NOMBRES DE LOS JUGADORES EXISTENTES, REEMPLAZANDO EL COMBO POR DEFECTO
            this.cbimagen.setModel(new javax.swing.DefaultComboBoxModel<>(combo));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarImagen;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Lienzo;
    private javax.swing.JLabel Mover;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JLabel Reloj;
    private javax.swing.JButton botonColor;
    private javax.swing.JButton botonConfiguracion;
    private javax.swing.JButton btbeliminar;
    private javax.swing.JButton btnaplicar;
    private javax.swing.JButton btnaplitam;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnatras2;
    private javax.swing.JButton btnatras3;
    private javax.swing.JButton btnatras4;
    private javax.swing.JButton btnvtntam;
    private javax.swing.JComboBox<String> cbimagen;
    private javax.swing.JComboBox<String> cbsel;
    private javax.swing.JComboBox<String> cbtam;
    private javax.swing.JComboBox<String> cbvtntam;
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JCheckBox checkBox2;
    private javax.swing.JCheckBox checkBox3;
    private javax.swing.JCheckBox checkBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbltexto;
    private javax.swing.JLabel lbltexto2;
    private javax.swing.JLabel lbltexto4;
    private javax.swing.JLabel lbltexto6;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField txttiempo;
    // End of variables declaration//GEN-END:variables

}
