package com.drawingapp.main;

import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;

public class GuiceDemo {
	private static final String SQUARE_REQ = "SQUARE";
	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);
	}
	private static void sendRequest(String squareReq) {
		if(squareReq.equals(SQUARE_REQ)){
			DrawShape d = new DrawSquare();
			SquareRequest request = new SquareRequest(d);
			request.makeRequest();
		}
		
	}

}
