package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
	
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
           int petNumber = JOptionPane.showOptionDialog(null,"Which pet would you like to buy?", "Happy Pet",0,
        		   JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Parrot", "Panda", "Wolf","Shark"}, null);
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
       while(true) {
           String pet = "";
       
           if(petNumber == 0) {
        	   pet = "parrot";
           }
           if(petNumber == 1) {
        	   pet = "panda";
           }
           if(petNumber == 2) {
        	   pet = "wolf";
           }
           if(petNumber == 3) {
        	   pet = "shark";
           }
           int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your " + pet + " happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play", "Eat", "Walk" }, null);
			
            if(task == 0) {
            	if(pet.equals("parrot")) {
            		happyParrot();
            	}
            }
            if(task == 1) {
            	if(pet.equals("parrot")) {
            		happyParrot();
            	}
            }
            if(task == 2) {
            	if(pet.equals("parrot")) {
            	madParrot();
            }
            }
            if(task == 0) {
            	if(pet.equals("panda")) {
            		happyPanda();
            	}
            }
            if(task == 1) {
            	if(pet.equals("panda")) {
            		happyPanda();
            	}
            }
            if(task == 2) {
            	if(pet.equals("panda")) {
            		madPanda();
            	}
            }
            if(task == 0) {
            	if(pet.equals("wolf")) {
            		madWolf();
            	}
            }
            if(task == 1) {
            	if(pet.equals("wolf")) {
            		happyWolf();
            	}
            }
            if(task == 2) {
            	if(pet.equals("wolf")) {
            		happyWolf();
            	}
            }
            if(task == 0) {
            	if(pet.equals("shark")) {
            		happyShark();
            	}
            }
            if(task == 1) {
            	if(pet.equals("shark")) {
            		happyShark();
            	}
            }
            if(task == 2) {
            	if(pet.equals("shark")) {
            		madShark();
            	}
            }
            int task2 = JOptionPane.showOptionDialog(null, "What would you like to do to make your " + pet + " happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Get pet/scratched", "Have a bath", "Swim" }, null);
            if(task2 == 0) {
            	if(pet.equals("parrot")) {
            		happyParrot();
            	}
            }
            if(task2 == 1) {
            	if(pet.equals("parrot")) {
            		madParrot();
            	}
            }
            if(task2 == 2) {
            	if(pet.equals("parrot")) {
            		madParrot();
            	}
            }
            if(task2 == 0) {
            	if(pet.equals("panda")) {
            		happyPanda();
            	}
            }
            if(task2 == 1) {
            	if(pet.equals("panda")) {
            		happyPanda();
            	}
            }
            if(task2 == 2) {
            	if(pet.equals("panda")) {
            		madPanda();
            	}
            }
            if(task2 == 0) {
            	if(pet.equals("wolf")) {
            		happyWolf();
            	}
            }
            if(task2 == 1) {
            	if(pet.equals("wolf")) {
            		madWolf();
            	}
            }
            if(task2 == 2) {
            	if(pet.equals("wolf")) {
            		madWolf();
            	}
            }
            if(task2 == 0) {
            	if(pet.equals("shark")) {
            		madShark();
            	}
            }
            if(task2 == 1) {
            	if(pet.equals("shark")) {
            		madShark();
            	}
            }
            if(task2 == 2) {
            	if(pet.equals("shark")) {
            		happyShark();
            	}
            }
          int task3 = JOptionPane.showOptionDialog(null,"What would you like to do to make you " + pet + " happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null, 
        		  new String[] { "Sleep", "Take a bath", "Eat again" }, null);
          if (task3 == 0) {
        	  if(pet.equals("parrot")) {
        		  madParrot();
        	  }
          }
          if(task3 == 1) {
        	  if(pet.equals("parrot")) {
        		  madParrot();
        	  }
       
          }
          if(task3 == 2) {
        	  if(pet.equals("parrot")) {
        		  happyParrot();
        	  }
          }
          if(task3 == 0) {
        	  if(pet.equals("panda")) {
        		  madPanda();
        	  }
          }
          if(task3 == 1) {
        	  if(pet.equals("panda")) {
        		  happyPanda();
        	  }
          }
          if(task3 == 2) {
        	  if(pet.equals("panda")) {
        		  happyPanda();
        	  }
          }
          if(task3 == 0) { 
        	  if(pet.equals("wolf")) {
        		  happyWolf();
        	  }
          }
          if(task3 == 1) {
        	  if(pet.equals("wolf")) {
        		  madWolf();
        	  }
          }
          if(task3 == 2) {
        	  if(pet.equals("wolf")) {
        		  madWolf();
        	  }
          }
          
          if(task3 == 0) {
        	  if(pet.equals("shark")) {
        		  happyShark();
        	  }
          }
          if(task3 == 1) {
        	  if(pet.equals("shark")) {
        		  madShark();
        	  }
          }
          if(task3 == 2) {
        	  if(pet.equals("shark")) {
        		  happyShark();
        	  }
          }
          if(happinessLevel == 3) {
        	  JOptionPane.showMessageDialog(null,"You are a very great owner!");
              break; 
          }
          else if(happinessLevel < 3) {
        	 JOptionPane.showMessageDialog(null, "You are a horrible owner, your pet does not like you.");
          }
        }
          

		
			// 6. Use user input to call the appropriate method created in step 5 below.
                
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void madParrot() {
JOptionPane.showMessageDialog(null, "Sqwuak! Sqwuak! Polly doesn't like that! - Polly Parrot");	
happinessLevel--;
}
static void happyParrot() {
	JOptionPane.showMessageDialog(null, "Thank you! Thank you owner! - Polly Parrot");
	happinessLevel++;
}
static void madPanda() {
	JOptionPane.showMessageDialog(null, "Panda doesn't want to do this! Panda angry! - Panda");
	happinessLevel--;
}
static void happyPanda() {
	JOptionPane.showMessageDialog(null, "Thank you so much owner! This is the best! - Panda");
	happinessLevel++;
}
static void happyWolf() {
	JOptionPane.showMessageDialog(null, "Thank you very much owner, this is fun! - Wolf");
	happinessLevel++;
}
static void madWolf() {
	JOptionPane.showMessageDialog(null, "I don't want to do this! This is the worst! - Wolf");
	happinessLevel--;
}
static void happyShark() {
	JOptionPane.showMessageDialog(null, "Thank you owner! I am so happy!");
	happinessLevel++;
}
static void madShark() {
	JOptionPane.showMessageDialog(null,"No, I don't want to do this!");
	happinessLevel--;
}





}