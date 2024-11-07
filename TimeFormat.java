// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String piriod = (hours >= 12 ) ? "PM" : "AM";
		if (hours > 12) {
			hours = hours - 12;
		}
		String min = (minutes < 10) ? "0" + minutes : "" + minutes;
            System.out.println(hours + ":" + min + " " + piriod);
        }
        // Replace this comment with the rest of your code
	}
