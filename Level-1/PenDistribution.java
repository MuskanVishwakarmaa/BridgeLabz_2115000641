public class PenDistribution{
	public static void main(String args[]){
		int noOfPens = 14;
		int students = 3;
		int penPerStudent = noOfPens/students;
		int remainingPen = noOfPens%students;
		System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
	}
}

