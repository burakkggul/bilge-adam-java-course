public class Passenger {
    private double departureFee;
    private boolean isBanOnLeavingTheCountry;
    private boolean visaStatus;



    public double getDepartureFee() {
        return departureFee;
    }

    public void setDepartureFee(double departureFee) {
        this.departureFee = departureFee;
    }

    public boolean isBanOnLeavingTheCountry() {
        return isBanOnLeavingTheCountry;
    }

    public void setBanOnLeavingTheCountry(boolean banOnLeavingTheCountry) {
        isBanOnLeavingTheCountry = banOnLeavingTheCountry;
    }

    public boolean getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(boolean visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "departureFee=" + departureFee +
                ", isBanOnLeavingTheCountry=" + isBanOnLeavingTheCountry +
                ", visaStatus=" + visaStatus +
                '}';
    }
}
