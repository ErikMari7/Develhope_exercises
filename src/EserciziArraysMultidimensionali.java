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
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

            }
        }
        for( int SumOfNumbers: matrix[0]) {
            sumOf += SumOfNumbers;
        }
        System.out.println("La somma degli elementi  nella prima riga è: " + sumOf);
    }
}
