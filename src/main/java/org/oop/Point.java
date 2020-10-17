package org.oop;

class Point {
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double distance(Point P)
    {
        double xDistance = this.x - P.x;
        double yDistance = this.y - P.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point P) {
        double xDistance = this.x - P.x;
        double yDistance = this.y - P.y;
        return Math.atan2(yDistance, xDistance);
    }

}
