package com.mingrisoft;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);   //����������ɨ����
    	System.out.println("������������֤��");         //��ʾ�û�����
    	String line = scanner.nextLine();           //��ȡ�û������һ���ı�
    	//��ӡ�������ı�������
    	System.out.println("ԭ��������֤����"+line.length()+"λ���ֵ�ѽ");
    }
}
