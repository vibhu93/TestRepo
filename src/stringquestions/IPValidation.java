package stringquestions;

import java.net.InetAddress;

public class IPValidation {

	public static void main(String[] args) {
		System.out.println(getIp());
		if (ipValidation(getIp())) {
			System.out.println("Your IP is Valid");
		} else {
			System.err.println("Check Your IP Address is not valid");
		}
	}

	// Get The system IP and Validate the below conditctions
	// 1 .It shound content 3 [. dot]
	// 2. It should not content Aphabates
	// 3. It Should not have special char
	// 4. each number is not more that 256

	// If Above all condition worked then only your IP is valid.

	public static String getIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (Exception e) {
			return "IP not found";
		}
	}

	public static boolean ipValidation(String ip) {
		try {
			if (ip.replaceAll("[0-9 .]", "").trim().isEmpty()) {
				String[] ipAd1 = ip.split("");
				int dot = 0;
				int tempCount = 0;
				for (int i = 0; i <= ipAd1.length - 1; i++) {
					if (ipAd1[i].equalsIgnoreCase(".")) {
						dot++;
					}
				}
				if (dot == 3) {
					String[] ipAd2 = ip.split("\\.");
					for (int i = 0; i <= ipAd2.length - 1; i++) {
						if (Integer.parseInt(ipAd2[i]) >= 257) {
							tempCount++;
						}
					}
					if (tempCount == 0 && dot == 3) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

}
