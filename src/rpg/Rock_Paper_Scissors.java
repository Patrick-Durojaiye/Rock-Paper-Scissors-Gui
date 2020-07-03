package rpg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Rock_Paper_Scissors implements ActionListener {
	
	private JFrame frame;
	private JPanel panel1, panel2,panel3,panel4,panel5,panel6;
	private JLabel humanpoints, computerpoints, points1,points2;
	private JLabel played1, played2;
	private JLabel choice1r,choice1p,choice1s, choice2r, choice2p, choice2s;
	private JButton Rock, Paper, Scissors;
	private static int computer=0, human=0;
	private int humpoint=0, compoint=0;
	private static final int CRock=1;
	private static final int CPaper=1;
	private static final int CScissors=1;
	
	public Rock_Paper_Scissors()
	{
		frame = new JFrame("Rock Paper Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(750,750);
		frame.setResizable(true);
		frame.setLayout(new GridLayout(4,1));
		
		
		panel1 = new JPanel();
		frame.add(panel1, BorderLayout.NORTH);
		panel2 = new JPanel();
		//panel2.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		panel3 = new JPanel();
		panel1.setLayout(new GridLayout(1,4));
		
		panel2.setLayout(new GridLayout(1,3));
		panel3.setLayout(new GridLayout(1,2));
		//panel3.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		
		humanpoints =  new JLabel("0");
		computerpoints = new JLabel("0");
		points1 = new JLabel("Human points: ");
		points2 = new JLabel("Computer points: ");
		panel1.add(points1);
		panel1.add(humanpoints);
		panel1.add(points2);
		panel1.add(computerpoints);
		panel4= new JPanel(new GridLayout(1,2));
		panel5=  new JPanel();
		panel6 =  new JPanel();
		
		choice1r = new JLabel();
		choice1p = new JLabel();
		choice1s = new JLabel();
		choice2r = new JLabel();
		choice2p = new JLabel();
		choice2s = new JLabel();
		
		String path1="C:/Users/Timi Durojaiye/eclipse-workspace/Rock Paper Scissor Game/Media/rock.jpg"; 
		String path2="C:/Users/Timi Durojaiye/eclipse-workspace/Rock Paper Scissor Game/Media/paper.jpg";
		String path3="C:/Users/Timi Durojaiye/eclipse-workspace/Rock Paper Scissor Game/Media/scissors.png";
		ImageIcon rockpic = new ImageIcon(path1);
		choice1r.setIcon(rockpic);
		choice1r.setSize(50, 50);
		choice2r.setIcon(rockpic);
		choice2r.setSize(50, 50);
		
		ImageIcon paperpic = new ImageIcon(path2);
		choice1p.setIcon(paperpic);
		choice1p.setSize(50, 50);
		choice2p.setIcon(paperpic);
		choice2p.setSize(50, 50);
		
		ImageIcon scissorspic = new ImageIcon(path3);
		choice1s.setIcon(scissorspic);
		choice1s.setSize(50, 50);
		choice2s.setIcon(scissorspic);
		choice2s.setSize(50, 50);

		Rock = new JButton("Rock");
		Paper = new JButton("Paper");
		Scissors =  new JButton("Scissors");
		Rock.addActionListener(this);
		Paper.addActionListener(this);
		Scissors.addActionListener(this);
		
		panel5.add(choice1r);
		panel5.add(choice1p);
		panel5.add(choice1s);
		panel6.add(choice2r);
		panel6.add(choice2p);
		panel6.add(choice2s);
		
		Rock.setSize(166, 150);
		Paper.setSize(166, 150);
		Scissors.setSize(166,150); 
		
		panel2.add(Rock);
		panel2.add(Paper);
		panel2.add(Scissors);
		frame.add(panel2);  
		
		played1 = new JLabel("Human Played");
		played2 = new JLabel("Computer Played");
		panel3.add(played1);
		panel3.add(played2);
		
		
		panel4.add(panel5);
		panel4.add(panel6);
		frame.add(panel3);
		frame.add(panel4);
		choice1r.setVisible(false);
		choice1p.setVisible(false);
		choice1s.setVisible(false);
		choice2r.setVisible(false);
		choice2p.setVisible(false);
		choice2s.setVisible(false); 
		
	}
	
	public void setRockhum()
	{
		choice1r.setVisible(true);
	}
	
	public void setRockcom()
	{
		choice2r.setVisible(true);
	}
	
	public void setPaperhum()
	{
		choice1p.setVisible(true);
	}
	
	public void setPapercom()
	{
		choice2p.setVisible(true);
	}
	
	public void setScissorshum()
	{
		choice1s.setVisible(true);
	}
	
	public void setScissorscom()
	{
		choice2s.setVisible(true);
	}
	
	public void computerturn()
	{
		Random num = new Random();
		computer= num.nextInt(3)+1;
		if(computer==1)
		{
			choice2r.setVisible(true);
		}
		
		if(computer==2)
		{
			choice2p.setVisible(true);
		}
		
		if(computer==3)
		{
			choice2s.setVisible(true);
		}
	}
	
	public void won(int human,int computer)
	{
		if(human==1 & computer ==1)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			compoint++;
			computerpoints.setText(""+compoint);
			draw();
			
		}
		
		if(human==2 & computer ==2)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			compoint++;
			computerpoints.setText(""+compoint);
			draw();
			
		}
		
		if(human==3 & computer ==3)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			compoint++;
			computerpoints.setText(""+compoint);
			draw();
			
		}
		
		if(human==1 & computer ==2)
		{
			compoint++;
			computerpoints.setText(""+compoint);
			comwon();
		}
		
		if(human==1 & computer ==3)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			humwon();
			
		}
		
		if(human==2 & computer ==1)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			humwon();
			
		}
		
		if(human==2 & computer ==3)
		{
			compoint++;
			computerpoints.setText(""+compoint);
			comwon();
			
		}
		
		if(human==3 & computer ==1)
		{
			compoint++;
			computerpoints.setText(""+compoint);
			comwon();
			
		}
		
		if(human==3 & computer ==2)
		{
			humpoint++;
			humanpoints.setText(""+humpoint);
			humwon();
		}
		
	}
	
	public void humwon()
	{
		
		JDialog.setDefaultLookAndFeelDecorated(true);
	    int response = JOptionPane.showConfirmDialog(null, "You won!!! Do you want to continue?", "Confirm",
	        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	    if (response == JOptionPane.NO_OPTION) {
	      
	      System.exit(response);
	      
	    } else if (response == JOptionPane.YES_OPTION) {
	    	
	    	choice1r.setVisible(false);
			choice1p.setVisible(false);
			choice1s.setVisible(false);
			choice2r.setVisible(false);
			choice2p.setVisible(false);
			choice2s.setVisible(false);
			
	    } else if (response == JOptionPane.CLOSED_OPTION) {
	      
	    	System.exit(response);
	      
	    }
	}
		
	    public void comwon()
		{
			
			JDialog.setDefaultLookAndFeelDecorated(true);
		    int response = JOptionPane.showConfirmDialog(null, "Computer won!!! Do you want to continue?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (response == JOptionPane.NO_OPTION) {
		    	
		      System.exit(response);
		      
		    } else if (response == JOptionPane.YES_OPTION) {
		    	
		    	choice1r.setVisible(false);
				choice1p.setVisible(false);
				choice1s.setVisible(false);
				choice2r.setVisible(false);
				choice2p.setVisible(false);
				choice2s.setVisible(false);
				
		    } else if (response == JOptionPane.CLOSED_OPTION) {
		      
		    	System.exit(response);
		      
		    }		 
	}
	    
	    public void draw()
		{
			
			JDialog.setDefaultLookAndFeelDecorated(true);
		    int response = JOptionPane.showConfirmDialog(null, "It's a draw :(  Do you want to continue?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (response == JOptionPane.NO_OPTION) {
		      
		      System.exit(response);
		      
		    } else if (response == JOptionPane.YES_OPTION) {
		    	
		    	choice1r.setVisible(false);
				choice1p.setVisible(false);
				choice1s.setVisible(false);
				choice2r.setVisible(false);
				choice2p.setVisible(false);
				choice2s.setVisible(false);
				
		    } else if (response == JOptionPane.CLOSED_OPTION) {
		      
		      System.exit(response);
		      
		    }		 
	}	    
	    
	    
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== Rock)
		{
			
			setRockhum();
			human=1;
			computerturn();	
			won(human,computer);
			
	
		}
		
		if(e.getSource()== Paper)
		{
			setPaperhum();
			human=2;
			computerturn();
			won(human,computer);
			
			
		}
		
		if(e.getSource()== Scissors)
		{
			setScissorshum();
			human=3;
			computerturn();
			won(human,computer);
			
			
		}
	}
	
	public static void main(String[] args) 
	{
	new Rock_Paper_Scissors();
	}	

}
