package InterviewPractice;

public class IpValidation {

	public static void main(String[] args) {
		if(ipValidation()) {
			System.out.println("Valid ip");
		}else {
			System.err.println("In-valid ip");
		}
	}

	public static boolean ipValidation() {
		try {
			String ip = "10.56.256. 36";;
			if (!ip.replaceAll("[0-9 .]", "").trim().isEmpty()) {
				return false;
			} else {
				if (ip.replaceAll("[0-9]", "").split("").length == 3) {
					String[] numbers = ip.split("\\.");
					for (String num : numbers) {
						if(Integer.parseInt(num)> 256) {
							return false;
						}
					}

				} else {
					return false;
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
