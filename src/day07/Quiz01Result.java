package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01Result {

	public static void main(String[] args) {
		
		ArrayList nameArr = new ArrayList();
		ArrayList numArr = new ArrayList();
		int num, temp=0;
		String name=null, phNum=null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				while(true) {
					System.out.println("이름 입력");
					name = sc.next();
					if(nameArr.indexOf(name) == -1) {//해당값이 없다면 -1
						break;//반복문을 빠져나감
					}
					System.out.println("존재하는 이름. 다시."); //중복 이름 존제
				}
				System.out.println("전화번호 입력");
				phNum = sc.next();
				nameArr.add(name);
				numArr.add(phNum);
				System.out.println("저장 완료");
				break;
			case 2:
				System.out.println("이름 입력");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {//해당값이 없다면 -1 //해당하는 값이 있으면 해당 인덱스 번호를 가져옴
					System.out.println("존재하지 않는 정보 입니다.");
				}else {
					System.out.println("이름 : " + name);
					System.out.println("전화번호 : " + numArr.get(temp));
				}
				break;
			case 3:
				System.out.println("이름 입력");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {//해당값이 없다면 -1 //해당하는 값이 있으면 해당 인덱스 번호를 가져옴
					System.out.println("존재하지 않는 정보 입니다.");
				}else {
					//nameArr.remove(temp);
					nameArr.remove(name);
					//numArr.remove(temp);
					numArr.remove( numArr.get(temp));
					System.out.println("삭제 완료");
				}
				break;
			case 4:
				System.out.println("이름\t전화번호");
				System.out.println("================");
				for(int i=0; i<numArr.size(); i++) {
					System.out.print(nameArr.get(i)+"\t");
					System.out.println(numArr.get(i));
					System.out.println("----------------");
				}
				break;
			case 5:
				System.exit(1);//프로그램 강제 종료
				break;
			}
		}

	}

}
