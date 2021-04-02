package Tirgul1;
// id:323036533 , name : Liwaa Hosh
import javax.swing.JOptionPane;
public class liwaa
{
	
public static void main(String[] args)
	{
		int x=0;
	while(x==0)// in order to restart or end the game
	{
		String p1,p2,practice,g1,g2,g3;		
		int tmp1,tmp2,tmp3,c=0;
		boolean valid=true,win=false;
		String Currentplayer=" ";
		String user=" ";
		
		tmp1=(int)(Math.random()*5)+1;
		tmp2=(int)(Math.random()*5)+1;
		tmp3=(int)(Math.random()*5)+1;
		while(tmp1==tmp2 || tmp1==tmp3  ||  tmp2==tmp3) // making sure that we generate 3 different random numbers 
		{
			tmp2=(int)(Math.random()*5)+1;
			tmp3=(int)(Math.random()*5)+1;
		}
			p1=JOptionPane.showInputDialog(null,"Please Enter full name of player#1");
			p2=JOptionPane.showInputDialog(null,"Please Enter full name of player#2");
			
			//practice match mode
					do 
					{
						practice=JOptionPane.showInputDialog(null,"Player#1:"+p1+"\n"+"How Many Numbers do you want to show"+"\n"+"Press 1,2,3 or Cancel for None");
						if(practice!=null)
							{
								switch(practice)
								{
						
								case "3":
									System.out.println("third random:"+tmp3);
				
								case "2":
									System.out.println("second random:"+tmp2);
							
								case "1":
									System.out.println("first random:"+tmp1);		
									break;					
								default:// every invalid input (not 3 or 2 or 1)
									valid=false;
									JOptionPane.showMessageDialog(null,"Enter A valid Value");
									break;
								}
								
							}				
							else // if the user clicks on 'Cancel' button
							{
								JOptionPane.showMessageDialog(null,"Leaving practice mode");
								break;								
							}
						
					}while(valid=true);//making sure we have a valid inputs.
					
		{
		while(win!=true)
		{			
						c=0;
						if (Currentplayer==p1) // to change turns from player 1 to 2.(saving code lines)
						{
							Currentplayer=p2;
							user="Player#2";
						}
						else
						{
							Currentplayer=p1;
							user="Player#1";
						}						
				// the guessing part for every player  and making sure that every guess is unique.			
					g1 =JOptionPane.showInputDialog(null,user+" "+Currentplayer+"\n"+"Please Enter your first guess");
					g2 =JOptionPane.showInputDialog(null,user+" "+Currentplayer+"\n"+"Please Enter your second guess");
			
					int num1=Integer.parseInt(g1);//guess number 1
					int num2=Integer.parseInt(g2);//guess number 2
					while(num1==num2) // prevent the user to keep guessing until he guessed g1!=g2. 
					{
						JOptionPane.showMessageDialog(null,"Enter A Differnt Value");
						g2 =JOptionPane.showInputDialog(null,user+" "+Currentplayer+"\n"+"Please Enter your second guess");  //giving the user another chance to guess a different number from 1st time.
						num2=Integer.parseInt(g2);// in order to compare with num1
					}			
					g3=JOptionPane.showInputDialog(null,user+" "+Currentplayer+"\n"+"Please Enter your third guess");
					int num3=Integer.parseInt(g3); //guess number 3
					while (num1==num3 || num2==num3)  //making sure that the 3rd guess is different from the other two guesses.
					{
						JOptionPane.showMessageDialog(null,"Enter A Differnt Value");
						g3 =JOptionPane.showInputDialog(null,user+" "+Currentplayer+"\n"+"Please Enter your third guess"); //giving the user another chance to guess a different number from the last two numbers.
						num3=Integer.parseInt(g3); // in order to compare with num1 and num2		
					}
								// check how many correct guesses for every player
			if (num1==tmp1 || num1==tmp2 || num1==tmp3)
				{
					c++;
				}
			if(num2==tmp1 || num2==tmp2 || num2==tmp3)
				{
					c++;
				}
			if(num3==tmp1 || num3==tmp2 || num3==tmp3)
				{
					c++;
				}
				switch(c) // To Display how many guesses was correct 
				{
				case 3:
					JOptionPane.showMessageDialog(null,"Congrats you guessed all numbers correctly !!");
					win=true;
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Oops you guessed two numbers correctly");
					break;
				case 1:
					JOptionPane.showMessageDialog(null,"Oops you guessed just one number correctly");
					break;
			
				default:
					break;
			}
						
		} 
			int input=JOptionPane.showConfirmDialog(null,"Congrats"+"\n"+user+" :"+Currentplayer+" "+"Won"+"\n"+"Do You Want To Start A New Game ?");
			if(input==0)// 0=yes.
				
			{
				x=0; //keep the loop going and restart the game. 
			}
			else // cancel or No.
			{
				JOptionPane.showMessageDialog(null,"The Game Has Ended , Thanks for playing !! ");
				x=1; // stopping the loop and ending game.
			}
		}
	 }	
  }
}			

	

