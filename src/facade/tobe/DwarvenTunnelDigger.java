package facade.tobe;

import java.util.logging.Level;
import java.util.logging.Logger;

// 참고자료 : https://github.com/iluwatar/java-design-patterns/tree/master/facade
public class DwarvenTunnelDigger extends DwarvenMineWorker {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void work() {
		LOGGER.log(Level.INFO, "{0} creates another promising tunnel.", name());
	}

	@Override
	public String name() {
		return "Dwarven tunnel digger";
	}
}
