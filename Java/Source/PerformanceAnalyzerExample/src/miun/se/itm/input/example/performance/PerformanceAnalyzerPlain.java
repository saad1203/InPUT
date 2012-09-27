package miun.se.itm.input.example.performance;

import java.util.concurrent.ExecutionException;

import miun.se.itm.input.example.performance.model.SomeJob;
import se.miun.itm.input.model.InPUTException;

/**
 * An implementation not using any parameter import method.
 * @author Felix Dobslaw
 *
 */
public class PerformanceAnalyzerPlain extends PerformanceAnalyzer {

	public PerformanceAnalyzerPlain() throws InterruptedException,
			ExecutionException {

		amountTasks = 10;
		task = new SomeJob();
		executions = 3;
		int[] poolSize = {1,2,8,9,10};
		this.poolSize = poolSize;
	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException, InPUTException {
		new PerformanceAnalyzerPlain().analyze();
	}
}