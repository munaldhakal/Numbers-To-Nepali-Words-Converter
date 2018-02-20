/**+
 * <<This program Converts any numbers entered into Nepali Words>>
 * @author Munal
 * @version 
 * @since , 19 Feb 2018
 */
public class Converter {

	private static Long toConvert=Long.parseLong("100");
	public static void main(String[] args) {
		String toString=String.valueOf(toConvert).trim();
		System.out.println(toString);
		int count=toString.length();
		String outputValue="";
		String tester="test";
		if(count==1&&toString.charAt(0)=='0') {
			outputValue="सुन्ना";
			toString="";
		}
		for(int i=0;i<toString.length();i++) {
			if(count>13) {
				outputValue=outputValue.concat("Number too large");
				break;
			}
			if(count==13||count==12) {
				if(toString.charAt(i)!='0') {
					if(count==13) {
							System.out.println("Hello");
					//	if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("खरब ");
							outputValue=outputValue.concat(number);
							tester="a";
							count--;
							i++;
					//	}
						/*else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("खरब");
							outputValue.concat(number);
						}*/
					}
					if(count==12) {
						if(tester=="a") {
							tester="test";
						}
						else {
							System.out.println("Hello"+tester);
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("खरब");
							outputValue.concat(number);
						}
					}
					
				}			
			}
			if(count==11||count==10) {
				if(toString.charAt(i)!='0') {
					if(count==11) {
						//if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("अरब ");
							outputValue=outputValue.concat(number);
							tester="a";
							count--;
							i++;
						/*}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("अरब");
							outputValue.concat(number);
						}*/
					}
					if(count==10) {
						if(tester=="a") {
							tester="test";
						}
						else {
							System.out.println("Hello"+tester);
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("अरब");
							outputValue.concat(number);
						}
					}
					
				}		
			}
			if(count==9||count==8) {
				if(toString.charAt(i)!='0') {
					if(count==9) {
						//if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("करोड़ ");
							outputValue=outputValue.concat(number);
							tester="a";
							count--;
							i++;
						/*}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("करोड़");
							outputValue.concat(number);
						}*/
					}
					if(count==8) {
						if(tester=="a") {
							tester="test";
						}
						else {
							System.out.println("Hello"+tester);
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("करोड़");
							outputValue.concat(number);
						}
					}
					
				}
			}
			if(count==7||count==6) {
				if(toString.charAt(i)!='0') {
					if(count==7) {
						//if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("लाख ");
							outputValue=outputValue.concat(number);
							tester="a";
							count--;
							i++;
						/*}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("लाख");
							outputValue.concat(number);
						}*/
					}
					if(count==6) {
						if(tester=="a") {
							tester="test";
						}
						else {
							System.out.println("Hello"+tester);
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("लाख");
							outputValue.concat(number);
						}
					}
					
				}
			}
			if(count==5||count==4) {
				if(toString.charAt(i)!='0') {
					if(count==5) {
						//if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("हजार ");
							outputValue=outputValue.concat(number);
							tester="a";
							count--;
							i++;
						/*}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("हजार");
							outputValue.concat(number);
						}*/
					}
					if(count==4) {
						if(tester=="a") {
							tester="test";
						}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("हजार");
							outputValue.concat(number);
						}
					}
					
				}
			}
			if(count==3) {
				if(toString.charAt(i)!='0') {
					String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
					number=number.concat(" ");
					number=number.concat("सय ");
					outputValue=outputValue.concat(number);
				}
			}
			if(count==2||count==1) {
				if(toString.charAt(i)!='0') {
					if(count==2) {
						//if(toString.charAt(i+1)!='0') {
							String a=Character.toString(toString.charAt(i));
							a=a.concat(Character.toString(toString.charAt(i+1)));
							String number=findNumber(Integer.parseInt(a));
							number=number.concat(" ");
							number=number.concat("रुपैंया");
							outputValue=outputValue.concat(number);
							tester="";
							count--;
							i++;
						//}
					}
					if(count==1) {
						if(tester=="") {
							tester="test";
							continue;
						}
						else {
							String number=findNumber(Integer.parseInt(Character.toString(toString.charAt(i))));
							number.concat("");
							number.concat("रुपैंया");
							outputValue.concat(number);
						}
					}
					
				}
			}
			count--;
		}
		System.out.println("Final Output:"+outputValue);
	}
	public static String findNumber(int a) {
		String[] nepaliValues={"", "एक", "दो", "तीन", "चार", "पाँच", "छह", "सात", "आठ", "नौ", "दस",
						"ग्यारह", "बारह", "तेरह", "चौदह", "पन्द्रह", "सोलह", "सत्रह", "अठारह", "उन्नीस", "बीस",
						"इक्कीस", "बाईस", "तेईस", "चौबीस", "पच्चीस", "छब्बीस", "सत्ताईस", "अट्ठाईस", "उनतीस", "तीस",
						"इकतीस", "बत्तीस", "तैंतीस", "चौंतीस", "पैंतीस", "छत्तीस", "सैंतीस", "अड़तीस", "उनतालीस", "चालीस",
						"इकतालीस", "बयालीस", "तैंतालीस", "चौवालीस", "पैंतालीस", "छियालीस", "सैंतालीस", "अड़तालीस", "उनचास", "पचास",
						"इक्यावन", "बावन", "तिरेपन", "चौवन", "पचपन", "छप्पन", "सत्तावन", "अट्ठावन", "उनसठ", "साठ",
						"इकसठ", "बासठ", "तिरेसठ", "चौंसठ", "पैंसठ", "छियासठ", "सड़सठ", "अड़सठ", "उनहत्तर", "सत्तर",
						"इकहत्तर", "बहत्तर", "तिहत्तर", "चौहत्तर", "पचहत्तर", "छिहत्तर", "सतहत्तर", "अठहत्तर", "उनासी", "अस्सी",
						"इक्यासी", "बयासी", "तिरासी", "चौरासी", "पचासी", "छियासी", "सत्तासी", "अट्ठासी", "नवासी", "नब्बे",
						"इक्यानबे", "बानबे", "तिरानबे", "चौरानबे", "पंचानबे", "छियानबे", "सत्तानबे", "अट्ठानबे", "निन्यानबे"};
		return nepaliValues[a];
	}
}
