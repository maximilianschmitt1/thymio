package gerat;

import java.util.List;

import thymio.ThymioClient;

public class ThymioButtons {
	short centerButton;

	public ThymioButtons(ThymioClient client) {
		List<Short> rawCenterButton = client.getVariable("button.center");

		if (rawCenterButton == null || rawCenterButton.size() < 1) {
			return;
		}

		this.centerButton = rawCenterButton.get(0);
	}
	
	public boolean isCenterButtonPressed() {
		return centerButton == 1;
	}
}
