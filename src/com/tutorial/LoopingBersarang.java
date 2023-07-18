package com.tutorial;

public class LoopingBersarang {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i==j) {
                    break;
                }
                if ((i + j)==8) {
                    break;
                }
            }
            System.out.print("\n");
        }

         System.out.println("lllll");
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("o ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

            System.out.println("");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("o ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
                if ((i + j) == 4) {
                    break;
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
                if (i == j) {
                    break;
                }
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
                if ((i + j) == 4) {
                    break;
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("   ");
                if ((i + j) == 4) {
                    break;
                }
            }
            for (int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                    if (i == j) {
                        break;
                    }
                }
                for (int j = 5; j > i; j--){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }

        System.out.println("");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("o ");
            }
            for (int k = 1; k < i; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("o ");
                if (i == j) {
                    break;
                }
            }
            for (int k = 4; k >= i; k--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}


