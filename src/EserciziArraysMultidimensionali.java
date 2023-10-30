/*  Scrivere un programma che contenga
 un metodo che permette di inizializzare
  una matrice riempita con dei valori a vostro
   piacimento e restituisca la somma degli elementi sulla prima riga
 */

class Ex27 {
    public static void main(String args[]) {
        Initmatrix();
    }
    public static void Initmatrix() {
        int sumOf = 0;
        int[][] matrix = {{1,8,5,10}, {7,2,4,8,6,10}};
        for( int SumOfNumbers: matrix[0]) {
            sumOf += SumOfNumbers;
        }
        System.out.println("La somma degli elementi  nella prima riga è: " + sumOf);
    }
}

/*  Scrivere un programma che contenga un metodo
 che permette di inizializzare una matrice e di scambiare
  le sue righe e le sue colonne stampandola a video.
   Matrice di partenza
1 2 3
4 5 6
Matrice risultato
 1 4
 2 5
 3 6


 */

class Ex28 {
    public static void main(String args[]) {
        int[][] matriceDiPartenza = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriceRisultato = ScambiaRigheConColonne(matriceDiPartenza);
        stampaMatrice(matriceDiPartenza, "Matrice di Partenza:");
        stampaMatrice(matriceRisultato, "Matrice Risultato:");
    }

    public static int[][] ScambiaRigheConColonne(int[][]matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] risultato = new int[colonne][righe];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                risultato[j][i] = matrice[i][j];
            }
        }
        return risultato;
    }
    public static void stampaMatrice(int[][]matrice, String messaggio) {
        System.out.println(messaggio);
        for(int i = 0; i < matrice.length; i++) {
            for (int j = 0 ; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
