import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Date {
	int date1;
	int date2;
	long days;
}

public class CalculateTime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*formats the date in the form of day month year*/
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		Scanner dates = new Scanner(System.in);
		/*Asks the user to input the first date and then the second date*/
		System.out.println("Please print the first date in the format of dd MM yyyy: ");
		String date1 = dates.nextLine();
		System.out.println("Please print the second date in the format of dd MM yyyy: ");
		String date2 = dates.nextLine(); 
		LocalDate firstDate = LocalDate.parse(date1, formatter);
		LocalDate secondDate = LocalDate.parse(date2, formatter);
		
		/*finds the duration between the first date and the second date*/
		Period duration = Period.between(firstDate, secondDate);
		int years = duration.getYears();
		String diffYears = " years, ";
		int months = duration.getMonths();
		String diffMonths = " months,";
		int days = duration.getDays();
		String diffDays = " days.";
		if (years == 1) {
			diffYears = " year,";
		}
		if (months == 1) {
			diffMonths = " month,";
		}
		if (days == 1) {
			diffDays = " day.";
		}
		System.out.println("The duration between these two dates is: " + years + diffYears + months + diffMonths + " and " + days + diffDays);
	}

}
