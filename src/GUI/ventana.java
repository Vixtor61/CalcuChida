package GUI;
import abstractFactory.arit.factoryArit;
import abstractFactory.conver.factoryConver;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
/** 
 *
 * @author Vixtor61 
 */
public class ventana extends JPanel {
private int WIDTH = 575,HEIGHT = 200;
private int widthTF = 120, heightTF=30;
private int widhtBT = 60, heightBT= 30;
private float a;
private float b;
private int dec;

JButton setA,setB;

JButton suma,resta,divi,multi,bin;

        
JTextField textfield1,textfield2,textfield3,textfield4;

   public ventana(){
       setA = new JButton("setA");
       setB = new JButton("setB");
       suma = new JButton("+");
       resta = new JButton("-");
       divi = new JButton("/");
       multi = new JButton("X");
       bin = new JButton("Bin");
       textfield1 = new JTextField();
       textfield2 = new JTextField();
       textfield3 = new JTextField();
       textfield4 = new JTextField();
       textfield4.setBounds(10, 85, widthTF, heightTF);
       textfield3.setBounds(135, 85, widthTF, heightTF);
       textfield2.setBounds(10, 125, widthTF+200, heightTF);
       textfield1.setBounds(10,10, widthTF+200, heightTF);
       setA.setBounds(450, 50, widhtBT+50, heightBT);
       setB.setBounds(350, 50, widhtBT+50, heightBT);
       
       suma.setBounds(10,50,widhtBT,heightBT);
       resta.setBounds(70,50,widhtBT,heightBT);
       divi.setBounds(130,50,widhtBT,heightBT);
       multi.setBounds(190,50,widhtBT,heightBT);
       bin.setBounds(250,50,widhtBT,heightBT);
       setA.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
            a = Float.parseFloat(textfield1.getText());
            textfield3.setText("A = " + a);
           }
       });
       setB.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
            b = Float.parseFloat(textfield1.getText()); 
            textfield4.setText("B = " + b);
           }
       });
       suma.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
           
            textfield2.setText("resultado: " + new factoryArit().getArit("suma").fill(a, b));
           
   }
       });
       resta.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
           
            textfield2.setText("resultado: " + new factoryArit().getArit("resta").fill(a, b));
           
   }
       });
       divi.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
           
            textfield2.setText("resultado: " + new factoryArit().getArit("division").fill(a, b));
           
   }
       });
       multi.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
           
            textfield2.setText("resultado: " + new factoryArit().getArit("multiplicacion").fill(a, b));
           
   }
       });
       bin.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            textfield2.setText(textfield1.getText());
            dec = Integer.parseInt(textfield1.getText()); 
            textfield2.setText("Bin: " + new factoryConver().getconver("binario").conver(dec));
           }
       });
       textfield1.setEditable(true);
       textfield2.setEditable(false);
       textfield3.setEditable(false);
       textfield4.setEditable(false);
       add(bin);
       add(setA);
       add(setB);
       add(textfield1);
       add(textfield2);
       add(textfield3);
       add(textfield4);
       add(suma);
       add(resta);
       add(divi);
       add(multi);
       
       setLayout(null);
       setPreferredSize(new Dimension(WIDTH,HEIGHT));
   }
}