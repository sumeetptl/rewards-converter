public class RewardValue {
    double cash;
    float miles;

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(float miles)
    {
        this.miles = miles;
    }
    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue(){

        return cash * 0.0035;
    }

}
