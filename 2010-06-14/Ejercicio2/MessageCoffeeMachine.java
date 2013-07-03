/* INCOMPLETO
 * TERMINAR!
 */

public class MessageCoffeeMachine extends CoffeeMachine{
	private PrintStream stream;
	
	public MessageCoffeeMachine(int price, PrintStream stream){
		super(price);
		this.stream = stream;
		stream.println("CoffeeMachine Empty");
	}

	public void insertCoin(Coin coin){
		try{
			super.insertCoin(coin);
			if(getCurrentMoney() >= getPrice()){
				stream.println("Please, take your coffee.");
			}else{
				stream.println(getPrice() - getCurrentMoney()
						 + " cents left.");
			}
		}catch(NotEnoughCoffeeException e){
			stream.println("Sorry, but the CoffeeMachine is empty.");
		}
	}
	
	public void loadCoffee(int amount){
		super.loadCoffee(amount);
		standByMsg();
	}
	
	private void standByMsg(){
		stream.println("Insert coins...");
	}

	
