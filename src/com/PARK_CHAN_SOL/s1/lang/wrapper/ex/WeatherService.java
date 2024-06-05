package com.PARK_CHAN_SOL.s1.lang.wrapper.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

	public WeatherDTO[] init() {
		String info = this.sb.toString();
		info = info.replace(',', '-');

		WeatherDTO[] wDTOs = this.getWeatherDTOs(info);
		return wDTOs;
	}

	private WeatherDTO[] getWeatherDTOs(String info) {
		String[] infoArr = info.split("-");
		for (int i = 0; i < infoArr.length; i++) {
			infoArr[i] = infoArr[i].trim();
//			System.out.println(infoArr[i]);
		}

		int idx = infoArr.length / 4;
		WeatherDTO[] wDTOs = new WeatherDTO[idx];

		for (int i = 0; i < wDTOs.length; i++) {
			wDTOs[i] = new WeatherDTO();
			wDTOs[i].setCity(infoArr[i * 4]);
			wDTOs[i].setGion(Double.parseDouble(infoArr[i * 4 + 1]));
			wDTOs[i].setStatus(infoArr[i * 4 + 2]);
			wDTOs[i].setHumidity(Integer.parseInt(infoArr[i * 4 + 3]));
		}
		return wDTOs;
	}

	// 날씨정보를 도시명으로 검색, 해당 날씨정보를 리턴
	// findByCity
	public WeatherDTO findByCity(String cityName, WeatherDTO[] wDTOs) {
		for (int i = 0; i < wDTOs.length; i++) {
			if (cityName.equals(wDTOs[i].getCity()))
				return wDTOs[i];
		}
		WeatherDTO wDTO = null;
		return wDTO;
	}

	// 날씨정보 추가
	// addWeather
	// 도시명, 기온, 날씨정보, 습도를 입력 받아서 기존의 날씨정보들에 추가
	public WeatherDTO[] addWeather(WeatherDTO[] wDTOs) throws IOException {
		int wDTOsLen = wDTOs.length;
		WeatherDTO[] wDTOsTmp = new WeatherDTO[wDTOsLen + 1];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < wDTOs.length; i++) {
			wDTOsTmp[i] = wDTOs[i];
		}
		wDTOsTmp[wDTOsLen] = new WeatherDTO();

		bw.write("\n도시명을 입력하세요\n");
		bw.flush();
		wDTOsTmp[wDTOsLen].setCity(br.readLine());

		while (true) {
			try {
				bw.write("\n기온을 입력하세요\n");
				bw.flush();
				wDTOsTmp[wDTOsLen].setGion(Double.parseDouble(br.readLine()));
				if (wDTOsTmp[wDTOsLen].getGion() < 0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				bw.write("\n잘못 입력하셨습니다\n\n");
				bw.flush();
			}
		} // while try catch - setGion()

		bw.write("\n현재상태를 입력하세요\n");
		bw.flush();
		wDTOsTmp[wDTOsLen].setStatus(br.readLine());

		while (true) {
			try {
				bw.write("\n습도를 입력하세요\n");
				bw.flush();
				wDTOsTmp[wDTOsLen].setHumidity(Integer.parseInt(br.readLine()));
				if (wDTOsTmp[wDTOsLen].getHumidity() < 0 || wDTOsTmp[wDTOsLen].getHumidity() > 100) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				bw.write("\n잘못 입력하셨습니다\n\n");
				bw.flush();
			}
		} // while try catch - setHumidity

		wDTOs = wDTOsTmp;
		return wDTOs;
	}

	// removeWeather
	// 기존 배열에서 하나를 삭제
	// 도시명을 입력 받아서 일치하는 날씨정보 삭제
	public WeatherDTO[] removeWeather(WeatherDTO[] wDTOs) throws IOException {
		int wDTOsLen = wDTOs.length;
		WeatherDTO[] wDTOsTmp = new WeatherDTO[wDTOsLen - 1];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("\n도시 명을 입력하세요\n");
		bw.flush();
		String cityName = br.readLine();
		WeatherDTO wDTO = findByCity(cityName, wDTOs);
		if (wDTO != null) {
			int j = 0;
			for (int i = 0; i < wDTOsLen; i++) {
				if (wDTO != wDTOs[i]) {
					wDTOsTmp[j++] = wDTOs[i];
				}
			}
			bw.write("\n해당 도시가 삭제되었습니다\n\n");
			bw.flush();
			wDTOs = wDTOsTmp;
		} else {
			bw.write("\n해당 도시의 정보가 존재하지 않습니다\n\n");
			bw.flush();
		}
		return wDTOs;
	}

}
