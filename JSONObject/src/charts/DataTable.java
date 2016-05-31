package charts;
import javax.json.JsonObject;


public class DataTable {
	private JsonObject data;
	private JsonObject version;
	
	
	public DataTable(JsonObject data){
		this.data = data;
	}
	
	public DataTable(JsonObject data, JsonObject version){
		this.data = data;
		this.version = version;
	}
	
	public JsonObject getData(){
		return this.data;
	}
	
	public JsonObject getVersion(){
		return this.version; 
	}
	
	public String toString(){
		return this.data.toString();
	}
	
	
}
