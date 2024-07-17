import java.util.Scanner;
public class GpaCalculator{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of semester finished:");
        byte n=sc.nextByte();
           System.out.println("Enter the value of semester credits:");
            float []sem_credits=new float[n];
            for(int i =0;i<n;i++){
                sem_credits[i]=sc.nextFloat();
            }
            System.out.println("Enter the semester GPA :");
            float []sem_gpa=new float[n] ;
            for(int i =0;i<n;i++){
                sem_gpa[i]=sc.nextFloat();
            }
            
            float cgpa ;
            float gpa_avg=0;
            float t_credit=0;
            for(int i=0;i<n;i++){
                
                gpa_avg += sem_gpa[i]*sem_credits[i];
                t_credit += sem_credits[i];
            }
            cgpa = gpa_avg/t_credit;
            System.out.println("\"CGPA\"="+cgpa);

        sc.close();
    }
}