package cn.com.taotao.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class DemoTest3 {
	
	@Test
	public void demo1() throws IOException{
		Map<String, Double> map = new HashMap<>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
		map.put("����", 2.0);
		map.put("�ƹ�", 2.5);
		map.put("������", 5.0);
		map.put("����", 3.0);
		map.put("����", 3.5);
		map.put("�ƹ�", (map.get("�ƹ�") + 1));
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���߲����֣�");
		String str = sc.nextLine();
		boolean flag = false; // ��Ǳ���
		for (String string : map.keySet()) {
			if (str.equals(string)) {
				System.out.println(map.get(string));
				flag = true;
			}

			double value = map.get(string);
			if (value > 3) {
				bw.write(String.valueOf(value));
				bw.newLine();
			}

		}
		bw.close();
		if (!flag) {
			System.out.println(!flag);
			System.out.println("���������ˣ��������������ɣ�");
		}

	}
	
}
































