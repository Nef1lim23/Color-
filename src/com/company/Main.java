package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Color.RED.printColor();
        Color.GREEN.printColor();
        Color.BLUE.printColor();
        Color.YELLOW.printColor();
        Color.PURPLE.printColor();
        Color.CYAN.printColor();

        System.out.println(" - простой текст");
        System.out.println(" - " + Color.getRandomLetter());
    }

    enum Color
    {
        RED("Красный"), BLUE("Синий"), GREEN("Зелёный"), YELLOW("Желтый"), PURPLE("пурпурный"),CYAN("циан");

        private String color;
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        Color(String color)
        {
            this.color = color;
        }

        //random block
        private static final
        Color[] VALUES = values();

        private static final
        int SIZE = VALUES.length;

        private static final
        Random RANDOM = new Random();
        public static Color getRandomLetter() {
            return VALUES[RANDOM.nextInt(SIZE)]; }


        public void printColor()
        {
            switch (color) {
                case "Красный": {
                    System.out.println(ANSI_RED + color + ANSI_RESET);
                    break;
                }
                case "Синий": {
                    System.out.println(ANSI_BLUE + color + ANSI_RESET);
                    break;
                }
                case "Зелёный": {
                    System.out.println(ANSI_GREEN + color + ANSI_RESET);
                    break;
                }
                case "Желтый": {
                    System.out.println(ANSI_YELLOW + color + ANSI_RESET);
                    break;
                }
                case "циан":  {
                    System.out.println(ANSI_CYAN + color + ANSI_RESET);
                    break;
                }
                case "пурпурный": {
                    System.out.println(ANSI_PURPLE + color + ANSI_RESET);
                    break;
                }

                default:
                    System.out.println("error");
            }

        }

    }

}


