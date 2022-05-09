package facade.tobe.main;

import java.util.Collection;
import java.util.List;

import facade.tobe.DwarvenCartOperator;
import facade.tobe.DwarvenGoldDigger;
import facade.tobe.DwarvenMineWorker;
import facade.tobe.DwarvenTunnelDigger;

public class DwarvenGoldmineFacade {
	
	private final List<DwarvenMineWorker> workers;
	
	public DwarvenGoldmineFacade() {
		workers = List.of(
				new DwarvenGoldDigger(),
				new DwarvenCartOperator(),
				new DwarvenTunnelDigger());
	}

	public void startNewDay() {
		makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
	}

	public void digOutGold() {
		makeActions(workers, DwarvenMineWorker.Action.WORK);
	}

	public void endDay() {
		makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
	}

	private static void makeActions(Collection<DwarvenMineWorker> workers,
			DwarvenMineWorker.Action... actions) {
		workers.forEach(worker -> worker.action(actions));
	}
	
}
