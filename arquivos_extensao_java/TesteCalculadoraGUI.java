package pacote.projeto.calculadora.java;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TesteCalculadoraGUI {
    static JFrame frame;
    static JPanel panel;
    static JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnPotencia, btnRaiz, btnFatorial, btnFinalizar, btnLimpar;
    static JLabel lblNum1, lblNum2;
    static JTextField txtNum1, txtNum2;
    static JTextArea areaResultado;
    static Calculadora calc;
    
    public static void main(String[] args) {
        
        calc = new Calculadora();
        frame = new JFrame("Calculadora Básica");
        panel = new JPanel();
        
        frame.add(panel);
        painelCalculadora(panel);
        
        /*INSERÇÃO E CONFIGURAÇÃO DO FRAME*/
        frame.setSize(300, 360);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension size = tk.getScreenSize();

        int xPos = (size.width / 2) - (frame.getWidth() / 2);
        int yPos = (size.height / 2) - (frame.getHeight() / 2);
        
        frame.setVisible(true);
        frame.setLocation(xPos, yPos);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private static void painelCalculadora(JPanel panel){
        panel.setLayout(null);//Flexibiliza a manipulação dos componentes da GUI
        
        lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(40, 20, 70, 25);
        panel.add(lblNum1);
        
        txtNum1 = new JTextField(20);
        txtNum1.setBounds(110, 20, 90, 25);
        panel.add(txtNum1);
        
        lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(40, 50, 70, 25);
        panel.add(lblNum2);
        
        txtNum2 = new JTextField(20);
        txtNum2.setBounds(110, 50, 90, 25);
        panel.add(txtNum2);
        
        btnLimpar = new JButton("C");
        btnLimpar.setBounds(205, 20, 50, 55);
        panel.add(btnLimpar);
        
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtNum1.requestFocus();
            }
        });
        
        btnSomar = new JButton("+");
        btnSomar.setBounds(40, 85, 50, 25);
        panel.add(btnSomar);
        
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.somarNumeros());
                }
            }
        });
        
        btnSubtrair = new JButton("-");
        btnSubtrair.setBounds(95, 85, 50, 25);
        panel.add(btnSubtrair);
        
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.subtrairNumeros());
                }
            }
        });
        
        btnMultiplicar = new JButton("x");
        btnMultiplicar.setBounds(150, 85, 50, 25);
        panel.add(btnMultiplicar);
        
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.multiplicarNumeros());
                }
            }
        });
        
        btnDividir = new JButton("/");
        btnDividir.setBounds(205, 85, 50, 25);
        panel.add(btnDividir);
        
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.dividirNumeros());
                }
            }
        });
        
        btnPotencia = new JButton("POW");
        btnPotencia.setBounds(40, 120, 70, 25);
        panel.add(btnPotencia);
       
        btnPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.elevarPotencia());
                }
            }
        });
        
        btnRaiz = new JButton("SQRT");
        btnRaiz.setBounds(115, 120, 80, 25);
        panel.add(btnRaiz);
        
        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.extrairRaizQuadrada());
                }
            }
        });
        
        btnFatorial = new JButton("N !");
        btnFatorial.setBounds(200, 120, 55, 25);
        panel.add(btnFatorial);
        
        btnFatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean notificar = notificarErro();
                if(!(notificar)){
                    calc.setNumero1(Double.parseDouble(txtNum1.getText()));
                    calc.setNumero2(Double.parseDouble(txtNum2.getText()));
                    areaResultado.setText("");
                    areaResultado.append(calc.obterFatorial());
                }
            }
        });
        
        areaResultado = new JTextArea(20,50);
        areaResultado.setText("\n\n             ***Área de Resultado***");
        areaResultado.setBounds(40, 155, 215, 100);
        areaResultado.setEnabled(false);
        panel.add(areaResultado);
        
        btnFinalizar = new JButton("FINALIZAR");
        btnFinalizar.setBounds(70, 265, 150, 25);
        panel.add(btnFinalizar);
        
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int flag = JOptionPane.showConfirmDialog(null, "Deseja encerrar?", "Finalizando programa", JOptionPane.YES_NO_OPTION);
                if(flag == 0){
                    System.exit(1);
                }
            }
        });
    
    }
    
    private static boolean notificarErro(){
        try{
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            return false;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.\nObs.: Preencha todos os campos!", "ERRO NA EXECUÇÃO DO PROGRAMA", JOptionPane.PLAIN_MESSAGE);
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum1.requestFocus();
            return true;
        }
    }
}
