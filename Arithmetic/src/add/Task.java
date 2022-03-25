package add;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Task {
	public static void main(String[] args) throws IOException {

		System.out.write("www.instanceofjava.com \n".getBytes());
		System.out.format("%s", "www.instanceofjava.com \n");
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("www.instanceofjava.com \n");
		System.err.print("This is custom error message");
		//System.console().writer().println("Hai");
	}
}