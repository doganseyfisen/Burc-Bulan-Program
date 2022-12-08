import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int month, day;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birth day (1-31): ");
		day = input.nextInt();
		System.out.print("Enter your birth month (1-12): ");
		month = input.nextInt();
		
		if(month == 1) {
			if(day >= 1 && day <= 31) {
				if( day > 21) {
				System.out.println("Your horoscope is: Aquarius");
				} else if( day <=21) {
					System.out.println("Your horoscope is: Capricorn");
				}
			}
		}
		
		if(month == 2) {
			if(day >= 1 && day <= 29) {
				if( day >= 20) {
				System.out.println("Your horoscope is: Pisces");
				} else if( day <20) {
					System.out.println("Your horoscope is: Aquarius");
				}
			}
		}	
		
		if(month == 3) {
			if(day >= 1 && day <= 31) {
				if( day >= 21) {
				System.out.println("Your horoscope is: Aries");
				} else if( day < 21) {
					System.out.println("Your horoscope is: Pisces");
				}
			}
		}
		
		if(month == 4) {
			if(day >= 1 && day <= 30) {
				if( day >= 21) {
				System.out.println("Your horoscope is: Taurus");
				} else if( day < 21) {
					System.out.println("Your horoscope is: Aries");
				}
			}
		}
		
		if(month == 5) {
			if(day >= 1 && day <= 31) {
				if( day >= 22) {
				System.out.println("Your horoscope is: Gemini");
				} else if( day < 22) {
					System.out.println("Your horoscope is: Taurus");
				}
			}
		}
		
		if(month == 6) {
			if(day >= 1 && day <= 30) {
				if( day >= 23) {
				System.out.println("Your horoscope is: Cancer");
				} else if( day < 23) {
					System.out.println("Your horoscope is: Gemini");
				}
			}
		}
		
		if(month == 7) {
			if(day >= 1 && day <= 31) {
				if( day >= 23) {
				System.out.println("Your horoscope is: Leo");
				} else if( day < 23) {
					System.out.println("Your horoscope is: Cancer");
				}
			}
		}
		
		if(month == 8) {
			if(day >= 1 && day <= 31) {
				if( day >= 23) {
				System.out.println("Your horoscope is: Virgo");
				} else if( day < 23) {
					System.out.println("Your horoscope is: Leo");
				}
			}
		}
		
		if(month == 9) {
			if(day >= 1 && day <= 30) {
				if( day >= 23) {
				System.out.println("Your horoscope is: Libra");
				} else if( day < 23) {
					System.out.println("Your horoscope is: Virgo");
				}
			}
		}
		
		if(month == 10) {
			if(day >= 1 && day <= 31) {
				if( day >= 23) {
				System.out.println("Your horoscope is: Scorpio");
				} else if( day < 23) {
					System.out.println("Your horoscope is: Libra");
				}
			}
		}
		
		if(month == 11) {
			if(day >= 1 && day <= 30) {
				if( day >= 22) {
				System.out.println("Your horoscope is: Sagittarius");
				} else if( day < 21) {
					System.out.println("Your horoscope is: Scorpio");
				}
			}
		}
		
		if(month == 12) {
			if(day >= 1 && day <= 31) {
				if( day >= 22) {
				System.out.println("Your horoscope is: Capricorn");
				} else if( day < 22) {
					System.out.println("Your horoscope is: Sagittarius");
				}
			}
		}
		
	}
}
