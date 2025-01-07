import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Play {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		File file = new File("silent.wav");
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		
		String response = "";
		// response = response.toUpperCase();
		while(!response.equals("Q")){
			System.out.println("P = play, S=Stop, R=Reset, Q=Quit");
			System.out.println("enter your response: ");
			response = scanner.next();
			response = response.toUpperCase();
			switch (response) {
				case ("P"):
					clip.start();
					break;
				case ("S"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("Q"): clip.close();
				break;
			
				default: System.out.println("Not Valid");
					break;
			}
		}
		// clip.start();
	}
}
