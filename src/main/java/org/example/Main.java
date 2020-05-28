package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Klient Klient1 = new Klient("Jan", "Nowak", "1991-12-02");
        Klient1.setHaslo("Mandarynki");
        Klient Klient2 = new Klient("Kazimerz", "Mak", "1969-03-26");
        Klient Klient3 = new Klient("Bogdan", "Mały", "1984-01-12");
        Klient[] tablicaKlientow = new Klient[]{Klient1, Klient2, Klient3};
        for (Klient klient : tablicaKlientow) {
            System.out.println("Login: " + klient.getLogin());
        }
        System.out.println("Wpisz swoj login: ");
        String login = scanner.nextLine();
        boolean czyLoginIstnieje = false;

        for (int i = 0; i < tablicaKlientow.length; i++) {
            if (tablicaKlientow[i].getLogin().equals(login)) {
                czyLoginIstnieje = true;
                if (tablicaKlientow[i].getHaslo() == null) {
                    System.out.println("Witaj " + tablicaKlientow[i].getImie() + "jestes tu pierwszy raz, wiec musisz podać swoje nowe hasło: ");
                    String haslo = scanner.nextLine();
                    System.out.println("Dobrze, teraz pobierz swoje hasło:   ");
                    if (scanner.nextLine().equals(haslo)) {
                        tablicaKlientow[i].setHaslo(haslo);
                        System.out.println(" Brawo ci się wstawić hasło");
                    } else {
                        System.out.println("Hasła muszą być zgodnie. Przerywam");
                    }
                    break;
                } else {
                    System.out.println(" Podaj hasło: ");
                    String haslo = scanner.nextLine();
                    if (haslo.equals(tablicaKlientow[i].getHaslo())) {
                        System.out.println("Witaj " + tablicaKlientow[i].getImie());


                    } else {
                        System.out.println(" błedne hasło");
                    }
                    break;
                }
            }

        }
        if (czyLoginIstnieje == false) {
            System.out.println("ten uzytkownik nie istnieje");

        }
    }

}

