package com.example.aris.spark_test;

import static spark.Spark.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get("/hello", (req, res) -> "Hello Fucker");
		System.out.println("hehehe");
	}

}
