package com.greedy.section01.exception;

public class ExceptionTest {
	
	public void chechEnoughMoney(int price, int money) throws Exception {
		
		System.out.println("������ ��� ���� " + money + "�� �̸�, ��ǰ ������ " + price + "�� �Դϴ�.");
		
		if(money >= price) {
			System.out.println("��ǰ�� �����ϱ� ���� �ݾ��� ����մϴ�.");
		} else {
			throw new Exception();
		}
		
		System.out.println("��ſ� ���� �ϼ���~");
	}
}
