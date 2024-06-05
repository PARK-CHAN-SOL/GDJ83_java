package com.PARK_CHAN_SOL.s1.lang.wrapper.ex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WeatherView {
	// 날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO[] wDTOs) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("\n");
		for (int i = 0; i < wDTOs.length; i++) {
			bw.write(i + 1 + ". ");
			bw.write("지역: " + wDTOs[i].getCity() + "\t");
			bw.write("기온: " + wDTOs[i].getGion() + "\t");
			bw.write("날씨정보: " + wDTOs[i].getStatus() + "\t");
			bw.write("습도: " + wDTOs[i].getHumidity() + "\n");
		}
		bw.write("\n");
		bw.flush();
	}

	public void view(WeatherDTO wDTO) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if (wDTO != null) {
			bw.write("\n지역: " + wDTO.getCity() + "\t\t");
			bw.write("기온: " + wDTO.getGion() + "\t");
			bw.write("날씨정보: " + wDTO.getStatus() + "\t");
			bw.write("습도: " + wDTO.getHumidity() + "\n");
			bw.write("\n");
		} else {
			bw.write("\n찾으시는 도시의 정보가 존재하지 않습니다\n\n");
		}
		bw.flush();
	}
}
