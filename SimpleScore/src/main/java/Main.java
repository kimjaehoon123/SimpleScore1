import java.util.Scanner;

public class Main  {
   public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü
      ScoreManager sm = new ScoreManager(); // ���� ���� �Ŵ��� 

      System.out.println("���� ���� ���α׷�");
      while(true) { // �޴� �Է� 
         System.out.println("(1) ���� �߰�");
         System.out.println("(2) ���� ��������");
         System.out.println("(3) ����");
         System.out.print("�Է� >> ");
         int menu = sc.nextInt();
         
         if(menu == 3) { // ���� �޴�
            break;
         }
         
         switch(menu) {
         case 1: // ���� �߰� 
            System.out.print("�л� �й� �Է� >> ");
            int sid = sc.nextInt();
            System.out.print("�߰� ���� �Է� >> ");
            int m = sc.nextInt();
            System.out.print("�⸻ ���� �Է� >> ");
            int f = sc.nextInt();
            System.out.print("���� ���� �Է� >> ");
            int h = sc.nextInt();
            Score s = new Score(m,f,h);
            s.setGrade(sm.grader.computeGrade(s));
            sm.addScore(sid, s);
            System.out.println("���� �߰� �Ϸ�");
            break;
            
         case 2: // ���� ��������
            System.out.print("������ �л� �й� �Է� >> ");
            sid = sc.nextInt(); // ������ �й� �Է�
            Score temp = sm.getScore(sid);
            if(temp != null) {
               System.out.println("�߰� ���� : " + temp.getMidScore());
               System.out.println("�⸻ ���� : " + temp.getFinalScore());
               System.out.println("���� ���� : " + temp.getHWScore());
               System.out.println("���� : " + temp.getGrade());   
            }
            else {
               System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
            }
            break;
         }         
      }
      
      
   }
}