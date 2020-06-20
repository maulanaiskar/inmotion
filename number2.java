public class test {

    public static char cariHuruf(String huruf) {
        for (int i = 0; i < huruf.length(); i++) {
            char karakter = huruf.charAt(i);
            for (int j = i + 1; j < huruf.length(); j++) {
                char karakter2 = huruf.charAt(j);
                if (karakter == karakter2)
                    return karakter;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String kalimat = "BCABA";
        char a = cariHuruf(kalimat);
        if (a != 0)
            System.out.print(a);
        else
            System.out.println("Tidak ada kata yang sama");
    }
}
