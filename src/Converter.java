/**+
 * <<This program Converts any numbers entered into Nepali Words>>
 * @author Munal
 * @version 1.0.0 
 * @since , 19 Feb 2018
 */
public class Converter {
	private static Long toConvert=Long.parseLong("556154535156");
	private static String toString=String.valueOf(toConvert).trim();
	private static String tester="test";
	private static String outputValue="";
	public static void main(String[] args) {
		System.out.println(toString);
		int count=toString.length();
		if(count==1&&toString.charAt(0)=='0') {
			outputValue="सुन्ना";
			toString="";
		}
		for(int i=0;i<toString.length();i++) {
			if(count>13) {
				outputValue=outputValue.concat("Number too large");
				break;
			}
			int x[]=setNumber(i,count);
			count=x[0];
			i=x[1];
			count--;
		}
		System.out.println("Final Output:"+outputValue+" रुपैंया");
	}
	public static String findNumber(int a) {
		String[] nepaliValues={"", "एक", "दो", "तीन", "चार", "पाँच", "छह", "सात", "आठ", "नौ", "दस","ग्यारह", "बारह", "तेरह", "चौदह", "पन्द्रह", "सोलह", "सत्रह", "अठारह", "उन्नीस", "बीस","इक्कीस", "बाईस", "तेईस", "चौबीस", "पच्चीस", "छब्बीस", "सत्ताईस", "अट्ठाईस", "उनतीस", "तीस","इकतीस", "बत्तीस", "तैंतीस", "चौंतीस", "पैंतीस", "छत्तीस", "सैंतीस", "अड़तीस", "उनतालीस", "चालीस","इकतालीस", "बयालीस", "तैंतालीस", "चौवालीस", "पैंतालीस", "छियालीस", "सैंतालीस", "अड़तालीस", "उनचास", "पचास","इक्यावन", "बावन", "तिरेपन", "चौवन", "पचपन", "छप्पन", "सत्तावन", "अट्ठावन", "उनसठ", "साठ","इकसठ", "बासठ", "तिरेसठ", "चौंसठ", "पैंसठ", "छियासठ", "सड़सठ", "अड़सठ", "उनहत्तर", "सत्तर","इकहत्तर", "बहत्तर", "तिहत्तर", "चौहत्तर", "पचहत्तर", "छिहत्तर", "सतहत्तर", "अठहत्तर", "उनासी", "अस्सी","इक्यासी", "बयासी", "तिरासी", "चौरासी", "पचासी", "छियासी", "सत्तासी", "अट्ठासी", "नवासी", "नब्बे","इक्यानबे", "बानबे", "तिरानबे", "चौरानबे", "पंचानबे", "छियानबे", "सत्तानबे", "अट्ठानबे", "निन्यानबे"};
		return nepaliValues[a];
	}
	public static String findPlace(int a) {
		String [] place = {" "," "," सय "," हजार "," हजार "," लाख "," लाख "," करोड़ "," करोड़ "," अरब "," अरब "," खरब "," खरब "};
		return place[a];
	}
	public static int[] setNumber(int i,int count) {
		int x[]=new int[2];
		if(toString.charAt(i)!='0') {
			if(count==13||count==11||count==9||count==7||count==5||count==2) {
				String a=Character.toString(toString.charAt(i)).concat(Character.toString(toString.charAt(i+1)));
				outputValue=outputValue.concat(findNumber(Integer.parseInt(a))).concat(findPlace(count-1));
				count--;
				tester="";
				i++;
				x[0]=count;
				x[1]=i;
			}
			if(count==1||count==4||count==6||count==8||count==10||count==12) {
				if(tester=="") {
					tester="test";
				}
				else {
					outputValue=outputValue.concat(findNumber(Integer.parseInt(Character.toString(toString.charAt(i))))).concat(findPlace(count-1));
					x[0]=count;
					x[1]=i;
				}
			}
			if(count==3) {
				outputValue=outputValue.concat(findNumber(Integer.parseInt(Character.toString(toString.charAt(i))))).concat(findPlace(count-1));
				x[0]=count;
				x[1]=i;
			}
		}
		return x;
	}
}