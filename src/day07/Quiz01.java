package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true, cpBool, jPhone, rPhone;
		int sNum;
		String nArr, pArr, jiPhone, riPhone;
		ArrayList arr01 = new ArrayList();
		ArrayList arr02 = new ArrayList();
		
		while(flag) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>>  ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				System.out.print("�̸��� �Է��ϼ��� : ");
				nArr = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				pArr = sc.next();
				cpBool = arr02.contains(pArr);
				if(cpBool == true) {
					System.out.println("������ ��ȭ��ȣ�� �����մϴ�.\n");
				}else {
					arr01.add(nArr);
					arr02.add(pArr);
					System.out.println("����Ǿ����ϴ�.\n");
				}
				break;
			case 2:
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				jiPhone = sc.next();
				jPhone = arr02.contains(jiPhone);
				if(jPhone == true) {
					int j = arr02.indexOf(jiPhone);
					System.out.println("������ ��ȭ��ȣ�� �����մϴ�.");
					System.out.println("�̸� : " + arr01.get(j) + "/ ��ȭ��ȣ : " + arr02.get(j) + "\n");
				}else {
					System.out.println("��ϵǾ� ���� �ʴ� ��ȣ �Դϴ�.\n");
				}
				break;
			case 3:
				System.out.print("�����Ͻ� ��ȭ��ȣ�� �Է��ϼ��� : ");
				riPhone = sc.next();
				rPhone = arr02.contains(riPhone);
				if(rPhone == true) {
					int j = arr02.indexOf(riPhone);
					System.out.println("�̸� : " + arr01.get(j) + "/ ��ȭ��ȣ : " + arr02.get(j));
					arr01.remove(j); arr02.remove(j);
					System.out.println("�����Ͽ����ϴ�.\n");
				}else {
					System.out.println("��ϵǾ� ���� �ʴ� ��ȣ �Դϴ�.\n");
				}
				break;
			case 4:
//				System.out.println("�̸� ���� : " + arr01);
//				System.out.println("����ó ���� : " + arr02);
				if(arr01.size() > 0 ) {
					for(int a=0 ; a <arr01.size() ; a++) {
						System.out.println(a + "��° �̸� : " + arr01.get(a) + " / ��ȭ��ȣ : " + arr02.get(a));
						System.out.println();
					}
				}else {
					System.out.println("��ϵ� ����ó�� �����ϴ�.\n");
				}
				break;
			case 5:
				System.out.println("�����մϴ�.\n");
				flag = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.\n");	
			}
		}

	}

}
