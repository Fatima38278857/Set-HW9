public enum NumberOfSeats {



    // Количество посадочных мест

        EspeciallySmall(0, 10),
        Small(10, 25),
        Average(25, 50),
        Large(60, 80),
        EspeciallyLarge(80, 120);

        final int from;
        final int to;

        NumberOfSeats(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {

            if (this.from == 0 && this.to == 0) {
                return "Вместимость автобуса не определена...";
            }
            if (this.from == 0 && this.to != 0) {
                return "Вместимость автобуса: <= 10 мест.";
            } else {
                return "Вместимость автобуса: от " + this.from + " до " + this.to + " мест.";
            }
        }
}
