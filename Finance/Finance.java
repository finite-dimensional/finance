package Finance;

public class Finance {

    public static double netReturn(double c_0, double c_1) {
	return c_1 - c_0;
    }

    public static double rateOfReturn(double c_0, double c_1) {
	return netReturn(c_0, c_1) / c_0;
    }

    public static double futureValue(double presentValue, double rate) {
	return presentValue * (1 + rate);
    }


}
