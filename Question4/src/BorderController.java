public class BorderController {
    private boolean isBanOnLeavingTheCountry;

    public void checkDepartureFee(double departureFee) throws DepartureFeeException {
        if(departureFee < 100){
            throw new DepartureFeeException("DepartureFee 100 tl den düşük olamaz");
        }
    }
    public void checkBanOnLeavingTheCountry(boolean isBanOnLeavingTheCountry) throws BanOnLeavingTheCountryException{
        if(isBanOnLeavingTheCountry == false){
            throw new BanOnLeavingTheCountryException("Ülke dışına çıkması banlanmıştır");
        }

    }
    public void checkVisa(boolean visaSatus) throws VisaException {
        if(visaSatus == false){
            throw new VisaException("Vizeninz bulunmamaktadır , çıkış yapamazsınız.");
        }
    }
}
