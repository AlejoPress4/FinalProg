package Helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {
    public static Scanner sc = new Scanner(System.in).useDelimiter("[\n]+|[\r\n]+");

    public static String readString(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        System.out.print(message);
        return sc.nextLine();
    }


    public static int readInt(String message) {

        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        int value = Integer.MIN_VALUE;
        System.out.print(message);

        do {

            try {

                ok = true;
                value = sc.nextInt();

            } catch (InputMismatchException e) {

                ok = false;
                System.out.print(">> Valor erróneo. " + message);
            } finally {

                sc.nextLine();
            }
        } while (ok == false);

        return value;
    }

    public static int readInt(int from, int to, String mensaje) {
        int value;
        int tmp = Math.min(from, to);
        if (tmp == to) {
            to = from;
            from = tmp;
        }

        do {
            value = readInt(mensaje);
            if (value != 0 && (value < from || value > to)) {
                System.out.printf("%sRango inválido. %s", Utils.RED, Utils.RESET);
            }
        } while (value != 0 && (value < from || value > to));
        return value;
    }

    public static String readString(int from, int to, String message) {
        String value;
        if (from > to) {
            int tmp = from;
            from = to;
            to = tmp;
        }
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        System.out.print(message);

        do {
            value = sc.nextLine();
            if (value.length() < from || value.length() > to) {
                System.out.printf("%sRango inválido (la cadena ingresada debe tener un numero de caracteres comprendido entre "+ from +" y "+ to +" ). %s%n", Utils.RED, Utils.RESET);
                System.out.print(message);
            }
        } while (value.length() < from || value.length() > to);

        return value;
    }


    public static long readLong(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        long value = Long.MIN_VALUE;
        System.out.print(message);

        do {

            try {
                ok = true;
                value = sc.nextLong();
            } catch (InputMismatchException e) {
                ok = false;
                System.out.print(">> Valor erróneo. " + message);
            } finally {
                sc.nextLine();
            }
        } while (ok == false);

        return value;
    }

    public static long readLong(long from, long to, String mensaje) {
        long value;
        long tmp = Math.min(from, to);
        if (tmp == to) {
            to = from;
            from = tmp;
        }

        do {
            value = readLong(mensaje);
            if (value != 0 && (value < from || value > to)) {
                System.out.printf("%sRango inválido. %s", Utils.RED, Utils.RESET);
            }
        } while (value != 0 && (value < from || value > to));
        return value;
    }

    public static double readDouble(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        double value = Double.NaN;
        System.out.print(message);

        do {

            try {
                ok = true;
                value = sc.nextDouble();
            } catch (InputMismatchException e) {
                ok = false;
                System.out.print(">> Valor erróneo. " + message);
            } finally {
                sc.nextLine();
            }
        } while (ok == false);

        return value;
    }

    public static double readDouble(double from, double to, String mensaje) {
        double value;
        double tmp = Math.min(from, to);
        if (tmp == to) {
            to = from;
            from = tmp;
        }

        do {
            value = readDouble(mensaje);
            if (value != 0 && (value < from || value > to)) {
                System.out.printf("%sRango inválido. %s", Utils.RED, Utils.RESET);
            }
        } while (value != 0 && (value < from || value > to));
        return value;
    }

    public static boolean readBoolean(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        boolean value = false;
        System.out.print(message);

        do {
            try {
                ok = true;
                String str = ' ' + sc.nextLine().toLowerCase().trim() + ' ';

                if (" si s true t yes y ".contains(str)) {
                    value = true;
                } else if (" no n false f not ".contains(str)) {
                    value = false;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                ok = false;
                System.out.printf(
                        "%s>> Se esperaba [si|s|true|t|yes|y|no|not|n|false|f]%s %s",
                        Utils.RED, Utils.RESET, message);
            }
        } while (!ok);

        return value;
    }

    public static Byte readByte(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        Byte value = Byte.MIN_VALUE;
        System.out.print(message);

        do {

            try {
                ok = true;
                value = sc.nextByte();
            } catch (InputMismatchException e) {
                ok = false;
                System.out.print(">> Valor erróneo. " + message);
            } finally {
                sc.nextLine();
            }
        } while (ok == false);

        return value;
    }

    public static Float readFloat(String message) {
        message = String.format("%s%s%s", Utils.BLUE, message, Utils.RESET);
        boolean ok;
        Float value = Float.NaN;
        System.out.print(message);

        do {

            try {
                ok = true;
                value = sc.nextFloat();
            } catch (InputMismatchException e) {
                ok = false;
                System.out.print(">> Valor erróneo. " + message);
            } finally {
                sc.nextLine();
            }
        } while (ok == false);

        return value;
    }
    
}