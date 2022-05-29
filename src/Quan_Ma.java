public class Quan_Ma {
    private int a,b;
    private int n;
    private int cout = 0;
    private int[] X = {1,1,2,2,-2,-2,-1,-1};
    private int[] Y = {2,-2,1,-1,1,-1,2,-2};
    private int[][] Array;

    public Quan_Ma(int n) {
        this.n = n;
//        khởi tạo bàn cờ
        this.Array = new int[this.n][this.n];
        for (int i = 0; i < this.Array.length; i++) {
            for (int j = 0; j < this.Array.length; j++) {
                this.Array[i][j] = 0;
            }
        }
     }
     public void display() {
         for (int i = 0; i < this.getArray().length; i++) {
             System.out.println();
             for (int j = 0; j < this.getArray().length; j++) {
                 System.out.printf(" %d |",this.getArray()[i][j]);
             }
         }
     }


     public void move(int a, int b){
        ++this.cout;
        this.Array[a][b] = this.cout;
         for (int i = 0; i < 8; i++) {
             if(this.cout == this.n*this.n){
                 System.out.println("Các nước đã đi của quân mã: ");
                 display();
                 System.exit(0);
             }
             int u = a + this.X[i];
             int v = b + this.Y[i];
             if(u>= 0 && u < n && v >= 0 && v < n && this.Array[u][v] == 0){
                 move(u,v);
             }
         }
         --this.cout;
         this.Array[a][b] = 0;
     }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public int[][] getArray() {
        return Array;
    }

    public void setArray(int[][] array) {
        Array = array;
    }
}
