
public class OurDataClient {
	
	private double[] data;
	private AdapterInterface interfac;
	
	public void dataIn(){
		
		data = interfac.dataIn();
		
	}
	
	public void setAdapter(AdapterInterface adapt){
		
		this.interfac = adapt;
	}
	
	public void setData(double[] dat){
		
		data = dat;
	}
	
	public double[] getData(){
		
		return data;
	}

}
