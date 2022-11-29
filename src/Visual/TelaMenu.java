/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Externos.Drawer;
import Externos.DrawerItem;
import Externos.EventDrawer;
import Externos.Header;
import java.awt.Color;
import javax.swing.ImageIcon;
import Externos.*;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author 0062928
 */
public class TelaMenu extends javax.swing.JFrame {

    private DrawerController drawer;

    public TelaMenu() {
        initComponents();
        drawer = Drawer.newDrawer(this)
                .background(new Color(90, 90, 90))
                .closeOnPress(false)
                .backgroundTransparent(0.3f)
                .leftDrawer(true)
                .enableScroll(true)
                .enableScrollUI(false)
                .headerHeight(160)
                .header(new Header())
                .space(3)
                .addChild(new DrawerItem("Mesa").icon(new ImageIcon(getClass().getResource("/icon/user.png"))).build())
                .addChild(new DrawerItem("Produtos").icon(new ImageIcon(getClass().getResource("/icon/cont.png"))).build())
                .addChild(new DrawerItem("Ingredientes").icon(new ImageIcon(getClass().getResource("/icon/report.png"))).build())
                .addChild(new DrawerItem("Vendas").icon(new ImageIcon(getClass().getResource("/icon/income.png"))).build())
                .addChild(new DrawerItem("Funcionarios").icon(new ImageIcon(getClass().getResource("/icon/expense.png"))).build())
                .addChild(new DrawerItem("Fornecedores").icon(new ImageIcon(getClass().getResource("/icon/data.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                     if(index == 0){
                        dispose();
                        TelaFuncionario t = new TelaFuncionario();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     if(index == 1){
                        dispose();
                        TelaFuncionario t = new TelaFuncionario();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     if(index == 2){
                        dispose();
                        TelaIngrediente t = new TelaIngrediente();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     if(index == 3){
                        dispose();
                        TelaFuncionario t = new TelaFuncionario();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     if(index == 4){
                        dispose();
                        TelaFuncionario t = new TelaFuncionario();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     if(index == 5){
                        dispose();
                        TelaFornecedor t = new TelaFornecedor();
                        t.setVisible(true);
                        t.setLocationRelativeTo(null);
                     }
                     
                    }
                    
                })
                .build();
        
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
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

        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Menu.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    // End of variables declaration//GEN-END:variables
}
