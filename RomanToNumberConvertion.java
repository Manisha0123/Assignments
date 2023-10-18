package practice;

public class RomanToNumberConvertion {

	public static void main(String[] args) {
		String s="IX";
		System.out.println(romanToNumber(s));
	}
	public static int romanValues(char ch) {
		switch(ch){
		 case 'I':{
			return 1;
		 }
		 case 'V':{
			return 5;
		 }
		 case 'X':{
			return 10;
		 }
		 case 'L':{
			return 50;
		 }
		 case 'C':{
			return 100;
		 }
		 case 'D':{
			return 500;
		 }
		 case 'M':{
			return 1000;
		 }
		}
		return ch;
	}
	public static int romanToNumber(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++){
			int i1=romanValues(s.charAt(i));
			if(i+1<s.length()){
				int i2=romanValues(s.charAt(i+1));
				if(i1<i2){
					sum=sum-i1;
				}
				else {
					sum=sum+i1;
				}
			}
			else {
				sum=sum+i1;
			}
		}
		return sum;
	}
}














