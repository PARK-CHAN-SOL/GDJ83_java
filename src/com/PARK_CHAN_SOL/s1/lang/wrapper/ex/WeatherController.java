package com.PARK_CHAN_SOL.s1.lang.wrapper.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WeatherController {
	private WeatherDTO[] wDTOs;
	private WeatherService ws;
	private WeatherView wv;

	// wDTOs, ws의 초기화는 WeatherController의 생성자에서 하세요
	public WeatherController() {
		this.ws = new WeatherService();
		this.wDTOs = this.ws.init();
		this.wv = new WeatherView();
	}

	// start
	// 1. 날씨전체정보출력
	// 2. 날씨정보검색
	// 3. 종료
	public void start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = 0;
		while (num != 5) {
			bw.write("1. 날씨전체정보출력  2. 날씨정보검색  3. 날씨정보추가  4. 날씨정보삭제  5. 종료\n");
			bw.flush();

			while (true) {
				try {
					num = Integer.parseInt(br.readLine());
					if (num != 1 && num != 2 && num != 3 && num != 4 && num != 5) {
						throw new NumberFormatException();
					}
					break;
				} catch (NumberFormatException e) {
					bw.write("\n잘못 입력하셨습니다\n\n");
					bw.write("1. 날씨전체정보출력  2. 날씨정보검색  3. 날씨정보추가  4. 날씨정보삭제  5. 종료\n");
					bw.flush();
				}
			} // while try catch - num

			if (num == 1) {
				this.wv.view(this.wDTOs);
			} else if (num == 2) {
				bw.write("\n도시 명을 입력하세요\n");
				bw.flush();
				String cityName = br.readLine();
				this.wv.view(this.ws.findByCity(cityName, wDTOs));
			} else if (num == 3) {
				wDTOs = ws.addWeather(wDTOs);
			} else if (num == 4) {
				wDTOs = ws.removeWeather(wDTOs);
			} else {
				bw.write("\n종료\n");				
			}
		}
		br.close();
		bw.close();
	}
}
