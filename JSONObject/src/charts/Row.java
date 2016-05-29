package charts;

public class Row {
	private String value, formatted, p;
	
	public Row(){
		
	}
	
	public Row(String v, String f, String p){
		this.value = v;
		this.formatted = f;
		this.p = p;
	}
	public String getV(){
		return this.value;
	}
	
	public String getF(){
		return this.formatted;
	}
	
	public String getP(){
		return this.p;
	}
	//TODO add the getters and setters 
	
	public String toJSON(){
		return "{\"c\":\"{\"v\":\""+this.value+"\", \"f\":\""+this.formatted+"\",\"p\":\""+this.p+"\"}";
	}
}
