/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastro;

import java.io.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import utilitarios.conexao;



public class Cad_clientes extends javax.swing.JFrame {

       
   int navega = 0;
    conexao con_clientes;
    public Cad_clientes() {
        try {
for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
        UIManager.setLookAndFeel(info.getClassName());
        break;
    }
}
} catch (Exception e) {
   // If Nimbus is not available, you can set the GUI to another look and feel.
}
        initComponents();
         con_clientes = new conexao();
        con_clientes.conecta();
        con_clientes.executeSQL("select * from clientes");
       try
        {
           con_clientes.resultset.first();
            mostrar_dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não Localizou o erro: "+erro);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cb_uf = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_codigo = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_natural = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_complemento = new javax.swing.JTextField();
        cb_sexo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_bairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_fone = new javax.swing.JTextField();
        cb_dndia = new javax.swing.JComboBox();
        cb_dnmes = new javax.swing.JComboBox();
        cb_dnano = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        tf_foto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_cep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jb_foto = new javax.swing.JButton();
        tf_cidade1 = new javax.swing.JTextField();
        jl_foto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jb_anterior = new javax.swing.JButton();
        jb_proximo = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_excluir = new javax.swing.JButton();
        jb_alterar = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Clientes");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(350, 20, 229, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastros"));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jPanel1.add(cb_uf);
        cb_uf.setBounds(680, 220, 50, 25);

        jLabel4.setText("Estado.:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 220, 60, 14);

        jLabel3.setText("Código:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 30, 50, 14);

        jl_codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jl_codigo);
        jl_codigo.setBounds(130, 20, 30, 20);

        tf_nome.setPreferredSize(new java.awt.Dimension(0, 25));
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(tf_nome);
        tf_nome.setBounds(130, 60, 350, 25);

        jLabel2.setText("Nome.:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 60, 50, 14);

        tf_endereco.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_endereco);
        tf_endereco.setBounds(130, 140, 350, 25);

        jLabel5.setText("Endereço.:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 140, 70, 14);

        jLabel6.setText("Naturalidade.:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 100, 80, 14);

        tf_natural.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_natural);
        tf_natural.setBounds(130, 100, 150, 25);

        jLabel7.setText("Sexo.:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 100, 60, 14);

        tf_complemento.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_complemento);
        tf_complemento.setBounds(130, 180, 230, 25);

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));
        cb_sexo.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(cb_sexo);
        cb_sexo.setBounds(350, 100, 125, 25);

        jLabel8.setText("Complemento.:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 180, 90, 14);

        jLabel9.setText("Bairro.:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 180, 50, 14);

        tf_bairro.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_bairro);
        tf_bairro.setBounds(470, 180, 260, 25);

        jLabel10.setText("Número.:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 140, 60, 14);

        tf_numero.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_numero);
        tf_numero.setBounds(620, 140, 110, 25);

        jLabel11.setText("Telefone.:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(540, 100, 60, 14);

        tf_fone.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_fone);
        tf_fone.setBounds(620, 100, 110, 25);

        cb_dndia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "2", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_dndia.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(cb_dndia);
        cb_dndia.setBounds(530, 60, 50, 25);

        cb_dnmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês", "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" }));
        cb_dnmes.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(cb_dnmes);
        cb_dnmes.setBounds(590, 60, 60, 25);

        cb_dnano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ano", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cb_dnano.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(cb_dnano);
        cb_dnano.setBounds(660, 60, 70, 25);

        jLabel12.setText("Data de Nascimento");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 40, 160, 14);

        tf_foto.setPreferredSize(new java.awt.Dimension(0, 25));
        tf_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fotoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_foto);
        tf_foto.setBounds(790, 190, 150, 25);

        jLabel13.setText("Cidade.:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 220, 70, 14);

        tf_cep.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_cep);
        tf_cep.setBounds(460, 220, 90, 25);

        jLabel14.setText("CEP.:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 220, 40, 20);

        jb_foto.setText("...");
        jb_foto.setToolTipText("Carregar Foto");
        jb_foto.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fotoActionPerformed(evt);
            }
        });
        jPanel1.add(jb_foto);
        jb_foto.setBounds(940, 190, 30, 25);

        tf_cidade1.setPreferredSize(new java.awt.Dimension(0, 25));
        jPanel1.add(tf_cidade1);
        tf_cidade1.setBounds(130, 220, 230, 25);
        jPanel1.add(jl_foto);
        jl_foto.setBounds(790, 20, 150, 150);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jb_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/Previous.png"))); // NOI18N
        jb_anterior.setText("Anterior");
        jb_anterior.setToolTipText("Anterior");
        jb_anterior.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_anteriorActionPerformed(evt);
            }
        });

        jb_proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/Next.png"))); // NOI18N
        jb_proximo.setText("Próximo");
        jb_proximo.setToolTipText("Proximo");
        jb_proximo.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_proximoActionPerformed(evt);
            }
        });

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/Save.png"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setToolTipText("Salvar");
        jb_salvar.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/New document.png"))); // NOI18N
        jb_novo.setText("Novo");
        jb_novo.setToolTipText("Novo");
        jb_novo.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });

        jb_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/deletes.gif"))); // NOI18N
        jb_excluir.setText("Excluir");
        jb_excluir.setToolTipText("Excluir");
        jb_excluir.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_excluirActionPerformed(evt);
            }
        });

        jb_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/Modify.png"))); // NOI18N
        jb_alterar.setText("Alterar");
        jb_alterar.setToolTipText("Alterar");
        jb_alterar.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alterarActionPerformed(evt);
            }
        });

        jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/Close.png"))); // NOI18N
        jb_sair.setText("Sair");
        jb_sair.setToolTipText("Sair");
        jb_sair.setPreferredSize(new java.awt.Dimension(120, 35));
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fotoActionPerformed

    private void jb_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fotoActionPerformed
        try
        {
            JFileChooser busca_foto = new JFileChooser();
            busca_foto.setCurrentDirectory(new File("/Projeto/Estoque/Imagens/"));
            busca_foto.setDialogTitle("Carregar imagem do Cliente");
            busca_foto.showOpenDialog(this);
            String foto = ""+busca_foto.getSelectedFile().getName();
            tf_foto.setText(foto);
            jl_foto.setIcon(new ImageIcon("/Projeto/Estoque/Imagens/"+tf_foto.getText()));
        }
        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Nao foi possível carregar a foto.");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jb_fotoActionPerformed

    private void jb_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_anteriorActionPerformed
        try
        {
            con_clientes.resultset.previous();
            mostrar_dados();
            navega = 1;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível ir para o registro anterior "+erro);
        }            // TODO add your handling code here:*/
    }//GEN-LAST:event_jb_anteriorActionPerformed

    private void jb_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_proximoActionPerformed
        try
        {
            con_clientes.resultset.next();
            mostrar_dados();
            navega = 2;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível ir para o próximo registro "+erro);
        }        // TODO add your handling code here:*/
    }//GEN-LAST:event_jb_proximoActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
    try
        {

            String sqlinsert ="insert into clientes (nome,dn_dia,dn_mes,dn_ano,foto,naturalidade) values ('"+
            tf_nome.getText()+"','"+
            cb_dndia.getSelectedItem()+"','"+
            cb_dnmes.getSelectedItem()+"','"+
            cb_dnano.getSelectedItem()+"','"+
            tf_foto.getText()+"','"+
            tf_natural.getText()+"')";
            con_clientes.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null,"Gravação realizado com sucesso!");

            //atualiza o ResultSet
            //con_cidade.resultset = con_cidade.statement.executeQuery("Select * from cidade");
            con_clientes.executeSQL("select * from clientes");
            //atualiza_combo_box_cidade();
            con_clientes.resultset.first(); //posiciona no primeiro registro
            mostrar_dados(); //irá chamar a função em que irá mstrar os dados no form
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro a tentar Gravar o registro..."+erro);
        }          // TODO add your handling code here:*/
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
          conexao conexao = new conexao();
        conexao.conecta();
        
      jl_codigo.setText("");
        tf_nome.setText("");
        cb_dndia.setSelectedItem("Dia");
        cb_dnmes.setSelectedItem("Mês");
        cb_dnano.setSelectedItem("Ano");
        tf_natural.setText("");
        tf_foto.setText("");
        jl_foto.setIcon(new ImageIcon("/Projeto/Estoque/Imagens/"+tf_foto.getText()));
        tf_nome.requestFocus();// TODO add your handling code here:*/
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluirActionPerformed
        try
        {
            String sql = "select * from clientes Where codigo = "+jl_codigo.getText();
            con_clientes.executeSQL(sql);
            con_clientes.resultset.first();
            String nome = "Deletar o Cliente : "+con_clientes.resultset.getString("nome")+" ?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Exclusão ",JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida == JOptionPane.YES_OPTION)
            {
                sql = "DELETE FROM clientes Where codigo ="+jl_codigo.getText();
                int conseguiu_excluir = con_clientes.statement.executeUpdate(sql);
                if (conseguiu_excluir == 1)
                {
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso");
                    //atualiza o ResultSet
                    con_clientes.executeSQL("Select * from clientes");
                    con_clientes.resultset.first(); //posiciona no primeiro registro
                    mostrar_dados(); //irá chamar a função em que irá mstrar os dados no form
                }
            }
            else
            return;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro a tentar excluir o registro..."+erro);
        }              // TODO add your handling code here:*/
    }//GEN-LAST:event_jb_excluirActionPerformed

    private void jb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alterarActionPerformed
        try
        {
            String sql ="UPDATE clientes SET nome ='"+tf_nome.getText()+"',"+
            "dn_dia = '"+cb_dndia.getSelectedItem()+"',"+
            "dn_mes = '"+cb_dnmes.getSelectedItem()+"',"+
            "dn_ano = '"+cb_dnano.getSelectedItem()+"',"+
            "foto = '"+tf_foto.getText()+"',"+
            "naturalidade = '"+tf_natural.getText()+"' where codigo = "+jl_codigo.getText();
            con_clientes.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Alteração realizado com sucesso!");

            //atualiza o ResultSet
            con_clientes.executeSQL("Select * from clientes ");
            con_clientes.resultset.next(); //posiciona no primeiro registro
            mostrar_dados(); //irá chamar a função em que irá mstrar os dados no form
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro a tentar Alterar o registro..."+erro);
        } 
    }//GEN-LAST:event_jb_alterarActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jb_sairActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(Cad_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_dnano;
    private javax.swing.JComboBox cb_dndia;
    private javax.swing.JComboBox cb_dnmes;
    private javax.swing.JComboBox cb_sexo;
    private javax.swing.JComboBox cb_uf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_alterar;
    private javax.swing.JButton jb_anterior;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_foto;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_proximo;
    private javax.swing.JButton jb_sair;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JLabel jl_codigo;
    private javax.swing.JLabel jl_foto;
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_cep;
    private javax.swing.JTextField tf_cidade1;
    private javax.swing.JTextField tf_complemento;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_fone;
    private javax.swing.JTextField tf_foto;
    private javax.swing.JTextField tf_natural;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_numero;
    // End of variables declaration//GEN-END:variables
public void mostrar_dados()
    {
        try
        {
            jl_codigo.setText(con_clientes.resultset.getString("codigo"));
            tf_nome.setText(con_clientes.resultset.getString("nome"));
            cb_dndia.setSelectedItem(con_clientes.resultset.getString("dn_dia"));
            cb_dnmes.setSelectedItem(con_clientes.resultset.getString("dn_mes"));
            cb_dnano.setSelectedItem(con_clientes.resultset.getString("dn_ano"));
            tf_natural.setText(con_clientes.resultset.getString("naturalidade"));
            tf_foto.setText(con_clientes.resultset.getString("foto"));
            jl_foto.setIcon(new ImageIcon("/Estoque/Imagens/"+tf_foto.getText()));
                       
        }
        catch(SQLException erro)
        {
           if (navega == 1)
                JOptionPane.showMessageDialog(null,"Olha, você já está no primeiro registro");
            else if (navega == 2)
                 JOptionPane.showMessageDialog(null,"Olha, você já está no último registro");
            else
                 JOptionPane.showMessageDialog(null,"Não localizou dados "+erro);
            navega=0;
        }
        }

}