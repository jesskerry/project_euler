
public class P19_CountingSundays {
	/*
	 * 1 Jan 1900 was a Monday.
	 * 
	 * 1 Jan 1901 was a Tuesday
	 * 
	 * Thirty days has September, April, June and November. All the rest have
	 * thirty-one, saving February alone, which has twenty-eight, rain or shine. And
	 * on leap years, twenty-nine.
	 * 
	 * A leap year occurs on any year evenly divisible by 4, but not on a century
	 * unless it is divisible by 400.
	 * 
	 * How many Sundays fell on the first of the month during the twentieth century
	 * (1 Jan 1901 to 31 Dec 2000)?
	 */
	public static void main(String[] args) {
		int count = 0;
		int[] date = { 1, 1, 1 }; // 1 Jan 01
		boolean leapYear = false;
		int currentWeekday = 2; // 1 Jan 01 is a Tuesday

		// loop through years 1901 - 2000
		for (int y = 1; y <= 100; y++) {
			if(y%4 == 0) {
				leapYear = true;
			} else {
				leapYear = false;
			}
			
			// loop through months
			for (int m = 1; m <= 12; m++) {

				// if it's Sunday, increment count
				if (currentWeekday == 0) {
					count++;
				}

				if (date[1] == 1 || date[1] == 2 || date[1] == 4 || date[1] == 6 || date[1] == 8 || date[1] == 9
						|| date[1] == 11) {
					// if the previous month had 31 days
					currentWeekday += 3;
					if(currentWeekday > 6) {
						currentWeekday -= 7;
					}
				} else if (date[1] == 5 || date[1] == 7 || date[1] == 10 || date[1] == 12) {
					// if the previous month had 30 days
					currentWeekday += 2;
					if(currentWeekday > 6) {
						currentWeekday -= 7;
					}
				} else {
					// February
					if(leapYear) {
						currentWeekday += 1;
						if(currentWeekday > 6) {
							currentWeekday -= 7;
						}
					}
				}

			}
		}
		// end loop
		
		System.out.println(count);
	}
}
