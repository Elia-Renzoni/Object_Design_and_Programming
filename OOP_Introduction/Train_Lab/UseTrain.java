/*
 *  @author Elia Renzoni
 *  @date 05/10/2023
 *  @brief
 * 
 */


public class UseTrain {
    public static void main(String[] argv) {
        int totSeat = 100;
        int firstClassSeats = 60;
        int secondClassSeats = 40;
        Train tr = new Train(totSeat, firstClassSeats, secondClassSeats);

        tr.reserveFirstClassSeat(firstClassSeats);
        tr.reserveSecondClassSeat(secondClassSeats);
        System.out.println("Tasso Occupazione Posti : " + tr.getTotOccupancyRatio());
        System.out.println("Tasso Occupazione Posti Prima Classe : " + tr.getFirstClassOccupancyRatio());
        System.out.println("Tasso Occupazione Posti Seconda Classe : " + tr.getSecondClassOccupancyRatio());
    }

}
