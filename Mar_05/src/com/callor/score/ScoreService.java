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
	private String fileName;

	public ScoreService() {
		intList = new ArrayList<Integer>();
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void makeScore() {
		// TODO 점수 생성
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
		System.out.println("생성완료 !!");
	}

	@Override
	public void saveScoreToFile() {
		// TODO txt파일에 점수 100개 저장

		FileWriter fileWrite = null;
		PrintWriter printer = null;
		int nSize = intList.size();

		try {
			fileWrite = new FileWriter(fileName);
			printer = new PrintWriter(fileWrite);

			for (int i = 0; i < nSize; i++) {
				printer.print(intList.get(i) + ":");
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

		System.out.println("txt파일 생성 완료 !!");
	}

	@Override
	public void loadScoreFromFile() {
		// TODO txt 파일 불러와서 총점, 평균 계산 후 출력
		ScoreVO sVO = new ScoreVO();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strList = new ArrayList<String>();
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String str = buffer.readLine();
				if (str == null) {
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
		
		for (String str : strList) {
			String[] scores = str.split(":");
			sVO = new ScoreVO();
			sVO.setKor(Integer.valueOf(scores[0]));
			sVO.setEng(Integer.valueOf(scores[1]));
			sVO.setMath(Integer.valueOf(scores[2]));
			sVO.setMusic(Integer.valueOf(scores[3]));
			sVO.setHistory(Integer.valueOf(scores[4]));
			scoreList.add(sVO);
		}

		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		for (ScoreVO vo : scoreList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%3.1f\n",
					vo.getKor(),
					vo.getEng(),
					vo.getMath(),
					vo.getMusic(),
					vo.getHistory(),
					vo.getTotal(),
					vo.getAvg());
		}
		System.out.println(Values.dLine);
	}
}
