package task_2;

import java.util.Map;
import java.util.Set;

public class RemouteFile extends Json{
    private boolean isDirectory;
    private String name;
    private String filePath;
    private long size = -1;
    
    
	public RemouteFile(int result, String error, Map<String, Set<RemouteFile>> keywords, boolean isDirectory,
			String name, String filePath, long size) {
		super(result, error, keywords);
		this.isDirectory = isDirectory;
		this.name = name;
		this.filePath = filePath;
		this.size = size;
	}


	public boolean isDirectory() {
		return isDirectory;
	}


	public void setDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public long getSize() {
		return size;
	}


	public void setSize(long size) {
		this.size = size;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + (isDirectory ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (size ^ (size >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RemouteFile other = (RemouteFile) obj;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (isDirectory != other.isDirectory)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "RemouteFile [isDirectory=" + isDirectory + ", name=" + name + ", filePath=" + filePath + ", size="
				+ size + "]";
	}

    
    
    
}
