package turtle.util;

public enum Direction {

    N(0),
    NE(45),
    E(90),
    SE(135),
    S(180),
    SW(225),
    W(270),
    NW(315);

    private int angle;

    private Direction(int angle) {
	this.angle = angle;
    }

    public int getAngle() {
	return angle;
    }

    public Position move(Position pos) {
	int x = pos.getX(), y = pos.getY();
	double degToRad = angle * Math.PI / 180;
	double dx = Math.sin(degToRad);
	double dy = Math.cos(degToRad);
	x += Math.round(dx);
	y += Math.round(dy);
	return new Position(x, y);
    }

    public Direction rotate(int degrees) {
	int newAngle = (angle + degrees) % 360;
	if (newAngle < 0) {
	    newAngle = 360 + newAngle;
	}
	return Direction.values()[(newAngle / 45)];
    }

}