/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import DAO.FornecedorDAO;
import Externos.Drawer;
import Externos.DrawerItem;
import Externos.EventDrawer;
import Externos.Header;
import java.awt.Color;
import javax.swing.ImageIcon;
import Externos.*;
import Modelagem.Fornecedor;
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
public class TelaFornecedor extends javax.swing.JFrame {

    private DrawerController drawer;

    public void Listar() {
        FornecedorDAO d = new FornecedorDAO();
        List<Fornecedor> lista = d.read();
        DefaultTableModel dados = (DefaultTableModel) tabelaListagem.getModel();
        dados.setNumRows(0);
        for (Fornecedor f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),        
                f.getCnpj(),
                f.getEmail(),
                f.getCelular(),
                f.getCep(),         
                f.getRua(),
                f.getNumero(),
                f.getComplemento(),
                f.getBairro(),
                f.getCidade(),         
                f.getEstado(),});
        }
    }

    public TelaFornecedor() {
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
                .addChild(new DrawerItem("Fornecedors").icon(new ImageIcon(getClass().getResource("/icon/expense.png"))).build())
                .addChild(new DrawerItem("Fornecedores").icon(new ImageIcon(getClass().getResource("/icon/data.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (index == 1 && item.equals(false)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 2 && item.equals(true)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 3 && item.equals(true)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 4 && item.equals(true)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 5 && item.equals(true)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
                            t.setVisible(true);
                            t.setLocationRelativeTo(null);
                        }
                        if (index == 6 && item.equals(true)) {
                            dispose();
                            TelaFornecedor t = new TelaFornecedor();
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
        tabelaListagem.getTableHeader().setForeground(new Color(255, 255, 255));
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
        txtPesquisar = new swing.TextFieldAnimation();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        txtCnpj = new javax.swing.JTextField();
        btnSalvar = new swing.Button();
        btnNovo = new swing.Button();
        btnAlterar = new swing.Button();
        btnExcluir = new swing.Button();
        btnLimpar = new swing.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUf = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
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
                "Id", "Nome", "Cnpj", "Email", "Celular", "Cep", "Rua", "N°", "Comp.", "Bairro", "Cidade", "Uf"
            }
        ));
        tabelaListagem.setFocusable(false);
        tabelaListagem.setGridColor(new java.awt.Color(230, 230, 230));
        tabelaListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaListagemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaListagem);
        if (tabelaListagem.getColumnModel().getColumnCount() > 0) {
            tabelaListagem.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaListagem.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaListagem.getColumnModel().getColumn(0).setMaxWidth(100);
            tabelaListagem.getColumnModel().getColumn(7).setPreferredWidth(30);
            tabelaListagem.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 775, 247));

        txtPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtPesquisar.setAnimationColor(new java.awt.Color(51, 102, 255));
        txtPesquisar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
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
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 15, 221, 32));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setText("Grupo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("Sub Grupo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jTabbedPane1.addTab("Listagem", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(620, 30, 90, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel4.setText("Id:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 30, 60, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel5.setText("Nome:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 70, 60, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel6.setText("Celular:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 110, 60, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel7.setText("Cnpj:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 150, 50, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel8.setText("Email:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 190, 50, 30);
        jPanel2.add(txtNome);
        txtNome.setBounds(100, 70, 190, 27);

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(239, 238, 237));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(100, 30, 190, 27);
        jPanel2.add(txtCelular);
        txtCelular.setBounds(100, 110, 190, 27);
        jPanel2.add(txtCnpj);
        txtCnpj.setBounds(100, 150, 190, 27);

        btnSalvar.setBackground(new java.awt.Color(86, 127, 253));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(620, 250, 110, 45);

        btnNovo.setBackground(new java.awt.Color(86, 127, 253));
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo);
        btnNovo.setBounds(70, 250, 110, 45);

        btnAlterar.setBackground(new java.awt.Color(86, 127, 253));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterar);
        btnAlterar.setBounds(210, 250, 110, 45);

        btnExcluir.setBackground(new java.awt.Color(86, 127, 253));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);
        btnExcluir.setBounds(350, 250, 110, 45);

        btnLimpar.setBackground(new java.awt.Color(86, 127, 253));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar);
        btnLimpar.setBounds(490, 250, 110, 45);

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel10.setText("Rua:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(310, 30, 50, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel11.setText("Cep:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(620, 70, 60, 30);

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel13.setText("Complemento:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(310, 150, 90, 30);

        jPanel2.add(txtUf);
        txtUf.setBounds(690, 30, 70, 25);
        txtUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"MG", "AC", "AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","PA","PB","PR","PE","PI","RJ","RN","RS", "RO", "RR", "SC","SP","SE","TO"}));
        jPanel2.add(txtRua);
        txtRua.setBounds(410, 30, 190, 27);
        jPanel2.add(txtComplemento);
        txtComplemento.setBounds(410, 150, 190, 27);

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel2.add(txtCidade);
        txtCidade.setBounds(410, 190, 190, 27);

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel14.setText("Cidade:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(310, 190, 90, 30);

        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        jPanel2.add(txtCep);
        txtCep.setBounds(690, 70, 70, 27);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(100, 190, 190, 27);

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel2.add(txtBairro);
        txtBairro.setBounds(410, 110, 190, 27);

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel15.setText("Número:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(310, 70, 60, 30);

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jLabel17.setText("Bairro:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(310, 110, 60, 30);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumero);
        txtNumero.setBounds(410, 70, 190, 27);

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/TelaFornecedores.png"))); // NOI18N
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Fornecedor f = new Fornecedor();
        f.setId(Integer.valueOf(txtId.getText()));
        f.setNome(txtNome.getText());
        f.setCelular(txtCelular.getText());
        f.setCnpj(txtCnpj.getText());
        f.setRua(txtRua.getText());
        f.setComplemento(txtComplemento.getText());
        f.setCidade(txtCidade.getText());
        f.setEmail(txtEmail.getText());
        f.setNumero(Integer.valueOf(txtNumero.getText()));
        f.setEstado(txtUf.getSelectedItem().toString());
        f.setBairro(txtBairro.getText());
        f.setCep(txtCep.getText());
        FornecedorDAO d = new FornecedorDAO();
        d.create(f);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtCep.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        
        FornecedorDAO f = new FornecedorDAO();
        List<Fornecedor> fun = f.read();
        txtId.setText(String.valueOf(fun.size() + 1));

        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Fornecedor f = new Fornecedor();
        FornecedorDAO d = new FornecedorDAO();
        d.update(f);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Fornecedor f = new Fornecedor();
        f.setId(Integer.valueOf(txtId.getText()));
        FornecedorDAO d = new FornecedorDAO();
        d.delete(f);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtCep.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        FornecedorDAO d = new FornecedorDAO();
        List<Fornecedor> lista = d.readForDesc(txtPesquisar.getText());
        DefaultTableModel dados = (DefaultTableModel) tabelaListagem.getModel();
        dados.setNumRows(0);
        for (Fornecedor f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),        
                f.getCnpj(),
                f.getEmail(),
                f.getCelular(),
                f.getCep(),         
                f.getRua(),
                f.getNumero(),
                f.getComplemento(),
                f.getBairro(),
                f.getCidade(),         
                f.getEstado(),});
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void tabelaListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaListagemMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        txtId.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 1).toString());       
        txtCnpj.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 2).toString());
        txtEmail.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 3).toString());
        txtCelular.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 4).toString());
        txtCep.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 5).toString());
        txtRua.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 6).toString());
        txtNumero.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 7).toString());
        txtComplemento.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 8).toString());
        txtBairro.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 9).toString());
        txtCidade.setText(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 10).toString());
        txtUf.setSelectedItem(tabelaListagem.getValueAt(tabelaListagem.getSelectedRow(), 11).toString());
    }//GEN-LAST:event_tabelaListagemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAlterar;
    private swing.Button btnExcluir;
    private swing.Button btnLimpar;
    private swing.Button btnNovo;
    private swing.Button btnSalvar;
    private javax.swing.JButton btnSalvar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private swing.TextFieldAnimation txtPesquisar;
    private javax.swing.JTextField txtRua;
    private javax.swing.JComboBox<String> txtUf;
    // End of variables declaration//GEN-END:variables
}
