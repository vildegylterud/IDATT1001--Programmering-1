import java.util.Random;

    class Spiller {

        private Random random;
        private int poengsum;

        /**
         * Konstruktør
         */
        public Spiller() {
            this.poengsum = 0;
            this.random = new Random();
        }

        /**
         * @return poengsummen
         */
        public int getPoengsum() {
            return poengsum;
        }


        /**
         * Kaster terning til spilleren har oppnådd en sum lik akkurat 100.
         *
         * @return antall kast som førte til summen
         */
        public int kastTerningen() {
            int kast = random.nextInt(6) + 1; //et kast med terning er tallene fra 1-6 (derfor +1)
            if (kast == 1) {
                poengsum = 0;
            } else if (poengsum < 100) {
                poengsum += kast;
            } else if (poengsum > 100) {
                poengsum -= kast;
            }
            return kast; //poengsum==100
        }

        public boolean isFerdig() {
            if (poengsum == 100) {
                return true;
            } else {
                return false;
            }
        }
    }


