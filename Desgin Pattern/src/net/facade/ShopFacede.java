package net.facade;

public class ShopFacede {
	private static final ShopFacede instance = new ShopFacede();
	
	private AccountService accountService;
	private EmailService emailService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private SmsService smsService;
	
	private ShopFacede() {
		accountService = new AccountService();
		emailService = new EmailService();
		paymentService = new PaymentService();
		shippingService = new ShippingService();
		smsService = new SmsService();
	}
	
	public static ShopFacede getInstace() {
		return instance;
	}
	
	public void buyByCashWithFreeShipping(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		System.out.println("Done\n");
	}
	
	public void buyByCreditCardWithExpressShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByCreditCard();
		shippingService.expressShipping();
		emailService.sendMail(email);
		smsService.sendSMS(mobilePhone);
	}


}
