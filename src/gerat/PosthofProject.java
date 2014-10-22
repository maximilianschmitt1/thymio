package gerat;

import thymio.ThymioClient;

public class PosthofProject {
	Gerat gerat;
	ThymioClient client;

	public PosthofProject(Gerat gerat, ThymioClient client) {
		this.gerat = gerat;
		this.client = client;
	}

	public void start() throws InterruptedException {
		ThymioEnvironmentModel environmentModel = gerat.getEnvironmentModel();
		ThymioButtons buttons = gerat.getButtons();
		
		boolean running = true;
		gerat.setSpeed(200);

		while (running) {
			Thread.sleep(33);
			gerat.update();
			environmentModel = gerat.getEnvironmentModel();
			buttons = gerat.getButtons();

			if (environmentModel.isCenterBlocked()) {
				running = false;
			}
			
			if (buttons.isCenterButtonPressed()) {
				running = false;
			}
		}
		
		gerat.setSpeed(0);
	}
}
