
package ViewPart;

/**
 *
 * @author Tibebu
 */
public class imgsView extends javax.swing.JFrame {

    /**
     * Creates new form imgsView
     */
    public imgsView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        myprogress = new javax.swing.JProgressBar();
        IMS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precentage = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        myprogress.setBackground(new java.awt.Color(255, 255, 255));
        myprogress.setForeground(new java.awt.Color(0, 102, 102));

        IMS.setBackground(new java.awt.Color(0, 204, 204));
        IMS.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        IMS.setForeground(new java.awt.Color(255, 0, 0));
        IMS.setText("loading...");

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory managment system");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        precentage.setBackground(new java.awt.Color(51, 255, 204));
        precentage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        precentage.setForeground(new java.awt.Color(255, 255, 255));
        precentage.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precentage)
                    .addComponent(IMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(392, 392, 392))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(IMS)
                .addGap(89, 89, 89)
                .addComponent(precentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(myprogress, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

   
    public static void main(String args[]) {
       imgsView myview=new imgsView();
       myview.setVisible(true);
      try
      {
          for(int i=0;i<100;i++)
          {
              Thread.sleep(40);
              myview.myprogress.setValue(i);
              myview.precentage.setText(Integer.valueOf(i)+"%");
              
          }
      }catch(Exception e)
      {
          e.printStackTrace();
      } 
      new Login().setVisible(true);
      myview.dispose();
      
      
     /*
      JFrame fram=new JFrame("INVENTORY SYSTEM");
      fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fram.setSize(400, 400);
      final JLabel lable=new JLabel("drag me");
      lable.setBounds(50, 50, 100, 100);
      lable.setForeground(Color.red);
      lable.setFont(new Font("Arial",Font.BOLD,17));
      fram.add(lable);
      fram.setLayout(null);
      fram.setVisible(true);
      int delay=10;
     Timer timer=new Timer(delay,new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            rotateLabel(lable); 
         }

           private void rotateLabel(JLabel lable) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
      });
     timer.start();
    
      
      
     
    }
     private static void roteteLabbel(JLabel lable)
     {
       rotationAngle++;  
       lable.setText(("<html><body><div style='transform:rotate("+rotationAngle+"deg);'>"+"Rotatibg lable</div></body></html"));
     }*/}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar myprogress;
    private javax.swing.JLabel precentage;
    // End of variables declaration//GEN-END:variables
}
