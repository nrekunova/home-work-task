package com.hillel.lecture_11;

public enum Smile {
    HAPPY {
        @Override
        public String toString() {
            return ":)";
        }
    },
    SAD {
        @Override
        public String toString() {
            return ":(";
        }
    },
    FACE_PALM {
        @Override
        public String toString() {
            return "8<";
        }
    }

}
