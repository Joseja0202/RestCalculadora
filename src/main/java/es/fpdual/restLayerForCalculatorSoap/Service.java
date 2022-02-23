package es.fpdual.restLayerForCalculatorSoap;

import java.net.MalformedURLException;
import java.net.URL;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

@org.springframework.stereotype.Service
public class Service {

	private static final String SERVICE_URL_STRING = "http://www.dneonline.com/calculator.asmx?wsdl";

	private static CalculatorSoap client = null;

	public void init() {
		if (client == null) {
			try {
				URL serviceUrl = new URL(SERVICE_URL_STRING);

				Calculator service = new Calculator(serviceUrl);

				Service.client = service.getCalculatorSoap();

			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

	public CalculatorSoap getClient() {
		this.init();
		return client;
	}

}
