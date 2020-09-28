import java.util.Scanner;

public class PlaneApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plane plane =  new Plane();
        int userInput;

        do{
            System.out.println("====================================================================================================");
            System.out.println("Select options 1-7");
            System.out.println("1. Show the number of empty seats");
            System.out.println("2. Show the list of empty seats");
            System.out.println("3. Show the list of customers together with their seat numbers in the order to the seat numbers");
            System.out.println("4. Show the list of customers together with their seat numbers in the order to the customer ID");
            System.out.println("5. Assign a customer to a seat");
            System.out.println("6. Remove a seat assignment");
            System.out.println("7. Quit");
            System.out.println("====================================================================================================");
            userInput = scanner.nextInt();

            switch(userInput){
                case 1:
                    System.out.print("Number of empty seats: "); 
                    plane.showNumEmptySeats();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("These are the empty seats:");
                    plane.showEmptySeats();
                    break;
                case 3:
                    System.out.println("Assigned seats (Sort: CustomerID)");
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    System.out.println("Assigned seats (Sort: SeatID)");
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Enter custId");
                    int custId = scanner.nextInt();
                    System.out.println("Enter SeatNo");
                    int seatNo = scanner.nextInt();
                    plane.assignSeat(seatNo-1, custId);
                    break;
                case 6:
                    System.out.println("Enter the seat to unassign");
                    int unassignSeatNo = scanner.nextInt();
                    plane.unAssignSeat(unassignSeatNo-1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid option, try again!");


            }
        } while (userInput !=7);

        

        
    }
    


    
    
}
