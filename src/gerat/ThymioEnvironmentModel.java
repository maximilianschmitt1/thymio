package gerat;

import java.util.List;

public class ThymioEnvironmentModel {
	short left, topLeft, center, topRight, right;

	public ThymioEnvironmentModel(List<Short> proxHorizontal) {
		if (proxHorizontal == null || proxHorizontal.size() < 1) {
			return;
		}

		left = proxHorizontal.get(0);
		topLeft = proxHorizontal.get(1);
		center = proxHorizontal.get(2);
		topRight = proxHorizontal.get(3);
		right = proxHorizontal.get(4);
	}

	public boolean isLeftBlocked() {
		return left > 0;
	}
	
	public boolean isRightBlocked() {
		return right > 0;
	}
	
	public boolean isTopLeftBlocked() {
		return topLeft > 0;
	}
	
	public boolean isTopRightBlocked() {
		return topRight > 0;
	}
	
	public boolean isCenterBlocked() {
		return center > 0;
	}
	
	public short getLeft() {
		return left;
	}

	public short getTopLeft() {
		return topLeft;
	}

	public short getCenter() {
		return center;
	}

	public short getTopRight() {
		return topRight;
	}

	public short getRight() {
		return right;
	}
	
	public void log() {
		System.out.println("LEFT: " + isLeftBlocked());
		System.out.println("TOP_LEFT: " + isTopLeftBlocked());
		System.out.println("CENTER: " + isCenterBlocked());
		System.out.println("TOP_RIGHT: " + isTopRightBlocked());
		System.out.println("RIGHT: " + isRightBlocked());
	}
}
