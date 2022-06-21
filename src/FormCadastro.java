import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Mariane
 */
public class FormCadastro extends javax.swing.JFrame {

    public FormCadastro() {
        initComponents();
        cmbBox_estado.setSelectedIndex(-1);  
    }

    DadosCadastrados janela2 = new DadosCadastrados();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lbl_codigoCliente = new javax.swing.JLabel();
        lbl_nomeCompleto = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        lbl_bairro = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        lbl_cep = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        lbl_celular = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        lbl_dataAniversario = new javax.swing.JLabel();
        lbl_dataCadastro = new javax.swing.JLabel();
        txtField_codCliente = new javax.swing.JTextField();
        txtField_nome = new javax.swing.JTextField();
        txtField_endereco = new javax.swing.JTextField();
        txtField_bairro = new javax.swing.JTextField();
        txtField_cidade = new javax.swing.JTextField();
        txtField_cep = new javax.swing.JTextField();
        cmbBox_estado = new javax.swing.JComboBox<>();
        rdBtn_feminino = new javax.swing.JRadioButton();
        rdBtn_masculino = new javax.swing.JRadioButton();
        btn_limpar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_FOuM = new javax.swing.JLabel();
        txtField_dataAniv = new javax.swing.JFormattedTextField();
        txtField_dataCad = new javax.swing.JFormattedTextField();
        txtField_telefone = new javax.swing.JFormattedTextField();
        txtField_celular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        lbl_codigoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_codigoCliente.setText("Código do cliente");

        lbl_nomeCompleto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nomeCompleto.setText("Nome completo");

        lbl_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_endereco.setText("Endereço");

        lbl_bairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bairro.setText("Bairro");

        lbl_cidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cidade.setText("Cidade");

        lbl_estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_estado.setText("Estado");

        lbl_cep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cep.setText("CEP");

        lbl_sexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_sexo.setText("Sexo");

        lbl_celular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_celular.setText("Celular");

        lbl_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_telefone.setText("Telefone");

        lbl_dataAniversario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_dataAniversario.setText("Data de aniversário");

        lbl_dataCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_dataCadastro.setText("Data de cadastro");

        cmbBox_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbBox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre\t", "Alagoas\t", "Amapá\t", "Amazonas\t", "Bahia\t", "Ceará\t", "Distrito Federal\t", "Espírito Santo\t", "Goiás\t", "Maranhão\t", "Mato Grosso\t", "Mato Grosso do Sul\t", "Minas Gerais\t", "Pará\t", "Paraiba\t", "Paraná\t", "Pernambuco\t", "Piauí", "Rio de Janeiro\t", "Rio Grande do Norte\t", "Rio Grande do Sul\t", "Rondônia\t", "Roraima\t", "Santa Catarina", "São Paulo\t", "Sergipe\t", "Tocantins" }));

        buttonGroup1.add(rdBtn_feminino);
        rdBtn_feminino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdBtn_feminino.setText("Feminino");

        buttonGroup1.add(rdBtn_masculino);
        rdBtn_masculino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdBtn_masculino.setText("Masculino");

