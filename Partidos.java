
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author 18299
 */
public class Partidos extends javax.swing.JInternalFrame {
    boolean creando = true;
    ManejoArchivo ma = new ManejoArchivo();
    public static String Satigualinea="";
    /**
     * Creates new form Partidos
     */
    public Partidos() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        votos = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento de Partidos");

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("ID");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Descripción");

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Votos");

        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setText("CREANDO");
        estado.setCaretColor(new java.awt.Color(255, 0, 0));
        estado.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        estado.setEnabled(false);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(desc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(votos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Guardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(votos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(votos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        //System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        String mid = id.getText();
        if(mid.isEmpty()){
            JOptionPane.showMessageDialog(null, "El ID es obligatorio.");
            return;
        }
        String mdesc = desc.getText();
        if(mdesc.isEmpty()){
            JOptionPane.showMessageDialog(null, "La descripcion es obligatoria.");
            return;
        }
        String mvotos = votos.getText();
        if(mvotos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Los votos son obligatorios.");
            return;
        }
        
        String slineanueva = "";
        
                if(creando == true){
            File f = new File("C:partidos.txt");

            try{
                if(!f.exists()){
                    f.createNewFile();
                }
                try ( //BufferedReader br = new BufferedReader(new FileReader(f));
                        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
                    bw.write(mid + " ; " + mdesc + " ; " + mvotos + " \n");
                    //bw.newLine();
                    bw.flush();
                }
            }catch(IOException ex){
                System.out.println("Error E/S: "+ex);
            }
        }else{
            File fnuevo = new File("C:partidos1.txt");
            File fantiguo = new File("C:partidos.txt");

            String acadena = (mid + " ; " + mdesc + " ; " + mvotos + " \n");
            String bcadena = (mid + " ; " + mdesc + " ; " + mvotos + " \n");
            int aid = Integer.parseInt(mid);

            BufferedReader br;

            try{
                if(fantiguo.exists()){
                    br = new BufferedReader(new FileReader(fantiguo));
                    BufferedWriter bw = new BufferedWriter (new FileWriter(fnuevo, true));
                            
                    String linea;

                    Scanner s = new Scanner(fantiguo);
                    while(s.hasNextLine()){
                        linea = s.nextLine();
                        Scanner sl = new Scanner(linea);

                        sl.useDelimiter("\\s*;\\s*");
                        int bid = Integer.parseInt(sl.next());

                        if(aid==bid){
                            bw.write(mid + " ; " + mdesc + " ; " + mvotos);
                            bw.newLine();
                        }else{
                            bw.write(linea);
                            bw.newLine();
                        }

                    }//fin whilw
                    s.close();
                    br.close();
                    bw.close();
                    
                    String nomantiguo = fantiguo.getName();

                    //metodo borrar
                    fantiguo.delete();
                    fnuevo.renameTo(fantiguo);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Partidos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Partidos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        estado.setText("CREANDO");
        id.setText("");
        desc.setText("");
        votos.setText("");
    }//GEN-LAST:event_GuardarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        int mid;
        creando = true;

        mid = Integer.parseInt(id.getText());

        Scanner s;

        try{
            File f = new File("C:partidos.txt");
            s = new Scanner(f);

            if(!f.exists()){
                f.createNewFile();
            }else{
                while (s.hasNextLine() && creando==true ){
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    if(mid == Integer.parseInt(sl.next())){
                        desc.setText(sl.next());
                        votos.setText(sl.next());
                        creando = false;

                        estado.setText("MODIFICANDO");

                    }else{
                        creando = true;

                        estado.setText("CREANDO");
                    }

                }

            }
            s.close();

        }catch(IOException e1){
            e1.printStackTrace();
        }
    }//GEN-LAST:event_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        estado.setText("CREANDO");
        id.setText("");
        desc.setText("");
        votos.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField votos;
    // End of variables declaration//GEN-END:variables
}
