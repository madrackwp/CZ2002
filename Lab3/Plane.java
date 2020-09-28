import java.util.Arrays;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        this.seat = new PlaneSeat[12];
        this.numEmptySeat = 12;
        for (int i = 0; i<12; i++){
            this.seat[i] = new PlaneSeat(i+1);
        }
    }

    private PlaneSeat[] sortSeats(){
        PlaneSeat[] seatCopy = this.seat;
        Arrays.sort(seatCopy,PlaneSeat.compareSeatID);
        return seatCopy;
    }

    public void showNumEmptySeats(){
        System.out.println(this.numEmptySeat);
    }

    public void showEmptySeats(){
        for (PlaneSeat planeSeat:seat){
            if (!planeSeat.isOccupied()){
                System.out.println("SeatID " + planeSeat.getSeatID());
            }
        }
    } 

    public void showAssignedSeats(boolean bySeatId){
        PlaneSeat[] copy = this.seat;
        if (bySeatId){
            Arrays.sort(copy, PlaneSeat.compareSeatID);
        } else {
            Arrays.sort(copy, PlaneSeat.compareCustomerID);
        }
        for (PlaneSeat seat : copy){
            if (seat.isOccupied()){
                System.out.println(seat);
            }
        }
    }

    public void assignSeat(int seatId, int custId){
        if (seat[seatId].isOccupied()){
            System.out.println("Warning this seat is already assigned, unassign it first!");
        } else {
            seat[seatId].assign(custId);
            this.numEmptySeat--;
            System.out.println("Seat assigned!");
        }
        
    }

    public void unAssignSeat(int seatId){
        seat[seatId].unAssign();
        this.numEmptySeat++;
        System.out.println("Seat unassigned!");
    }
}

