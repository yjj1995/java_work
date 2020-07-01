public class TestArray {
    public static void main(String[] arg){
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2 = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
            array2[i] = array1[i];
            if(i%2==0)
            {
                array2[i] = i;
            }
//            System.out.print(array2[i]);
        }
    }
}
