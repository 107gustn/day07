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
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연착처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>  ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				nArr = sc.next();
				System.out.print("전화번호를 입력하세요 : ");
				pArr = sc.next();
				cpBool = arr02.contains(pArr);
				if(cpBool == true) {
					System.out.println("동일한 전화번호가 존재합니다.\n");
				}else {
					arr01.add(nArr);
					arr02.add(pArr);
					System.out.println("저장되었습니다.\n");
				}
				break;
			case 2:
				System.out.print("전화번호를 입력하세요 : ");
				jiPhone = sc.next();
				jPhone = arr02.contains(jiPhone);
				if(jPhone == true) {
					int j = arr02.indexOf(jiPhone);
					System.out.println("동일한 전화번호가 존재합니다.");
					System.out.println("이름 : " + arr01.get(j) + "/ 전화번호 : " + arr02.get(j) + "\n");
				}else {
					System.out.println("등록되어 있지 않는 번호 입니다.\n");
				}
				break;
			case 3:
				System.out.print("삭제하실 전화번호를 입력하세요 : ");
				riPhone = sc.next();
				rPhone = arr02.contains(riPhone);
				if(rPhone == true) {
					int j = arr02.indexOf(riPhone);
					System.out.println("이름 : " + arr01.get(j) + "/ 전화번호 : " + arr02.get(j));
					arr01.remove(j); arr02.remove(j);
					System.out.println("삭제하였습니다.\n");
				}else {
					System.out.println("등록되어 있지 않는 번호 입니다.\n");
				}
				break;
			case 4:
//				System.out.println("이름 정보 : " + arr01);
//				System.out.println("연락처 정보 : " + arr02);
				if(arr01.size() > 0 ) {
					for(int a=0 ; a <arr01.size() ; a++) {
						System.out.println(a + "번째 이름 : " + arr01.get(a) + " / 전화번호 : " + arr02.get(a));
						System.out.println();
					}
				}else {
					System.out.println("등록된 연락처가 없습니다.\n");
				}
				break;
			case 5:
				System.out.println("종료합니다.\n");
				flag = false;
				break;
			default:
				System.out.println("다시 입력하세요.\n");	
			}
		}

	}

}
