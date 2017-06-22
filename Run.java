import Finance.*;

public class Run {

    public static void main(String[] args) {

	double c_0 = 100;
	double c_1 = 110;
	double rate = 0.25;
	
	System.out.println("netReturn(" + c_0 + "," + c_1 + ") = " +
			   Finance.netReturn(c_0,c_1));

	System.out.println("rateOfReturn(" + c_0 + "," + c_1 + ") = " +
			   Finance.rateOfReturn(100,110));

	System.out.println("futureValue(" + c_0 + "," + rate + ") = " +
			   Finance.futureValue(c_0, rate));
    }

}
