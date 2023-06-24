public class RewardValue {
    private double cashValue = 0.0;
    private int milesValue = 0;
    private final double CONVERT_RATE = 0.0035;
    public RewardValue(double cash) {

        this.cashValue = cash;
        milesValue = (int)(cash / CONVERT_RATE);
    }
    public RewardValue(int milesValue) {

        this.milesValue = milesValue;
        cashValue = milesValue * CONVERT_RATE;
    }
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
