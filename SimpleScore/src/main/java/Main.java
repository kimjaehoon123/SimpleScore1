import java.util.Scanner;

public class Main  {
   public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in); // 스캐너 객체
      ScoreManager sm = new ScoreManager(); // 성적 관리 매니저 

      System.out.println("성적 관리 프로그램");
      while(true) { // 메뉴 입력 
         System.out.println("(1) 성적 추가");
         System.out.println("(2) 성적 가져오기");
         System.out.println("(3) 종료");
         System.out.print("입력 >> ");
         int menu = sc.nextInt();
         
         if(menu == 3) { // 종료 메뉴
            break;
         }
         
         switch(menu) {
         case 1: // 성적 추가 
            System.out.print("학생 학번 입력 >> ");
            int sid = sc.nextInt();
            System.out.print("중간 점수 입력 >> ");
            int m = sc.nextInt();
            System.out.print("기말 점수 입력 >> ");
            int f = sc.nextInt();
            System.out.print("과제 점수 입력 >> ");
            int h = sc.nextInt();
            Score s = new Score(m,f,h);
            s.setGrade(sm.grader.computeGrade(s));
            sm.addScore(sid, s);
            System.out.println("점수 추가 완료");
            break;
            
         case 2: // 성적 가져오기
            System.out.print("가져올 학생 학번 입력 >> ");
            sid = sc.nextInt(); // 가져올 학번 입력
            Score temp = sm.getScore(sid);
            if(temp != null) {
               System.out.println("중간 점수 : " + temp.getMidScore());
               System.out.println("기말 점수 : " + temp.getFinalScore());
               System.out.println("과제 점수 : " + temp.getHWScore());
               System.out.println("성적 : " + temp.getGrade());   
            }
            else {
               System.out.println("해당 학번은 존재하지 않습니다.");
            }
            break;
         }         
      }
      
      
   }
}