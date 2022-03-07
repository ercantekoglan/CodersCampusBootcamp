package com.coderscampus.Week14.alphaAdvantage;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Week14.alphaAdvantage.dto.AlphaAdvantageResponse;

public class AlphaAdvantageIntegration {

	@Test
	public void callApiExample() {
		
		//RestTemplae allows us to make restful calls send data or fetch data etc...
		RestTemplate rt = new RestTemplate();
		//getForEntitiy - postForEntity (more specific)  - convinience methods.
		//for exchange icin parametlereden birini doldurur. exchancge de sana hangi islemi yaoacagini sorar (get-post-pu vs)
		
		//rt.getForEntity(null, String.class) ikinci parametre de response type en kolay yolu String.class yap
		//ne gelirse gelsin string olarak cevirir sana
		
		
		//url cekiyoruz
		URI url = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.com/query")
													   .queryParam("function", "TIME_SERIES_INTRADAY")
													   .queryParam("symbol", "TSLA")
													   .queryParam("interval", "5min")
													   .queryParam("apikey", "D34PEUKAWZFSBQFA")
													   .build()
													   .toUri();
		
		//belirtilen url i buidl yapip get ile datayi fetch yapiyo ve string donduruyo
		//burda donen deger tam olarak string olmuyo
		//ResponseEntity<String> response = rt.getForEntity(url, String.class);
		//response olarak more information verir.
		
		//response string olarak donuyo
		//String response = rt.getForObject(url, String.class);
		
		
		//ResponseEntity<String> response = rt.getForEntity(url, String.class);
		//ResponseEntity<String> response = rt.getForEntity(url, String.class);
		//System.out.println(response);
		//System.out.println(response.getBody());
		
		//gelen json response u nu json parser ile cavirebilirsin.
		//json.parser.online.fr
		
		ResponseEntity<AlphaAdvantageResponse> response = rt.getForEntity(url, AlphaAdvantageResponse.class);
		System.out.println(response.getBody());
	}
	
}
