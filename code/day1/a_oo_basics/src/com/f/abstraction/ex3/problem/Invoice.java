package com.f.abstraction.ex3.problem;

public class Invoice {
		private String invoiceId;
		private String vendorName;
		private double ratePerHr;
		private double numbersOfHr;
		public Invoice(String invoiceId, String vendorName, double ratePerHr, double numbersOfHr) {
			super();
			this.invoiceId = invoiceId;
			this.vendorName = vendorName;
			this.ratePerHr = ratePerHr;
			this.numbersOfHr = numbersOfHr;
		}
		@Override
		public String toString() {
			return "Invoice [invoiceId=" + invoiceId + ", vendorName=" + vendorName + ", ratePerHr=" + ratePerHr
					+ ", numbersOfHr=" + numbersOfHr + "]";
		}
		
		public double payment() {
			return ratePerHr* numbersOfHr*0.8;
		}
		
		
}
