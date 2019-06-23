package ua.kiev.prog;

import java.util.logging.Logger;

    public class Main {
        private static Logger logger = Logger.getLogger(Main.class.getName());

        public static void main(String[] args) {
           /* Rectangle r =new Rectangle ();

            r.setHeight(2);
            r.setWight(5);
            logger.info("Прямоугольник с высотой - " + r.getHeight() + " и с шириной " + r.getWight() + " имеет площадь " + r.sqr());*/

           Triangle triangle = new Triangle();

            triangle.setBese(15);
            triangle.setHeigth(6);
            logger.info("Триугольник с стороной - " + triangle.getBese() + " и с высотой " + triangle.getHeigth() + " имеет площадь " + triangle.getArea());

        }
    }