        btn_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpar.setIcon(new javax.swing.ImageIcon("D:\\DS\\Cadastro de Cliente\\limpar.png")); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon("D:\\DS\\Cadastro de Cliente\\check2.png")); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_fechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_fechar.setIcon(new javax.swing.ImageIcon("D:\\DS\\Cadastro de Cliente\\fechar.png")); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Cadastro De Cliente");

        try {
            txtField_dataAniv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtField_dataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtField_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) - ########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtField_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) - #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_fechar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_bairro)
                                    .addComponent(lbl_endereco)
                                    .addComponent(lbl_nomeCompleto)
                                    .addComponent(lbl_codigoCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField_bairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtField_endereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtField_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtField_codCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtField_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_celular)
                                    .addComponent(lbl_sexo)
                                    .addComponent(lbl_cep)
                                    .addComponent(lbl_telefone)
                                    .addComponent(lbl_dataAniversario)
                                    .addComponent(lbl_dataCadastro)
                                    .addComponent(lbl_estado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_limpar)
                                    .addComponent(cmbBox_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtField_cep, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtField_dataAniv)
                                    .addComponent(txtField_dataCad)
                                    .addComponent(txtField_telefone)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rdBtn_feminino, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdBtn_masculino)
                                        .addGap(6, 6, 6))
                                    .addComponent(txtField_celular))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_FOuM)
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoCliente)
                    .addComponent(txtField_codCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nomeCompleto)
                    .addComponent(txtField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_endereco)
                    .addComponent(txtField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bairro)
                    .addComponent(txtField_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cidade)
                    .addComponent(txtField_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado)
                    .addComponent(cmbBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtField_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sexo)
                    .addComponent(rdBtn_feminino)
                    .addComponent(rdBtn_masculino)
                    .addComponent(lbl_FOuM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_celular)
                    .addComponent(txtField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefone)
                    .addComponent(txtField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dataAniversario)
                    .addComponent(txtField_dataAniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dataCadastro)
                    .addComponent(txtField_dataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_fechar)
                    .addComponent(btn_limpar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed

        btn_limpar.addActionListener
        (
            new ActionListener()
            {
                //Método utilizado para ouvir ações realizadas no botão Limpar (ação: clicar)
                public void actionPerformed(ActionEvent e)
                {
                    txtField_codCliente.setText(null);    
                    txtField_nome.setText(null);
                    txtField_endereco.setText(null);
                    txtField_bairro.setText(null);
                    txtField_cidade.setText(null);
                    cmbBox_estado.setSelectedIndex(-1);
                    txtField_cep.setText(null);
                    buttonGroup1.clearSelection();
                    txtField_celular.setText(null);
                    txtField_telefone.setText(null);
                    txtField_dataAniv.setText(null);
                    txtField_dataCad.setText(null);          
                    
                    txtField_codCliente.requestFocus();  
                } 
            }
        );
                                                   
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
            
            if(rdBtn_feminino.isSelected()){
                lbl_FOuM = new JLabel ("Feminino");
            }else{
                lbl_FOuM = new JLabel ("Masculino");
            }    
        
            janela2 = new DadosCadastrados();
            janela2.setLocationRelativeTo(null);
            janela2.setVisible(true);
            janela2.setResizable(false);
            janela2.enviaDados(this, txtField_codCliente.getText(), txtField_nome.getText(), txtField_endereco.getText(), txtField_bairro.getText(), txtField_cidade.getText(), cmbBox_estado.getSelectedItem().toString(), txtField_cep.getText(), lbl_FOuM.getText(), txtField_celular.getText(), txtField_telefone.getText(), txtField_dataAniv.getText(), txtField_dataCad.getText());                                           
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_fecharActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new FormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cmbBox_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_FOuM;
    private javax.swing.JLabel lbl_bairro;
    private javax.swing.JLabel lbl_celular;
    private javax.swing.JLabel lbl_cep;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_codigoCliente;
    private javax.swing.JLabel lbl_dataAniversario;
    private javax.swing.JLabel lbl_dataCadastro;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_nomeCompleto;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JRadioButton rdBtn_feminino;
    private javax.swing.JRadioButton rdBtn_masculino;
    private javax.swing.JTextField txtField_bairro;
    private javax.swing.JFormattedTextField txtField_celular;
    private javax.swing.JTextField txtField_cep;
    private javax.swing.JTextField txtField_cidade;
    private javax.swing.JTextField txtField_codCliente;
    private javax.swing.JFormattedTextField txtField_dataAniv;
    private javax.swing.JFormattedTextField txtField_dataCad;
    private javax.swing.JTextField txtField_endereco;
    private javax.swing.JTextField txtField_nome;
    private javax.swing.JFormattedTextField txtField_telefone;
    // End of variables declaration//GEN-END:variables
}
