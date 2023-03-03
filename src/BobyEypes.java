public enum BobyEypes {

        a("Седан"),
        b("Хэтчбек"),
        c("Купе"),
        d("Универсал"),
        e("Внедорожник"),
        f("Кроссовер"),
        g("Пикап"),
        h("Фургон"),
        i("Минивен");

        final String bobyName ;

        BobyEypes(String bobyName) {
                this.bobyName = bobyName;
        }

        public String toString() {
                return "Тип кузова - " + bobyName;


        }
}

