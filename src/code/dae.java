package code;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;

public class dae extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame f1;

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("static-access")
			public void run() {
                try {
                    dae window = new dae();
                    window.f1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public dae() {
	        initialize();
	    }

	 private void initialize()
	 {

	        JFrame frame=new JFrame();
	        frame.setVisible(true);
	        //frame.setSize(800,600);
	        //frame.setLocation(200,50);
	        frame.setBounds(-10,0,1800,740);
	        frame.setTitle("Career World --Way To Success");
	        ImageIcon icon=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\PicsArt_1485415453700.png");
	      //  ImageIcon icon1=new ImageIcon("PicsArt_1485415453700.png");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\aeronautical-engineering-image.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\pensitdown1.jpg");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\_20170203_010755.JPG");
	        ImageIcon icon5=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\ca7b81256d27f757790508035a8177c0.png");	        
	        ImageIcon icon6=new ImageIcon("C:\\Users\\rahul\\OneDrive\\Desktop\\Career-Guidance-System-master\\src\\image\\images(1).jpg");
	        frame.setIconImage(icon.getImage());
	        
	        
	        
	        JPanel co = new JPanel();
	        co.setLayout(null);
	        //co.setBackground(Color.blue);
	        JScrollPane sp = new JScrollPane(co);
	        co.setPreferredSize(new Dimension(100, 1850));

	    
	        
	        
	        JLabel label1 = new JLabel("DashBoard");
	        label1.setBounds(50,470,300,50); 
	        Font f1=new Font("Arial",Font.BOLD,30);
	         label1.setFont(f1);
	        
	        JButton b1 = new JButton(icon5);
	        b1.setBounds(75,520,80,80);
	        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	        b1.setCursor(cur);

	        

	        b1.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b1Event(e);
	     			}
	    			
	     		});
	        
	        
	        
	        JButton logout = new JButton(icon6);
   	        logout.setBounds(75,700,80,80);
   	       
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});
	       
	        
	        JButton b2 = new JButton("About");
	        b2.setBounds(50,610,130,30);
	        b2.setCursor(cur);
	        
	        
	        b2.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b2Event(e);
	     			}
	    			
	     		});
	       

	        
	        JButton b3 = new JButton("Expert Guidance");
	        b3.setBounds(50,660,130,30);
	        b3.setCursor(cur);

	        b3.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b3Event(e);
	     			}
	    			
	     		});
	       
	        
	        
	       // JLabel logo= new JLabel(icon1);
	       // logo.setBounds(-20,110,300,300);
	           
	        JLabel label2 = new JLabel(icon2);
	        label2.setBounds(-20,0,1400,450);
	        
	        JLabel label4 = new JLabel(icon3);
	        label4.setBounds(840,500,600,300);
	        
	        
	        JLabel label5 = new JLabel(icon4);
	        label5.setBounds(20,1095,250,200);

	        
	        
	        
	        
	        JLabel label3 = new JLabel("Diploma in Aeronautical Engineering");
	        label3.setBounds(440,470,700,40); 
	        Font f2=new Font("copperplate Gothic Bold",Font.PLAIN,30);
	           label3.setFont(f2);
	           label3.setForeground(Color.blue);
	           
	           
	           JTextArea a1 = new JTextArea("-Diploma in Aeronautical Engineering is a "
	           		+ "3 years long \nDiploma certificate program. In this article, you will be reading "
	           		+ "\ndetails about Diploma in Aeronautical Engineering course, such "
	           		+ "\nas- eligibility criteria, admission process, career prospects "
	           		+ "\nand career paths."
	           		+ "\n \n-We rely on Airlines for transportation of people and goods. "
	           		+ "\nAeronautical Engineering is a discipline that is directly related "
	           		+ "\nto airlines and aviation sector. It deals with design, \nmanufacturing, "
	           		+ "maintenance, service and testing of aircraft.");
	              a1.setBounds(280,520,640,265); 
	              Font f3=new Font("Verdana",Font.PLAIN,20);
	               a1.setFont(f3);
	              // a1.setForeground(Color.red);
	               a1.setEditable(false);
	             
	           
	               
	               JTextArea a2 = new JTextArea("-It is a job oriented course. On completing the course, Diploma holders may find work at "
	               		+ "\nmajor airlines, aircraft maintenance firms, parts and component manufacturing firms etc. Let us "
	               		+ "\ncheck out further details about the discipline of Aeronautical Engineering in the next section-"
	               		+ "\n \n-Aeronautical Engineering is a discipline that deals with aeronautics. Aeronautics includes "
	               		+ "\nstudy, design, development and testing of air flight capable machines."
	               		+ "\n \n-Various types of air flight capable machines are- aircraft, missiles, drones, satellites, "
	               		+ "\nrockets and space shuttles. The term �Aeronautical Engineering� has been derived from Aeronautics. "
	               		+ "\nThus, it is evident that this branch of Engineering primarily deals with the design, development, "
	               		+ "\nplanning, manufacturing and testing of flight capable machines mentioned above!"
	               		+ "\n \n-The Diploma course can be said to be multidisciplinary. It contains elements of mechanical, "
	               		+ "\nelectrical and electronics engineering."
	               		+ "\n \n-Since this branch involves manufacturing and maintenance of complex flying structures, it can "
	               		+ "\nbe said to be a challenging and technically demanding field. At the same time, careers associated "
	               		+ "\nwith this sector are financially rewarding too. Aviation sector is dependent on Aeronautical Engineers. "
	               		+ "\nAviation sector is growing. This growth has been creating new and better job opportunities for "
	               		+ "\nAeronautical Engineers."
	               		+ "\n \n-Diploma in Aeronautical Engineering course trains students in areas such as- aerodynamics, "
	               		+ "\nnavigation systems, control systems etc of air flight capable machines such as aircraft,missiles etc");
	   	              a2.setBounds(280,790,1050,600); 
	   	               a2.setFont(f3);
	   	              // a1.setForeground(Color.red);
	   	               a2.setEditable(false);
	   	       
	   	               
	   	            JTextArea a3 = new JTextArea("1st semester subjects - "
	   	            		+ " \n�Mathematics"
	   	            		+ " \n�Computer Programming (Introduction)"
	   	            		+ " \n�Digital Electronics"
	   	            		+ " \n�Basic Electronics"
	   	            		+ " \n�Computer Application (Introduction)");
	   		              a3.setBounds(280,1395,400,170);
	   		               a3.setFont(f3);
	   		              // a1.setForeground(Color.red);
	   		               a3.setEditable(false);
	   		               
	   		               
	   		            JTextArea a4 = new JTextArea("2nd semester subjects - "
		   	            		+ " \n�Mathematics"
		   	            		+ " \n�Engineering Physics"
		   	            		+ " \n�Computer Programming (Advanced)"
		   	            		+ " \n�Basic Electronics"
		   	            		+ " \n�Web Designing");
		   		              a4.setBounds(690,1395,400,170);
		   		               a4.setFont(f3);
		   		              // a1.setForeground(Color.red);
		   		               a4.setEditable(false);
		   		               
		   		              
		   		               
		   		           
		   		            JTextArea a5 = new JTextArea("3rd semester subjects- "
			   	            		+ " \n�C++ Programing"
			   	            		+ " \n�DBMS"
			   	            		+ " \n�Operating System"
			   	            		+ " \n�Data Structure"
			   	            		+ " \n�Microprocessor");
			   		              a5.setBounds(1100,1395,235,170);
			   		               a5.setFont(f3);
			   		              // a1.setForeground(Color.red);
			   		               a5.setEditable(false);
			   		               
			   		               
			   		            JTextArea a6 = new JTextArea("4th semester subjects - "
			   		            		+ "\n�Computer Networks"
			   		            		+ "\n�Software Development (Basics)"
			   		            		+ "\n�Database Management System "
			   		            		+ "\n�Software Engineering"
			   		            		+ "\n�Visual Basic C++");
				   		              a6.setBounds(280,1570,400,170);
				   		               a6.setFont(f3);
				   		              // a1.setForeground(Color.red);
				   		               a6.setEditable(false);
				   		               
				   		               
				   		            JTextArea a7 = new JTextArea("5th semester subjects - "
					   	            		+ " \n�Java Programing"
					   	            		+ " \n�Web Development"
					   	            		+ " \n�Computer Maintainance"
					   	            		+ " \n�Elective Project"
					   	            		+ " \n�Basic Management Skills");
					   		              a7.setBounds(690,1570,400,170);
					   		               a7.setFont(f3);
					   		              // a1.setForeground(Color.red);
					   		               a7.setEditable(false);
					   		                       
				   		           
					   		               
					   		               
					   		            JTextArea a8 = new JTextArea("6th semester subjects- "
						   	            		+ " \n�Advanced Java"
						   	            		+ " \n�Software Testing"
						   	            		+ " \n�AMI"
						   	            		+ " \n�Management"
						   	            		+ " \n�EDP");
						   		              a8.setBounds(1100,1570,235,170);
						   		               a8.setFont(f3);
						   		              // a1.setForeground(Color.red);
						   		               a8.setEditable(false);
			   		               
	               
	        
						   		            JButton b4 = new JButton("Take an Aptitude Test >>>");
							   		         Font f4=new Font("AR JULIAN",Font.BOLD,20);
							   	            b4.setFont(f4);
							   	              b4.setBounds(600,1770,300,40);
							   	            b4.setForeground(Color.red);
		                                    b4.setCursor(cur);
		                                    
		                                    b4.addActionListener(new ActionListener()
		                                 	{
		                                 			public void actionPerformed(ActionEvent e)
		                                 			{
		                                 				b4Event(e);
		                                 			}
		                                			
		                                 		});
	        co.add(label1);
	        co.add(label2);
	        co.add(label3);
	        co.add(label4);
	        co.add(label5);
	        co.add(a1);
	        co.add(a2);
	        co.add(a3);
	        co.add(a4);
	        co.add(a5);
	        co.add(a6);
	        co.add(a7);
	        co.add(a8);
	       // co.add(logo);
	        co.add(b1);
	        co.add(b2);
	        co.add(b3);
	        co.add(b4);
	       co.add(logout); 
	        frame.getContentPane().add(sp);	        
}
	 public static void b1Event(ActionEvent e)
	    {
			Home h = new Home();
		    h.setVisible(true);
		       	
		}
	 
	 
	 public static void b2Event(ActionEvent e)
	    {
			About a = new About();
		    a.setVisible(true);
		       	
		}
	 
	 public static void b3Event(ActionEvent e)
	    {
			EG eg = new EG();
		    eg.setVisible(true);
		       	
		}
	 
	 public static void logoutEvent(ActionEvent e)
	    {
			Login l = new Login();
		    l.setVisible(true);
		       	
		}
	 public static void b4Event(ActionEvent e)
	    {
		   
		 TabbedPane tp = new TabbedPane();
		    tp.setVisible(true);
		}
	 
	 
	 public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
	 
	 
}