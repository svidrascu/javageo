package org.javatraining.shapes;


import org.apache.commons.lang3.StringUtils;
import org.javatraining.ICongruentClub;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */
public class Hexagon extends AbstractPolygon implements ICongruentClub {

    private double side1;

    public Hexagon(double side1, double side2, double side3, double side4, double side5, double side6) throws CannotFormShape {
        super(side1, side2, side3, side4, side5, side6);
        if (side1 != side2 || side2 != side3 || side3 != side4 || side4 != side5 || side5 != side6) {
            throw new CannotFormShape("This cannot be a hexagon, it doesnt have 6 equal sides");
        }
        this.side1 = side1;
    }

    public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));
        return 666;
    }

    public String dance() {
        return "Bamboleooooooo bamboleaaaa<br>";
    }

    public String explode() {
        return "BOOOOOOM !!!<br>";
    }

    public String rotate() {
        return "shuuuuup !!!<br>";
    }

}
