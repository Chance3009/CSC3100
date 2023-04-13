public class Topic8 {
	public static void main(String[] args) {
		char[] keyArr = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
	
		char[][] ansArr = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
						   {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
						   {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
						   {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
						   {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
						   {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
						   {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
						   {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		for (int i=0; i<8; i++) {
			int correct = 0;
			int wrong = 0;
			
			for(int j=0; j<10; j++) {
				if (ansArr[i][j] == keyArr[j]) {
					correct ++;
				} else {
					wrong ++;
				};
			}
			
			System.out.printf("Student %d answered %d question(s) correctly and %d question(s) wrongly.\n\n", i, correct, wrong);
		}
	}
}
