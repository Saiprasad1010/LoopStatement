package WhileAndDo;

public class LoopStatementType {
//	static void loopstatement1() {
//		int a=0;
//		while (a<=10) {
//			System.out.println(a);
//			a++;
//		}
//		}
//	static void loopstatement2() {
//		int a=10;
//		while (a>=0) {
//		System.out.println(a);
//		a--;
//	}
//	}
//	static void loopstatement3() {
//		int a=0;
//		do {
//			System.out.println(a);
//			a++;
//		} while (a<=10);
//	}
//	static void loopstatement4() {
//		int a=0;
//		do {
//			System.out.println(a);
//			a++;
//			if (a==5) {a++;
//				continue;
//			}
//		} while(a<=12);
//	}
	static void loopstatement5() {
		int a=0;
		while (a<10) {
			if (a==5) {
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}
	}
	static void loopstatement6() {
		for (int i=10; i>=0;i--) {
			if (i==5) {
				continue;	
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		loopstatement1();
//		loopstatement2();
//		loopstatement3();
//		loopstatement4();
		loopstatement5();
		loopstatement6();
		
	}
}
