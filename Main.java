import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] tab = new int[0];
    char[] tabc = new char[0];
    String[] tabs = new String[0];
    while (true) {
      int stan;
      System.out.println("Mini Menu");
      System.out.println("0. Koniec programu:");
      System.out.println("1. Dodaj tablicę typu Int:");
      System.out.println("2. Wyświetl tablicę typu Int:");
      System.out.println("3. Dodaj tablicę typu Char:");
      System.out.println("4. Wyświetl tablicę typu Char:");
      System.out.println("5. Dodaj tablicę typu String:");
      System.out.println("6. Wyświetl tablicę typu String:");
      Scanner scan = new Scanner(System.in);
      stan = scan.nextInt();

      switch (stan) {
        case 0:
          return;
        case 1:
          tab = Tab_Int_Initialize();
          break;
        case 2:
            Tab_Int_Display(tab);
          break;
        case 3:
          tabc = Tab_Char_Initialize();
          break;
        case 4:     
            Tab_Char_Display(tabc);
          break;
        case 5:
          tabs = Tab_String_Initialize();
          break;
        case 6:
          Tab_String_Display(tabs);
          break;
      }
    }
  }

  public static int[] Tab_Int_Initialize() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj ilość elementów tablicy:");
    int n = scan.nextInt();
    int[] tab = new int[n];
    System.out.println("Podaj elementy tablicy:");
    for (int j = 0; j < n; j++) {
      tab[j] = scan.nextInt();
    }
    return tab;
  }

public static void Tab_Int_Display(int[] tab) {
  System.out.println("Twoja tablica ma: " + tab.length + " elementów");
  System.out.println("Elementy tablicy:");
  
  boolean initialized = false; // Flaga wskazująca, czy tablica została zainicjalizowana

  for (int i = 0; i < tab.length; i++) {
    if (tab[i] != 0) {
      initialized = true;
      System.out.println(tab[i]);
    }  
  }
  
  if (!initialized) {
    System.out.println("Tablica nie została jeszcze zainicjalizowana.");
  }
}
  public static char[] Tab_Char_Initialize() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj ilość elementów tablicy:");
    int n = scan.nextInt();
    scan.nextLine(); // Pobranie znaku nowej linii po pobraniu liczby

    char[] tab = new char[n];
    System.out.println("Podaj elementy tablicy:");
    for (int j = 0; j < n; j++) {
      String input = scan.nextLine();
      if (input.length() > 0) {
        tab[j] = input.charAt(0);
      } else {
        System.out.println("Wprowadź poprawny znak!");
        j--;
      }
    }
    return tab;
  }

  public static void Tab_Char_Display(char[] tab) {
    System.out.println("Twoja tablica ma: " + tab.length + " elementów");
    System.out.println("Elementy tablicy:");
    boolean initialized = false; // Flaga wskazująca, czy tablica została zainicjalizowana

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] != '\u0000') {
        initialized = true;
        break;
      }
    }

    if (initialized) {
      for (int i = 0; i < tab.length; i++) {
        System.out.println(tab[i]);
      }
    } else {
      System.out.println("Tablica nie została jeszcze zainicjalizowana.");
    }
  }

  public static String[] Tab_String_Initialize() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj ilość elementów tablicy:");
    int n = scan.nextInt();
    scan.nextLine(); // Pobranie znaku nowej linii po pobraniu liczby

    String[] tab = new String[n];
    System.out.println("Podaj elementy tablicy:");
    for (int j = 0; j < n; j++) {
      String input = scan.nextLine();
      tab[j] = input;
    }
    return tab;
  }

  public static void Tab_String_Display(String[] tab) {
    System.out.println("Twoja tablica ma: " + tab.length + " elementów");
    System.out.println("Elementy tablicy:");
    boolean initialized = false; // Flaga wskazująca, czy tablica została zainicjalizowana

    for (int i = 0; i < tab.length; i++) {
      if (tab[i] != null) {
        initialized = true;
        break;
      }
    }

    if (initialized) {
      for (int i = 0; i < tab.length; i++) {
        if (tab[i] != null) {
          System.out.println(tab[i]);
        }
      }
    } else {
      System.out.println("Tablica nie została jeszcze zainicjalizowana.");
    }
  }
}