import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
	
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime = time.format(formatter);
	
	public void log(String text) {
		System.out.println("[" + formattedTime + "]" + " [LOG] " + text);
	}
	
	public void err(String text) {
		System.out.println("[" + formattedTime + "]" + " [ERR] " +   text);
	}
	
	public void warn(String text) {
		System.out.println("[" + formattedTime + "]" + " [WARN] " +  text);
	}
}
