public enum LoadCapacity {

   // Грузоподъемность

        N1(0, 3.5f),
        N2(3.5f, 12f),
        N3(12f, 100f);

        final float from;
        final float to;


        LoadCapacity(float from, float to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {


            if (this.from == 0) {
                return "Грузопдъёмность: <= " + this.to + "т.";
            }
            if (this.to == 100) {
                return "Грузоподъёмность: > " + this.from + "т.";
            } else {
                return "Грузоподъёмность: 3.5 т < x <= 12 т";
            }
        }
}
