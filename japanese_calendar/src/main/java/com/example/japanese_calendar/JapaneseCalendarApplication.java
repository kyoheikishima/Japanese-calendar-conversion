package com.example.japanese_calendar;

public class JapaneseCalendarApplication {

	public static void main(String[] args) {
		double taxRate = 0.1;
		JapaneseCalendarApplication j = new JapaneseCalendarApplication();
		System.out.println(1500 + j.tax(1500, taxRate));

		
	}

	protected double tax(double price, double consumptionTax) {
		return price * consumptionTax;
	}

}
