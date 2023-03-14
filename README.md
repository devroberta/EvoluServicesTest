EXERCICIO 1 (Solução método) :

public void ticoTeco() {
        String mult3 = "Tico";
        String mult5 = "Teco";

        String result = "";
        boolean isMult = false;

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                result += mult3;
                isMult = true;
            }
            if (x % 5 == 0) {
                result += mult5;
                isMult = true;
            }
            if (!isMult) {
                result += x;
            }
            if (x < 100) {
                result += ", ";
            }
            isMult = false;
        }
        System.out.println(result);
    }

    -----------------------------------------------

    EXERCICIO 2 (Solução método) :

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("á|à|â|ã|ä","a")
                .replaceAll("é|è|ê|ë","e")
                .replaceAll("ó|ò|ô|õ","o")
                .replaceAll("ú|ù|û|ũ","u")
                .replaceAll(" ", "")
                .replaceAll("\\p{Punct}", "")
                .toLowerCase();
        String aux = new StringBuilder(s).reverse().toString();
        return s.equals(aux) ? true : false;
    }
