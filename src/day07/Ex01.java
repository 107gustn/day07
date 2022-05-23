package day07;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		/*
		컬렉션 프레임 워크
		컬렉션
		- 다수의 데이터, 데이터 그룹
		- 무한한 데이터의 집합 - 자바의 자료 구조
		프레임워크
		- 하나의 틀
		- 표준화된 프로그래밍 방식
		List, Set, Map
		List(부모)
		- ArrayList
		- LinkedList
		- Stack...
		
		ArrayList
		- 순서를 유지한다.
		- 데이터의 중복을 허용한다.
		*/
		ArrayList arr = new ArrayList(); //클래스자료형 객체 //배열과 비슷함 //첫번째 문자가 대문자인것은 class 이다. //클래스자료형으로 변수를 만들면 기능을 가지고 있다.
		arr.add("123");//배열처럼 따로 사이즈를 지정할 필요가 없으며 add를 통해 추가해 줄 수 있다.
		arr.add("465");
		System.out.println(arr.get(0)); //0번째 인덱스 출력
		System.out.println(arr.get(1)); //1번째 인덱스 출력
		
		int s = arr.size(); //해당 ArrayList에 저장되어있는 갯수를 얻어와준다.
		System.out.println( s ); //int 형태로 값을 출력해준다.
		
		int[] a = new int[3];
		System.out.println(a.length);
		
		boolean bool = arr.contains("123"); //해당하는 값이 있는지 없는지 확인해준다.
		if(bool == true) { //boolean 형태로 값을 저장하기 때문에 비교할때 true, false로 비교한다.
			System.out.println("123은 존재합니다.");
		}
 		
		System.out.println( bool ); //boolean 타입으로 값을 출력해준다.
		System.out.println(arr.contains("13211")); //해당 값이 이으면 true / 없으면 false
		
		System.out.println( arr.remove("123") ); //삭제하는 기능
		System.out.println( arr.get(0) ); //0번쨰 있던 값이 삭제가 되어서 값이 앞으로 위치가 떙겨짐
		System.out.println( arr.size() );
		
		arr.clear(); //해당하는 값을 전부다 삭제한다.
		System.out.println( arr.size() );
		
		arr.add("라면"); arr.add("소금");
		arr.add("순대");//순서대로 저장이 됨
		String index = "소금"; //해당하지 않으면 -1값, 해당하는 값이 있으면 해당 위치 값을 저장해준다.
		int i = arr.indexOf(index);//같은 이름의 위치 번호를 저장함
		System.out.println(i + "번째 존재함");
		
		System.out.println("변경 전 : " + arr.get(1));
		arr.set(i, "금금");//특정 위치의 값을 변경함
		System.out.println("변경 후 : " + arr.get(1));
		
	}

}
