package com.PARK_CHAN_SOL.s1.lang.wrapper.ex;

public class WeatherService {

	// Controller Layer
	// Business Layer (데이터 전처리 후처리)
	// DAO Layer
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 맑음 - 90");
		this.sb.append("-제주 , 26.3 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public void init() {
		String info = sb.toString();
		info = info.replace(',', '-');

		String[] infoArr = info.split("-");

		for (int i = 0; i < infoArr.length; i++) {
			infoArr[i] = infoArr[i].trim();
//			System.out.println(infoArr[i]);
		}
		
		int idx = infoArr.length / 4;
		WeatherDTO[] wDTOs = new WeatherDTO[idx];
		
		for (int i = 0; i < wDTOs.length; i++) {
				wDTOs[i] = new WeatherDTO();
				wDTOs[i].setCity(infoArr[i*4]);
				wDTOs[i].setGion(Double.parseDouble(infoArr[i*4+1]));
				wDTOs[i].setStatus(infoArr[i*4+2]);
				wDTOs[i].setHumidity(Integer.parseInt(infoArr[i*4+3]));
		}
	}

}
