import java.util.Scanner;

public class BuildingDemo {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Building [] buildingArray = new Building[10];
		int numberOfBuildings = 0;
		int option; 
		
		do {
			System.out.println("Press 1 to add a Building");
			System.out.println("Press 2 to look at all the existing Buildings");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();  //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the new building?");
				String newName = keyboard.nextLine();
				System.out.println("How many rooms does this new building have?");
				int newNumberOfRooms = keyboard.nextInt();
				
				Building currentBuilding = new Building();
				currentBuilding.setName(newName);
				currentBuilding.setNumberOfRooms(newNumberOfRooms);
				
				if(numberOfBuildings < buildingArray.length) {
					buildingArray[numberOfBuildings] = currentBuilding;
					numberOfBuildings++;
				}
				else {
					System.out.println("No more room for additional buildings!");
				}
			}
			else if(option == 2) {
				for(int index = 0; index < numberOfBuildings; index++){
					System.out.println("Name: " + buildingArray[index].getName());
					System.out.println("Number Of Rooms: " + buildingArray[index].getNumberOfRooms());
				}
			}
			else if(option == 3) {
				System.out.println("Thank you for using the program!");	
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 3);
	}
}
