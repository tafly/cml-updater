import java.net.*;
import java.io.*;


public class Processing {

	void updateCML(String player) {

		try {
			URL url = new URL("http://www.crystalmathlabs.com/tracker/api.php?type=update&player=" + player);
			URLConnection yc = url.openConnection();
			yc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			// open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                    //System.out.println(inputLine);
            	System.out.println(player + " updated on CML (" + inputLine + ")");
            }
            br.close();

                     
            
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
}
