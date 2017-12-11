import java.util.Scanner; 
public class TextAdventure {
	
	public TextAdventure(String name)
	{
		this.name = name;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(final String PlayerName) {
		this.name = PlayerName;
	}
	//cool typing effect maybe.
	
	public static void typeEffect(String s) {
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
			try {
				Thread.sleep(50);
			} catch(Exception e) {
				System.out.println(e);
			}
		} System.out.println("");
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//It begins. Get the players name.
		
		typeEffect("Welcome to the Reading Day Adventure!");
		typeEffect("Please enter a name for your character:");
		TextAdventure Player1 = new TextAdventure(keyboard.nextLine());
		
		typeEffect("Welcome, " + Player1.name + "!");
		typeEffect("You are about to embark on a trying adventure, choose wisely. There's no going back.");
		//Cool suspenseful hyphens.
		
		for(int i=0; i<20; i++) {
			System.out.print("- ");
			try {
				Thread.sleep(250);
			} catch(Exception e) {
				System.out.println(e);
			}
		} System.out.println("");
		
		typeEffect("You wake up at 3:00 PM after a night of heavy drinking. You realize you have a final project due in two hours.");
		
		typeEffect("You can either go back to sleep or go to the library. To make decisions, enter 1 for the first option and 2 for the second:");
		String choice = keyboard.next();
		 String good_job = "Yay! Your studying paid off, you'll probably get that A!";
         String yikes = "Sorry, you failed at life.";
         String try_again = "Please enter 1 or 2 aka a valid input.";
		
		if(choice.equals("1")) {
            typeEffect ("You remember you have an essay due in 3 hours! Looks like you have to get up now.");
            typeEffect ("Maybe you could take some time to eat first and catch up on social media for a little... ");
            typeEffect ("Or you could just start working and eat later.");
           
            typeEffect ("What do you want to do? 1. Eat 2. Just push through: ");
            String get_up = keyboard.next();
           
            
            if(get_up.equals("1")) {
                typeEffect ("Well darn, looks like you missed your deadline.");
                typeEffect ("At least you can go back to sleep now.");
                typeEffect ("Or maybe you could start studying for that final you have at 8am tomorrow...");
               
                typeEffect ("So will you to 1. Sleep or 2. Study: ");
                String missed_deadline = keyboard.next();
               
                if (missed_deadline.equals("1")) {
                    typeEffect ("Well. Guess you were just too exhausted and overslept.");
                    typeEffect (yikes);
                }
               
                if(missed_deadline.equals("2")) {
                    typeEffect (good_job);
                }
 
                while(!missed_deadline.equals("1") && !missed_deadline.equals("2")) {
                    typeEffect (try_again);
                    keyboard.next();
                }
            }
           
            if(get_up.equals("2")) {
                typeEffect ("Hey, good on you. You got a good start on that essay.");
                typeEffect ("Ah, you just got a text, your friend wants to get lunch!");
               
                typeEffect ("1. Eat or 2. Keep studying: ");
                String lunch = keyboard.next();
               
                if(lunch.equals("1")) {
                    typeEffect ("You lost track of time while you were out and mised your deadline :/");
                    typeEffect (yikes);
                }
               
                if(lunch.equals("2")) {
                    typeEffect (good_job);
                }
 
                while(!lunch.equals("1") && !lunch.equals("2")) {
                    typeEffect (try_again);
                    keyboard.next();
                }
            }
 
            while(!get_up.equals("1") && !get_up.equals("2")) {
                typeEffect (try_again);
                keyboard.next();
            }
        }
		
		//ADYAS CODE.
		
		if (!choice.equals("1") && !choice.equals("2")) {
			typeEffect (try_again);
			choice = keyboard.next();
		}
		if (choice.equals("2")) {
			typeEffect("There are no more seats! Do you try another library(1) or go upstairs(2)?");
			String choice1 = keyboard.next();
			//Library track.
			if (choice1.equals("1")) {
				typeEffect("As you're walking, you notice a hoard of cute dogs. Do you get distracted(1) or keep walking(2)?");
				if (keyboard.next().equals("1")) {
					typeEffect("You missed the project! You failed at life.");
				} else typeEffect("You managed to pull through and get an A-! Well done!");
			}
			//Upstairs track.
			else if (choice1.equals("2")) {
				typeEffect("Its finals week, yet somehow...the entire floor is empty.");
				typeEffect("Do you go check the other floors(1) or explore this creepy floor(2)?");
				//Left track aka Adyas job.
				String choice2= keyboard.next();
				if (!choice2.equals("1") && !choice2.equals("2")) {
					typeEffect(try_again);
					choice2 = keyboard.next();
				}
				if (choice2.equals("1")) {
					typeEffect("They are all suddenly empty. A large figure is headed towards you. It is the evil cerberus, but we'll call him Fluffy.");
					typeEffect("Do you run(1) or walk towards it(2)?");
					//Run track.
					if (keyboard.next().equals("1")) {
						typeEffect("Fluffy thinks you're playing!");
						typeEffect("Do you use this against him and kill him(1) or keep playing(2)?");
						if (keyboard.next().equals("1")) {
							typeEffect("You killed your only chance of getting out. You are stuck here forever, you failed at life.");
						} else typeEffect("He loves you! He helps you get out of the Upstairs. Well done! Finals dont really matter now, do they?");
					} //Walk track.
					else typeEffect("He is threatened by you. You try to escape but it is too late, you're stuck in the Upstairs forever. You failed at life.");
				} 
				//Prernas job
				else if (choice2.equals("2")) {
		                    typeEffect("You see two shadows moving in the distance...");
		                   
		                    typeEffect("Do you want to move towards the 1. left or 2. right: ");
		                    String shadows = keyboard.next();
		                    if (!shadows.equals("1") && !shadows.equals("2")) {
		    					typeEffect(try_again);
		    					shadows = keyboard.next();
		    				}
		                    if(shadows.equals("1")) {
		                        typeEffect ("You run into a nice talking dog, whose name, you later find out, is Dave.");
		                        typeEffect ("He warns you of Cerberus, who we call Fluffy , who is rapidly approaching.");
		                        typeEffect ("Dave barely finishes his sentence before you can feel Fluffy's breath on your neck...");
		                        typeEffect ("As Dave yells at you to run, he growls and attacks Fluffy, impairing him enough to give you a chance to escape.");
		                        typeEffect ("Despite being as stunned as you are, you run.");
		                        typeEffect ("You run as far away from that library as you can, wondering what the hell you just got into...");
		                    }
		                   
		                    if(shadows.equals("2")) {
		                        typeEffect("You run into an awfully large and scary Cerberus...lets call him Fluffy");
		                        typeEffect("As he turns and spots you, he growls and lunges forward...");
		                        typeEffect("You try to run but he's too big and too fast...");
		                        typeEffect("You feel a weight on you and suddenly everything goes black...");
		                        typeEffect(yikes);
		                    }
		                }
		            }
				}
			}
		}