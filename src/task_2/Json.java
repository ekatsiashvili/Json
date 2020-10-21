package task_2;

import java.util.Map;
import java.util.Set;

class Json {
	private int result;
	private String error;
	private Map<String, Set<RemouteFile>> keywords;
	
	
	Json(int result, String error, Map<String, Set<RemouteFile>> keywords) {
		super();
		this.result = result;
		this.error = error;
		this.keywords = keywords;
	}
	
	
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
	public Map<String, Set<RemouteFile>> getKeywords() {
		return keywords;
	}
	public void setKeywords(Map<String, Set<RemouteFile>> keywords) {
		this.keywords = keywords;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
		result = prime * result + this.result;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Json other = (Json) obj;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (keywords == null) {
			if (other.keywords != null)
				return false;
		} else if (!keywords.equals(other.keywords))
			return false;
		if (result != other.result)
			return false;
		return true;
	}


	@Override
	 public String toString() {
		return "Json [result=" + result + ", error=" + error + ", keywords=" + keywords + "]";
	}

public static void main(String[] args) {
		
	}
	
	
}


