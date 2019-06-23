package ua.kiev.prog;

public class Triangle {

        private int bese;
        private int heigth;

        public int getBese() {
            return bese;
        }


        public void setBese(int bese) {
            this.bese = bese;
        }


        public int getHeigth() {
            return heigth;
        }


        public void setHeigth(int heigth) {
            this.heigth = heigth;
        }


        public Integer getArea() {

            return bese*heigth/2;
        }


        public Triangle(int bese, int heigth) {
            this.bese = bese;
            this.heigth = heigth;
        }

        public Triangle() {

        }
    }

