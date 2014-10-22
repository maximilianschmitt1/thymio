package gerat;

import java.util.ArrayList;

import thymio.ThymioClient;

public class Gerat {
	ThymioClient client;
	ArrayList<Short> rawSpeed = new ArrayList<Short>();

	public Gerat(ThymioClient client) {
		this.client = client;
	}
	
	public void update() {
	}
	
	public ThymioEnvironmentModel getEnvironmentModel() {
		return new ThymioEnvironmentModel(client.getVariable("prox.horizontal"));
	}
	
	public ThymioButtons getButtons() {
		return new ThymioButtons(client);
	}
	
	public void setSpeed(int speed) {
		rawSpeed.clear();
		rawSpeed.add(new Short((short) speed));
		client.setVariable("motor.left.target", rawSpeed);
		client.setVariable("motor.right.target", rawSpeed);
	}
}
