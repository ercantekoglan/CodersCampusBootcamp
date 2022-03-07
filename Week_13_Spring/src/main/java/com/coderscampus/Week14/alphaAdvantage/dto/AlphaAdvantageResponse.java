package com.coderscampus.Week14.alphaAdvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaAdvantageResponse {
	
	//json dan gelen respons u javay donustur. obejct icin de object kuraca burada.
	

		//@JsonProperty => belirtilen baslik-deger eslemesini yapmaya yarar
		@JsonProperty("Meta Data")
		private MetaData metaData;

		@JsonProperty("Time Series (5min)")
		private TimeSeries timeSeries;

		public MetaData getMetaData() {
			return metaData;
		}
		public void setMetaData(MetaData metaData) {
			this.metaData = metaData;
		}
		public TimeSeries getTimeSeries() {
			return timeSeries;
		}
		public void setTimeSeries(TimeSeries timeSeries) {
			this.timeSeries = timeSeries;
		}
	}