package UI;

import modelo.Calculadora;
import java.awt.event.MouseEvent;

public class UICalculadora extends javax.swing.JFrame {
    
    public Calculadora calc = new Calculadora();
    public double resposta;
    public double op1;
    public double op2;
    public UICalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonOne = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonMul = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonResult = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CALCULADORA");

        jButtonOne.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOne.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonOne.setForeground(new java.awt.Color(153, 153, 153));
        jButtonOne.setText("1");
        jButtonOne.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOneMouseClicked(evt);
            }
        });

        jButtonFour.setBackground(new java.awt.Color(0, 0, 0));
        jButtonFour.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonFour.setForeground(new java.awt.Color(153, 153, 153));
        jButtonFour.setText("4");
        jButtonFour.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFourMouseClicked(evt);
            }
        });

        jButtonSeven.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSeven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSeven.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSeven.setText("7");
        jButtonSeven.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSevenMouseClicked(evt);
            }
        });

        jButtonFive.setBackground(new java.awt.Color(0, 0, 0));
        jButtonFive.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonFive.setForeground(new java.awt.Color(153, 153, 153));
        jButtonFive.setText("5");
        jButtonFive.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFiveMouseClicked(evt);
            }
        });

        jButtonEight.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonEight.setForeground(new java.awt.Color(153, 153, 153));
        jButtonEight.setText("8");
        jButtonEight.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEightMouseClicked(evt);
            }
        });

        jButtonTwo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonTwo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonTwo.setForeground(new java.awt.Color(153, 153, 153));
        jButtonTwo.setText("2");
        jButtonTwo.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTwoMouseClicked(evt);
            }
        });

        jButtonZero.setBackground(new java.awt.Color(0, 0, 0));
        jButtonZero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonZero.setForeground(new java.awt.Color(153, 153, 153));
        jButtonZero.setText("0");
        jButtonZero.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZeroMouseClicked(evt);
            }
        });

        jButtonPoint.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPoint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonPoint.setForeground(new java.awt.Color(153, 153, 153));
        jButtonPoint.setText(".");
        jButtonPoint.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPointMouseClicked(evt);
            }
        });

        jButtonNine.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonNine.setForeground(new java.awt.Color(153, 153, 153));
        jButtonNine.setText("9");
        jButtonNine.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNineMouseClicked(evt);
            }
        });

        jButtonSix.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSix.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSix.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSix.setText("6");
        jButtonSix.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSixMouseClicked(evt);
            }
        });

        jButtonThree.setBackground(new java.awt.Color(0, 0, 0));
        jButtonThree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonThree.setForeground(new java.awt.Color(153, 153, 153));
        jButtonThree.setText("3");
        jButtonThree.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThreeMouseClicked(evt);
            }
        });

        jButtonDiv.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDiv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonDiv.setForeground(new java.awt.Color(153, 153, 153));
        jButtonDiv.setText("/");
        jButtonDiv.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDivMouseClicked(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(153, 153, 153));
        jButtonAdd.setText("+");
        jButtonAdd.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });

        jButtonMul.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonMul.setForeground(new java.awt.Color(153, 153, 153));
        jButtonMul.setText("*");
        jButtonMul.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMulMouseClicked(evt);
            }
        });

        jButtonSub.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSub.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSub.setText("-");
        jButtonSub.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubMouseClicked(evt);
            }
        });

        jButtonResult.setBackground(new java.awt.Color(0, 0, 0));
        jButtonResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonResult.setForeground(new java.awt.Color(153, 153, 153));
        jButtonResult.setText("=");
        jButtonResult.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResultMouseClicked(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 0, 0));
        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(153, 153, 153));
        jButtonClear.setText("C");
        jButtonClear.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
    }

    private void jButtonZeroMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "0");
    }

    private void jButtonOneMouseClicked(java.awt.event.MouseEvent evt) {                                        
                                                
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "1");
      
    }

    private void jButtonTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoMouseClicked
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "2");
    }//GEN-LAST:event_jButtonTwoMouseClicked

    private void jButtonPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPointMouseClicked
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + ".");
    }//GEN-LAST:event_jButtonPointMouseClicked

    private void jButtonThreeMouseClicked(java.awt.event.MouseEvent evt) {                                          
         String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "3");
    }

    private void jButtonFourMouseClicked(java.awt.event.MouseEvent evt) {                                         
         String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "4");
    }

    private void jButtonFiveMouseClicked(java.awt.event.MouseEvent evt) {                                         
         String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "5");
    }

    private void jButtonSixMouseClicked(java.awt.event.MouseEvent evt) {                                        
         String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "6");
    }

    private void jButtonSevenMouseClicked(java.awt.event.MouseEvent evt) {                                          
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "7");
    }

    private void jButtonEightMouseClicked(java.awt.event.MouseEvent evt) {                                          
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "8");
    }

    private void jButtonNineMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String elemento = jTextField1.getText();
        jTextField1.setText(elemento + "9");
    }

    private void jButtonDivMouseClicked(java.awt.event.MouseEvent evt) {                                        
        guardarOperadores();
        calc.setOperacao(Calculadora.OPERACAO.DIVISAO);
        jTextField1.setText("");
    }

    private void jButtonMulMouseClicked(java.awt.event.MouseEvent evt) {                                        
        guardarOperadores();
        calc.setOperacao(Calculadora.OPERACAO.MULTIPLICACAO);
        jTextField1.setText("");
    }

    private void jButtonSubMouseClicked(java.awt.event.MouseEvent evt) {                                        
        guardarOperadores();
        calc.setOperacao(Calculadora.OPERACAO.SUBTRACAO);
        jTextField1.setText("");
    }

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {                                        
        guardarOperadores();
        calc.setOperacao(Calculadora.OPERACAO.ADICAO);
        jTextField1.setText("");

    }

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {
        String aString= jTextField1.getText();
        double aDouble = Double.parseDouble(aString);
        jTextField1.setText("");
        op1=0f;
        op2=0f;

    }//esse ta okay

    private void jButtonResultMouseClicked(MouseEvent evt) {
        guardarOperadores();
        calc.setOperador1(op1);
        calc.setOperador2(op2);
        resposta = calc.calcular();
        jTextField1.setText(String.valueOf(resposta));
        op1 = resposta;

    }
  
    private void guardarOperadores(){
        String aString = jTextField1.getText();
        if(op1==0f) {
            op1 = (Double.parseDouble(aString));
        }else{
            op2 = (Double.parseDouble(aString));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonMul;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JButton jButtonResult;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
