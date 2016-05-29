package charts;

public class Column {
	private String label;
	private String type;
	private String id, pattern, p;
	
	public Column(String type){
		this.type = type;
	}
	
	public Column(String type, String label, String id, String pattern, String p){
		this.type = type;
		this.label = label;
		this.id =id;
		this.pattern = pattern;
		this.p = p;
	}
	
	
	public String getP(){
		return this.p;
	}
	
	public String getPattern(){
		return this.pattern;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public String toJSON(){
		return "{\"id\":\""+this.id+"\",\"label:\""+this.label+"\",\"pattern\":\""+this.pattern+"\",\"p\":\""+this.p+"\"}"; 
	}
}
