
public class UKData {
	
	private String data;
	private static UKData instance;
	
	private UKData(){
		data = "";
	}
	
	public String getData(){
		
		return data;
	}
	
	public void dataIn(String s){
		
		data = s;
		
	}
	
	public static UKData getInstance(){
		if(instance ==null){
			instance = new UKData();
		}
		return instance;
	}

}
