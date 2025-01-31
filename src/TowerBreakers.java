public class TowerBreakers {

    public static void main(String[] args) {

        int n = 1;
        int m = 7;
        int towerBreaker = towerBreaker(n, m);
        System.out.println(towerBreaker);
    }

    //n - no of towers
    //m - height of tower
    public static int towerBreaker(int n, int m){
        if(m == 2){
            return 2;
        }
        if( n % 2 == 0){
            return 2;
        }
        return 1;
    }
}
