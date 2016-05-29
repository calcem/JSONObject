package charts;

import java.util.ArrayList;
import java.util.List;

public class WordTreeJSON {
	//private String 
	private Column col;
	private List<Row> rows = new ArrayList<Row>();
	
	public WordTreeJSON(){
		
	}
	
	public void addColumn(String type, String label, String id, String pattern, String p){
		col = new Column(type,label,id,pattern,p);
	}
	
	public void addRow(String v, String f, String p){
		rows.add(new Row(v,f,p));
	}
	
	public String json(){
		String json = "{\"n\"cols\":["+col.toJSON()+"],\"rows\":[";
		for(int i = 0; i<rows.size();i++) {
			if(i==rows.size()-1)
				json += rows.get(i).toJSON()+"\n";
			else 
				json += rows.get(i).toJSON()+",\n";
		}
		json+="]\n}";
		return json;
		
	}
	
}
