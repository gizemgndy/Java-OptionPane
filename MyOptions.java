import javax.swing.JOptionPane;

public class MyOptions {
	
	public static void main(String[] args) {
		
		
		//System.out.println(" Hello CMPE 261");
		
		// Message Dialogs....
		//JOptionPane.showMessageDialog(null, " Hello My CMPE 261"); // default...
		//JOptionPane.showMessageDialog(null, " Content", " My Title", JOptionPane.INFORMATION_MESSAGE);
		
		
		// Option dialogs....
		
		/*
		
		Object [] options = {"Yes", "No"};
		int myOption = JOptionPane.showOptionDialog(null, " Would you like to have a cup of tea", " Order tea", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		
		
		//System.out.println(" My option is: "+ myOption);
		
		JOptionPane.showMessageDialog(null, " Your option is "+myOption, "My Option is", JOptionPane.INFORMATION_MESSAGE);
		
		
		if(myOption==JOptionPane.YES_OPTION) {
			System.out.println(" You will have a cup of tea");
		}
		else if (myOption==JOptionPane.NO_OPTION) {
			
			System.out.println(" You will  not have a cup of tea");
		}
		
		else {
			
			System.out.println(" You will have nothing...");
		}
		
		*/
		
		
		// confirmation dialog
		
		/*
		
		int n = JOptionPane.showConfirmDialog(null, "Sure to Quit"); ///default...
		
		System.out.println(" Your confirmation is: "+ n);
		
		int m= JOptionPane.showConfirmDialog(null, "Sure to exit", "Title", JOptionPane.YES_OPTION);
		
		System.out.println(" Your confirmation is: "+ m);
		
		// if you want to use more options than 3... then we use  "JOptionPane.showOptionDialog" 
		
		*/
		
		// input dialog...
		
		/*
		
		String name = JOptionPane.showInputDialog("Input your name"); //1
		
		System.out.println(" My name is: "+  name);
		
		String lastName = JOptionPane.showInputDialog("Input your Last Name", "Istanbul"); // 2
		
		System.out.println(" My last name is: "+  lastName);
		
		String middleName= JOptionPane.showInputDialog(null,"Input Your Middle Name", " Title", JOptionPane.WARNING_MESSAGE); //3
		
		System.out.println(" My middle name is: "+  middleName);
		
		*/
		
		Object []days = {"Mon", "Tue","Wen", "Thur", "Fri","Sat","Sun"};
		
		String day = (String)JOptionPane.showInputDialog(null, "What day is today", "Select a day", JOptionPane.QUESTION_MESSAGE,null,days,"Mon");
		
		if(day !=null)
		 System.out.println(" Today is: "+ day);
		
		
		// input an integer number...
		
		String age = JOptionPane.showInputDialog(null,"How old are you","Input age", JOptionPane.QUESTION_MESSAGE);
		
		int myAge =0;
		
		try {
		
		 myAge= Integer.parseInt(age);
		 

			if(myAge>18) {
				System.out.println(" You are university student..");
			}
			else {
			
				System.out.println(" Your are high schools student...");
			}
		 
		 
		
		}catch (NumberFormatException e) {
		
			JOptionPane.showMessageDialog(null, "Input Integer Nubmer only", " Number problem", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
		
		
	}

}













