package t;

import java.lang.reflect.Field; 

class Reflect {
	private int result;
	private String error;

	//public String toString() { 
        //return "result = " + result + ", " + error; 
                           
    //}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setData(final int result, String error) {
        this.result   = result;
        this.error = error;
	}
	
	@Override
	public String toString() {
		return "Class [result=" + result + ", error=" + error + "]";
	} 
	
	public static void main(String[] args) {
		
	}
	
	
	
} 
