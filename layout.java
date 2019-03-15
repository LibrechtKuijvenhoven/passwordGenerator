import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 *
 * @author librecht kuijvenhoven
 */
public class layout extends passwordGenerator{

    // Variables declaration - do not modify
    private javax.swing.JCheckBox characters;
    private javax.swing.JButton copy;
    private javax.swing.JButton Save;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane password_field;
    private javax.swing.JTextPane password_length;
    private javax.swing.JTextField length;
    private javax.swing.JCheckBox lower;
    private javax.swing.JCheckBox numbers;
    private javax.swing.JCheckBox symbols;
    private javax.swing.JCheckBox upper;
    private javax.swing.JCheckBox duplicates;



    passwordGenerator pw;
    // End of variables declaration
    public layout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        password_field = new javax.swing.JTextPane();
        password_length = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        lower = new javax.swing.JCheckBox();
        upper = new javax.swing.JCheckBox();
        numbers = new javax.swing.JCheckBox();
        characters = new javax.swing.JCheckBox();
        symbols = new javax.swing.JCheckBox();
        length = new javax.swing.JTextField();
        copy = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        duplicates = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(password_field);

        password_length.setEditable(false);
        password_length.setBackground(new java.awt.Color(240, 240, 240));
        password_length.setText("Output:");

        password_field.setEditable(false);

        jButton1.setText("Generate!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lower.setText("lowercase letters");
        lower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerActionPerformed(evt);
            }
        });

        upper.setText("uppercase letters");
        upper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperActionPerformed(evt);
            }
        });

        numbers.setText("numbers");
        numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersActionPerformed(evt);
            }
        });

        characters.setText("special characters");
        characters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charactersActionPerformed(evt);
            }
        });

        symbols.setText("symbols");
        symbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolsActionPerformed(evt);
            }
        });

        length.setText("6");
        copy.setText("copy");
        copy.setVisible(false);
        copy.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){ copyActionPreformed(evt); }
        });

        Save.setText("Save");
        Save.setVisible(false);
        Save.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){ SaveActionPreformed(evt); }
        });

        duplicates.setSelected(true);
        duplicates.setText("Duplicates");
        //<editor-fold desc="grouplayout">
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lower)
                                                                        .addComponent(upper))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(characters)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(numbers)
                                                                                .addGap(68, 68, 68)
                                                                                .addComponent(symbols)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(password_length, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(64, 64, 64)
                                                                                                .addComponent(duplicates)))
                                                                                .addGap(127, 127, 127)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(password_length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(duplicates))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lower)
                                                        .addComponent(numbers)
                                                        .addComponent(symbols))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(upper))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(characters, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
        );// </editor-fold>
        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        password_field.setText("");
        pw.pwLength = Integer.parseInt(length.getText());
        pw.set_characters();
        // checks if the password field is empty
        if (duplicates.isSelected()) {
            if (pw.passwordCheck(duplicates.isSelected()) == "checked") {
                display(generate_password());
                copy.setVisible(true);
                Save.setVisible(true);
            } else {
                copy.setVisible(false);
                Save.setVisible(false);
                display(passwordCheck(duplicates.isSelected()));
            }
        }else{
            if (pw.passwordCheck(duplicates.isSelected()) == "checked") {
                display(generate_distinct_password());
                copy.setVisible(true);
                Save.setVisible(true);
            } else {
                copy.setVisible(false);
                Save.setVisible(false);
                display(passwordCheck(duplicates.isSelected()));
            }
        }

    }

    private void lowerActionPerformed(java.awt.event.ActionEvent evt) {
        if(lower.isSelected()) {
            pw.useLower = true;
        }else{
            pw.useLower = false;
        }
    }

    private void upperActionPerformed(java.awt.event.ActionEvent evt) {
        if(upper.isSelected()) {
            pw.useUpper = true;
        }else{
            pw.useUpper = false;
        }
    }

    private void numbersActionPerformed(java.awt.event.ActionEvent evt) {
        if(numbers.isSelected()) {
           pw.useNumbers = true;
        }else{
            pw.useNumbers = false;
        }
    }

    private void charactersActionPerformed(java.awt.event.ActionEvent evt) {
        if(characters.isSelected()) {
            pw.useCharacters = true;
        }else{
            pw.useCharacters = false;
        }
    }

    private void symbolsActionPerformed(java.awt.event.ActionEvent evt) {
        if(symbols.isSelected()) {
            pw.useSymbols = true;
        }else{
            pw.useSymbols = false;
        }
    }

    private void copyActionPreformed(java.awt.event.ActionEvent evt){
        pw.Copy();
    }

    private void SaveActionPreformed(java.awt.event.ActionEvent evt){
        pw.Save(pw.pwOutput);
    }

    private void display(String text){
        password_field.setText(text);
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
           javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout().setVisible(true);
            }
        });
    }
}