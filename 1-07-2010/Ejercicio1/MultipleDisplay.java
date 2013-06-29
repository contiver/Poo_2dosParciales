public class MultipleDisplay implements Display{
	private Set<Display> displays = new HashSet<Display>();
	
	public void addDisplay(Display display){
		displays.add(display);
	}
	
	public void showMessage(String message){
		for(Display d: displays){
			d.showMessage(message);
		}
	}	
}

/* Luego en la zona punteada del MessageCoffeeMachineTest se agrega:
	Display MultipleDisplay display = new MultipleDisplay();
	display.addDisplay(console);
	display.addDisplay(lcd);
	display.addDisplay(file);
*/
