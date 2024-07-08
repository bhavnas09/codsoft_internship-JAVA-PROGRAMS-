
    import java.util.Scanner;
    public class stu_cal {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("******STUDENT GRADE CALCULATOR******");
            System.out.print("ENTER THE NUMBER OF SUBJECTS: ");
            int num_subjects ,marks[],total_marks=0;
            float percentage;
            num_subjects = s.nextInt();
            marks = new int[num_subjects];
            for(int i =0;i<num_subjects;i++)
            {
                System.out.print("ENTER THE MARKS(out of hundred) IN SUBJECT "+(i+1)+":" );
                marks[i] = s.nextInt();
            }
            for(int i=0;i<num_subjects;i++)
            {
                total_marks = total_marks+marks[i];
            }
            System.out.println("TOTAL MARKS IN "+num_subjects+" SUBJECTS: "+total_marks);

            percentage=(total_marks/num_subjects);
            System.out.println("PERCENTAGE: "+percentage);
            String grade;
            if (percentage >= 90) {
                grade = "A";}
            else if (percentage >= 80) {
                grade = "B";}
            else if ( percentage>= 70) {
                grade = "C";}
            else if (percentage >= 60) {
                grade = "D";}
            else {
                grade = "F";}

            System.out.println("GRADE: "+grade);
            System.out.println("******INFORMATION CALCULATED******");
            System.out.println("TOTAL MARKS IN "+num_subjects+"SUBJECTS: "+total_marks);
            System.out.println("PERCENTAGE: "+percentage+"%");
            System.out.println("GRADE: "+grade);
        }
    }


