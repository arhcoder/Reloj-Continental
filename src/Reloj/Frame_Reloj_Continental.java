package Reloj;

// Desarrollador: Alejandro Ramos Herrera (@arhcoder).
// Imágenes utilizadas: Flaticon | Mercado de Vectores | https://www.flaticon.com.
// Licencia: GNU GPLv3.
// Desarrollado en noviembre de 2018.
// Tiempo de desarrollo: 2 días.
// Propósito: Práctica y Entretenimiento.

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Frame_Reloj_Continental extends javax.swing.JFrame implements Runnable{
    
    String Horas,Minutos,Segundos;
    Thread Hilo;
    int H = 0;
    
    String HusoPaís = "Mexico/General";
    
    public Frame_Reloj_Continental() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Reloj Continental - ARH;");
        Hilo = new Thread(this);
        Hilo.start();
        HusoPaís = "Mexico/General";
        fecha(HusoPaís);
        setVisible(true);  
    }
    
    public void fecha(String HusoPaís)
    {
    SimpleDateFormat Formato = new SimpleDateFormat("dd/MM/yyyy");
    Date FechaDate = new Date();
    String FechaPaises= "";
    TimeZone.setDefault(TimeZone.getTimeZone(HusoPaís));
    FechaPaises = Formato.format(FechaDate);
    Lbl_FechaX.setText(FechaPaises);
    }
    public void hora()
    {
        Calendar Calendario = new GregorianCalendar();
        Date HoraActual = new Date();
        Calendario.setTime(HoraActual);
        
        Horas = Calendario.get(Calendar.HOUR_OF_DAY)>9?""+Calendario.get(Calendar.HOUR_OF_DAY):"0"+Calendario.get(Calendar.HOUR_OF_DAY);
        Minutos = Calendario.get(Calendar.MINUTE)>9?""+Calendario.get(Calendar.MINUTE):"0"+Calendario.get(Calendar.MINUTE);
        Segundos = Calendario.get(Calendar.SECOND)>9?""+Calendario.get(Calendar.SECOND):"0"+Calendario.get(Calendar.SECOND);
        H = Calendario.get(Calendar.HOUR_OF_DAY);
        if(H>24)
        {
        H = H - 24;
        }
        Horas = Integer.toString(H);
        fecha(HusoPaís);
    }
    
    public void run()
    {
        Thread Current = Thread.currentThread();
        while(Current==Hilo)
        {
            hora();
            Lbl_HoraX.setText(Horas+":"+Minutos+":"+Segundos);    
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gtb_Continentes = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Lbl_Bandera = new javax.swing.JLabel();
        Lbl_Mapa = new javax.swing.JLabel();
        Lbl_Fecha = new javax.swing.JLabel();
        Lbl_Hora = new javax.swing.JLabel();
        Lbl_FechaX = new javax.swing.JLabel();
        Lbl_HoraX = new javax.swing.JLabel();
        Lbl_País = new javax.swing.JLabel();
        Lbl_Continente = new javax.swing.JLabel();
        Mbr_Menú = new javax.swing.JMenuBar();
        Mop_América = new javax.swing.JMenu();
        Rbt_México = new javax.swing.JRadioButtonMenuItem();
        Rbt_Argentina = new javax.swing.JRadioButtonMenuItem();
        Rbt_Colombia = new javax.swing.JRadioButtonMenuItem();
        Rbt_Ecuador = new javax.swing.JRadioButtonMenuItem();
        Rbt_Chile = new javax.swing.JRadioButtonMenuItem();
        Rbt_Brasil = new javax.swing.JRadioButtonMenuItem();
        Rbt_Canadá = new javax.swing.JRadioButtonMenuItem();
        Rbt_EUA = new javax.swing.JRadioButtonMenuItem();
        Rbt_Perú = new javax.swing.JRadioButtonMenuItem();
        Mop_África = new javax.swing.JMenu();
        Rbt_South_África = new javax.swing.JRadioButtonMenuItem();
        Rbt_Egipto = new javax.swing.JRadioButtonMenuItem();
        Mop_Europa = new javax.swing.JMenu();
        Rbt_Alemania = new javax.swing.JRadioButtonMenuItem();
        Rbt_Portugal = new javax.swing.JRadioButtonMenuItem();
        Rbt_España = new javax.swing.JRadioButtonMenuItem();
        Rbt_Francia = new javax.swing.JRadioButtonMenuItem();
        Rbt_Grecia = new javax.swing.JRadioButtonMenuItem();
        Rbt_Italia = new javax.swing.JRadioButtonMenuItem();
        Rbt_Rusia = new javax.swing.JRadioButtonMenuItem();
        Mop_Asia = new javax.swing.JMenu();
        Rbt_Japón = new javax.swing.JRadioButtonMenuItem();
        Rbt_China = new javax.swing.JRadioButtonMenuItem();
        Rbt_Corea = new javax.swing.JRadioButtonMenuItem();
        Rbt_Taiwán = new javax.swing.JRadioButtonMenuItem();
        Rbt_Filipinas = new javax.swing.JRadioButtonMenuItem();
        Mop_Oceanía = new javax.swing.JMenu();
        Rbt_Australia = new javax.swing.JRadioButtonMenuItem();
        Mop_Instrucciones = new javax.swing.JMenu();
        Mop_Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_México.png"))); // NOI18N
        jDesktopPane1.add(Lbl_Bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 260, 150));

        Lbl_Mapa.setBackground(new java.awt.Color(255, 255, 255));
        Lbl_Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Mapa Mundi.png"))); // NOI18N
        jDesktopPane1.add(Lbl_Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 300, 210));

        Lbl_Fecha.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_Fecha.setForeground(new java.awt.Color(0, 204, 0));
        Lbl_Fecha.setText("Fecha: ");
        jDesktopPane1.add(Lbl_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 41));

        Lbl_Hora.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_Hora.setForeground(new java.awt.Color(0, 204, 0));
        Lbl_Hora.setText("Hora:");
        Lbl_Hora.setToolTipText("");
        jDesktopPane1.add(Lbl_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 41));

        Lbl_FechaX.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_FechaX.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_FechaX.setText("DD/MM/AAAA");
        jDesktopPane1.add(Lbl_FechaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 41));

        Lbl_HoraX.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_HoraX.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_HoraX.setText("00:00:00");
        jDesktopPane1.add(Lbl_HoraX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, 41));

        Lbl_País.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_País.setForeground(new java.awt.Color(255, 0, 0));
        Lbl_País.setText("México");
        jDesktopPane1.add(Lbl_País, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 41));

        Lbl_Continente.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Lbl_Continente.setForeground(new java.awt.Color(0, 102, 255));
        Lbl_Continente.setText("América");
        jDesktopPane1.add(Lbl_Continente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, 41));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        Mop_América.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_América.png"))); // NOI18N
        Mop_América.setText("América");

        Gtb_Continentes.add(Rbt_México);
        Rbt_México.setSelected(true);
        Rbt_México.setText("México");
        Rbt_México.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_MéxicoActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_México);

        Gtb_Continentes.add(Rbt_Argentina);
        Rbt_Argentina.setText("Argentina");
        Rbt_Argentina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_ArgentinaActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Argentina);

        Gtb_Continentes.add(Rbt_Colombia);
        Rbt_Colombia.setText("Colombia");
        Rbt_Colombia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_ColombiaActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Colombia);

        Gtb_Continentes.add(Rbt_Ecuador);
        Rbt_Ecuador.setText("Ecuador");
        Rbt_Ecuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_EcuadorActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Ecuador);

        Gtb_Continentes.add(Rbt_Chile);
        Rbt_Chile.setText("Chile");
        Rbt_Chile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_ChileActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Chile);

        Gtb_Continentes.add(Rbt_Brasil);
        Rbt_Brasil.setText("Brasil");
        Rbt_Brasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_BrasilActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Brasil);

        Gtb_Continentes.add(Rbt_Canadá);
        Rbt_Canadá.setText("Canadá");
        Rbt_Canadá.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_CanadáActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Canadá);

        Gtb_Continentes.add(Rbt_EUA);
        Rbt_EUA.setText("E.U.A");
        Rbt_EUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_EUAActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_EUA);

        Gtb_Continentes.add(Rbt_Perú);
        Rbt_Perú.setText("Perú");
        Rbt_Perú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_PerúActionPerformed(evt);
            }
        });
        Mop_América.add(Rbt_Perú);

        Mbr_Menú.add(Mop_América);

        Mop_África.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_África.png"))); // NOI18N
        Mop_África.setText("África");

        Gtb_Continentes.add(Rbt_South_África);
        Rbt_South_África.setText("South África");
        Rbt_South_África.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_South_ÁfricaActionPerformed(evt);
            }
        });
        Mop_África.add(Rbt_South_África);

        Gtb_Continentes.add(Rbt_Egipto);
        Rbt_Egipto.setText("Egipto");
        Rbt_Egipto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_EgiptoActionPerformed(evt);
            }
        });
        Mop_África.add(Rbt_Egipto);

        Mbr_Menú.add(Mop_África);

        Mop_Europa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Europa.png"))); // NOI18N
        Mop_Europa.setText("Europa");

        Gtb_Continentes.add(Rbt_Alemania);
        Rbt_Alemania.setText("Alemania");
        Rbt_Alemania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_AlemaniaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Alemania);

        Gtb_Continentes.add(Rbt_Portugal);
        Rbt_Portugal.setText("Portugal");
        Rbt_Portugal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_PortugalActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Portugal);

        Gtb_Continentes.add(Rbt_España);
        Rbt_España.setText("España");
        Rbt_España.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_EspañaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_España);

        Gtb_Continentes.add(Rbt_Francia);
        Rbt_Francia.setText("Francia");
        Rbt_Francia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_FranciaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Francia);

        Gtb_Continentes.add(Rbt_Grecia);
        Rbt_Grecia.setText("Grecia");
        Rbt_Grecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_GreciaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Grecia);

        Gtb_Continentes.add(Rbt_Italia);
        Rbt_Italia.setText("Italia");
        Rbt_Italia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_ItaliaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Italia);

        Gtb_Continentes.add(Rbt_Rusia);
        Rbt_Rusia.setText("Rusia");
        Rbt_Rusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_RusiaActionPerformed(evt);
            }
        });
        Mop_Europa.add(Rbt_Rusia);

        Mbr_Menú.add(Mop_Europa);

        Mop_Asia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Asia.png"))); // NOI18N
        Mop_Asia.setText("Asia");

        Gtb_Continentes.add(Rbt_Japón);
        Rbt_Japón.setText("Japón");
        Rbt_Japón.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_JapónActionPerformed(evt);
            }
        });
        Mop_Asia.add(Rbt_Japón);

        Gtb_Continentes.add(Rbt_China);
        Rbt_China.setText("China");
        Rbt_China.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_ChinaActionPerformed(evt);
            }
        });
        Mop_Asia.add(Rbt_China);

        Gtb_Continentes.add(Rbt_Corea);
        Rbt_Corea.setText("Corea");
        Rbt_Corea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_CoreaActionPerformed(evt);
            }
        });
        Mop_Asia.add(Rbt_Corea);

        Gtb_Continentes.add(Rbt_Taiwán);
        Rbt_Taiwán.setText("Taiwán");
        Rbt_Taiwán.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_TaiwánActionPerformed(evt);
            }
        });
        Mop_Asia.add(Rbt_Taiwán);

        Gtb_Continentes.add(Rbt_Filipinas);
        Rbt_Filipinas.setText("Filipinas");
        Rbt_Filipinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_FilipinasActionPerformed(evt);
            }
        });
        Mop_Asia.add(Rbt_Filipinas);

        Mbr_Menú.add(Mop_Asia);

        Mop_Oceanía.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Oceanía.png"))); // NOI18N
        Mop_Oceanía.setText("Oceanía");

        Gtb_Continentes.add(Rbt_Australia);
        Rbt_Australia.setText("Australia");
        Rbt_Australia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbt_AustraliaActionPerformed(evt);
            }
        });
        Mop_Oceanía.add(Rbt_Australia);

        Mbr_Menú.add(Mop_Oceanía);

        Mop_Instrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Instrucciones.png"))); // NOI18N
        Mop_Instrucciones.setText("Instrucciones");
        Mop_Instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mop_InstruccionesMouseClicked(evt);
            }
        });
        Mbr_Menú.add(Mop_Instrucciones);

        Mop_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reloj/spr_Salir.png"))); // NOI18N
        Mop_Salir.setText("Salir");
        Mop_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mop_SalirMouseClicked(evt);
            }
        });
        Mbr_Menú.add(Mop_Salir);

        setJMenuBar(Mbr_Menú);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rbt_MéxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_MéxicoActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_México.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("México");
    HusoPaís = "Mexico/General";
    fecha(HusoPaís);
    hora();
    }//GEN-LAST:event_Rbt_MéxicoActionPerformed

    private void Rbt_EcuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_EcuadorActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Ecuador.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Ecuador");
    HusoPaís = "America/Guayaquil";
    hora();
    }//GEN-LAST:event_Rbt_EcuadorActionPerformed

    private void Rbt_ArgentinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_ArgentinaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Argentina.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Argentina");
    HusoPaís = "America/Argentina/Buenos_Aires";
    hora();
    }//GEN-LAST:event_Rbt_ArgentinaActionPerformed

    private void Rbt_ColombiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_ColombiaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Colombia.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Colombia");
    HusoPaís = "America/Bogota";
    hora();
    }//GEN-LAST:event_Rbt_ColombiaActionPerformed

    private void Rbt_PerúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_PerúActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Perú.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Perú");
    HusoPaís = "America/Lima";
    hora();
    }//GEN-LAST:event_Rbt_PerúActionPerformed

    private void Rbt_ChileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_ChileActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Chile.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Chile");
    HusoPaís = "America/Santiago";
    hora();
    }//GEN-LAST:event_Rbt_ChileActionPerformed

    private void Rbt_AlemaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_AlemaniaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Alemania.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("Alemania");
    HusoPaís = "Europe/Berlin";
    hora();
    }//GEN-LAST:event_Rbt_AlemaniaActionPerformed

    private void Rbt_PortugalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_PortugalActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Portugal.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("Portugal");
    HusoPaís = "Portugal";
    hora();
    }//GEN-LAST:event_Rbt_PortugalActionPerformed

    private void Rbt_GreciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_GreciaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Grecia.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("Grecia");
    HusoPaís = "Europe/Athens";
    hora();
    }//GEN-LAST:event_Rbt_GreciaActionPerformed

    private void Rbt_FranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_FranciaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Francia.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("Francia");
    HusoPaís = "Europe/Paris";
    hora();
    }//GEN-LAST:event_Rbt_FranciaActionPerformed

    private void Rbt_EspañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_EspañaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_España.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("España");
    HusoPaís = "Europe/Madrid";
    hora();
    }//GEN-LAST:event_Rbt_EspañaActionPerformed

    private void Rbt_ItaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_ItaliaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Italia.png")));
    Lbl_Continente.setText("Europa");
    Lbl_País.setText("Italia");
    HusoPaís = "Europe/Rome";
    hora();
    }//GEN-LAST:event_Rbt_ItaliaActionPerformed

    private void Rbt_JapónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_JapónActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Japón.png")));
    Lbl_Continente.setText("Asia");
    Lbl_País.setText("Japón");
    HusoPaís = "Japan";
    hora();
    }//GEN-LAST:event_Rbt_JapónActionPerformed

    private void Rbt_ChinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_ChinaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_China.png")));
    Lbl_Continente.setText("Asia");
    Lbl_País.setText("China");
    HusoPaís = "Asia/Hong_Kong";
    hora();
    }//GEN-LAST:event_Rbt_ChinaActionPerformed

    private void Rbt_CoreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_CoreaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Corea.png")));
    Lbl_Continente.setText("Asia");
    Lbl_País.setText("Corea");
    HusoPaís = "Asia/Seoul";
    hora();
    }//GEN-LAST:event_Rbt_CoreaActionPerformed

    private void Rbt_TaiwánActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_TaiwánActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Taiwán.png")));
    Lbl_Continente.setText("Asia");
    Lbl_País.setText("Taiwán");
    HusoPaís = "Asia/Taipei";
    hora();
    }//GEN-LAST:event_Rbt_TaiwánActionPerformed

    private void Rbt_FilipinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_FilipinasActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Filipinas.png")));
    Lbl_Continente.setText("Asia");
    Lbl_País.setText("Filipinas");
    HusoPaís = "Asia/Manila";
    hora();
    }//GEN-LAST:event_Rbt_FilipinasActionPerformed

    private void Mop_InstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mop_InstruccionesMouseClicked
    // Instrucciones //
    JOptionPane.showMessageDialog(null,"Instrucciones:\n" +
    "\n" +
    "Haz clic en las pestañas de la\n" +
    "parte superior del programa, y\n" +
    "selecciona el país del que qui-\n" +
    "eras conocer la fecha y la hora.\n" +
    "\n" +
    "Da clic sobre el nombre del país,\n" +
    "para actualizar la pantalla del\n" +
    "programa.\n"+
    "\n" +
    "NOTA: La hora y fecha de cada país,\n"+
    "está actualizada con respecto a la\n"+
    "hora y fecha de la capital del mísmo.");
    }//GEN-LAST:event_Mop_InstruccionesMouseClicked

    private void Rbt_South_ÁfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_South_ÁfricaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_South_África.png")));
    Lbl_Continente.setText("África");
    Lbl_País.setText("South África");
    HusoPaís = "Africa/Johannesburg";
    hora();
    }//GEN-LAST:event_Rbt_South_ÁfricaActionPerformed

    private void Rbt_AustraliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_AustraliaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Australia.png")));
    Lbl_Continente.setText("Oceanía");
    Lbl_País.setText("Australia");
    HusoPaís = "Australia/Canberra";
    hora();
    }//GEN-LAST:event_Rbt_AustraliaActionPerformed

    private void Mop_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mop_SalirMouseClicked
    this.dispose();
    }//GEN-LAST:event_Mop_SalirMouseClicked

    private void Rbt_EUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_EUAActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_EUA.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("E.U.A");
    HusoPaís = "America/New_York";
    hora();
    }//GEN-LAST:event_Rbt_EUAActionPerformed

    private void Rbt_CanadáActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_CanadáActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Canadá.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Canadá");
    HusoPaís = "Canada/Eastern";
    hora();
    }//GEN-LAST:event_Rbt_CanadáActionPerformed

    private void Rbt_BrasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_BrasilActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Brasil.png")));
    Lbl_Continente.setText("América");
    Lbl_País.setText("Brasil");
    HusoPaís = "America/Sao_Paulo";
    hora();
    }//GEN-LAST:event_Rbt_BrasilActionPerformed

    private void Rbt_RusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_RusiaActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Rusia.png")));
    Lbl_Continente.setText("Europa/Asia");
    Lbl_País.setText("Rusia");
    HusoPaís = "Europe/Moscow";
    hora();
    }//GEN-LAST:event_Rbt_RusiaActionPerformed

    private void Rbt_EgiptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbt_EgiptoActionPerformed
    Lbl_Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banderas/spr_Egipto.png")));
    Lbl_Continente.setText("África");
    Lbl_País.setText("Egipto");
    HusoPaís = "Egypt";
    hora();
    }//GEN-LAST:event_Rbt_EgiptoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_Reloj_Continental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Reloj_Continental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Reloj_Continental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Reloj_Continental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Reloj_Continental().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gtb_Continentes;
    private javax.swing.JLabel Lbl_Bandera;
    private javax.swing.JLabel Lbl_Continente;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_FechaX;
    private javax.swing.JLabel Lbl_Hora;
    private javax.swing.JLabel Lbl_HoraX;
    private javax.swing.JLabel Lbl_Mapa;
    private javax.swing.JLabel Lbl_País;
    private javax.swing.JMenuBar Mbr_Menú;
    private javax.swing.JMenu Mop_América;
    private javax.swing.JMenu Mop_Asia;
    private javax.swing.JMenu Mop_Europa;
    private javax.swing.JMenu Mop_Instrucciones;
    private javax.swing.JMenu Mop_Oceanía;
    private javax.swing.JMenu Mop_Salir;
    private javax.swing.JMenu Mop_África;
    private javax.swing.JRadioButtonMenuItem Rbt_Alemania;
    private javax.swing.JRadioButtonMenuItem Rbt_Argentina;
    private javax.swing.JRadioButtonMenuItem Rbt_Australia;
    private javax.swing.JRadioButtonMenuItem Rbt_Brasil;
    private javax.swing.JRadioButtonMenuItem Rbt_Canadá;
    private javax.swing.JRadioButtonMenuItem Rbt_Chile;
    private javax.swing.JRadioButtonMenuItem Rbt_China;
    private javax.swing.JRadioButtonMenuItem Rbt_Colombia;
    private javax.swing.JRadioButtonMenuItem Rbt_Corea;
    private javax.swing.JRadioButtonMenuItem Rbt_EUA;
    private javax.swing.JRadioButtonMenuItem Rbt_Ecuador;
    private javax.swing.JRadioButtonMenuItem Rbt_Egipto;
    private javax.swing.JRadioButtonMenuItem Rbt_España;
    private javax.swing.JRadioButtonMenuItem Rbt_Filipinas;
    private javax.swing.JRadioButtonMenuItem Rbt_Francia;
    private javax.swing.JRadioButtonMenuItem Rbt_Grecia;
    private javax.swing.JRadioButtonMenuItem Rbt_Italia;
    private javax.swing.JRadioButtonMenuItem Rbt_Japón;
    private javax.swing.JRadioButtonMenuItem Rbt_México;
    private javax.swing.JRadioButtonMenuItem Rbt_Perú;
    private javax.swing.JRadioButtonMenuItem Rbt_Portugal;
    private javax.swing.JRadioButtonMenuItem Rbt_Rusia;
    private javax.swing.JRadioButtonMenuItem Rbt_South_África;
    private javax.swing.JRadioButtonMenuItem Rbt_Taiwán;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}