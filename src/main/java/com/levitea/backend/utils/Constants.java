package com.levitea.backend.utils;

public class Constants {
    public enum CustomerType {
        RETAIL,
        SHOP_OWNER,
        ADMIN,
    }

    public enum ProductSize {
        GM_250("250 Gms"),
        GM_500("500 Gms"),
        GM_1000("1 KG");

        public final String label;

        private ProductSize(String label) {
            this.label = label;
        }
    }

//
//    public static final String GM_250 = "250 GMS";
//    public static final String GM_500 = "500 GMS";
//    public static final String GM_1000 = "1000 GMS";
////    public static final String GM_250 = "250 GMS";
}
