public class whilejava {
    public static void main(String[] args) {
//        while(kondisi) {
//            aksi
//        }

        int nilai = 0;
        while(nilai < 5) {
            System.out.println("iterasi ke-" + nilai);
            nilai++;
        }

        nilai = 0;
        while(true) {
            System.out.println("halo");
            nilai++;
            if (nilai == 3) {
                break;
            }
        }
    }
}
