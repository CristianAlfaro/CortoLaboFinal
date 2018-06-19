
package cortofinal;


import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class GUI extends JFrame{
    
    private JComboBox<String> Raza;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTable jTable;
    
    public GUI(){
        super("Concurso canino");
        initialComponents();
    }
    
    private void initialComponents() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Container container = getContentPane();

        jLabel1 = new JLabel();
        jLabel2 = new JLabel(); 
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        
        Raza = new JComboBox<>();
        
        jRadioButton1 = new JRadioButton("SI");
        jRadioButton2 = new JRadioButton("NO");
        
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        
        jButton1.setText("Buscar");
        jButton2.setText("Insertar");
        jButton3.setText("Actualizar");
        jButton4.setText("Eliminar");
        jButton5.setText("Limpiar");

        
        jLabel1.setText("N° inscripcion");
        jLabel2.setText("Nombre");
        jLabel3.setText("Propetario");
        jLabel4.setText("Edad");
        jLabel5.setText("Raza");
        jLabel6.setText("Estado");

        Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pitbull", "Pastor Aleman", "Gran danes", "Dalmata","Rottweiler" }));
        Raza.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaActionPerformed(evt);
            }
        });

        
        
        jButton1.setBounds(400, 20, 100, 20);
        jButton2.setBounds(20, 180, 100, 20);
        jButton3.setBounds(130, 180, 100, 20);
        jButton4.setBounds(240, 180, 100, 20);
        jButton5.setBounds(350, 180, 100, 20);
        
        jLabel1.setBounds(20, 20, 100, 20);
        jLabel2.setBounds(20, 50, 100, 20);
        jLabel3.setBounds(400, 50, 100, 20);
        jLabel4.setBounds(20, 80, 100, 20);
        jLabel5.setBounds(20, 110, 100, 20);
        jLabel6.setBounds(20, 150, 100, 20);
        
        jTextField1.setBounds(125, 20, 250, 20);
        jTextField2.setBounds(75, 50, 300, 20);
        jTextField3.setBounds(500, 50, 190, 20);
        jTextField4.setBounds(75, 80, 100, 20);
        
        Raza.setBounds(75, 110, 150, 20);
        
        jRadioButton1.setBounds(75, 150, 50, 20);
        jRadioButton2.setBounds(125, 150, 50, 20);
        
        container.add(jTextField1);
        container.add(jTextField2);
        container.add(jTextField3);
        container.add(Raza);
        container.add(jLabel1);
        container.add(jLabel2);
        container.add(jLabel3);
        container.add(jLabel4);
        container.add(jLabel5);
        container.add(jLabel6);
        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);
        container.add(jButton4);
        container.add(jButton5);
        container.add(jRadioButton1);
        container.add(jRadioButton2);
        
        setSize(740,500);


    }
    
    private void RazaActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
    } 
    
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable(){
                @Override
                public void run(){
                    new GUI().setVisible(true);
                }
            });
    }
}
