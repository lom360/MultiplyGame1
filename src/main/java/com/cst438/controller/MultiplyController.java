package com.cst438.controller;
 
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cst438.dto.MultiplyProblem;
 
@RestController
public class MultiplyController {
	
	private final int LOWER = 11;  // lower and upper limits (inclusive) for factors.
	private final int UPPER = 99;
	
	private Random generator = new Random();
	
	@GetMapping("/multiplication/new")
	public MultiplyProblem getProblem() {
		MultiplyProblem mp = new MultiplyProblem();
		mp.factorA = getRandomFactor();
		mp.factorB = getRandomFactor();
		return mp;
	}
	
	/*
	 * generate a random integer >=LOWER and <=UPPER 
	 */
	private int getRandomFactor() {
		return generator.nextInt(UPPER-LOWER+1)+LOWER;
	}
 
}
