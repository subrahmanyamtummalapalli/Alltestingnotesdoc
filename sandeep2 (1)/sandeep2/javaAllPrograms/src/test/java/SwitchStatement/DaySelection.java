package SwitchStatement;

public class DaySelection {
	
	public static void day()
	{
		int day=4;
		switch(day)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("no number");
			break;
		
		}
		
	}

	public static void main(String[] args) {
		
		day();
	}

}
