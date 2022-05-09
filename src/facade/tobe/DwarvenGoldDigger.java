package facade.tobe;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DwarvenGoldDigger extends DwarvenMineWorker {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void work() {
		LOGGER.log(Level.INFO, "{0} digs for gold.", name());
	}

	@Override
	public String name() {
		return "Dwarf gold digger";
	}
}
