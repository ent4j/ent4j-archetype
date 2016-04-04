package ${package}.batch.batchlet;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

import lombok.extern.java.Log;

@Dependent
@Named
@Log
public class SimpleBatchlet implements Batchlet {

	@Override
	public String process() throws Exception {
		log.info("SimpleBatchlet started...");
		Thread.sleep(5000);
		log.info("SimpleBatchlet2 ended...");
		return "COMPLETED";
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub

	}

}
