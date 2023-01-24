package stringquestions;

public class IpAddressValidation {
	
	public static void main(String[] args) {
		if(ipValidationProgram("10.23.56.256")) {
			System.out.println("valid Ip");
		}else {
			System.err.println("In-valid Ip");
		}
	}
	
	public static boolean ipValidationProgram(String ip) {
		if(!ip.replaceAll("[0-9 .]", "").isEmpty()) {
			return false;
		}else {
			int temp=0;
			int dot = ip.replaceAll("[^.]", "").length();
			if(dot==3) {
				for(String ipsNumber:ip.split("\\.")) {
					if(Integer.parseInt(ipsNumber)>256) {
						temp++;
					}
				}
				if(temp>0) {
					return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}

}
