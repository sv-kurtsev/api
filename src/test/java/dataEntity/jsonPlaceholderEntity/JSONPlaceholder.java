package dataEntity.jsonPlaceholderEntity;

import java.util.List;

public class JSONPlaceholder{
	private List<JSONPlaceholderItem> jSONPlaceholder;

	public void setJSONPlaceholder(List<JSONPlaceholderItem> jSONPlaceholder){
		this.jSONPlaceholder = jSONPlaceholder;
	}

	public List<JSONPlaceholderItem> getJSONPlaceholder(){
		return jSONPlaceholder;
	}

	@Override
 	public String toString(){
		return 
			"JSONPlaceholder{" + 
			"jSONPlaceholder = '" + jSONPlaceholder + '\'' + 
			"}";
		}
}