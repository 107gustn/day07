package day07;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		/*
		�÷��� ������ ��ũ
		�÷���
		- �ټ��� ������, ������ �׷�
		- ������ �������� ���� - �ڹ��� �ڷ� ����
		�����ӿ�ũ
		- �ϳ��� Ʋ
		- ǥ��ȭ�� ���α׷��� ���
		List, Set, Map
		List(�θ�)
		- ArrayList
		- LinkedList
		- Stack...
		
		ArrayList
		- ������ �����Ѵ�.
		- �������� �ߺ��� ����Ѵ�.
		*/
		ArrayList arr = new ArrayList(); //Ŭ�����ڷ��� ��ü //�迭�� ����� //ù��° ���ڰ� �빮���ΰ��� class �̴�. //Ŭ�����ڷ������� ������ ����� ����� ������ �ִ�.
		arr.add("123");//�迭ó�� ���� ����� ������ �ʿ䰡 ������ add�� ���� �߰��� �� �� �ִ�.
		arr.add("465");
		System.out.println(arr.get(0)); //0��° �ε��� ���
		System.out.println(arr.get(1)); //1��° �ε��� ���
		
		int s = arr.size(); //�ش� ArrayList�� ����Ǿ��ִ� ������ �����ش�.
		System.out.println( s ); //int ���·� ���� ������ش�.
		
		int[] a = new int[3];
		System.out.println(a.length);
		
		boolean bool = arr.contains("123"); //�ش��ϴ� ���� �ִ��� ������ Ȯ�����ش�.
		if(bool == true) { //boolean ���·� ���� �����ϱ� ������ ���Ҷ� true, false�� ���Ѵ�.
			System.out.println("123�� �����մϴ�.");
		}
 		
		System.out.println( bool ); //boolean Ÿ������ ���� ������ش�.
		System.out.println(arr.contains("13211")); //�ش� ���� ������ true / ������ false
		
		System.out.println( arr.remove("123") ); //�����ϴ� ���
		System.out.println( arr.get(0) ); //0���� �ִ� ���� ������ �Ǿ ���� ������ ��ġ�� ������
		System.out.println( arr.size() );
		
		arr.clear(); //�ش��ϴ� ���� ���δ� �����Ѵ�.
		System.out.println( arr.size() );
		
		arr.add("���"); arr.add("�ұ�");
		arr.add("����");//������� ������ ��
		String index = "�ұ�"; //�ش����� ������ -1��, �ش��ϴ� ���� ������ �ش� ��ġ ���� �������ش�.
		int i = arr.indexOf(index);//���� �̸��� ��ġ ��ȣ�� ������
		System.out.println(i + "��° ������");
		
		System.out.println("���� �� : " + arr.get(1));
		arr.set(i, "�ݱ�");//Ư�� ��ġ�� ���� ������
		System.out.println("���� �� : " + arr.get(1));
		
	}

}
