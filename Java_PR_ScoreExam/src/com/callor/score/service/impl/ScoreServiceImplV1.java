package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.VaLine;

public class ScoreServiceImplV1 implements ScoreService {
	private String fileName;
	private List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		fileName = "src/com/callor/score/data/score.txt";
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// ScoreVO sVO;
		while (true) {
			ScoreVO sVO = new ScoreVO();
			System.out.print("학번 입력(종료 : QUIT) : ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				break;
			}

			int sum = 0;
			float avg = 0;
			try {
				int stNum = Integer.valueOf(strNum);
				System.out.print("국어점수 입력 : ");
				String strkor = scan.nextLine();
				int kor = Integer.valueOf(strkor);
				System.out.print("수학점수 입력 : ");
				String strEng = scan.nextLine();
				int eng = Integer.valueOf(strEng);
				System.out.print("영어점수 입력 : ");
				String strMath = scan.nextLine();
				int math = Integer.valueOf(strMath);
				System.out.print("음악점수 입력 : ");
				String strMusic = scan.nextLine();
				int music = Integer.valueOf(strMusic);
				System.out.println();

				sVO.setStnum(stNum);
				sVO.setKor(kor);
				sVO.setEng(eng);
				sVO.setMath(math);
				sVO.setMusic(music);
				sum += sVO.getKor();
				sum += sVO.getEng();
				sum += sVO.getMath();
				sum += sVO.getMusic();
				avg = (float) sum / 4;
				sVO.setSum(sum);
				sVO.setAvg(avg);
				scoreList.add(sVO);

			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}

		}

	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				printer.printf("%d\t%d\t%d\t%d\t%d\n",
						scoreList.get(i).getStnum(),
						scoreList.get(i).getKor(),
						scoreList.get(i).getEng(),
						scoreList.get(i).getMath(),
						scoreList.get(i).getMusic());
			}
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일 저장 완료!!");

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		System.out.println(VaLine.dLine(50));
		System.out.println("성적알림표");
		System.out.println(VaLine.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(VaLine.sLine(50));
		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%05d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					scoreList.get(i).getStnum(),
					scoreList.get(i).getKor(),
					scoreList.get(i).getEng(),
					scoreList.get(i).getMath(),
					scoreList.get(i).getMusic(),
					scoreList.get(i).getSum(),
					scoreList.get(i).getAvg());
		}

	}

}
