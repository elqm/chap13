package com.greedy.section01.exception;

public class Application1 {

	public static void main(String[] args) throws Exception {
		
		/* ����ó��
		 * 1. ����(Error)
		 * 2. ����(Exception)
		 * */
		
		/* ������ ���ܸ� �߻���Ű�� ���
		 * throw new ����Ŭ������();
		 * 
		 * ���� ó�� ���
		 * 1. throws�� ����
		 * 2. try-catch�� ó��
		 * */
		
		ExceptionTest et = new ExceptionTest();
		
		/* ��ǰ ������ 10000�� �̰�, ���� ���� 50000�� �� ��� */
//		et.chechEnoughMoney(10000, 50000);
		
		et.chechEnoughMoney(50000, 10000);
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
