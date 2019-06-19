package com.lambdas.consumers;

import com.lambdas.interfaces.GenericTwoInputWithOneOutput;
import com.lambdas.interfaces.IntInputStringOutput;
import com.lambdas.interfaces.RunCode;
import com.lambdas.interfaces.RunCodeWithOneParam;
import com.lambdas.interfaces.RunCodeWithTwoParamsOneOutput;

// This class will consume RunCode Interface with the help of lambda
public class ConsumeInterfaces {
	public ConsumeInterfaces(){
		
	}
	
	public void runLambdaCode (RunCode runObj) {
		runObj.run();
	}
	
	public void runParamCode(RunCodeWithOneParam oneParam, String stringToDisplay) {
		
		oneParam.run(stringToDisplay);
	}
	
	public Object runParamCodeWithResult(RunCodeWithTwoParamsOneOutput twoParams, Integer param1 , Integer param2) {
		return twoParams.result(param1, param2);
	}
	
	public Object process(IntInputStringOutput obj,int index) {
		
		
	return obj.process(index);	
	
	
	}
	

}
