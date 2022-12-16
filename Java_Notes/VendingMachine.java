public class VendingMachine {
    // <!-- indicating another dimension array after item call -->
	private Item[][] contents = new Item[4][3];
	private Double deposited = 0.0;
	
	public VendingMachine(){};
	public VendingMachine(Item[][] contents){
		this.countents = contents;
    }
    public Double despositMoney(Double amount){
		// <!-- increment deposited by amount if amount is greater than start point-->
		if (amount > 0.0){
			this.deposited += amount;
		}
		return deposited;
	}
	public Double refund(){
		Double amountRefunded = deposited;
		deposited = 0.0;
		return amountRefunded;
	}
	public Item buy(String selection){
		// <!-- customer makes selection: String"<letter>, <number>" -->
		// <!-- Below(in here): where to split and then how many items in the array -->
        // <!-- validate that String is in letter number format. Failed validation returns null -->
		String[] selectArr = selection.split(",",2);
		if(!selectArr[0].toLowerCase().equals( "a") && !selectArr[0].toLowerCase().equals("b") && !selectArr[0].toLowerCase().equals("c")){
			return null;
		}
		if(Integer.parseInt(selectArr[1])< 0|| Integer.parseInt(selectArr[1])>3){
			return null;
		}
        int letterIndex;
        // <!-- translate that String into y,x coordinates -->
        switch (selectArr[0].toLowerCase()){
            case "a":
                letterIndex = 0;
                break;
            case "b":
                letterIndex = 1;
                break;
            default:
                letterIndex = 2;
        }
        int[] itemSelected = {Integer.parseInt(selectArr[1]), letterIndex};
		// <!-- check deposited versus item.price. check item.quantityInStock > 0  -->
        Item item = contents[itemSelected[0]][Integer.parseInt(selectArr[1])] ;
		// <!-- if bopth are true - item.cost from deposited -->
        if (deposited >= item.getPrice() && item.getQuantityInStock >0){
            deposited-=item.getPrice();
            item.setQWuantityInStock(item.quantityInStock() -1);
            return item;
        }
        else{
            System.out.println("Try again");
            return null;
        }
		// <!-- decrement item.quantityInStock -1 -->
		// <!-- return item object: -->
		return Item;
	}
// <!-- generate getters and setters here -->
	public Item[][] getContents(){
		return contents;
	}
	public void setContents(Item[][] contents){
		this.contents = contents;
	}
	public Double getDesposited(){
		return deposited;
	}
}
}
