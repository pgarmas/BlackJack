/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import static blackjack.BlackJack.handAceCount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author polina.garmas
 */
public class MainFrame extends javax.swing.JFrame {

    Deck koloda;
    ArrayList<Card> playerHand;
    ArrayList<Card> dealerHand;
    
    boolean gameOver = false;
    boolean playerIsDone = false;
    boolean dealerIsDone = false;
    String gameOverText;
    
    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Взять ещё карту");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Финал");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Карты дилера");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setName(""); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel2.setText("Карты игрока");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(25);
        jTextArea4.setPreferredSize(new java.awt.Dimension(154, 64));
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel3.setText("Очки дилера");

        jButton3.setText("Начать раунд");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Очки игрока");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        gameOver = false;
        playerIsDone = false;
        dealerIsDone = false;
        jTextArea1.setText("Начало раунда:\nДилер сдает себе и игроку по две карты.\n");
        
        koloda = new Deck();
        koloda.shuffle();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());
        playerHand.add(koloda.getCard());
        dealerHand.add(koloda.getCard());
        showOutcome(playerHand, dealerHand);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
        
        gameCheck();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gameCheck()
    {
        
            showOutcome(playerHand, dealerHand);
            if (handValue(playerHand).get(0)>21) {//если у игрока перебор
                gameOver=true;
                }
            if (handValue(dealerHand).get(0)>21) {//если у дилера перебор
                gameOver=true;
                }
            if (has21(handValue(dealerHand)))
            {
                dealerIsDone=true;
            }
            if (has21(handValue(playerHand)))
            {
                playerIsDone=true;
            }
            
            if (dealerIsDone&&playerIsDone) {
                endGame();
                return;
            }
                
                jButton2.setEnabled(!playerIsDone);
                jButton1.setEnabled(!playerIsDone);
                if (gameOver) endGame();
                else if (playerIsDone) dealerMove();
                    
    }
    
    private void endGame()
    {
        int playerBest = BestValue(handValue(playerHand));
        int dealerBest = BestValue(handValue(dealerHand));
        //выбираем сообщение о конце игры
        //если у обоих перебор
        if (handValue(playerHand).get(0)>21&&handValue(dealerHand).get(0)>21) 
        {
            gameOverText="У обоих перебор, никто не выиграл!\n";
        } else
        //если у игрока перебор, а диллер в порядке
        if (handValue(playerHand).get(0)>21&&handValue(dealerHand).get(0)<=21) 
        {
            gameOverText="У игрока перебор, выиграл дилер!\n";
        }else
        //если у дилера перебор, а игрок в порядке
        if (handValue(playerHand).get(0)<=21&&handValue(dealerHand).get(0)>21) 
        {
            gameOverText="У дилера перебор, выиграл игрок!\n";
        }else
        //если у игрока 21, а у диллера нет
        if (playerBest==21&&dealerBest!=21) 
        {
            gameOverText="У игрока 21!\n";
        }else
        //если у диллера 21, а у игрока нет
        if (playerBest!=21&&dealerBest==21) 
        {
            gameOverText="У дилера 21!\n";
        }else
        //если у обоих 21
        if (playerBest==21&&dealerBest==21) 
        {
            gameOverText="У обоих 21! Ничья!\n";
        }else
        //у игрока больше чем у диллера
        if (playerBest>dealerBest) 
        {
            gameOverText="У игрока "+playerBest+" очков, у дилера "+dealerBest+" очков.\nИгрок выиграл!\n" ;
        }else
        //у игрока меньше чем у диллера  
        if (playerBest<dealerBest) 
        {
            gameOverText="У игрока "+playerBest+" очков, у дилера "+dealerBest+" очков.\nДилер выиграл!\n" ;
        }else
        //у обоих поровну
        if (playerBest==dealerBest) 
        {
            gameOverText="У игрока "+playerBest+" очков, у дилера "+dealerBest+" очков.\nНичья!\n" ;
        }
        
        jTextArea1.setText(jTextArea1.getText()+gameOverText);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        JOptionPane.showMessageDialog(null, gameOverText);
    }
    
    private void dealerMove()
    {
        if (dealerNeedMoreCard(handValue(dealerHand))) {
                    dealerHand.add(koloda.getCard());
                    jTextArea1.setText(jTextArea1.getText()+"Дилер берет себе карту\n");
                    showOutcome(playerHand, dealerHand);
                } else {
            dealerIsDone=true;
        }
        gameCheck();
    }
    
    private static int BestValue (ArrayList<Integer> currentPoints) 
    {
        int bestValue=0;
        for (Integer currentPoint : currentPoints) {
            if (currentPoint>bestValue&&currentPoint<=21) {
                bestValue=currentPoint;
            }
        }
        if (bestValue==0) {
            bestValue=currentPoints.get(0);
        }
        return bestValue;
    }
    
    private static boolean has21 (ArrayList<Integer> currentPoints){
        return currentPoints.contains(21);
    }
    
    private static boolean dealerNeedMoreCard (ArrayList<Integer> currentPoints){
        return !(currentPoints.contains(17)||
                currentPoints.contains(18)||
                currentPoints.contains(19)||
                currentPoints.contains(20)||
                currentPoints.contains(21));
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Вы выбрали закончить игру+ написать об этом в окне хода игры
        jTextArea1.setText(jTextArea1.getText()+"Вы выбрали закончить игру\n");
        playerIsDone=true;
        jButton2.setEnabled(!playerIsDone);
        jButton1.setEnabled(!playerIsDone);
        //надо обновить окошки с картами и очками игрока
        showOutcome(playerHand, dealerHand);
        //надо вернуться на игровой цикл
        dealerMove();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //надо сдать игроку карту + написать об этом в окне хода игры
        playerHand.add(koloda.getCard());
        jTextArea1.setText(jTextArea1.getText()+"Дилер сдает игроку карту\n");
        //надо обновить окошки с картами и очками игрока
        showOutcome(playerHand, dealerHand);
        dealerMove();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTextArea1.setLineWrap(true);
        jTextArea2.setLineWrap(true);
        jTextArea3.setLineWrap(true);
        jTextArea4.setLineWrap(true);
    }//GEN-LAST:event_formWindowOpened

    void showOutcome(ArrayList<Card> playerHand,ArrayList<Card> dealerHand)
    {
        String playerCards="";
        for (Card deck1 : playerHand) {
             playerCards+=deck1.name()+"\n";
        }
        jTextArea4.setText(playerCards);
        
        jTextArea5.setText(handValue(playerHand).toString()); 
        
        String dealerCards="";
             for (Card deck1 : dealerHand) {
             dealerCards+=deck1.name()+"\n";
        }
        jTextArea2.setText(dealerCards);
        jTextArea3.setText(handValue(dealerHand).toString());  
        
        
            
        

    }
    
    public static ArrayList<Integer> handValue (ArrayList<Card> hand)
    {
        int sum=0;
        for (Card crd : hand) {
            //add card value to the sum
            if (crd.getValue()==Values.Ace) sum+=1;
            if (crd.getValue()==Values.Two) sum+=2;
            if (crd.getValue()==Values.Three) sum+=3;
            if (crd.getValue()==Values.Four) sum+=4;
            if (crd.getValue()==Values.Five) sum+=5;
            if (crd.getValue()==Values.Six) sum+=6;
            if (crd.getValue()==Values.Seven) sum+=7;
            if (crd.getValue()==Values.Eight) sum+=8;
            if (crd.getValue()==Values.Nine) sum+=9;
            if (crd.getValue()==Values.Ten) sum+=10;
            if (crd.getValue()==Values.Jack) sum+=10;
            if (crd.getValue()==Values.Queen) sum+=10;
            if (crd.getValue()==Values.King) sum+=10;
            }
        int aces =handAceCount(hand);
        ArrayList<Integer> handValues = new ArrayList<>();
        handValues.add(sum);
        for (int i = 0; i < aces; i++) {
            sum+=10;
            handValues.add(sum);
        }
        
        return handValues;
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
