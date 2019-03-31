package collectionFramewrokInJava;

public class Price {
	
	String items;
	int price;

	public  Price(String itm,int pri) {
		this.items=itm;
		this.price=pri;		
		
	}
	
	public int hashCode(){
        int hashcode = 0;
        hashcode = price*20;
        hashcode =hashcode+items.hashCode();
        return hashcode;
    }

    public boolean equals(Object obj){
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.items.equals(this.items) && pp.price == this.price);
        } else {
            return false;
        }
    }
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "item:"+items+"price:"+price;
	}

}
