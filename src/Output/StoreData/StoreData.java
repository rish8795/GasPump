package Output.StoreData;

import DataStore.Data;

// this is abstract class which groups all Store Data actions in a single place.
public abstract class StoreData {
	
	Data data;
	 public StoreData(Data data)
	 {
		 this.data = data;
	 }
	
	 
	 public abstract void storedata();

}
