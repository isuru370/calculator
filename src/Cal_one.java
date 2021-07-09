


import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.WindowListener;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;




/**
 *
 * @author fernando
 */
public class Cal_one extends JFrame implements ActionListener,KeyListener,WindowListener {
    
                          String sRawInput = "";
	String sDisplay = "0";
	 boolean isPlus = true;
	 boolean isPoint = false;
	 boolean isOperation = false;
	 double value1 ;
	 double value2  ;
	 double sum ;
	 String operation = "";
                            String memory = "0";
                            
         
                        Cal_one(){
                          initComponents();
           
    }
                        void maxtextcount(){
                            final int MAX_TEXT_COUNT = 20;
                            
                            if(number.getText().length() == MAX_TEXT_COUNT){
                                String a = number.getText().substring(0,number.getText().length() -1);
                                number.setText(a);
                            }else if
                                   (number.getText().length() > MAX_TEXT_COUNT) {
                                   int x = (number.getText().length() - MAX_TEXT_COUNT);
                                   System.out.println(x);
                                   number.setText(number.getText().substring(0, number.getText().length() - x));
                            }
                            }
                         
                        
    
    public void  initComponents(){
        setTitle("my Cal");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(100, 50, 380, 650);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
//-------------------------------------------------------------------------------------------------textfeild--------------------------------------------------

        number  = new JTextField();
        number.setBounds(20, 0, 320, 40);
        number.setBackground(Color.BLACK);
        number.setForeground(Color.WHITE);
        number.setFont(new Font("Tahoma", Font.BOLD , 18));
        number.setText("0");
        number.addKeyListener(this);
       
        
        number2 = new JTextField();
        number2.setBounds(20,40, 320, 40);
        number2.setBackground(Color.BLACK);
        number2.setForeground(Color.WHITE);
        number2.setFont(new Font("Tahoma", Font.BOLD , 18));
        number2.setHorizontalAlignment(JTextField.RIGHT);
         number2.setText("0");
        number2.addKeyListener(this);
        
        
        memorydisply = new JTextField();
        memorydisply.setBounds(260, 80, 80, 30);
        memorydisply.setText("0");
        
  //--------------------------------------------------------------------------------------panel-------------------------------------------------------------------
  
        JPanel panal1  = new JPanel();
        add(panal1). setBounds(0, 120, 380, 200);
        panal1.setLayout(null);
        panal1.setBackground(Color.lightGray);
        
        JPanel panal2 = new JPanel();
        add(panal2). setBounds(0, 350, 380, 200);
        panal2.setLayout(null);
        panal2.setBackground(Color.lightGray);
        
        
        
   JLabel achi = new JLabel("\u00A9 2021  ramesh");
        
 //-------------------------------------------------------------------button--------------------------------------------------------------------------------------------
 
        JButton but0 = new JButton("0");
        JButton but1 = new JButton("1");
        JButton but2 = new JButton("2");
        JButton but3 = new JButton("3");
        JButton but4 = new JButton("4");
         JButton but5 = new JButton("5");
         JButton but6 = new JButton("6");
         JButton but7 = new JButton("7");
         JButton but8 = new JButton("8");
         JButton but9 = new JButton("9");
         JButton but10 = new JButton(".");
         JButton but11 = new JButton("\u00B1");       //+,- operaters
         JButton but12 = new JButton("+");
         JButton but13 =  new JButton("-");
         JButton but14 = new JButton("\u00D7");
         JButton but15 = new JButton("\u00F7");
         JButton but16 = new JButton("=");
         JButton but17 = new JButton("\u221A");
         JButton but18 = new JButton("%");
         JButton but19 = new JButton("1/n");
         JButton but20 = new JButton("x\u00B2");
         JButton but21 = new JButton("x\u00B3"); 
         JButton but22 = new JButton("Mod");  
         JButton but23 = new JButton("<<");
         
                              JButton MC = new JButton("MC");
                              JButton MR = new JButton("MR");
                              JButton MS = new JButton("MS");
         
         JButton clear = new JButton("C");
         JButton exit = new JButton("EXIT");
         
         
 //--------------------------------------------------------------------Scientific keys------------------------------------------------------------------------------
 
                            JButton bSin = new JButton("sin");
	     JButton bCos = new JButton("cos");
	     JButton bTan = new JButton("tan");
         	      JButton bLog = new JButton("log");
                           JButton bLn = new JButton("ln");
	     JButton bAsin = new JButton("asin");
	     JButton bAcos = new JButton("acos");
	 JButton bAtan = new JButton("atan");
         	 JButton bPowerOfTen = new JButton("10^n");
                 	 JButton bAbs = new JButton("abs");
	 JButton bSinH = new JButton("sinh");
	 JButton bCosH = new JButton("cosh");
	 JButton bTanH = new JButton("tanh");
         
         
         
         
 //--------------------------------------------------------- jpanal 1 add button-----------------------------------------------------------------------------------------------------------
 
panal1.add(but7).setBounds(10, 160, 54, 38);    panal1.add(but8).setBounds(70, 160, 54, 38);     panal1.add(but9).setBounds(130, 160, 54, 38);   
but7.setFont(new Font("Tahoma", Font.BOLD, 14));             but8.setFont(new Font("Tahoma", Font.BOLD, 14));            but9.setFont(new Font("Tahoma", Font.BOLD, 14));

panal1.add(but4).setBounds(10, 200, 54, 38);    panal1.add(but5).setBounds(70, 200, 54, 38);     panal1.add(but6).setBounds(130, 200, 54, 38);  
 but4.setFont(new Font("Tahoma", Font.BOLD, 14));             but5.setFont(new Font("Tahoma", Font.BOLD, 14));            but6.setFont(new Font("Tahoma", Font.BOLD, 14));
 
panal1.add(but1).setBounds(10, 240, 54, 38);    panal1.add(but2).setBounds(70, 240, 54, 38);     panal1.add(but3).setBounds(130, 240, 54, 38);   
but1.setFont(new Font("Tahoma", Font.BOLD, 14));             but2.setFont(new Font("Tahoma", Font.BOLD, 14));            but3.setFont(new Font("Tahoma", Font.BOLD, 14));

panal1.add(but0).setBounds(10, 280, 54, 38);    panal1.add(but10).setBounds(70, 280, 54, 38);   panal1.add(but11).setBounds(130, 280, 54, 38);  
but0.setFont(new Font("Tahoma", Font.BOLD, 14));             but10.setFont(new Font("Tahoma", Font.BOLD, 14));            but11.setFont(new Font("Tahoma", Font.BOLD, 14));

panal1.add(but12).setBounds(190, 280, 54, 38);    panal1.add(but13).setBounds(190, 240, 54, 38);            panal1.add(but14).setBounds(190, 200, 54, 38);                         panal1.add(but15).setBounds(190, 160, 54, 38);  
but12.setFont(new Font("Tahoma", Font.BOLD, 14));             but13.setFont(new Font("Tahoma", Font.BOLD, 14));            but14.setFont(new Font("Tahoma", Font.BOLD, 14));         but15.setFont(new Font("Tahoma", Font.BOLD, 14));
  
panal1.add(but16).setBounds(250, 280, 115, 38);   panal1.add(but17).setBounds(250, 240, 54, 38);            panal1.add(but18).setBounds(250, 200, 54, 38);                         panal1.add(but19).setBounds(250, 160, 54, 38); 
but16.setFont(new Font("Tahoma", Font.BOLD, 14));             but17.setFont(new Font("Tahoma", Font.BOLD, 14));            but18.setFont(new Font("Tahoma", Font.BOLD, 14));         but19.setFont(new Font("Tahoma", Font.BOLD, 10));
but16.setBackground(Color.BLUE);
but16.setForeground(Color.WHITE);

 panal1.add(but20).setBounds(310, 200, 54, 38);                         panal1.add(but21).setBounds(310, 160, 54, 38);          panal1.add(but22).setBounds(310, 240, 54, 38);  
but20.setFont(new Font("Tahoma", Font.BOLD, 14));             but21.setFont(new Font("Tahoma", Font.BOLD, 14));            but22.setFont(new Font("Tahoma", Font.BOLD, 8)); 

panal1.add(but23).setBounds(70, 120, 54, 38);
but23.setFont(new Font("Tahoma", Font.BOLD, 12));   

panal2.add(achi).setBounds(130, 550, 130, 30);
achi.setForeground(Color.BLUE);

		                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                 
  //------------------------------------------------------------Scientific keys----------------------------------------------------------------------------------------------------
  
  panal2.add(bSin).setBounds(10, 450, 65, 38);       panal2.add(bCos).setBounds(80, 450, 65, 38);    panal2.add(bTan).setBounds(150, 450, 65, 38);   panal2.add(bLog).setBounds(220, 360, 65, 38);   panal2.add(bLn).setBounds(290, 360, 65, 38);
  bSin.setFont(new Font("Tahoma", Font.BOLD, 14));             bCos.setFont(new Font("Tahoma", Font.BOLD, 14));            bTan.setFont(new Font("Tahoma", Font.BOLD, 14));         bLog.setFont(new Font("Tahoma", Font.BOLD, 14));        bLn.setFont(new Font("Tahoma", Font.BOLD, 14));
   
 panal2.add(bAsin).setBounds(10, 405, 65, 38);       panal2.add(bAcos).setBounds(80, 405, 65, 38);    panal2.add(bAtan).setBounds(150, 405, 65, 38);   panal2.add(bPowerOfTen).setBounds(220, 405, 65, 38);   panal2.add(bAbs).setBounds(290, 405, 65, 38);
 bAsin.setFont(new Font("Tahoma", Font.BOLD, 14));             bAcos.setFont(new Font("Tahoma", Font.BOLD, 14));            bAtan.setFont(new Font("Tahoma", Font.BOLD, 14));         bPowerOfTen.setFont(new Font("Tahoma", Font.BOLD, 10));        bAbs.setFont(new Font("Tahoma", Font.BOLD, 14));
 
 panal2.add(bSinH).setBounds(10, 360, 65, 38);       panal2.add(bCosH).setBounds(80, 360, 65, 38);    panal2.add(bTanH).setBounds(150, 360, 65, 38); 
 bSinH.setFont(new Font("Tahoma", Font.BOLD, 14));             bCosH.setFont(new Font("Tahoma", Font.BOLD, 13));            bTanH.setFont(new Font("Tahoma", Font.BOLD, 13));    
 
 panal2.add(exit).setBounds(220, 450, 135, 38);
 exit.setFont(new Font("Tahoma", Font.BOLD, 14));   
 exit.setBackground(Color.red);
 exit.setForeground(Color.WHITE);
 
 panal2.add(MC).setBounds(310,120, 54, 38);                                                          panal2.add(MR).setBounds(250,120, 54, 38);                                                               panal2.add(MS).setBounds(190,120, 54, 38);                                                                                                                                           
 MC.setFont(new Font("Times New Roman",  Font.PLAIN, 12));                   MR.setFont(new Font("Times New Roman",  Font.PLAIN, 12));                         MS.setFont(new Font("Times New Roman",  Font.PLAIN, 12));   
 MC.setBackground(Color.blue);                                                                             MR.setBackground(Color.blue);                                                                                  MS.setBackground(Color.blue);
 MC.setForeground(Color.WHITE);                                                                          MR.setForeground(Color.WHITE);                                                                                   MS.setForeground(Color.WHITE);
 MC.setFocusable(false);                                                                                            MR.setFocusable(false);                                                                                                 MS.setFocusable(false);
 
 panal2.add(clear).setBounds(10, 120, 54, 38);
 clear.setFont(new Font("Times New Roman",  Font.BOLD, 14)); 
 clear.setBackground(Color.GREEN);
 clear.setForeground(Color.red);
 
 
 
         
but0.addActionListener(this);
 but1.addActionListener(this);
 but2.addActionListener(this);
 but3.addActionListener(this);
 but4.addActionListener(this);
 but5.addActionListener(this);
 but6.addActionListener(this);
 but7.addActionListener(this);
 but8.addActionListener(this);
 but9.addActionListener(this);
 but10.addActionListener(this);
 but11.addActionListener(this);
 but12.addActionListener(this);
 but13.addActionListener(this);
but14.addActionListener(this);
 but15.addActionListener(this);
 but16.addActionListener(this);
 but17.addActionListener(this);
 but18.addActionListener(this);
 but19.addActionListener(this);
 but20.addActionListener(this);
 but21.addActionListener(this);
 but22.addActionListener(this);
 but23.addActionListener(this);
 
 
 MC.addActionListener(this);
 MS.addActionListener(this);
 MR.addActionListener(this);
 
  clear.addActionListener(this);
  exit.addActionListener(this);
 
 //------------------------------------------------------------------------------------sic-------------------------------------------------------------------------------------------------
 
   bSin.addActionListener(this);
   bCos.addActionListener(this);
   bTan.addActionListener(this);
  bLog.addActionListener(this);
  bLn.addActionListener(this);
  bAsin.addActionListener(this);
  bAcos.addActionListener(this);
  bAtan.addActionListener(this);
  bPowerOfTen.addActionListener(this);
  bAbs.addActionListener(this);
  bSinH.addActionListener(this);
  bCosH.addActionListener(this);
  bTanH.addActionListener(this);

 
 //-----------------------------------------------------------------------------------add button-----------------------------------------------------------------------------------------
 
            add(number);
            add(number2);
            add(memorydisply);
       
         add(but0);
         add(but1);
         add(but2);
         add(but3);
         add(but4);
         add(but5);
         add(but6);
         add(but7);
         add(but8);
         add(but9);
         add(but10);
         add(but11);
         add(but12);
         add(but13);
         add(but14);
         add(but15);
         add(but16);
         add(but17);
         add(but18);
         add(but19);
         add(but20);
         add(but21);
         add(but22);
         add(but23);
         
         add(MC);
         add(MR);
         add(MS);
         
         add(clear);
         add(exit);
 //----------------------------------------------------------------------------Scientific keys-------------------------------------------------
 
        add(bSin);
        add(bCos);
        add(bTan);
        add(bAsin);
        add( bAcos);
        add(bAtan);
        add(bSinH);
        add(bCosH);
        add(bTanH);
        add(bPowerOfTen);
        add(bLog);
        add(bLn);
        add(bAbs);
 
     
        add(achi);
        add(panal1);
        add(panal2);
        setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
                               try {
                                   UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
                                   
                               } catch (UnsupportedLookAndFeelException ex) {
                                   System.out.println(ex);
                               }
        Cal_one ca = new Cal_one();
    }
    
