import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UKAdapterTest {
	
	UKData ukData;
	OurDataClient client;
	UKDataAdapter adapt;
	
	@Before
	public void setUp() throws Exception {
		
		ukData = UKData.getInstance();
		client = new OurDataClient();
		adapt = new UKDataAdapter();
		
		String ukinfo = "0.15, -0.45, 0.7, 0.9, -1.4";
		
		ukData.dataIn(ukinfo);
		
		client.setAdapter(adapt);
		client.dataIn();
	}

	@Test
	public void test() {
		
		String cvsSplit = ",";
		
		//Input
		String csv = ukData.getData();
		
		//Conversion
		String[] values = csv.split(cvsSplit);
		
		//Create Array of Doubles
		double[] vals = new double[values.length];
		
		int i = 0;
		for(String val:values){
			//convert each String to a double
			vals[i++] = Double.parseDouble(val);
		}
		
		double[] expectedvalues = client.getData();
		
		assertArrayEquals(vals, expectedvalues, 0.01);
	}

}
