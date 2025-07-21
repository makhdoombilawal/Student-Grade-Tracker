import java.util.*;
class MarksheetinArray{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		
		String subjects[] = {"english", "math", "science", "urdu", "sindhi"};
		int marks[] = new int[subjects.length];
		int obtained=0;
		int total=500;
		
		for (int i=0; i<subjects.length; i++){
			System.out.print("Enter Marks "+subjects[i]+" :");
			marks[i] = input.nextInt();
			obtained+=marks[i];
		}

       boolean extra = false;
		for (int i = 0; i < subjects.length; i++) {
            if (marks[i] > 100) {
				extra=true;
                System.out.println("Invalid Marks Entered");                
            }
			break;
		}
		
		boolean fail = false;
		for(int i=0; i<subjects.length; i++){
			
            if (marks[i] < 40) {
				fail=true;
				System.out.println("\nFailed:");
                System.out.println(subjects[i].toUpperCase() + " = " + marks[i]);
            }
			
		
	}
		    if (!fail){
				fail=false;
				System.out.println("All Pass Subjects: ");
			}
		int pers = (obtained*100)/total;
		
		while(fail=true){
		System.out.println("\nObtained: "+ obtained);
		if(pers>=40 && pers<=50){
			System.out.println("Persentage: "+ pers+"%"+" \nPass");
		}else if(pers>50 && pers<=60){
			System.out.println("Persentage: "+ pers+"%"+" \nC Grade");
		}else if(pers>60 && pers<=70){
			System.out.println("Persentage: "+ pers+"%"+" \nB Grade");
		}else if(pers>70 && pers<=80){
			System.out.println("Persentage: "+ pers+"%"+" \nA Grade");
		}else if(pers>80 && pers<=100){
			System.out.println("Persentage: "+ pers+"%"+" \nA+ Grade");
		}
		
		System.out.println();
		for (int i=0; i<subjects.length; i++){
			System.out.println(subjects[i].toUpperCase()+" = "+marks[i]);
			
		}
		break;
		}
	
		
		}
		
		
}
