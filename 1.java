public class HitungJarakTempuh {
    public static void main(String[] args){
    
        //Kecepatan(Velocity = V) Mobil meter/detik
        int v1 = 6;//pkl 10:25:21 sd 10:36:20 (11 menit)
        int v2 = 7;//pkl 10:36:21 sd 10:46:20 (10 menit)
        int v3 = 8;//pkl 10:46:21 sd 10:56:20 (10 menit)
        int v4 = 9;//pkl 10:56:21 sd 11:06:20 (10 menit)
        int v5 = 10;//pkl 11:06:21 sd 11:16:20 (10 menit)
        int v6 = 11;//pkl 11:16:21 sd 11:26:20 (10 menit)
        int v7 = 12;//pkl 11:26:21 sd 11:36:20 (10 menit)
        int v8 = 13;//pkl 11:36:21 sd 11:46:20 (10 menit)
        int v9 = 14;//pkl 11:46:21 sd 11:56:20 (10 menit)
        int v10 = 15;//pkl 11:56:21 sd 12:00:00 (3 menit 39 detik)
        
        //waktu (Time = T) tempuh dalam detik
        int t1 = 11*60;
        int t2 = 10*60;
        int t3 = (3*60)+39;
        
        //Total Jarak(Space = S) tempuh dalam meter
        int St = (v1*t1) + (v2*t2) + (v3*t2) + (v4*t2) + (v5*t2)
                 + (v6*t2) + (v7*t2) + (v8*t2) + (v9*t2) + (v10*t3);
        //Hasil 
        System.out.println("Jarak yang ditempuh dari pkl 10:25:21 sd 12:00:00 adalah " + St + "meter");
        
        
    }
}
