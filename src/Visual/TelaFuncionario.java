/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import DAO.FuncionarioDAO;
import Externos.Drawer;
import Externos.DrawerItem;
import Externos.EventDrawer;
import Externos.Header;
import java.awt.Color;
import javax.swing.ImageIcon;
import Externos.*;
import Modelagem.Funcionario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.extras.*;
import com.formdev.flatlaf.demo.FlatLafDemo.*;
import com.formdev.flatlaf.demo.*;
import Externos.TextField;
import java.awt.Font;

/**
 *
 * @author 0062928
 */
public class TelaFuncionario extends javax.swing.JFrame {

    private DrawerController drawer;

    public void Listar() {
        FuncionarioDAO d = new FuncionarioDAO();
        List<Funcionario> lista = d.read();
        DefaultTableModel dados = (DefaultTableModel) tabelaListagem.getModel();
        dados.setNumRows(0);
        for (Funcionario f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCpf(),
                f.getCelular(),
                f.getCargo(),
                f.getSalario(),});
        }
    }

    public TelaFuncionario() {
        initComponents();
        drawer = Drawer.newDrawer(this)
                .background(new Color(90, 90, 90))
                .closeOnPress(true)
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
                        if (index == 1 && item.equals(false)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 2 && item.equals(true)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 3 && item.equals(true)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 4 && item.equals(true)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 5 && item.equals(true)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 6 && item.equals(true)) {
                            dispose();
                            TelaFuncionario t = new TelaFuncionario();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }

                    }

                })
                .build();
        
        
        tabelaListagem.setShowHorizontalLines(true);
        tabelaListagem.setShowVerticalLines(true);
        tabelaListagem.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
        tabelaListagem.getTableHeader().setOpaque(false);
        tabelaListagem.getTableHeader().setBackground(new Color(32, 136, 203));
        tabelaListagem.getTableHeader().setForeground(new Color(255,255,255));
        tabelaListagem.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaListagem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxGrupo = new javax.swing.JComboBox<>();
        txtPesquisar = new swing.TextFieldAnimation();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        button1 = new swing.Button();
        button2 = new swing.Button();
        button3 = new swing.Button();
        button4 = new swing.Button();
        button5 = new swing.Button();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        btnSalvar4.setBackground(new java.awt.Color(0, 119, 234));
        btnSalvar4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnSalvar4.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar4.setText("Salvar");
        btnSalvar4.setBorder(null);
        btnSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cpf", "Celular", "Cargo", "Salário"
            }
        ));
        tabelaListagem.setFillsViewportHeight(true);
        tabelaListagem.setGridColor(new java.awt.Color(230, 230, 230));
        tabelaListagem.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tabelaListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaListagemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaListagem);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 775, 247));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setText("Grupo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("Sub Grupo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        boxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -", "Adicionar", " " }));
        boxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGrupoActionPerformed(evt);
            }
        });
        jPanel1.add(boxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txtPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtPesquisar.setAnimationColor(new java.awt.Color(51, 102, 255));
        txtPesquisar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txtPesquisar.setSelectionColor(new java.awt.Color(51, 102, 255));
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 15, 221, 32));

        jTabbedPane1.addTab("Listagem", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel3.setText("Salário:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(450, 150, 50, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel4.setText("Id:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 50, 60, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel5.setText("Nome:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 100, 60, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel6.setText("Celular:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 150, 60, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel7.setText("Cpf:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(450, 50, 50, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel8.setText("Cargo:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(450, 100, 50, 30);
        jPanel2.add(txtNome);
        txtNome.setBounds(140, 100, 210, 27);

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(239, 238, 237));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(140, 50, 210, 27);
        jPanel2.add(txtCelular);
        txtCelular.setBounds(140, 150, 210, 27);
        jPanel2.add(txtCpf);
        txtCpf.setBounds(520, 50, 210, 27);
        jPanel2.add(txtCargo);
        txtCargo.setBounds(520, 100, 210, 27);
        jPanel2.add(txtSalario);
        txtSalario.setBounds(520, 150, 210, 27);

        button1.setBackground(new java.awt.Color(86, 127, 253));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Salvar");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1);
        button1.setBounds(620, 240, 110, 45);

        button2.setBackground(new java.awt.Color(86, 127, 253));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Novo");
        button2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel2.add(button2);
        button2.setBounds(70, 240, 110, 40);

        button3.setBackground(new java.awt.Color(86, 127, 253));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Alterar");
        button3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3);
        button3.setBounds(210, 240, 110, 45);

        button4.setBackground(new java.awt.Color(86, 127, 253));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Excluir");
        button4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel2.add(button4);
        button4.setBounds(350, 240, 110, 45);

        button5.setBackground(new java.awt.Color(86, 127, 253));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Limpar");
        button5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel2.add(button5);
        button5.setBounds(485, 240, 110, 45);

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 800, 350));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Tela Funcionarios.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        Funcionario f = new Funcionario();
        f.setId(Integer.valueOf(txtId.getText()));
        f.setCargo(txtCargo.getText());
        f.setNome(txtNome.getText());
        f.setSalario(txtSalario.getText());
        f.setCelular(txtCelular.getText());
        f.setCpf(txtCpf.getText());
        FuncionarioDAO d = new FuncionarioDAO();
        d.create(f);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        FuncionarioDAO f = new FuncionarioDAO();
        List<Funcionario> fun = f.read();
        txtId.setText(String.valueOf(fun.size() + 1));

        txtNome.setText("");
        txtCpf.setText("");
        txtSalario.setText("");
        txtCargo.setText("");
        txtCelular.setText("");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        Funcionario f = new Funcionario();
        f.setCargo(txtCargo.getText());
        f.setNome(txtNome.getText());
        f.setSalario(txtSalario.getText());
        f.setCelular(txtCelular.getText());
        f.setCpf(txtCpf.getText());
        f.setId(Integer.valueOf(txtId.getText()));
        FuncionarioDAO d = new FuncionarioDAO();
        d.update(f);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        Funcionario f = new Funcionario();
        f.setId(Integer.valueOf(txtId.getText()));
        FuncionarioDAO d = new FuncionarioDAO();
        d.delete(f);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtSalario.setText("");
        txtCargo.setText("");
        txtCelular.setText("");
    }//GEN-LAST:event_button5ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        FuncionarioDAO d = new FuncionarioDAO();
        List<Funcionario> lista = d.readForDesc(txtPesquisar.getText());
        DefaultTableModel dados = (DefaultTableModel) tabelaListagem.getModel();
        dados.setNumRows(0);
        for (Funcionario f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCpf(),
                f.getCelular(),
                f.getCargo(),
                f.getSalario(),});
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void tabelaListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaListagemMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        txtId.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 1).toString());
        txtCpf.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 2).toString());
        txtCelular.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 3).toString());
        txtCargo.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 4).toString());
        txtSalario.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabelaListagemMouseClicked

    private void boxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGrupoActionPerformed
        
        
        if(boxGrupo.getSelectedItem().toString() == "Adicionar"){
            System.out.println("Gayzãooo");
        }
            
    }//GEN-LAST:event_boxGrupoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGrupo;
    private javax.swing.JButton btnSalvar4;
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    private swing.Button button5;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaListagem;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private swing.TextFieldAnimation txtPesquisar;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
