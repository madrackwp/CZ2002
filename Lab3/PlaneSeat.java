import java.util.Comparator;

public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;


    public PlaneSeat(int seatId){
        this.seatId = seatId;
        this.assigned = false;
        this.customerId = 0;
    }

    public PlaneSeat(int seatId, int customerId){
        this.seatId = seatId;
        this.customerId = customerId;
    }

    public int getSeatID(){
        return this.seatId;
    }

    public int getCustomerID(){
        return this.customerId;
    }

    public boolean isOccupied(){
        return this.assigned;
    }

    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unAssign(){
        this.customerId = 0;
        this.assigned = false;
    }

    public static Comparator<PlaneSeat> compareCustomerID = new Comparator<PlaneSeat>(){
        public int compare(PlaneSeat s1, PlaneSeat s2){
            int cust1 = s1.getCustomerID();
            int cust2 = s2.getCustomerID();

            return cust1-cust2;
        }
    };

    public static Comparator<PlaneSeat> compareSeatID = new Comparator<PlaneSeat>(){
        public int compare(PlaneSeat s1, PlaneSeat s2){
            int seat1 = s1.getSeatID();
            int seat2 = s2.getSeatID();
            return seat1-seat2;
        }
    };

    public String toString(){
        return "SeatID: " + this.seatId + " isOccupied: " + this.assigned + " CustomerID: "+ this.customerId;
    }



    
    
}