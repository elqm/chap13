package com.greedy.section01.exception;

public class Application2 {

	public static void main(String[] args) {
		
		/* try-catch �̿��� ��� */
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.chechEnoughMoney(10000, 50000);
			et.chechEnoughMoney(50000, 10000);
			
			System.out.println("========== ��ǰ ���� ���� ===========");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("========= ��ǰ ���� �Ұ� ===========");
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
