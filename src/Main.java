public class Main {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //iki matris çıkışı
        System.out.println("Matris:");
        firstmatris(matris1);
        transpoz(matris1);

        System.out.println("Matris:");
        firstmatris(matris2);
        transpoz(matris2);
    }

    //ilk matrisi geziyoruz
    public static void firstmatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //tranpozu gezip yazıyoruz
    public static void transpoz(int[][] matris) {
        System.out.println("Transpoz:");
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + "\t");
            }
            System.out.println();
        }
    }
}