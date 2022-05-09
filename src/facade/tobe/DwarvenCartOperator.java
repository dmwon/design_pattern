package facade.tobe;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DwarvenCartOperator extends DwarvenMineWorker {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void work() {
		LOGGER.log(Level.INFO, "{0} moves gold chunks out of the mine.", name());
	}

	@Override
	public String name() {
		return "Dwarf cart operator";
	}
}
