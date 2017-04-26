package facade;

public class Facade {

	private UserCreditSubsystem credit;
	private PaymentSubsystem payments;

	boolean purchase(double amonut) {

		payments.pay(amonut);
		if (payments.verify()) {
			credit.add(amonut);
			if (credit.check()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
