package com.javaclub.team4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Task {

	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public abstract void runTask();
}
