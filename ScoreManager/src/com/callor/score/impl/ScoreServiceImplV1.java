package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.Valine;
import com.callor.score.service.ScoreService;
import com.callor.score.vo.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {
	private List<Integer> numList;
	private String fileName;
	private int[] rndNum;

	public ScoreServiceImplV1() {
		numList = new ArrayList<Integer>();
		rndNum = new int[100];
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(100) + 1;
			numList.add(rndNum[i]);
		}
		System.out.println("점수생성완료!!");
	}

	@Override
	public void saveScoreToFile() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			int nSize = numList.size();
			for (int i = 0; i < nSize; i++) {
				printer.print(rndNum[i] + ":");
				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일저장완료!!");
	}

	@Override
	public void loadScoreFromFile() {
		
		List<String> strList = new ArrayList<String>();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
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
		
		for(String str : strList) {
			ScoreVO vo = new ScoreVO();
			
			String[] strScore = str.split(":");
			vo.setKor(Integer.valueOf(strScore[0]));
			vo.setEng(Integer.valueOf(strScore[1]));
			vo.setMath(Integer.valueOf(strScore[2]));
			vo.setMusic(Integer.valueOf(strScore[3]));
			vo.setHistory(Integer.valueOf(strScore[4]));
			
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			
			vo.setSum(sum);
			vo.setAvg(avg);
			scoreList.add(vo);
		}
		System.out.println(Valine.dLine(50));
		System.out.println("순번\t\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Valine.sLine(50));
		int nSize = scoreList.size();
		int count = 0;
		for(int i = 0; i < nSize; i++) {
			++count;
			System.out.printf("%d\t\t%d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					count,
					scoreList.get(i).getKor(),
					scoreList.get(i).getEng(),
					scoreList.get(i).getMath(),
					scoreList.get(i).getMusic(),
					scoreList.get(i).getHistory(),
					scoreList.get(i).getSum(),
					scoreList.get(i).getAvg()
					);
		}
		System.out.println(Valine.dLine(50));
	}
	}
	