   JTextField number ;
   JTextField number2;
   JTextField memorydisply;
   JLabel achi;
    JPanel panal1;
    JPanel panal2;
    JButton but0;
    JButton but1;
    JButton but2;
    JButton but3;
    JButton but4;
    JButton but5;
    JButton but6;
    JButton but7;
    JButton but8;
    JButton but9;
    JButton but10;
    JButton but11;
    JButton but12;
    JButton but13;
    JButton but14;
    JButton but15;
    JButton but16;
    JButton but17;
    JButton but18;
    JButton but19;
    JButton but20;
    JButton but21;
    JButton but22;
    JButton but23;
    
    JButton MR;
    JButton MC;
    JButton MS;
    
    JButton clear;
    JButton exit;
    
    JButton bSin;
    JButton bCos;
    JButton bTan;
    JButton bLog;
    JButton bLn;
    JButton bAsin;
    JButton bAcos;
    JButton bAtan;
    JButton bPowerOfTen;
    JButton  bAbs;
    JButton bSinH;
    JButton bCosH;
    JButton bTanH;

    @Override
    public void actionPerformed(ActionEvent e) {
  
            if (e.getActionCommand().equals("1")) 
		{
			if(operation == "1")
			{
                                                                                                               
				sDisplay = "1";
				sRawInput = "1";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "1";
				sRawInput += "1";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
                                                                                                                                                                             
                                                                                            }                                                                               
            }
              
            
        if(e.getActionCommand().equals("2")){
                                                                                             if(operation == "2")
			{
                                                                                                         
				sDisplay = "2";
				sRawInput = "2";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "2";
				sRawInput += "2";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
                                                                                            }
        }
        if(e.getActionCommand().equals("3")){
                                                                                             if(operation == "3")
			{
                                                                                                             
				sDisplay = "3";
				sRawInput = "3";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "3";
				sRawInput += "3";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
                                                                                            }
        }
         if(e.getActionCommand().equals("4")){
                                                                                     if(operation == "4")
			{
                                                                                                             
				sDisplay = "4";
				sRawInput = "4";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "4";
				sRawInput += "4";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
                                                                                            } 
        }
         
         if(e.getActionCommand().equals("5")){
                                                                                        if(operation == "5")
			{
                                                                                                        
				sDisplay = "5";
				sRawInput = "5";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "5";
				sRawInput += "5";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
                                                                                            }
        }
          if(e.getActionCommand().equals("6")){
                                                                                   if(operation == "6")
			{
                                                                                                       
				sDisplay = "6";
				sRawInput = "6";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "6";
				sRawInput += "6";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
          
        }
          }
           if(e.getActionCommand().equals("7")){
                                                                               if(operation == "7")
			{
                                                                                                            
				sDisplay = "7";
				sRawInput = "7";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "7";
				sRawInput += "7";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
          
        }
        }
            if(e.getActionCommand().equals("8")){
                                                                                  if(operation == "8")
			{
                                                                                                             
				sDisplay = "8";
				sRawInput = "8";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "8";
				sRawInput += "8";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
          
        }
        }
              if(e.getActionCommand().equals("9")){
                                                                                       if(operation == "9")
			{
                                                                                                           
				sDisplay = "9";
				sRawInput = "9";
				number.setText(sRawInput);
				operation = "";
                                
			}
			else 
			{
				sDisplay = sDisplay + "9";
				sRawInput += "9";
				number.setText(sRawInput);
                                                                                                          maxtextcount();
			}
                                                                                            if(isOperation == true){
          
        }
        }
              if(e.getActionCommand().equals("0")){
                  
			if(sDisplay.equals("0"))
			{
				sDisplay = "0";
				sRawInput += "0";
				number.setText(sRawInput);
			}
			else
			{
				sDisplay = sDisplay + "0";
				sRawInput += "0";
				number.setText(sRawInput);
			}
              }
              if(e.getActionCommand().equals(".")){
                                                                                 if(sDisplay.equals("."))
			{
				sDisplay = "0.";
				sRawInput += "0.";
				number.setText(sRawInput);
			}
			else if(!isPoint)
			{
				sDisplay = sDisplay + ".";
				sRawInput += ".";
				number.setText(sRawInput);
			}
			isPoint= true;
              
             
        }
                  if (e.getActionCommand().equals("<<")) {
            
                                                                               sDisplay = sDisplay.substring(0, sDisplay.length()-1);
			sRawInput = sRawInput.substring(0, sRawInput.length()-1);
			if(sRawInput.equals(""))
			{
				
				number.setText("0");
			}
			else 
			{
				
				number.setText(sRawInput);
			}
            }
                  
              
              if(e.getActionCommand().equals("+")){
             
                                                                                         if(!isOperation)
			{
				value1 = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = "+";
                                                                                        isPoint = false;
				isPlus = true;
				sRawInput += " + ";
				number2.setText(sRawInput);
				if(isPoint)
				{
					number2.setText(""+value1);
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)value1);
				}
			}
			else if(isOperation && operation != "=")
			{
				value2  = Double.parseDouble(sDisplay);
				
				if(operation == "+")
				{
					sum = value1 + value2;
				}
				else if(operation == "-")
				{
					sum = value1 - value2;
				}
				else if(operation == "*")
				{
					sum = value1 * value2;
				}
				else if(operation == "/")
				{
					sum = value1 / value2;
				}
				else if(operation == "%")
				{
					sum = value1 % value2;
				}
				else
				{
					sum = value2;
				}
				String temp = "0";
				if(isPoint || operation == "/")
				{
					number2.setText(""+sum);
					temp = ""+sum;
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)sum);
					temp = ""+(int)sum;
				}
				operation = "+";
				sDisplay = "";
				value1 = sum;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " + ";
				number.setText(sRawInput);
				sRawInput = temp + " + ";
			}
			else if(operation == "=")
			{
				sDisplay = "";
				operation = "+";
				isPlus = true;
				isOperation = true;
				sRawInput += " + ";
				number.setText(sRawInput);
			}
			isOperation = true;                                                           
                                                     
                  }
              if(e.getActionCommand().equals("-")){
                           if(!isOperation)
			{
				value1 = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = "-";
				isPlus = true;
                                                                                        isPoint = false;
				sRawInput += " -";
				number2.setText(sRawInput);
				if(isPoint)
				{
					number2.setText(""+value1);
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)value1);
				}
			}
			else if(isOperation && operation != "=")
			{
				value2  = Double.parseDouble(sDisplay);
				
				if(operation == "+")
				{
					sum = value1 + value2;
				}
				else if(operation == "-")
				{
					sum = value1 - value2;
				}
				else if(operation == "*")
				{
					sum = value1 * value2;
				}
				else if(operation == "/")
				{
					sum = value1 / value2;
				}
				else if(operation == "%")
				{
					sum = value1 % value2;
				}
				else
				{
					sum = value2;
				}
				String temp = "0";
				if(isPoint || operation == "-")
				{
					number.setText(""+sum);
					temp = ""+sum;
				}
				else if(!isPoint)
				{
					number.setText(""+(int)sum);
					temp = ""+(int)sum;
				}
				operation = "-";
				sDisplay = "";
				value1 = sum;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " -";
				number.setText(sRawInput);
				sRawInput = temp + " + ";
			}
			else if(operation == "=")
			{
				sDisplay = "";
				operation = "-";
				isPlus = true;
				isOperation = true;
				sRawInput += " -";
				number.setText(sRawInput);
			}
			isOperation = true;                                                     
              }
              if(e.getActionCommand().equals("\u00F7")){
                           if(!isOperation)
			{
				value1 = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = "/";
				isPlus = true;
                                                                                        isPoint = false;
				sRawInput += " \u00F7 ";
				number2.setText(sRawInput);
				if(isPoint)
				{
					number2.setText(""+value1);
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)value1);
				}
			}
			else if(isOperation && operation != "=")
			{
				value2  = Double.parseDouble(sDisplay);
				
				if(operation == "+")
				{
					sum = value1 + value2;
				}
				else if(operation == "-")
				{
					sum = value1 - value2;
				}
				else if(operation == "*")
				{
					sum = value1 * value2;
				}
				else if(operation == "/")
				{
					sum = value1 / value2;
				}
				else if(operation == "%")
				{
					sum = value1 % value2;
				}
				else
				{
					sum = value2;
				}
				String temp = "0";
				if(isPoint || operation == "/")
				{
					number.setText(""+sum);
					temp = ""+sum;
				}
				else if(!isPoint)
				{
					number.setText(""+(int)sum);
					temp = ""+(int)sum;
				}
				operation = "/";
				sDisplay = "";
				value1 = sum;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " \u00F7 ";
				number.setText(sRawInput);
				sRawInput = temp + "  \u00F7 ";
			}
			else if(operation == "=")
			{
				sDisplay = "";
				operation = "/";
				isPlus = true;
				isOperation = true;
				sRawInput += "  \u00F7";
				number.setText(sRawInput);
			}
			isOperation = true;                                                     
              }
           if(e.getActionCommand().equals("\u00D7")){
                                                                                                if(!isOperation)
			{
			                          value1 = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = "*";
				isPlus = true;
                                                                                         isPoint = false;
				sRawInput += "\u00D7 ";
				number2.setText(sRawInput);
				if(isPoint)
				{
					number2.setText(""+value1);
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)value1);
				}
			}
			else if(isOperation && operation != "=")
			{
				value2  = Double.parseDouble(sDisplay);
				
				if(operation == "+")
				{
					sum = value1 + value2;
				}
				else if(operation == "-")
				{
					sum = value1 - value2;
				}
				else if(operation == "*")
				{
					sum = value1 * value2;
				}
				else if(operation == "/")
				{
					sum = value1 / value2;
				}
				else if(operation == "%")
				{
					sum = value1 % value2;
				}
				else
				{
					sum = value2;
				}
				String temp = "0";
				if(isPoint || operation == "*")
				{
					number.setText(""+sum);
					temp = ""+sum;
				}
				else if(!isPoint)
				{
					number.setText(""+(int)sum);
					temp = ""+(int)sum;
				}
				operation = "*";
				sDisplay = "";
				value1 = sum;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " \u00D7 ";
				number.setText(sRawInput);
				sRawInput = temp + "\u00D7 ";
			}
			else if(operation == "=")
			{
				sDisplay = "";
				operation = "*";
				isPlus = true;
				isOperation = true;
				sRawInput += "  \u00D7";
				number.setText(sRawInput);
			}
			isOperation = true;                                     
              }
              if(e.getActionCommand().equals("%")){
                                                                              
			 if (operation == "*") {
                                                                   value2 = Double.parseDouble(sDisplay);
                                                                  sum = value1 * (value2 / 100);
                                                                 sRawInput = value1 + " \u00D7 " + value2 + "%";
                                                                  number.setText(sRawInput);
                                                                  number2.setText("" + sum);
                                                                  sDisplay = "";
                                                                  value1 = sum;
                                                                  operation = "=";
                                                                  isPlus = true;
                                                                 isOperation = true;
                                                                 isPoint = true;
                                                                  sRawInput = "" + sum;

                                                              } else {
                                                                     number.setText("");
                                                                     number2.setText("");
                                                                     sDisplay = "";
                                                                     value1 = sum;
                                                                   operation = "=";
                                                                   isPlus = true;
                                                                   isOperation = true;
                                                                    isPoint = true;
                                                                  sRawInput = "" + sum;

                                                 }

              }
              if(e.getActionCommand().equals("\u221A")){
                                                                             value1 = Double.parseDouble(sDisplay);
			sum = Math.sqrt(value1);
			sRawInput =  "\u221A" + sRawInput;
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
              }
              if(e.getActionCommand().equals("Mod")){
                     if(!isOperation)
			{
				value1 = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = "%";
				isPlus = true;
				sRawInput += " Mod ";
				number2.setText(sRawInput);
				if(isPoint)
				{
					number2.setText(""+value1);
				}
				else if(!isPoint)
				{
					number2.setText(""+(int)value1);
				}
			}
			else if(isOperation && operation != "=")
			{
				value2  = Double.parseDouble(sDisplay);
				
				if(operation == "+")
				{
					sum = value1 + value2;
				}
				else if(operation == "-")
				{
					sum = value1 - value2;
				}
				else if(operation == "*")
				{
					sum = value1 * value2;
				}
				else if(operation == "/")
				{
					sum = value1 / value2;
				}
				else if(operation == "%")
				{
					sum = value1 % value2;
				}
				else
				{
					sum = value2;
				}
				String temp = "0";
				if(isPoint || operation == "/")
				{
					number.setText(""+sum);
					temp = ""+sum;
				}
				else if(!isPoint)
				{
					number.setText(""+(int)sum);
					temp = ""+(int)sum;
				}
				operation = "%";
				sDisplay = "";
				value1 = sum;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += "  Mod";
				number.setText(sRawInput);
				sRawInput = temp + " * ";
			}
			else if(operation == "=")
			{
				sDisplay = "";
				operation = "%";
				isPlus = true;
				isOperation = true;
				sRawInput += "  Mod ";
				number.setText(sRawInput);
			}
			isOperation = true;                            
              }
              if(e.getActionCommand().equals("=")){
                	                                                     value2  = Double.parseDouble(sDisplay);
			
			if(operation == "+")
			{
				sum = value1 + value2;
			}
			else if(operation == "-")
			{
				sum = value1 - value2;
			}
			else if(operation == "*")
			{
				sum = value1 * value2;
			}
			else if(operation == "/")
			{
				sum = value1 / value2;
			}
			else if(operation == "%")
			{
				sum = value1 % value2;
			}
			else
			{
				sum = value2;
			}
			String temp = "";
			if(isPoint || operation == "/")
			{
				number2.setText(""+sum);
				temp = ""+sum;
			}
			else if(!isPoint)
			{
				number2.setText(""+(int)sum);
				temp = ""+(long)sum;
			}
			sDisplay = "";
			value1 = sum;
			isPlus = true;
			isPoint = false;
			isOperation = true;
			sRawInput += " = ";
			number.setText(sRawInput);
			sRawInput = temp;
			operation = "=";
                  
              }
              
              if(e.getActionCommand().equals("\u00B1")){
                  if(isPlus)
			{
				sDisplay = "-" + sDisplay;
				sRawInput = sDisplay;
				number2.setText(sRawInput);
				isPlus = false;
			}
			else
			{
				sDisplay = sDisplay.substring(1, sDisplay.length());
				sRawInput = sDisplay.substring(1, sDisplay.length());
				number.setText(sRawInput);
				isPlus = true;
			}
              }
              if(e.getActionCommand().equals("x\u00B2")){
                                                                               value1 = Double.parseDouble(sDisplay);
			sum = Math.pow(value1, 2);
			String temp = "";
			if(!isPoint)
			{
				number2.setText(""+(int)sum);
				temp = ""+(int)sum;
			}
			else 
			{
				number2.setText(""+sum);
				temp = ""+sum;
			}
			sRawInput += "^2 = ";
			number.setText(sRawInput);
			sRawInput = temp;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = false;
			isOperation = true;
			isPlus = true;
              }
                if(e.getActionCommand().equals("x\u00B3")){
                                                                               value1 = Double.parseDouble(sDisplay);
			sum = Math.pow(value1, 3);
			String temp = "";
			if(!isPoint)
			{
				number2.setText(""+(int)sum);
				temp = ""+(int)sum;
			}
			else 
			{
				number2.setText(""+sum);
				temp = ""+sum;
			}
			sRawInput += "^2 = ";
			number.setText(sRawInput);
			sRawInput = temp;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = false;
			isOperation = true;
			isPlus = true;
              }
                if(e.getActionCommand().equals("1/n")){
                                                                             value1 = Double.parseDouble(sDisplay);
			sum = 1 / value1;
			if(isPoint)
			{
				sRawInput = "1 / " + value1;
			}
			else 
			{
				sRawInput = "1 / " + (int)value1;
			}
			number.setText(sRawInput);
			number2.setText(""+sum);
			sDisplay = "";
			sRawInput = ""+sum;
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
 //-------------------------------------------------------------------------------------------------------------sic-----------------------------------------------------------------------------
 
 
                if(e.getActionCommand().equals("sin")){
                                                                              value1 = Double.parseDouble(sDisplay);
			if(value1 == 30)
			{
				sum = Math.sin(Math.toRadians(value1)) + 0.0000000000000001;
			}
			else
			{
				sum = Math.sin(Math.toRadians(value1));
			}
			sRawInput =  "sin("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                if(e.getActionCommand().equals("cos")){
                                             value1 = Double.parseDouble(sDisplay);
			if(value1 == 60)
			{
				sum = Math.cos(Math.toRadians(value1)) - 0.0000000000000001;
			}
			else if (value1 == 90)
			{
				sum = 0;
			}
			else 
			{
				sum = Math.cos(Math.toRadians(value1));
			}
			sRawInput =  "cos("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                if(e.getActionCommand().equals("tan")){
                                                                                 value1 = Double.parseDouble(sDisplay);
			if(value1 == 45)
			{
				sum = Math.tan(Math.toRadians(value1)) + 0.0000000000000001;
			}
			else if(value1 == 90)
			{
				sum = 0;
				number2.setText("Invalid");
			}
			else
			{
				sum = Math.tan(Math.toRadians(value1));
			}
			sRawInput =  "tan("+sRawInput+")";
			number.setText(sRawInput);
			if(value1 != 90)
			{
				number2.setText(""+sum);
			}
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                if(e.getActionCommand().equals("log")){
                                                                               value1 = Double.parseDouble(sDisplay);
			sum = Math.log10(value1);
			sRawInput =  "log"+sRawInput;
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                if(e.getActionCommand().equals("ln")){
                                                                                   value1 = Double.parseDouble(sDisplay);
			sum = Math.log(value1);
			sRawInput =  "ln"+sRawInput;
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                if(e.getActionCommand().equals("asin")){
                                                                               value1 = Double.parseDouble(sDisplay);
			sum = Math.asin(Math.toRadians(value1));
			sRawInput =  "asin("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                }
                  if(e.getActionCommand().equals("acos")){
                                                                              value1 = Double.parseDouble(sDisplay);
			sum = Math.acos(Math.toRadians(value1));
			sRawInput =  "acos("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                  }
                   if(e.getActionCommand().equals("atan")){
                                                                                  value1 = Double.parseDouble(sDisplay);
			sum = Math.atan(Math.toRadians(value1));
			sRawInput =  "atan("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                   }
                   if(e.getActionCommand().equals("10^n")){
                                                                              value1 = Double.parseDouble(sDisplay);
			sum = Math.pow(10, value1);
			sRawInput =  "10^"+sRawInput;
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                   }
                   if(e.getActionCommand().equals("abs")){
                                                                                value1 = Double.parseDouble(sDisplay);
			sum = Math.abs(value1);
			sRawInput =  "abs("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                   }
                   if(e.getActionCommand().equals("sinh")){
                                                                               value1 = Double.parseDouble(sDisplay);
			sum = Math.sinh(Math.toRadians(value1));
			sRawInput =  "sinh("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                   }
                    if(e.getActionCommand().equals("cosh")){
                                                                                 value1 = Double.parseDouble(sDisplay);
			sum = Math.cosh(Math.toRadians(value1));
			sRawInput =  "cosh("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
                   }
                     if(e.getActionCommand().equals("tanh")){
                                                                                value1 = Double.parseDouble(sDisplay);
			sum = Math.tanh(Math.toRadians(value1));
			sRawInput =  "tanH("+sRawInput+")";
			number.setText(sRawInput);
			number2.setText(""+sum);
			sRawInput = ""+sum;
			sDisplay = "";
			value1 = sum;
			operation = "=";
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
                     if(e.getActionCommand().equals("MS")){
                          memory = number2.getText();
                          memorydisply.setText(memory);
                          
                     }
                     if(e.getActionCommand().equals("MR") && memory != null ){
                        memory = memorydisply.getText();
                        number2.setText(memory);
                        memorydisply.setText("0");
                      
                     }
                     if(e.getActionCommand().equals("MC")){
                        memorydisply.setText("0");
                        number2.setText("0");
                     }
                     if(e.getActionCommand().equals("EXIT")){
                          exit();
                     }
                     if(e.getActionCommand().equals("C")){
                                                                               value1 = value2 = sum = 0;
			sDisplay = "";
			operation = "";
			number.setText("0");
			isPoint = false;
			isPlus = true;
			isOperation = false;
			sRawInput = "";
			number2.setText("0");
                     }

                   }
                    public void exit(){
                        int x = JOptionPane.showConfirmDialog(rootPane,"Are you want to close?");
        
                                if(x == JOptionPane.YES_OPTION){
                                System.exit(0);
        }else
        {
           
        }
                    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
      
    }

    @Override
    public void keyReleased(KeyEvent e) {
      try {
             String S [] = {"f","F","d","D"};
                    for(String ch : S){
                        if(number.getText().contains(ch)| e.getKeyCode()==32){
                            number.setText("");
                        }
                    }
        
           double d = Double.parseDouble(number.getText());
        } catch (Exception ex) {
            number.setText("");
        }
      maxtextcount();
        }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
       int x = JOptionPane.showConfirmDialog(rootPane, "Are you want to close?","Window Closing", JOptionPane.YES_NO_OPTION);
       
       if(x == JOptionPane.YES_OPTION){
           System.exit(0);
       }else
       {
        Cal_one ca = new Cal_one();
       }
    }

    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
     
    }

    @Override
    public void windowActivated(WindowEvent e) {
    
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
      
    }
        
  
        
    }

    
    

              
    


    
        

    

