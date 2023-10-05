/*
 *  @author Elia Renzoni
 *  @date 05/10/2023
 *  @brief 
 * 
 */


public class Train {
   private int nTotSeats;
   private int nFirstClassSeat;
   private int nSecondClassSeat;
   private int nFirstClassReservedSeats;
   private int nSecondClassReservedSeats;
   
   Train(int tot, int firstClass, int secondClass) {
        this.nTotSeats = tot;
        this.nFirstClassSeat = firstClass;
        this.nSecondClassSeat = secondClass;
   }

   public void reserveFirstClassSeat(int firstClassTotSeats) {
        if (this.nFirstClassReservedSeats < firstClassTotSeats) {
            this.nFirstClassReservedSeats++;
            System.out.println("Prenotazione effettuata con successo !");
        } else {
            System.out.println("Errore nella prenotazione, posti della prima classe occupati, riprova piú tardi");
        }
   }

   public void reserveSecondClassSeat(int secondClassTotSeats) {
        if (this.nSecondClassReservedSeats < secondClassTotSeats) {
            this.nSecondClassReservedSeats++;
            System.out.println("Prenotazione effettuata con successo !");
        } else {
            System.out.println("Errore nella prenotaziione, posti della seconda classe occupati, riprova piú tardi");
        }
   }

   public double getTotOccupancyRatio() {
        return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nTotSeats;
   }

   public double getFirstClassOccupancyRatio() {
        return this.nFirstClassReservedSeats / this.nFirstClassSeat;
   }

   public double getSecondClassOccupancyRatio() {
        return this.nSecondClassReservedSeats / this.nSecondClassSeat;
   }
}
