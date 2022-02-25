import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double departureFee;
        boolean isBanOnLeavingTheCountry;
        boolean visaStatus;
        BorderController borderController;
        while(true){
        System.out.println("Lütfen uçuş ücretini giriniz: ");
        departureFee = scanner.nextDouble();
        System.out.println("Ban lı mı değil mi bilgisini giriniz: ");
        isBanOnLeavingTheCountry = scanner.nextBoolean();
        System.out.println("Vize durum bilgisini giriniz: ");
        visaStatus = scanner.nextBoolean();
        Passenger passenger = new Passenger();


        borderController = new BorderController();
            try {
                borderController.checkBanOnLeavingTheCountry(isBanOnLeavingTheCountry);
                passenger.setBanOnLeavingTheCountry(isBanOnLeavingTheCountry);

            } catch (BanOnLeavingTheCountryException e) {
                e.printStackTrace();
            }
            try {
                borderController.checkDepartureFee(departureFee);
                passenger.setDepartureFee(departureFee);
            } catch (DepartureFeeException e) {
                e.printStackTrace();
            }

            try {
                borderController.checkVisa(visaStatus);
                passenger.setVisaStatus(visaStatus);
            } catch (VisaException e) {
                e.printStackTrace();
            }
            if(passenger.isBanOnLeavingTheCountry() && passenger.getDepartureFee() > 100 && passenger.getVisaStatus() ){
                System.out.println("Passenger oluşmuştur");
                System.out.println(passenger);
                break;
            }

        }
    }
}
