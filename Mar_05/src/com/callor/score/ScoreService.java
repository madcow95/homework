package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScoreService implements CartService {

	private List<Integer> intList;
	private List<String> strList;
	private List<ScoreVO> scoreVO;
	private String fileName;
	private ScoreVO sVO;

	public ScoreService() {
		scoreVO = new ArrayList<ScoreVO>();
		strList = new ArrayList<String>();
		intList = new ArrayList<Integer>();
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void makeScore() {
		// TODO ���� ����
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
		System.out.println("�����Ϸ� !!");
	}

	@Override
	public void saveScoreToFile() {
		// TODO txt���Ͽ� ���� 100�� ����

		FileWriter fileWrite = null;
		PrintWriter printer = null;
		int nSize = intList.size();

		try {
			fileWrite = new FileWriter(fileName);
			printer = new PrintWriter(fileWrite);

			for (int i = 0; i < nSize; i++) {
				printer.print(intList.get(i) + ":" + "\t");
				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}

			printer.close();
			fileWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("txt���� ���� �Ϸ� !!");
	}

	@Override
	public void loadScoreFromFile() {
		// TODO txt ���� �ҷ��ͼ� ����, ��� ��� �� ���
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				strList.add(str);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int nSize = strList.size();
		for(String str : strList) {
			String[] scores = str.split(":");
			
		}
		
		

	}
}
