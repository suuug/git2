import java.util.*;

class Hello {
 
    public static void main(String[] args) {
    	int input;
    	 
    	System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
    	
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        
            if(input==0) {
                System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
            }
            
            if(input!=0) 
                System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
                System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
             
    }
}
 
