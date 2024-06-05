package com.PARK_CHAN_SOL.s1.lang.wrapper.ex;

import java.io.IOException;

public class WeatherMain {

	public static void main(String[] args) throws IOException{
		// DTO (Data Transfer Object)
		// DAO (Data Access Object)
		
//		WeatherDTO[] wDTOs = new WeatherService().init();
//		new WeatherView().view(wDTOs);
		WeatherController wc = new WeatherController();
		wc.start();
	}

}
