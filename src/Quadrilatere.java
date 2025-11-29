public class Quadrilatere {
        private float cote1;
        private float cote2;
        private float cote3;
        private float cote4;

        public float getCote1 () {
            return cote1;
        }

        public void setCote1 () {
            this.cote1 = cote1;
        }

        public float getCote2 () {
            return cote2;
        }

        public void setCote2 () {
            this.cote2 = cote2;
        }

        public float getCote3 () {
            return cote3;
        }
        public void setCote3 () {
            this.cote3 = cote3;
        }

        public float getCote4 () {
            return cote4;
        }

        public void setCote4 () {
            this.cote4 = cote4;
        }
        public Quadrilatere() {
            this.cote1 = 4;
            this.cote2 = 4;
            this.cote3 = 4;
            this.cote4 = 4;
        }

        public Quadrilatere(float cote1, float cote2, float cote3, float cote4) {
            this.cote1 = cote1;
            this.cote2 = cote2;
            this.cote3 = cote3;
            this.cote4 = cote4;
        }

        public float getSurface (){
            return this.cote1 * this.cote2 * this.cote3 * this.cote4;
        }
        public float getPerimetre(){
            return this.cote1 + this.cote2 + this.cote3 + this.cote4;
        }
    }





