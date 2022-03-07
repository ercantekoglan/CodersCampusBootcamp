package com.coderscampus.Week14.alphaAdvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSeries {
	@JsonProperty("2020-02-06 13:55:00")
	private StockData stockData1;
	@JsonProperty("2020-02-06 13:50:00")
	private StockData stockData2;
	@JsonProperty("2020-02-06 13:45:00")
	private StockData stockData3;
	@JsonProperty("2020-02-06 13:40:00")
	private StockData stockData4;
	@JsonProperty("2020-02-06 13:35:00")
	private StockData stockData5;
	@JsonProperty("2020-02-06 13:30:00")
	private StockData stockData6;

	public StockData getStockData1() {
		return stockData1;
	}

	public void setStockData1(StockData stockData1) {
		this.stockData1 = stockData1;
	}

	public StockData getStockData2() {
		return stockData2;
	}

	public void setStockData2(StockData stockData2) {
		this.stockData2 = stockData2;
	}

	public StockData getStockData3() {
		return stockData3;
	}

	public void setStockData3(StockData stockData3) {
		this.stockData3 = stockData3;
	}

	public StockData getStockData4() {
		return stockData4;
	}

	public void setStockData4(StockData stockData4) {
		this.stockData4 = stockData4;
	}

	public StockData getStockData5() {
		return stockData5;
	}

	public void setStockData5(StockData stockData5) {
		this.stockData5 = stockData5;
	}

	public StockData getStockData6() {
		return stockData6;
	}

	public void setStockData6(StockData stockData6) {
		this.stockData6 = stockData6;
	}

}