package facade.tobe;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DwarvenMineWorker {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	public void goToSleep() {
		LOGGER.log(Level.INFO, "{0} goes to sleep.", name());
	}

	public void wakeUp() {
		LOGGER.log(Level.INFO, "{0} wakes up.", name());
	}

	public void goHome() {
		LOGGER.log(Level.INFO, "{0} goes home.", name());
	}

	public void goToMine() {
		LOGGER.log(Level.INFO, "{0} goes to the mine.", name());
	}

	private void action(Action action) {
		switch (action) {
		case GO_TO_SLEEP:
			goToSleep();
			break;
		case WAKE_UP:
			wakeUp();
			break;
		case GO_HOME:
			goHome();
			break;
		case GO_TO_MINE:
			goToMine();
			break;
		case WORK:
			work();
			break;
		default:
			// LOGGER.info("Undefined action");
			break;
		}
	}

	public void action(Action... actions) {
		Arrays.stream(actions).forEach(this::action);
	}

	public abstract void work();

	public abstract String name();

	public enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
	}
}