
public class UKDataAdapter implements AdapterInterface{
	
	private UKData ukdata;
	
	@Override
	public double[] dataIn() {
		
		ukdata = UKData.getInstance();
		String newdata = ukdata.getData();
		
		String dataSplit = ",";
		
		String[] values = newdata.split(dataSplit);
		
		double[] newValues = new double[values.length];
		
		for(int i=0; i<newValues.length; i++){
			
			newValues[i] = Double.parseDouble(values[i]);
		}
		
		return newValues;
		
	}

}
