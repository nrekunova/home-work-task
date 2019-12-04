package com.hillel.lecture_11;

public enum Contact {


    ADMIN,
    VASYA {
        @Override
        public boolean isOffline() {
            return true;
        }
    },
    PETYA;

    public boolean isOffline() {
        return false;
    }
}
