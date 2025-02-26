package common_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZAPutility {

    private Process zapProcess;

    public void startZAP() throws IOException {
//        try {
//            // Specify the path to ZAP executable or script
//        	String zapPath = "/home/gautham/Documents/OWSAP/zap.sh";
//  // Replace with the actual path to your ZAP executable or script
//
//            // Build the command to start ZAP
//            ProcessBuilder zapProcessBuilder = new ProcessBuilder(zapPath);
//
//            // Start ZAP
//            zapProcess = zapProcessBuilder.start();
//
//            // Optionally, wait for ZAP to start (you may need to customize this based on your setup)
//            Thread.sleep(5000); // Wait for 5 seconds
//
//            System.out.println("ZAP has been started.");
//
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
     	String zapPath = "/home/gautham/Downloads/ZAP_2.14.0_Linux/ZAP_2.14.0/zap.sh";
    	ProcessBuilder zapProcessBuilder = new ProcessBuilder(zapPath);
    	zapProcessBuilder.redirectErrorStream(true);
    	Process zapProcess = zapProcessBuilder.start();

    	// Read the process output
    	BufferedReader reader = new BufferedReader(new InputStreamReader(zapProcess.getInputStream()));
    	String line;
    	while ((line = reader.readLine()) != null) {
    	    System.out.println(line);
    	}
    }

    public void stopZAP() {
        try {
            if (zapProcess != null) {
                // Stop ZAP
                zapProcess.destroy();

                // Optionally, wait for ZAP to stop (you may need to customize this based on your setup)
                Thread.sleep(5000); // Wait for 5 seconds

                System.out.println("ZAP has been stopped.");
            } else {
                System.out.println("ZAP process is null. Was it started?");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
