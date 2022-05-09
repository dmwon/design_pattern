import facade.tobe.main.DwarvenGoldmineFacade;

public class FacadeMain {

	public static void main(String[] args) {
		DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
		facade.startNewDay();
		facade.digOutGold();
		facade.endDay();
	}
	
}
