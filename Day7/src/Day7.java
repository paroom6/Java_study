
public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		score = (int)(Math.random()*100) +1;
		switch(score/10) {
		case 9 :
			System.out.println("점수 :"+ score + ", 학점 : A 학점");		
			break;
		case 8 :
			System.out.println("점수 :"+ score + ", 학점 : B 학점");
			break;
		case 7 :
			System.out.println("점수 :"+ score +", 학점 : C 학점");
			break;
		default :
			System.out.println("점수 :"+ score +", 학점 : F 학점");
				
		}

	}

}
class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		score = (int)(Math.random()*100) +1;
		switch(score/10) {
		case 10 :
		case 9 :
			System.out.println("점수 :"+ score + ", 학점 : A 학점");		
			break;
		case 8 :
			System.out.println("점수 :"+ score + ", 학점 : B 학점");
			break;
		case 7 :
			System.out.println("점수 :"+ score +", 학점 : C 학점");
			break;
		default :
			System.out.println("점수 :"+ score +", 학점 : F 학점");
				
		}

	}

}