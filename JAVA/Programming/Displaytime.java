
public class Displaytime {

	public static void main(String[] args) {
		int seconds = 2400;
		int hours = seconds / 3600;
		int remainSec = seconds % 3600;
		int min = remainSec /60;
		int sec = remainSec % 60;
		System.out.println("The time:" +hours +""+"hours"
		+""+min +""+"minutes"+""+sec+""+"seconds");

	}

}
