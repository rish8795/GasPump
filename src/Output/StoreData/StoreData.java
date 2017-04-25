package Output.StoreData;

import DataStore.Data;

public abstract class StoreData {
	
	Data data;
	 public StoreData(Data data)
	 {
		 this.data = data;
	 }
	
	 
	 public abstract void storedata();

}
