object Main {
    //wypisuje wszystkie dzielniki n
    fun dzielniki(n: Int) {
        for (i in 1..n) {
            if (n % i == 0) {
                println("$i jest dzielnikiem $n")
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        dzielniki(210)
    }
}
/*
Wygenerowano bytecode:
// ================Main.class =================
// class version 52.0 (52)
// access flags 0x31
public final class Main {


  // access flags 0x11
  public final dzielniki(I)V
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
   L0
    LINENUMBER 4 L0
    ICONST_1
    ISTORE 2
    ILOAD 1
    ISTORE 3
    ILOAD 2
    ILOAD 3
    IF_ICMPGT L1
   L2
    LINENUMBER 4 L2
    NOP
   L3
    LINENUMBER 5 L3
    ILOAD 1
    ILOAD 2
    IREM
    IFNE L4
   L5
    LINENUMBER 6 L5
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ILOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC " jest dzielnikiem "
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ILOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 4
   L6
    ICONST_0
    ISTORE 5
   L7
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 4
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L8
   L4
    LINENUMBER 4 L4
    ILOAD 2
    ILOAD 3
    IF_ICMPEQ L1
    IINC 2 1
   L9
    GOTO L2
   L1
    LINENUMBER 9 L1
    RETURN
   L10
    LOCALVARIABLE i I L3 L9 2
    LOCALVARIABLE this LMain; L0 L10 0
    LOCALVARIABLE n I L0 L10 1
    MAXSTACK = 2
    MAXLOCALS = 6

  // access flags 0x19
  public final static main([Ljava/lang/String;)V
  @Lkotlin/jvm/JvmStatic;()
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 0
    LDC "args"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 13 L1
    GETSTATIC Main.INSTANCE : LMain;
    SIPUSH 210
    INVOKEVIRTUAL Main.dzielniki (I)V
   L2
    LINENUMBER 14 L2
    RETURN
   L3
    LOCALVARIABLE args [Ljava/lang/String; L0 L3 0
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x2
  private <init>()V
   L0
    LINENUMBER 1 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this LMain; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x19
  public final static LMain; INSTANCE
  @Lorg/jetbrains/annotations/NotNull;() // invisible

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 1 L0
    NEW Main
    DUP
    INVOKESPECIAL Main.<init> ()V
    ASTORE 0
    ALOAD 0
    PUTSTATIC Main.INSTANCE : LMain;
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 1

  @Lkotlin/Metadata;(mv={1, 5, 1}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0009H\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"}, d2={"LMain;", "", "()V", "dzielniki", "", "n", "", "main", "args", "", "", "([Ljava/lang/String;)V", "untitled1"})
  // compiled from: Main.kt
}


// ================META-INF/untitled1.kotlin_module =================
                " *

Linia 1: `public final class Main` - Definiuje klasę publiczną o nazwie `Main`. Jest to klasa końcowa (final), co oznacza, że nie może być dziedziczona.
Linia 8: `public final dzielniki(I)V` - Definiuje publiczną i finalną metodę `dzielniki` przyjmującą jeden argument typu `Int` (I) i niezwracającą żadnej wartości (V).
Linie 14-23: Implementacja metody `dzielniki` - Rozpoczyna się blok implementacji metody `dzielniki`. Na początku inicjalizowane są dwie zmienne lokalne: `i` i `n`, które przechowują wartości argumentów metody. Następnie kod przechodzi do pętli `for`, która wykonuje się od `1` do `n`. Wewnątrz pętli znajduje się warunek `IF_ICMPGT`, który sprawdza, czy wartość `i` jest większa lub równa `n`. Jeśli tak, to pętla jest przerywana i kod przechodzi dalej. W przeciwnym przypadku, następuje sprawdzenie warunku `IFNE`, który sprawdza, czy reszta z dzielenia `n` przez `i` jest równa `0`. Jeśli tak, to zostaje wywołana metoda `println`, która wyświetla komunikat na standardowym wyjściu. Następnie wartość `i` jest inkrementowana o `1`, a pętla przechodzi do kolejnej iteracji.
Linie 29-37: Implementacja metody `main` - Rozpoczyna się blok implementacji metody `main`, która jest oznaczona adnotacją `@JvmStatic`. Na początku metoda przyjmuje argument `args`, który jest tablicą ciągów znaków (`Array<String>`). Następnie jest wywoływana metoda `dzielniki` z argumentem `210`. Po zakończeniu wywołania metody `dzielniki`, metoda `main` kończy swoje działanie.
Linie 43-45: Prywatny konstruktor - Definiuje prywatny konstruktor dla klasy `Main`. Jest to konstruktor bezargumentowy, który inicjalizuje instancję klasy. Ponieważ jest prywatny, nie można tworzyć instancji klasy `Main` z zewnątrz.
Linie 51-54: Inicjalizacja instancji klasy `Main` - Tworzy instancję klasy `Main` poprzez wywołanie konstruktora i zapisuje ją w statycznym polu `INSTANCE`. Dzięki temu dostęp do instancji klasy może być łatwo uzyskany.
Linia 57-58: Adnotacja `@Lkotlin/Metadata` - Adnotacja zawierająca metadane o klasie `Main`. Może zawierać informacje o wersji kompilatora, używanych bibliotekach itp.
Linia 62: `META-INF/untitled1.kotlin_module` - Plik zawierający informacje o module Kotlina.

Porównanie bytecodu wygenerowanego dla tego samego algorytmu w Javie i Kotlinie:
Java:
Wersja klasy: 61.0
Klasa lab3/Main jest publiczna i finalna.
Metoda dzielniki jest publiczna i statyczna, przyjmuje argument typu int (I) i nie zwraca wartości (V).
Metoda main jest publiczna i statyczna, przyjmuje argument typu String[] i nie zwraca wartości.
Implementacja metody dzielniki zawiera pętlę for, warunki IF_ICMPGT i IFNE, wywołanie println itp.
Kotlin:
Wersja klasy: 52.0
Klasa Main jest publiczna i finalna.
Metoda dzielniki jest publiczna i niezmienna (final), przyjmuje argument typu int i nie zwraca wartości.
Metoda main jest publiczna, statyczna i adnotowana jako @JvmStatic, przyjmuje argument typu String[] i nie zwraca wartości.
Implementacja metody dzielniki zawiera pętlę while, warunki IF_ICMPGT i IFNE, tworzenie obiektu StringBuilder, wywołanie println itp.
Istnieje prywatny konstruktor dla klasy Main, która jest wywoływana przez statyczną instancję INSTANCE.
Istnieje plik META-INF/untitled1.kotlin_module, który zawiera metadane o klasie Main.

 */