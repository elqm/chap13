package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application2 {

	public static void main(String[] args) {
		
		/* �پ��� Ÿ���� ���ܸ� multi catch block�� �̿��ؼ� ó�� */
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(-20000, 30000);
			
		} catch (PriceNegativeException e) {
			System.out.println("PriceNegativeException �߻�!");
			System.out.println(e.getMessage());
		} catch (MoneyNegativeException e) {
			System.out.println("MoneyNegativeException �߻�!");
			System.out.println(e.getMessage());
		} catch (NotEnoughMoneyException e) {
			System.out.println("NotEnoughMoneyException �߻�!");
			System.out.println(e.getMessage());
		} catch (NegativeException e) {
			System.out.println("NegativeException �߻�!");
			System.out.println(e.getMessage());
		} finally {
			/* ���� �߻� ���ο� ��� ���� ������ ���� */
			System.out.println("finally �� ���� ������...");
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
