package com.mleiman.pricescrapper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PriceScrapperMain {
	
	
	public static void main(String[] args) {
		String url = "";
		try {
			Document doc = Jsoup.connect(url).get();
			System.out.print(doc.getAllElements().toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
